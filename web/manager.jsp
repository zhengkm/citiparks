<%-- 
    Document   : manager
    Created on : 2015-2-21, 19:23:16
    Author     : Kehao Xu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">   
        <link rel="stylesheet" rel="stylesheet" href="./media/css/manager.css" type="text/css" >
        <title>Manager Page</title>
    </head>
    
    
    <body>

      <div class="container">
        <br/>
        <div class="l">
        <div class="log">
            <div class="form-group">
              <label class="label" >Site_Number</label>
              <input type="text" class="form-control" value="" placeholder="Site Number" id="Site_Number" />
              
            </div>
              
             <div class="form-group">
              <label class="label" for="login-name">Site_Name</label>
              <input type="text" class="form-control" value="" placeholder="Site Name" id="Site_Name" />
              
            </div>
              
             <div class="form-group">
              <label class="label" for="login-name">Address</label>
              <input type="text" class="form-control" value="" placeholder="Address" id="Address" />
              
            </div>
 
              
             <div class="form-group">
              <label class="label" >Longtitude</label>
              <input type="text" class="form-control" value="" placeholder="Longtitude" id="Longtitude" />
              
            </div>
              
              
            <div class="form-group">
              <label class="label" >Latitude</label>
              <input type="text" class="form-control" value="" placeholder="Latitude" id="Latitude" />
              
            </div>
              
             <div class="form-group">
              <label class="label" for="login-name">Begin_Date</label>
              <input type="text" class="form-control" value="" placeholder="Begin Date" id="BeginDate"/>
              
            </div>

            <div class="form-group">
              <label class="label" >End_Date</label>
              <input type="text" class="form-control" value="" placeholder="End Date" id="EndDate"/>
              
            </div>
              
             <div class="form-group">
              <label class="label" for="login-name">Days</label>
              <input type="text" class="form-control" value="" placeholder="Days" id="Days" />
              
            </div>

            <div class="form-group">
              <label class="label" >Amount Of Breakfast</label>
              <input type="text" class="form-control" value="" placeholder="Amount" id="Breakfast" />
              
            </div>
              
             <div class="form-group">
              <label class="label" for="login-name">Amount Of Lunch</label>
              <input type="text" class="form-control" value="" placeholder="Amount" id="Lunch" />
              
            </div>

            <div class="form-group">
              <label class="label" >Amount Of Snack</label>
              <input type="text" class="form-control" value="" placeholder="Amount" id="Snack" />
              
            </div>
              


            <div class="form-group">
              <label class="label" >Type</label>
              <select class="select1" id="Type" >
                    <option value="0">Hot</option>
                    <option value="1">Cold</option>
                  </select>
            </div>
            <div class="form-group">
              <label class="label" >State</label>
              <select class="select1" id="State" >
                    <option value="1">Open</option>
                    <option value="0">Close</option>
                  </select>
            </div>
            <div class="form-group">
              <label class="label" >Cooler</label>
              <select class="select1" id="Cooler">
                    <option value="0">No</option>
                    <option value="1">Yes</option>
                  </select>
            </div>
            <div class="form-group">
              <label class="label" >Ovens</label>
              <select class="select1" id="Ovens">
                    <option value="0">No</option>
                    <option value="1">Yes</option>
                  </select>
            </div>
            <div class="submit"><button class="btn" type="submit" id="store">Update</button>                  
               
            </div>
            
           
          </div>
        </div>
      </div>
    <!-- /.container -->

    </body>
        <script type="text/javascript">
        $(document).ready(function()
        {
            $("#store").click(function()
            {
                var Site_Number=$("#Site_Number").val();
                var Site_Name=$("#Site_Name").val();
                var Address=$("#Address").val();
                var Type=$("#Type").val();
                var Longtitude=$("#Longtitude").val();
                var Latitude=$("#Latitude").val();
                var BeginDate=$("#BeginDate").val();
                var EndDate=$("#EndDate").val();
                var Days=$("#Days").val();
                var Breakfast=$("#Breakfast").val();
                var Lunch=$("#Lunch").val();
                var Snack=$("#Snack").val();
                var Ovens=$("#Ovens").val();
                var Coolers=$("#Coolers").val();
                var State=$("#State").val();


                if(State=="" || Site_Number=="" || Site_Name=="" || Address=="" || Type=="" || Longtitude=="" || Latitude=="" || BeginDate=="" || EndDate=="" || Days=="" || Breakfast=="" || Lunch=="" || Snack=="" || Ovens=="" || Coolers=="")
                    alert("Please finish all information!");
                else
                {
                    $.post(
                    "./newSite",
                    {"site_num":Site_Number,"site_name":Site_Name,"address":Address,"hot_cold":Type,"longtitude":Longtitude,"latitude":Latitude,"begin_date":BeginDate,"end_date":EndDate,"days":Days,"b":Breakfast,"l":Lunch,"s":Snack,"ovens":Ovens,"coolers":Coolers,"state":State},
                     function(data){                    
                        alert(data);
                        $(".form-control").val("");
                     },
                    "text" );
                }
            });
                    
            
        });
    </script>
</html>

