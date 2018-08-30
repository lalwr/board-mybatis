package com.board.dao;

import com.board.vo.BoardVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO extends CommonDAO{

    public List<BoardVO> board() {
        return getSqlSession().selectList("Board.list");
    }
}
