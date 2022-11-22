package ch.bzz.hobbytinder.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class UserLoginController {

        @PostMapping("/login")
        public String login(@RequestParam(value="email") String email, @RequestParam(value="password") String password, HttpServletResponse response) {
            Cookie cookie = new Cookie("Test","Test");
            cookie.setMaxAge(7 * 24 * 60 * 60); // expires in 7 days
            System.out.println(email);
            System.out.println(password);
            response.addCookie(cookie);
            return "Logged in with email: " + email + " and password: " + password;
        }

    @PutMapping("/register")
    public String register(Model model, @RequestBody Map<String, String> body) {
        //  return "Logged in with email: " + email + " and password: " + password;
        return "";
    }
    }
