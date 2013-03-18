// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package telkomsigma.itbroadband.web.security;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import telkomsigma.itbroadband.model.security.Authority;
import telkomsigma.itbroadband.model.security.Principal;
import telkomsigma.itbroadband.web.security.ApplicationConversionServiceFactoryBean;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    public Converter<Authority, String> ApplicationConversionServiceFactoryBean.getAuthorityToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<telkomsigma.itbroadband.model.security.Authority, java.lang.String>() {
            public String convert(Authority authority) {
                return new StringBuilder().append(authority.getLabel()).append(' ').append(authority.getName()).toString();
            }
        };
    }
    
    public Converter<Long, Authority> ApplicationConversionServiceFactoryBean.getIdToAuthorityConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, telkomsigma.itbroadband.model.security.Authority>() {
            public telkomsigma.itbroadband.model.security.Authority convert(java.lang.Long id) {
                return Authority.findAuthority(id);
            }
        };
    }
    
    public Converter<String, Authority> ApplicationConversionServiceFactoryBean.getStringToAuthorityConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, telkomsigma.itbroadband.model.security.Authority>() {
            public telkomsigma.itbroadband.model.security.Authority convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Authority.class);
            }
        };
    }
    
    public Converter<Principal, String> ApplicationConversionServiceFactoryBean.getPrincipalToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<telkomsigma.itbroadband.model.security.Principal, java.lang.String>() {
            public String convert(Principal principal) {
                return new StringBuilder().append(principal.getName()).append(' ').append(principal.getPassword()).append(' ').append(principal.getPasswordConfirmation()).append(' ').append(principal.getHashedPassword()).toString();
            }
        };
    }
    
    public Converter<Long, Principal> ApplicationConversionServiceFactoryBean.getIdToPrincipalConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, telkomsigma.itbroadband.model.security.Principal>() {
            public telkomsigma.itbroadband.model.security.Principal convert(java.lang.Long id) {
                return Principal.findPrincipal(id);
            }
        };
    }
    
    public Converter<String, Principal> ApplicationConversionServiceFactoryBean.getStringToPrincipalConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, telkomsigma.itbroadband.model.security.Principal>() {
            public telkomsigma.itbroadband.model.security.Principal convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Principal.class);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getAuthorityToStringConverter());
        registry.addConverter(getIdToAuthorityConverter());
        registry.addConverter(getStringToAuthorityConverter());
        registry.addConverter(getPrincipalToStringConverter());
        registry.addConverter(getIdToPrincipalConverter());
        registry.addConverter(getStringToPrincipalConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}
