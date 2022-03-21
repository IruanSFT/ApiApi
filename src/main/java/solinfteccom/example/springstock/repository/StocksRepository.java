package solinfteccom.example.springstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import solinfteccom.example.springstock.model.Stocks;

@Repository
public interface StocksRepository extends JpaRepository<Stocks, Long>{
    
}