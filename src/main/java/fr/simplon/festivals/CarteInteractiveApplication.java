
package fr.simplon.festivals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Cette classe est le point d'entrée de l'application CarteInteractive. Elle démarre l'application Spring Boot et configure automatiquement les composants.
 */
@SpringBootApplication
public class CarteInteractiveApplication {

    /**
     * Constructeur par défaut de la classe CarteInteractiveApplication.
     */
    public CarteInteractiveApplication() {
        // TODO: Ajouter une implémentation si nécessaire.
    }

    /**
     * Méthode principale de l'application CarteInteractive.
     * Démarre l'application Spring Boot en utilisant la classe CarteInteractiveApplication comme configuration initiale.
     * @param args Les arguments de la ligne de commande (non utilisés dans cette application).
     */
    public static void main(String[] args) {
        // Démarre l'application Spring Boot en utilisant la classe CarteInteractiveApplication comme configuration initiale.
        SpringApplication.run(CarteInteractiveApplication.class, args);
    }

}


