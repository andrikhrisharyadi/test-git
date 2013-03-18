package telkomsigma.itbroadband.web.security;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import telkomsigma.itbroadband.model.security.Authority;

@RequestMapping("/security/roles")
@Controller
@RooWebScaffold(path = "security/roles", formBackingObject = Authority.class)
public class RoleController {
}
