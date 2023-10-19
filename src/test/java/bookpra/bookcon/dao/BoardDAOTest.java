package bookpra.bookcon.dao;

import bookpra.bookcon.service.BoardService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@AllArgsConstructor
class BoardDAOTest {

    BoardService bs;

    @Test
    @Transactional
    public void getNextNoTest() {
        int result = bs.getNextNo();

        assertEquals(result,1);

    }

}