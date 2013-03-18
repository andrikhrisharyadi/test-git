package telkomsigma.itbroadband.model.security;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "users")
public class Principal {

    @NotNull
    @Column(unique = true)
    @Size(min = 5, max = 50)
    private String name;

    @NotNull
    @Size(min = 5, max = 50)
    private String password;

    private Boolean enabled;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Authority> roles = new HashSet<Authority>();
}
