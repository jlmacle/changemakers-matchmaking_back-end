package cm.controllers;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import cm.repositories.ContributorsRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ContributorController {
    Logger logger = LoggerFactory.getLogger(ContributorController.class);

    private final PasswordEncoder passwordEncoder;

    private final ContributorsRepository contributorRepository;

    public ContributorController(PasswordEncoder passwordEncoder, ContributorsRepository contributorRepository) {
        this.passwordEncoder = passwordEncoder;
        this.contributorRepository = contributorRepository;
    }

    /** A method used to retrieve contributor data when authentication succeeds.
     * 
     */
    @PostMapping("/contributor_auth")
    public String authenthicator(@RequestBody Map<String, String> credentials) {

        // String username = credentials.get("username");
        // String encodedPassword = passwordEncoder.encode(credentials.get("password"));

        // Contributor contributor = new Contributor();
        // contributor.setUsername(username);
        // contributor.setPassword(encodedPassword);
        // contributorRepository.save(contributor);
        
        return "Authentification successfull";
    }
    

    
    
    
    
}