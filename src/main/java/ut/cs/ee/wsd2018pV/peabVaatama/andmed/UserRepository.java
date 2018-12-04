package ut.cs.ee.wsd2018pV.peabVaatama.andmed;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<Kasutajad, Long> {

    // SELECT * FROM users
    List<Kasutajad> findAll();

    @Query(value = "SELECT * FROM kasutajad WHERE perenimi = :perenimi",
            nativeQuery = true)
    Kasutajad findByPerenimi(@Param("perenimi") String perenimi);

}