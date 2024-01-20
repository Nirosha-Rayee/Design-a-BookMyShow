package com.example.bookmyshowcode.repositories;

import com.example.bookmyshowcode.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {
    //List<ShowSeatType> findByShowId(Long showId);

    List<ShowSeatType> findAllByShow(Long showId);

    //List<ShowSeatType> findAllByShow(Long id);
}
