package bookpra.bookcon.service;

import bookpra.bookcon.dao.MarketDAO;
import bookpra.bookcon.entity.Market;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MarketService {
    private MarketDAO marketDAO;

    public List<Market> findAll() {
        return marketDAO.findAll();
    }

    public void save(Market market) {
        marketDAO.save(market);
    }

    public Optional<Market> findById(int market_id) {
        return marketDAO.findById(market_id);
    }

    public void deleteById(int market_id) {
        marketDAO.deleteById(market_id);
    }
}
