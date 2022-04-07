package edutech;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;
import edutech.dao.*;
import edutech.entity.*;

@Component
@Log4j2 // Génère le 'logger' pour afficher les messages de trace
public class ConsoleApp implements CommandLineRunner {
    @Autowired // Auto-initialisé par Spring
    private UserRepository userDAO;
    @Autowired
    PasswordEncoder encoder;

    @Override
    /*
     * Equivalent de la méthode 'main' pour une application Spring Boot
     **/
    public void run(String... args) throws Exception {

        log.info("On liste tous les enregistrements de la table 'User'");
        List<User> tousLesUtilisateurs = userDAO.findAll();
        for (User u : tousLesUtilisateurs) {
            System.out.println(u);
        }
        
        tapezEnterPourContinuer();

        log.info("On ajoute un nouvel enregistrement");
        User eleve1 = new User("nico", "aymard","nico@gmail.com",encoder.encode("nicoymd"));
        log.info("Avant d'enregistrer, pas de clé : {}", eleve1);
        userDAO.save(eleve1);
        log.info("Après l'enregistrement, la clé a été générée : {}", eleve1);

        tapezEnterPourContinuer();

        log.info("Recherche par clé");
        Optional<User> oc = userDAO.findById(2);
        oc.ifPresent(c -> log.info("On a trouvé: {}", c));

        tapezEnterPourContinuer();

        log.info("Suppression par clé");
        log.info("Avant la suppression il y a {} enregistrements", userDAO.count());
        try {
            userDAO.deleteById(2);
            log.info("Après la suppression il reste {} enregistrements", userDAO.count());    
        } catch (DataIntegrityViolationException e) {
            log.info("Impossible de supprimer cet utilisateur, il reste toujours {} enregistrements", userDAO.count());    

        }
   }

    public static void tapezEnterPourContinuer() throws Exception {
        System.out.println("Tapez \"ENTER\" pour continuer...");
        System.in.read();
    }
}
