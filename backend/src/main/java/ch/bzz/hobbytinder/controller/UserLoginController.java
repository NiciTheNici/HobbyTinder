package ch.bzz.hobbytinder.controller;

import ch.bzz.hobbytinder.model.User;
import ch.bzz.hobbytinder.util.SHA256;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

@RestController
public class UserLoginController {

        @PostMapping("/login")
        public String login(@RequestParam(value="email") String email, @RequestParam(value="password") String password, HttpServletResponse response) {
            //Get Database entry and check if user exists and password is correct
            Cookie cookie = new Cookie("LoggedIn","true");
            response.addCookie(cookie);
            return "Logged in with email: " + email + " and password: " + SHA256.getHexString(SHA256.getSHA(password));
        }

    @PostMapping("/register")
    public String register(@RequestParam(value="email") String email, @RequestParam(value="password") String password,@RequestParam(value="name") String name, @RequestParam(value="firstname") String firstname,  @RequestParam(value="birthday") String birthday, HttpServletResponse response) {
        //  return "Logged in with email: " + email + " and password: " + password;
        User user = new User();
        user.setUserUUDI(UUID.randomUUID());
        user.setName(name);
        user.setFirstname(firstname);
        user.setBirthdate(new Date(birthday));
        user.setPassword(SHA256.getHexString(SHA256.getSHA(password)));
        user.setEmail(email);
        return "User created: " + user.toString();
    }
}
