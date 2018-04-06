/* global google */

var directionsDisplay;
var map;
var directionsService ;
function initialize() {
    
directionsDisplay = new google.maps.DirectionsRenderer;
directionsService = new google.maps.DirectionsService();
   
 directionsDisplay = new google.maps.DirectionsRenderer();
    var dhaka = new google.maps.LatLng(23.74396, 90.36972);
  
    var mapOptions = {
        
        zoom: 10,
        center: dhaka
    };
//    map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);
//    directionsDisplay.setMap(map);
    
//    var onChangeHandler = function() {
//          calculateAndDisplayRoute(directionsService);
//        };
//        document.getElementById('start').addEventListener('change', onChangeHandler);
//        document.getElementById('end').addEventListener('change', onChangeHandler);
        
        }
        function calculateAndDisplayRoute(directionsService) {
            //window.alert("ok");
           //alert("hit");
            if(directionsService==null){
                
            }
            else{
              
            }
           // document.write(directionsService);
       var start= new google.maps.LatLng(23.74396, 90.36972);
        var end = "Daffodil International University Main Campus (DIU)";
        directionsService.route({
          origin: start,
          destination: end,
          travelMode: 'DRIVING'
        }, function(response, status) {
          if (status === 'OK') {
            //directionsDisplay.setDirections(response);
            
                 var result = "";
            result.innerHTML= "";
			var obj=new Array;
            for (var i =0; i < response.routes[0].legs[0].steps.length; i++){
                //obj[i]={"route":result=response.routes[0].legs[0].steps[i].instructions};
                var route=result=response.routes[0].legs[0].steps[i].instructions;
                var okroute=route.replace(/<[^>]*>/g,"");
				obj[i]={"route":okroute,"location":result=response.routes[0].legs[0].steps[i].start_location};
					
            }
            var obj1 = { "name":"John"};
//var myJSON = JSON.stringify(obj);
				var myJSON = JSON.stringify(obj);
                                //alert(myJSON);
                                //window.document.write(myJSON);
				//document.getElementById("result").innerHTML = myJSON;
//                                document.body.innerHTML = '';
                               
//                                document.body.innerHTML=("<p>'"+myJSON+"'</p>");
                               // document.write(myJSON);
                                //response.getWriter().write("n,m");
                                document.getElementById("name").value=myJSON;
                var form = document.getElementById("vehicles");
            form.submit();
           
              
              
                                
            //console.log(response);
           // directionsDisplay.setDirections(response);
          } else {
            window.alert('Directions request failed due to ' + status);
          }
        });
    }
        



