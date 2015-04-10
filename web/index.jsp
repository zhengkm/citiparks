<%-- 
    Document   : map
    Created on : 2015-2-21, 23:42:14
    Author     : Kehao Xu
--%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>map</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0, width=device-width"/>
        <!--<meta name="viewport" content="width=device-width, initial-scale=1.0">-->
        
        <!-- Loading Bootstrap -->
        <link href="./dist/css/vendor/bootstrap.min.css" rel="stylesheet">

        <!-- Loading Flat UI -->
        <link href="./dist/css/flat-ui.min.css" rel="stylesheet">
        <link rel="shortcut icon" href="">
        
         <!--Loading myfeed CSS--> 
        <link href="./media/css/myfeed.css" rel="stylesheet">
        
        <style type="text/css">
            html { height: 100% }
            body { height: 100%; margin: 0; padding: 0;  }
        </style>
        <script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?key=AIzaSyDZthIqDtWlS3wbtqF5PWPGkBAH4vtOt2g&sensor=TRUE"></script>
    <script type="text/javascript">
      
    </script>
    </head>
    <body>
        <div id="map_canvas" style="width:100%; height:100%"></div>
        <div class="secondary" style="display:none">   
                <div class="feed" id="site">
                    <header class="">
                        <h2 class="feed-title"><a class="feed-title" id="siteName" href="#"></a></h2>
                        <p class="feed-meta">
                            <span class="fui-location"></span>
                            Address: <a class="feed-date" id="address" href="#"></a>
                        </p>
                        <p class="feed-meta">
                            <span class="fui-calendar"></span>
                            Begin Date: <a class="feed-date" id="b_date" href="#"></a> | End Date: <a class="feed-date" id="e_date" href="#"></a>
                        </p>
                        <p class="feed-meta">
                            <span class="fui-triangle-right-large"></span>
                            Hot/Cold: <a class="feed-date" id="hot_cold" href="#"></a>
                        </p>
                        <p class="feed-meta">
                            <span class="fui-triangle-right-large"></span>
                            Ovens: <a class="feed-date" id="ovens" href="#"></a>
                        </p>
                        <p class="feed-meta">
                            <span class="fui-triangle-right-large"></span>
                            coolers: <a class="feed-date" id="coolers" href="#"></a>
                        </p>
                        <p class="feed-meta">
                            <span class="fui-info-circle"></span>
                            Days: <a class="feed-date" id="days" href="#"></a>
                        </p>
                        <p class="feed-meta">
                            <span class="fui-info-circle"></span>
                            Status: <a class="feed-date" id="state" href="#"></a>
                        </p>
                    </header>
                </div>  
        
                

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="feed">
                <h3 class="brand" >Menu </h3>
              
              <div class="menu">
              <p class="feed-meta">
                Breakfast: 
              </p>
                <ul id="B_menu">
                    <li><span class="feed-date">---</span></li>
                    <li><span class="feed-date">---</span></li>
                    <li><span class="feed-date">---</span></li>
               </ul>
              </div>
              
            <div class="menu">
              <p class="feed-meta">
                Lunch: 
              </p>
                <ul id="L_menu">
                    <li><span class="feed-date">---</span></li>
                    <li><span class="feed-date">---</span></li>
                    <li><span class="feed-date">---</span></li>
               </ul>
              </div>
              
              <div class="menu">
              <p class="feed-meta">
                Snacks: 
              </p>
                   <ul id="S_menu">
                        <li><span class="feed-date">---</span></li>
                        <li><span class="feed-date">---</span></li>
                        <li><span class="feed-date">---</span></li>
                   </ul>
              </div>     
            </div>
            <div class="feed-icon" STYLE="padding-right:28px;margin-bottom: 8px;"> 
                <a class="fb-share-button icon" data-layout="button_count"></a>
               
            
            </div> 
             <div class="feed-icon"> 
               
               
                <a  href="https://twitter.com/share" class="icon twitter-share-button " data-hashtags="Citipark">Tweet</a>
<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>
               
            </div> 
            <!--<div Style="clear:both;"></div>-->
        </div>
        

        <div id="fb-root"></div>
        <script>(function(d, s, id) {
        var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) return;
        js = d.createElement(s); js.id = id;
        js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.0";
        fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'facebook-jssdk'));</script>
      <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
      <script src="./dist/js/vendor/jquery.min.js"></script>
      <!-- Include all compiled plugins (below), or include individual files as needed -->
      <script src="./dist/js/flat-ui.min.js"></script>
      
      <script src="./media/js/map.js"></script>
    </body>
</html>


