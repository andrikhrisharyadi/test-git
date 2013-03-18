package telkomsigma.itbroadband.web.security;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import telkomsigma.itbroadband.model.security.Principal;

@RequestMapping("/security/users")
@Controller
@RooWebScaffold(path = "security/users", formBackingObject = Principal.class)
public class UserController {
}
