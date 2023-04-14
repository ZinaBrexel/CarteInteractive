
/*---------------- Start Security Input nom-------------------*/
const nom = document.querySelector('input[name="nom"]');

nom.addEventListener('input', function (event) {
    const value = event.target.value;
    const regex = /^[a-zA-Z ]{2,30}$/;
    if (!regex.test(value)) {
        event.target.setCustomValidity('Le nom doit contenir entre 2 et 30 lettres alphabétiques et des espaces uniquement.');
    } else {
        event.target.setCustomValidity('');
    }
});
/*------------------------------------------------------------*/

/*---------------- Start Security Input URL-------------------*/
const urlInput = document.querySelector('input[name="urlInput"]');
urlInput.addEventListener('input', () => {
    const url = urlInput.value.trim();
    const urlRegex = /^(https?:\/\/)?([a-zA-Z0-9]+\.[a-zA-Z]{2,6})(\/[a-zA-Z0-9]*)*$/;

    const isValidUrl = urlRegex.test(url);

    if (!isValidUrl) {
        urlInput.setCustomValidity('L\'URL doit commencer par "http://" ou "https://"');
    } else {
        urlInput.setCustomValidity('');
    }
});

/*------------------------------------------------------------*/

/*---------------- Start Security Input ville-------------------*/
const villeInput = document.querySelector('input[name="ville"]');

villeInput.addEventListener('input', () => {
    const ville = villeInput.value.trim();
    const villeRegex = /^[a-zA-ZÀ-ÖØ-öø-ÿ\s]+$/;

    const isValidVille = villeRegex.test(ville);

    if (!isValidVille) {
        villeInput.setCustomValidity('Le champ ville ne doit contenir que des lettres.');
    } else {
        villeInput.setCustomValidity('');
    }
});
/*------------------------------------------------------------*/
/*---------------- Start Security Input code postal-----------------*/
const cpInput = document.querySelector('input[name="cp"]');
cpInput.addEventListener('input', () => {
    const cp = cpInput.value.trim();
    const cpRegex = /^[0-9]{5}$/;

    const isValidCp = cpRegex.test(cp);

    if (!isValidCp) {
        cpInput.setCustomValidity('Le code postal doit contenir 5 chiffres.');
    } else {
        cpInput.setCustomValidity('');
    }
});

cpInput.addEventListener('blur', () => {
    cpInput.reportValidity();
});

/*------------------------------------------------------------*/


/*---------------- Start Security Input lieu-----------------*/
const lieuInput = document.querySelector('input[name="lieu"]');

lieuInput.addEventListener('input', () => {
    const lieu = lieuInput.value.trim();
    const lieuRegex = /^[\w\s\u00C0-\u00FF'-]*$/;

    const isValidLieu = lieuRegex.test(lieu);

    if (!isValidLieu) {
        lieuInput.setCustomValidity('Le champ Lieu ne doit contenir que des caractères alphanumériques, des espaces, des apostrophes, des tirets ou des caractères accentués.');
    } else {
        lieuInput.setCustomValidity('');
    }
});

/*------------------------------------------------------------*/
/*---------------- Start Security date début------------------*/
const debutInput = document.querySelector('input[name="debut"]');

debutInput.addEventListener('input', () => {
    const debut = debutInput.value.trim();
    const debutRegex = /^\d{4}-\d{2}-\d{2}$/;

    const isValidDebut = debutRegex.test(debut);

    if (!isValidDebut) {
        debutInput.setCustomValidity('La date de début doit être au format "yyyy-mm-dd"');
    } else {
        debutInput.setCustomValidity('');
    }
});
/*------------------------------------------------------------*/
/*---------------- Start Security date fin------------------*/
const finInput = document.querySelector('input[name="fin"]');
finInput.addEventListener('input', () => {
    const fin = finInput.value.trim();
    const finRegex = /^\d{4}-\d{2}-\d{2}$/;

    const isValidFin = finRegex.test(fin);

    if (!isValidFin) {
        finInput.setCustomValidity('La date de fin doit être au format "yyyy-mm-dd"');
    } else {
        finInput.setCustomValidity('');
    }
});
/*---------------------------------------------------------------*/
/*---------------- Start Security Input lat---------------------*/
const latInput = document.getElementById('lat');

latInput.addEventListener('input', () => {
    const lat = latInput.value.trim();
    const latRegex = /^-?([1-8]?[1-9]|[1-9]0)\.{1}\d{1,6}$/;

    const isValidLat = latRegex.test(lat);

    if (!isValidLat) {
        latInput.setCustomValidity('La latitude doit être un nombre décimal valide.');
    } else {
        latInput.setCustomValidity('');
    }
});
/*---------------------------------------------------------------*/
/*---------------- Start Security Input lon---------------------*/
const lonInput = document.getElementById('lon');

lonInput.addEventListener('input', () => {
    const lon = lonInput.value.trim();
    const lonRegex = /^[-+]?([1-8]?\d(\.\d+)?|90(\.0+)?)([eE][-+]?\d+)?$/;

    const isValidLon = lonRegex.test(lon);

    if (!isValidLon) {
        lonInput.setCustomValidity('La longitude doit être un nombre valide entre -90 et 90.');
    } else {
        lonInput.setCustomValidity('');
    }
});

/*---------------------------------------------------------------*/
