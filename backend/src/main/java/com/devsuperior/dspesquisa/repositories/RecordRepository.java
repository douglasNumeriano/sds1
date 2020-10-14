package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Record;

@Repository // Componente gerenciado pelo Sprinboot
public interface RecordRepository extends JpaRepository<Record, Long> {

}
