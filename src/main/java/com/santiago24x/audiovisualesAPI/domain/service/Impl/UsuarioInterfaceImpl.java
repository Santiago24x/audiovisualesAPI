package com.santiago24x.audiovisualesAPI.domain.service.Impl;


import com.santiago24x.audiovisualesAPI.domain.exceptions.AdminIdNotFoundException;
import com.santiago24x.audiovisualesAPI.domain.exceptions.AdminNotFoundException;
import com.santiago24x.audiovisualesAPI.domain.repository.UsuarioRepository;
import com.santiago24x.audiovisualesAPI.domain.service.UsuarioInterface;
import com.santiago24x.audiovisualesAPI.persistence.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioInterfaceImpl implements UsuarioInterface<Usuario> {

    private final  UsuarioRepository repository;

    @Autowired
    public UsuarioInterfaceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Usuario> getAll() {
        return repository.findAll();
    }

    @Override
    public ResponseEntity<Usuario> getById(Object id) {
        try{
            Long  newId = Long.parseLong(id.toString());
            Usuario optionalAdmin = repository.findById(Math.toIntExact(newId))
                    .orElseThrow(() -> new AdminNotFoundException("Admin no encontrado"));
            return ResponseEntity.ok(optionalAdmin);

        }catch (NumberFormatException e){
            throw new AdminIdNotFoundException("Haz ingresado una letra u/o otro caracter diferente a un Número de tipo Long");
        }
    }

    @Override
    public ResponseEntity<Usuario> save(Usuario usuario) {
        repository.save(usuario);
        return ResponseEntity.ok(usuario);
    }

    @Override
    public ResponseEntity<Void> delete(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
