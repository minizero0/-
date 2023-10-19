package bookpra.bookcon.service;


import bookpra.bookcon.dao.BoardDAO;
import bookpra.bookcon.entity.Board;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardService {

    private BoardDAO dao;

    public List<Board> findAll() {
        return dao.findAll();
    }

    public int getNextNo() {
        return dao.getNextNo();
    }

    public void insert(Board b) {
        dao.insert(b);
    }

    public Board findById(int no) {
        return dao.findById(no).get();
    }

    public void updateStep(int b_ref, int b_step) {
        dao.updateStep(b_ref, b_step);
    }

    public List<Board> selectAll() {
        return dao.selectAll();
    }

}
