package com.example.bookmyshowcode.repositories;

import com.example.bookmyshowcode.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
    @Override
    Optional<ShowSeat> findById(Long id);

    @Override
    ShowSeat save(ShowSeat showSeat); //upsert --> insert + update
}
