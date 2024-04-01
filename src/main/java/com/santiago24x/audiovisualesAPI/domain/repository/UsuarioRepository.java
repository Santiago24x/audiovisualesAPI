package com.santiago24x.audiovisualesAPI.domain.repository;

import com.santiago24x.audiovisualesAPI.persistence.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
