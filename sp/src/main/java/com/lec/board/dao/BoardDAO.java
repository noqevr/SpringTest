package com.lec.board.dao;

import java.util.List;

import com.lec.board.vo.BoardVO;

public interface BoardDAO {

	public List<BoardVO> selectAll();
	
	public BoardVO select(String wr_uid);
	
	public void updateCount(String wr_uid);
	
	public void insert(BoardVO board);
	
	public void update(BoardVO board);
	
	public void delete(String wr_uid);
}