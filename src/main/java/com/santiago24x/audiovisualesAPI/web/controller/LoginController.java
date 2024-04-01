package com.santiago24x.audiovisualesAPI.web.controller;


import com.santiago24x.audiovisualesAPI.domain.security.JWTAuthtenticationConfig;
import com.santiago24x.audiovisualesAPI.persistence.entities.Usuario;
import com.santiago24x.audiovisualesAPI.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private JWTAuthtenticationConfig jwtAuthtenticationConfig;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password) {

        Usuario usuario = usuarioRepository.findByUsername(username);

        if (usuario != null && usuario.getPassword().equals(password)) {
            String token = jwtAuthtenticationConfig.getJWTToken(username);
            usuarioRepository.save(usuario);
            return token;
        } else {
            throw new RuntimeException("Invalid Information");
        }
    }}