package com.santiago24x.audiovisualesAPI.domain.service;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsuarioInterface<T>{
    List<T> getAll();
    ResponseEntity<T> getById(Object id);
    ResponseEntity<T> save(T t);
    ResponseEntity<Void> delete(Integer id);

}