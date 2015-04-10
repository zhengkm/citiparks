/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(function() {
 
    var geo;
           
    function getPositionSuccess( position ){
        var lat = position.coords.latitude;
        var lng = position.coords.longitude;
        
        var mapOptions = {
          center: new google.maps.LatLng(lat, lng),//set map center
          zoom: 14,  
          mapTypeId: google.maps.MapTypeId.ROADMAP              //set map style
        };
        
        
        
        var map = new google.maps.Map(document.getElementById("map_canvas"),mapOptions);
        var myIcon = new google.maps.Circle({
            center :new google.maps.LatLng(lat, lng),
            radius:80,
            strokeColor:"#0000FF",
            strokeOpacity:0.6,
            strokeWeight:2,
            fillColor:"#0000FF",
            fillOpacity:0.4,
            map:map
        });
        
            
        var curControlDiv = document.createElement('div');
        var curControl = new CenterControl(curControlDiv, map, "cur", function(){
            var position_option = {
                enableHighAccuracy: true,
                maximumAge: 30000,
                timeout: 20000
            };
            navigator.geolocation.getCurrentPosition(getPositionSuccess, getPositionError, position_option);
        });
        
        var closeControlDiv = document.createElement('div');
        var closeControl = new CenterControl(closeControlDiv, map, "close", function(){
            if ($(".secondary").css("display") === "none")
                   $("#map_canvas").css("height", "35%");
                else 
                   $("#map_canvas").css("height", "100%");

                $(".secondary").toggle("slow");
            
        });

        curControlDiv.index = 1;
        closeControlDiv.index = 1;
        map.controls[google.maps.ControlPosition.TOP_RIGHT].push(curControlDiv);
        map.controls[google.maps.ControlPosition.TOP_RIGHT].push(closeControlDiv);

         for (var site in geo) { // [{"siten_ame":name, "longtitude":lon, "latitude":lat}, {}, {}]
            var point = new google.maps.LatLng(geo[site].longtitude, geo[site].latitude);
            var marker = new google.maps.Marker({
                position:point,
                map:map,
                title: geo[site].site_name
            });
            google.maps.event.addListener(marker,'click',function(){
                
                var title = this.title;
                $.post(
                "./getMenu",
                {"siteName": title},
                function(data) {      
                  
                    var a = $("#siteName");
                    a.text(title);

                    a = $("#address");
                    a.text(data.address);

                    a = $("#b_date");
                    a.text(data.b_date);

                    a = $("#e_date");
                    a.text(data.e_date);

                    a = $("#ovens");
                    a.text(data.ovens);

                    a = $("#coolers");
                    a.text(data.coolers);

                    a = $("#days");
                    a.text(data.days);

    //                a = $("#B_number");
    //                a.text(data.B_number);
    //                
    //                a = $("#L_number");
    //                a.text(data.L_number);
    //                
    //                a = $("#S_number");
    //                a.text(data.S_number);

                    a = $("#hot_cold");
                    a.text(data.hot_cold);

                    a = $("#state");
                    a.text(data.state);
                    
                    
                    a = document.getElementById("L_menu").getElementsByClassName("feed-date");
                    var L_menu = data.L_menu.split(',');
                    for (var i = 0; i < a.length; i++) {
                        a[i].innerHTML = "";
                    }
                    for (var i = 0; i < L_menu.length; i++) {
                        a[i].innerHTML = L_menu[i].trim();
                    }

                    a = document.getElementById("B_menu").getElementsByClassName("feed-date");
                    var B_menu = data.B_menu.split(',');
                    for (var i = 0; i < a.length; i++) {
                        a[i].innerHTML = "";
                    }
                    for (var i = 0; i < B_menu.length; i++) {
                        a[i].innerHTML = B_menu[i].trim();
                    }

                    a = document.getElementById("S_menu").getElementsByClassName("feed-date");
                    var S_menu = data.S_menu.split(',');
                    for (var i = 0; i < a.length; i++) {
                        a[i].innerHTML = "";
                    }
                    for (var i = 0; i < S_menu.length; i++) {
                        a[i].innerHTML = S_menu[i].trim();
                    }

                    $("#map_canvas").css("height", "35%");
                    $(".secondary").show("slow");
                },
                "JSON"); 
            });
        }
    }
    
    
   function getPositionError(error) {
    switch (error.code) {
        case error.TIMEOUT:
            alert("Timeout");
            break;
        case error.PERMISSION_DENIED:
            alert("You cancle the connection");
            break;
        case error.POSITION_UNAVAILABLE:
            alert("Fail to access location");
            break;
        }
    }
    
    function initialize() {
        $.post(
        "./getGeolocation",
        {},
         function(data){  
            geo = data;
            var position_option = {
                enableHighAccuracy: true,
                maximumAge: 30000,
                timeout: 20000
            };
            navigator.geolocation.getCurrentPosition(getPositionSuccess, getPositionError, position_option);
         },
    "JSON" );
    }
   
     google.maps.event.addDomListener(window, 'load', initialize);
    
    
     
   function CenterControl(controlDiv, map, name, func) {

        // Set CSS for the control border
        var controlUI = document.createElement('div');
        controlUI.style.backgroundColor = '#fff';
        controlUI.style.border = '2px solid #fff';
        controlUI.style.borderRadius = '3px';
        controlUI.style.boxShadow = '0 2px 6px rgba(0,0,0,.3)';
        controlUI.style.cursor = 'pointer';
        controlUI.style.marginBottom = '22px';
        controlUI.style.textAlign = 'center';
        controlUI.title = 'Click to recenter the map';
        controlDiv.appendChild(controlUI);

        // Set CSS for the control interior
        var controlText = document.createElement('div');
        controlText.style.color = 'rgb(25,25,25)';
        controlText.style.fontFamily = 'Roboto,Arial,sans-serif';
        controlText.style.fontSize = '16px';
        controlText.style.lineHeight = '38px';
        controlText.style.paddingLeft = '5px';
        controlText.style.paddingRight = '5px';
        controlText.innerHTML = name;
        controlUI.appendChild(controlText);

        // Setup the click event listeners: simply set the map to
        google.maps.event.addDomListener(controlUI, 'click', function() {
            func();
        });
    }
});
