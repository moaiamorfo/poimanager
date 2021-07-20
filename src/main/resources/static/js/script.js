$(document).ready(
	function(){
		$("#vocemappa").hover(function() {
  			$("#vocemappa").fadeOut("slow", function(){
    			// alert("Il tag è stato nascosto correttamente.");
  		});
	});
});

function creaMappa() {
	  var perimetro = new google.maps.LatLngBounds();
	  const myLatLng = { lat: 40.4160721, lng: 16.8145609 };
	  const map = new google.maps.Map(document.getElementById("mappa"), {
	    zoom: 4,
	    center: myLatLng,
	  });
	  new google.maps.Marker({
	    position: myLatLng,
	    map,
	    title: "Tavole Palatine di Metaponto",
	  });
	  perimetro.extend(myLatLng);
	  new google.maps.Marker({
		position: { lat:40.6645789, lng:16.6115742 },
		map,
		title: "Sassi di Matera",
	  });
	  perimetro.extend({ lat:40.6645789, lng:16.6115742 });
	  map.fitBounds(perimetro);
	}