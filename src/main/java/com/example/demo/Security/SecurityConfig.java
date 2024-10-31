package com.example.demo.Security;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
@EnableWebSecurity

public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity  http) throws Exception {

        /* Première  solution  */
 /*  http
        .authorizeHttpRequests((authz) -> authz
            .anyRequest().authenticated()
        )
        //.httpBasic(withDefaults());
        .formLogin(withDefaults());
        
 */  
/* Deuxième solution  */
        http
        .csrf(csrf -> csrf.disable()) 
        .cors(withDefaults())
        .authorizeHttpRequests(authorizeRequests ->
            authorizeRequests
                .requestMatchers("/public/**").permitAll()
                .requestMatchers("/user/**").hasRole("USER") // Accès limité aux utilisateurs avec le rôle USER
                .requestMatchers("/admin/**").hasRole("ADMIN") // Accès limité aux utilisateurs avec le rôle 
                .anyRequest().authenticated() // Toutes les autres requêtes nécessitent une authentification
        )
        .httpBasic(withDefaults()); // Utilisation de l'authentification HTTP Basi 
        
         return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        User.UserBuilder users = User.withUsername("user")
                .password(passwordEncoder().encode("password"))
                .roles("USER");
        
        return new InMemoryUserDetailsManager(
                users.build(),
                User.withUsername("admin")
                    .password(passwordEncoder().encode("adminpass"))
                    .roles("ADMIN")
                    .build()
        );
    }
     @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
     @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
       // Ignorer les requêtes aux ressources statiques comme CSS, JS, images, etc. 
        return (web) -> web.ignoring().requestMatchers("/resources/**"); 
    }
}
