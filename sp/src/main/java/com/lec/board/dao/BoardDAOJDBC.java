package com.lec.board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lec.board.vo.BoardVO;

@Repository("boardDao")
public class BoardDAOJDBC implements BoardDAO {

	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> selectAll() {
		List<BoardVO> list = boardMapper.selectAll();
		return list;
	}

	@Override
	public BoardVO select(String wr_uid) {
		BoardVO board = boardMapper.selectOne(wr_uid);
		return board;
	}

	
	@Override
	public void updateCount(String wr_uid) {
		boardMapper.updateViewcnt(wr_uid);
	}

	@Override
	public void insert(BoardVO board) {
		boardMapper.insertOne(board);
	}

	@Override
	public void update(BoardVO board) {
		boardMapper.updateOne(board);
	}

	@Override
	public void delete(String wr_uid) {
		boardMapper.deleteOne(wr_uid);
	}


}