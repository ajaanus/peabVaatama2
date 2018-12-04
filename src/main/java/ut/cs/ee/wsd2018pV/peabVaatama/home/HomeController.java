package ut.cs.ee.wsd2018pV.peabVaatama.home;
//src/main/java/ee/ut/cs/wad2018/fall/springbootdemo/home/HomeController.java
//package ee.ut.cs.wad2018.fall.springbootdemo.home;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getTestPage() {
        return "home/index";
    }

    @RequestMapping(path = "/product", method = RequestMethod.GET)
    public String getPhonePage() {
        return "home/product";
    }

//    @RequestMapping(path = "/contact", method = RequestMethod.GET)
//    public String getContactPage() {
  //      return "home/contact";
//    }

    // Same as @RequestMapping(method = RequestMethod.GET)
    @GetMapping(path = "/test-dynamic")
    public String getTest2Page(
            @RequestParam(value = "name-from-url",
                    required = false,
                    defaultValue = "World") String nameFromUrl, Model model) {
        model.addAttribute("nameTemplate", nameFromUrl);
        return "home/index_dynamic";
    }


}

