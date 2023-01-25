package com.lec.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lec.board.service.BoardService;
import com.lec.board.vo.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		List<BoardVO> list = boardService.selectList();
		model.addAttribute("list",list);
		return "board/list";
	}
	
	
	@RequestMapping("/view.do")
	public ModelAndView view(@RequestParam String wr_uid) {
		boardService.updateViewcnt(wr_uid);
		BoardVO board = boardService.selectOne(wr_uid);
		return new ModelAndView("board/view","board",board);
	}
	
	@RequestMapping("/write.do")
	public String write() {
		return "board/write";
	}
	
	@RequestMapping("/writeOk.do")
	public String writeOk(@ModelAttribute BoardVO board) {
		boardService.insertOne(board);
		return "redirect:/board/list.do";
	}
	
	@RequestMapping("/update.do")
	public ModelAndView update(@RequestParam String wr_uid) {
		
		BoardVO board = boardService.selectOne(wr_uid);
		return new ModelAndView("board/update","board",board);
	}
	
	@RequestMapping("/updateOk.do")
	public String updateOk(@ModelAttribute BoardVO board) {
		
		boardService.updateOne(board);
		return "redirect:/board/list.do";
	}
	
	@RequestMapping("/deleteOk.do/{wr_uid}")
	public String deleteOk(@PathVariable String wr_uid) {
		
		boardService.deleteOne(wr_uid);
		return "redirect:/board/list.do";
	}
	
	
}
