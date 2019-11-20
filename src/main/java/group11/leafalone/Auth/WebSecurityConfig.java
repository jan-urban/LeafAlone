package group11.leafalone.Auth;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/about", "/h2/**").permitAll()
                .antMatchers("/plants/contribute").hasRole("CONTRIBUTOR")
                .antMatchers("/plants/add").hasRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .csrf().ignoringAntMatchers("/h2/**")
                .and()
                .headers()
                .frameOptions()
                .disable()
                .and()
                .logout()
                .permitAll();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("user")
                        .password("password")
                        .roles("USER")
                        .build();
        UserDetails contributor =
                User.withDefaultPasswordEncoder()
                        .username("contributor")
                        .password("admin")
                        .roles("CONTRIBUTOR", "USER")
                        .build();

        return new InMemoryUserDetailsManager(user, contributor);
    }
}