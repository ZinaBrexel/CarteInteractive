
    // Initialisation Leaflet
    let mymap = L.map('map').setView([48.202047, -2.932644], 8);

    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
    { tileSize: 512, zoomOffset: -1, maxZoom: 18 }
    ).addTo(mymap);

    // Fonction pour ajouter une marque
    function addMarkerOnMap(lat, lon, nom, ville) {
    let coords = [lat, lon];
// On ajoute une marque à l'endroit de notre géolocalisation
    marker = L.marker(coords).addTo(mymap);
// Un popup qui s'affichera au-dessus du marqueur
    let popup = L.popup().setContent('<h1>'+nom+'</h1>'+ville);
    marker.bindPopup(popup);
    marker.addEventListener('click', (event) => {
    popup.openOn(mymap);
});
}



