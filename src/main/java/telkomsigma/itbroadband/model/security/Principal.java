package telkomsigma.itbroadband.model.security;

import java.util.Collections;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import telkomsigma.itbroadband.validation.FieldMatch;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "users")
@FieldMatch.List({
    @FieldMatch(first = "password", second = "passwordConfirmation", message = "The password fields must match"),
})
public class Principal {

    @NotNull
    @Column(unique = true)
    @Size(min = 5, max = 50)
    private String name;

    @Size(min = 5, max = 50)
    @Transient
    private String password;

    @Transient
    private String passwordConfirmation;

    @Column(name = "HASHED_PASSWORD")
    private String hashedPassword;

    private Boolean enabled;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "users_roles",
		joinColumns = @JoinColumn(name = "USER_ID"),
		inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private Set<Authority> roles = Collections.emptySet();

//    @AssertTrue(message = "Password confirmation mismatched")
//    public boolean isPasswordConfirmationMatched() {
//        if (password == null) return true;
//        return password.equals(passwordConfirmation);
//    }

    @PrePersist
    @PreUpdate
    private void encryptPassword() {
       if (password != null) {
    	   // hashedPassword = Encryptors.sha256(password);
    	   // System.out.println(password + " ==(sha256)==> " + hashedPassword);

    	   hashedPassword = new StandardPasswordEncoder("1tBro4DbanD").encode(password);
    	   System.out.println(password + " => " + hashedPassword);
       }
    }

}
