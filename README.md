# Carte Interactive 🗺

[![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](https://forthebadge.com)

[![forthebadge](https://forthebadge.com/images/badges/powered-by-electricity.svg)](https://forthebadge.com)


![Image](https://zupimages.net/up/23/15/t075.png)


## Description du projet 🌱

Ce prototype de site web a été réalisé dans le cadre d'un TP en formation. Il permet de découvrir les festivals bretons sur une carte Open Street Map, avec une expérience utilisateur fluide et agréable.

Côté Back-end, le site utilise les technologies Spring Boot avec Spring MVC, Thymeleaf et Spring Data JPA pour gérer les données. Côté Front-end, les fonctionnalités sont développées en HTML5, CSS3 et Javascript.

Le projet a été conçu pour être facile à utiliser et offre une expérience utilisateur agréable, tout en permettant de trouver rapidement les festivals les plus proches de chez soi, ainsi que les événements les plus populaires de la région.

En résumé, ce prototype de site web est un outil pratique et convivial pour découvrir les festivals bretons sur une carte Open Street Map, facilement et rapidement.

## Langages et Framwork utilisés 💬

![Image](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

![Image](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)


![MySQL Badge](https://img.shields.io/badge/MySQL-4479A1?logo=mysql&logoColor=fff&style=for-the-badge)

![Image](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)

![Hibernate Badge](https://img.shields.io/badge/Hibernate-59666C?logo=hibernate&logoColor=fff&style=for-the-badge)

![Image](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)


![Thymeleaf Badge](https://img.shields.io/badge/Thymeleaf-005F0F?logo=thymeleaf&logoColor=fff&style=for-the-badge)

![Image](https://img.shields.io/badge/JavaScript-323330?style=for-the-badge&logo=javascript&logoColor=F7DF1E)

![Spring Boot Badge](https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=fff&style=for-the-badge)

![Font Awesome Badge](https://img.shields.io/badge/Font%20Awesome-528DD7?logo=fontawesome&logoColor=fff&style=for-the-badge)


----------

## Fonctionnalités 📋

**1. Afficher la liste des festivals**

Notre site affiche une liste de festivals dans un tableau et ajoute également un marqueur sur la carte Open Street Map pour chacun d'eux. Lorsqu'un utilisateur clique sur un marqueur, une pop-up s'affiche avec les principales informations relatives au festival correspondant.


![Image](https://zupimages.net/up/23/15/6blx.png)


**2. Ajouter un festival**

Notre site permet à l'utilisateur d'ajouter un festival en cliquant sur le bouton "Ajouter un festival" présent sur la page d'accueil. Une fois sur la page d'ajout, l'utilisateur a la possibilité d'annuler sa saisie via un bouton dédié. Si l'utilisateur choisit d'annuler, il sera redirigé vers la page d'accueil. En revanche, s'il valide l'ajout, il sera également redirigé vers la page d'accueil où il pourra immédiatement constater l'actualisation de la liste des festivals et l'apparition du marqueur correspondant sur la carte.


![Image](https://zupimages.net/up/23/15/456g.png)


**3. Editer un festival**

Notre site offre à l'utilisateur la possibilité d'éditer un festival (à l'exception de sa géolocalisation) en cliquant sur le bouton "Editer" situé à la fin de chaque entrée du tableau. Une fois le bouton "Editer" cliqué, l'utilisateur est redirigé vers la page d'édition du festival choisi. Comme pour la page d'ajout, l'utilisateur peut annuler ses modifications à tout moment en cliquant sur le bouton dédié. S'il annule, il sera redirigé vers la page d'accueil. En revanche, s'il valide ses modifications, les données seront mises à jour dans la base de données et également immédiatement affichées dans la liste des festivals sur la page d'accueil. Le marqueur correspondant sur la carte sera également mis à jour. Dans tous les cas, que l'utilisateur annule ou valide, il sera redirigé vers la page d'accueil.


![Image](https://zupimages.net/up/23/15/dzrn.png)


----------



## Prérequis 🔐

**1. Créer une base de données MySQL**

Dans ce projet, la base de données 'festivals' doit être créee avant de lancer l'application. Cependant, la table 'festival' n'a pas besoin d'être créée préalablement car elle sera générée automatiquement à partir du code. Le DataLoader a été créé pour permettre d'enregistrer les données fictives dans la base de données lors du lancement de l'application en utilisant le fichier 'festivals.json' qui est inclus dans le projet.

**2. Cloner le repository**

Vous pouvez consulter la documentation correspondante en cliquant sur le lien suivant : https://docs.github.com/fr/repositories/creating-and-managing-repositories/cloning-a-repository.
Elle contient toutes les informations nécessaires pour cloner le dépôt.

**3. Modification de application.properties**

Pour pouvoir vous connecter à votre base de donnée vous devrez adapter votre configuration dans ce fichier situé dans resources/application.properties

![Image](https://zupimages.net/up/23/15/qt9j.png)


----------

## Utilisation 💻

Instructions d'utilisation

1. Pour lancer l'application , exécuter le fichier 'CarteInteractiveApplication' se situant dans 'fr.simplon.fetivals.CarteInteractiveApplication'

2. Ouvrez votre navigateur et veuillez vous rendre à l'adresse [http://localhost:8080/](url)
   Si tout c'est passé correctement, la page d'acceuil du site sera affiché et vous serez prêt à utiliser l'application.

3. Enjoy ! ✨



----------


## Updates 🥇

**1. internationalisation**


Le site est capable de s'adapter à la langue du navigateur de l'utilisateur grâce à une fonctionnalité d'internationalisation.

*( le 13 avril 2023 )*

-> Ajout de l'anglais et l'anglais américain

-> Ajout de l'espagnol

**2. UI/UX**

*( le 13 avril 2023 )*

Afin d'améliorer la lisibilité, le format d'affichage de la date dans la liste a été modifié.

*( le 14 avril 2023 )*

Afin d'améliorer l'expérience utilisateur, plusieurs fonctionnalités ont été ajoutées. Il est désormais possible de faire défiler la liste des festivals tout en gardant le menu fixe, ce qui permet de visualiser les informations en tout temps. De plus, un effet de survol a été ajouté pour les cellules de la table, ce qui améliore la visibilité des informations. Les boutons ont également été retravaillés pour un design plus moderne, tout comme le header et le footer.
Désormais, lors de la création d'un festival, l'utilisateur a la possibilité de sélectionner la latitude et la longitude en cliquant directement sur la carte. Les données sélectionnées sont ensuite automatiquement enregistrées dans les champs correspondants.

**3. Sécurité**


*( le 14 avril 2023 )*

Un script de sécurité a été ajouté pour protéger les données entrées par l'utilisateur avant leur insertion dans la base de données, évitant ainsi les erreurs 500 qui pourraient se produire. Des messages d'erreur s'affichent maintenant sous chaque champ qui poserait problème, avertissant l'utilisateur en cas de saisie incorrecte.