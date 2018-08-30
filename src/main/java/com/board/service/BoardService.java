package com.board.service;

import com.board.vo.BoardVO;

import java.util.List;

public interface BoardService {
    List<BoardVO> boards();

    List<BoardVO> boardsXML();
}
