/**
 * Initialise une carte Leaflet centrée sur les coordonnées [48.202047, -2.932644] avec un zoom de 8.
 * Ajoute une couche de tuiles OpenStreetMap à la carte avec des options personnalisées.
 */
let mymap = L.map('map').setView([48.202047, -2.932644], 8);

L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
    { tileSize: 512, zoomOffset: -1, maxZoom: 18 }
).addTo(mymap);

// Ajoutez un événement "click" à la carte
mymap.addEventListener('click', function(e) {
    // Récupérez les coordonnées du clic
    let lat = e.latlng.lat;
    let lon = e.latlng.lng;

    // Mettez à jour les champs "lat" et "lon"
    document.getElementById("lat").value = lat;
    document.getElementById("lon").value = lon;
});
