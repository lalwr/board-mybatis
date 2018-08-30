package com.board.service;

import com.board.dao.BoardDAO;
import com.board.mapper.BoardMapper;
import com.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardDAO boardDAO;

    @Autowired
    BoardMapper boardMapper;

    @Override
    public List<BoardVO> boards() {
        return boardMapper.board();
    }

    @Override
    public List<BoardVO> boardsXML() {
        return boardMapper.boardXml();
    }
}
