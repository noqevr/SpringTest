package com.lec.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lec.board.dao.BoardDAO;
import com.lec.board.vo.BoardVO;

@Service("boardService")
public class BoardServiceImple implements BoardService {

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public List<BoardVO> selectList() {
		List<BoardVO> list = boardDao.selectAll();
		return list;
	}

	@Override
	public BoardVO selectOne(String wr_uid) {
		BoardVO board = boardDao.select(wr_uid);
		return board;
	}

	@Override
	public void updateViewcnt(String wr_uid) {
		boardDao.updateCount(wr_uid);
	}

	@Override
	public void insertOne(BoardVO board) {
		boardDao.insert(board);
	}

	@Override
	public void updateOne(BoardVO board) {
		boardDao.update(board);
	}

	@Override
	public void deleteOne(String wr_uid) {
		boardDao.delete(wr_uid);
	}

}