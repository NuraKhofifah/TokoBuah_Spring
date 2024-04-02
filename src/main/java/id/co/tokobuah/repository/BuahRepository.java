package id.co.tokobuah.repository;

import id.co.tokobuah.model.Buah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import static id.co.tokobuah.constant.BuahConstant.qAllDataActive;

@Repository
public interface BuahRepository extends JpaRepository<Buah, Integer> {
    @Query(value = qAllDataActive, nativeQuery = true)
    List<Buah> findByStatus(int status);
}
