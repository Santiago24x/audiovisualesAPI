package com.santiago24x.audiovisualesAPI.domain.repository;

import com.santiago24x.audiovisualesAPI.persistence.entities.Plataformas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlataformasRepository extends JpaRepository<Plataformas, Integer> {
}
