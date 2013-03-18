package telkomsigma.itbroadband.model.security;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "roles")
public class Authority {

    @NotNull
    @Size(min = 5, max = 50)
    private String label;

    @NotNull
    @Column(unique = true)
    @Size(min = 6, max = 20)
    @Pattern(regexp = "^ROLE_[A-Z]*")
    private String name;
}
