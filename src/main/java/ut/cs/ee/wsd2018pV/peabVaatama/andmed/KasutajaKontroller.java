package ut.cs.ee.wsd2018pV.peabVaatama.andmed;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KasutajaKontroller {
    private final UserRepository userRepository;

    KasutajaKontroller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/contact")
    public String showAllUsers(Model model) {
        model.addAttribute("kasutajad", userRepository.findAll());
        return "home/contact";
    }
    @PostMapping("/contact")
    public String salvestaKasutaja(@ModelAttribute Kasutajad kasutaja) {
        userRepository.save(kasutaja);
        return "redirect:/contact";
    }

}
