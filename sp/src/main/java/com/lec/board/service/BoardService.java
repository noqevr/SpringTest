package com.lec.board.service;

import java.util.List;

import com.lec.board.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> selectList();
	
	public BoardVO selectOne(String wr_uid);
	
	public void updateViewcnt(String wr_uid);
	
	public void insertOne(BoardVO board);
	
	public void updateOne(BoardVO board);
	
	public void deleteOne(String wr_uid);
}