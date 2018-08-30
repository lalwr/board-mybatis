package com.board.mapper;

import com.board.vo.BoardVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BoardMapper {

    @Select("SELECT * FROM board")
    public List<BoardVO> board();

    public List<BoardVO> boardXml();
}
