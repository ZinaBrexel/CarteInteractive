/**
 * Initialise une carte Leaflet centrée sur les coordonnées [48.202047, -2.932644] avec un zoom de 8.
 * Ajoute une couche de tuiles OpenStreetMap à la carte avec des options personnalisées.
 */
let mymap = L.map('map').setView([48.202047, -2.932644], 8);

L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
    { tileSize: 512, zoomOffset: -1, maxZoom: 18 }
).addTo(mymap);

/**
 * Ajoute une marque sur la carte à l'emplacement spécifié par les coordonnées lat/lon.
 * Affiche le nom et la ville dans un popup lorsqu'on clique sur la marque.
 * @param {double} lat La latitude de l'emplacement de la marque.
 * @param {double} lon La longitude de l'emplacement de la marque.
 * @param {String} nom Le nom à afficher dans le popup.
 * @param {String} ville La ville à afficher dans le popup.
 */
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


