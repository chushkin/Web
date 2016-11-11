import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("login", "command", new User());
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("SpringWeb") User user,
                             ModelMap model) {
        model.addAttribute("email", user.getEmail());
        model.addAttribute("password", user.getPassword());
        if (checkUser(user.getEmail(), user.getPassword())) {
            return "result";
        } else {
            return "login";
        }
    }

    private String _email = "jek@sophos.com";
    private String _pass = "0000";

    private boolean checkUser(String email, String pass) {
        if(email.equals(_email)&&pass.equals(_pass))
            return true;
        return false;
    }
}