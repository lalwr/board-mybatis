package com.board.controller;

import com.board.service.BoardService;
import com.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/boards")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping
    public String boards(ModelMap modelMap){

        List<BoardVO> boardList = boardService.boards();
        List<BoardVO> boardList2 = boardService.boardsXML();
        modelMap.addAttribute("boardList", boardList);
        modelMap.addAttribute("boardList2", boardList2);

        return "board/list";
    }

    @PostMapping
    public String boardWrite(){
        return "board_write";
    }

    @GetMapping("/{boardId}")
    public String boardRead(){
        return "board_read";
    }

    @DeleteMapping
    public String boardDelete(){
        return "redirect:/boards";
    }

}
