package com.santiago24x.audiovisualesAPI.web.controller;


import com.santiago24x.audiovisualesAPI.domain.service.Impl.UsuarioInterfaceImpl;
import com.santiago24x.audiovisualesAPI.persistence.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/register")

public class UsuarioController {
    private final UsuarioInterfaceImpl usuarioInterfaceImpl;

    @Autowired
    public UsuarioController(UsuarioInterfaceImpl usuarioInterfaceImpl) {
        this.usuarioInterfaceImpl = usuarioInterfaceImpl;
    }
    @GetMapping
    public List<Usuario> getAllAdmins(){
        return usuarioInterfaceImpl.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getAdminById(@PathVariable Object id) {
        return usuarioInterfaceImpl.getById(id);
    }

    @PostMapping
    public ResponseEntity<Usuario> saveAdmin(@RequestBody Usuario adminSave) {
        return usuarioInterfaceImpl.save(adminSave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable Long id) {
        return usuarioInterfaceImpl.delete(Math.toIntExact(id));
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Usuario> updateAdmin( @PathVariable Object id, @RequestBody Usuario adminUpdate) {
//        return usuarioInterfaceImpl.update(id, adminUpdate);
    }
