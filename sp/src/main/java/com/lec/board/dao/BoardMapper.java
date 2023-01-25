package com.lec.board.dao;

import java.util.List;

import com.lec.board.vo.BoardVO;

public interface BoardMapper {

	List<BoardVO> selectAll();
	
	BoardVO selectOne(String wr_uid);
	
	void insertOne(BoardVO board);
	
	void updateOne(BoardVO board);
	
	void deleteOne(String wr_uid);
	
	void updateViewcnt(String wr_uid);
}