package bookpra.bookcon.dao;

import bookpra.bookcon.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketDAO extends JpaRepository<Market, Integer> {
}
