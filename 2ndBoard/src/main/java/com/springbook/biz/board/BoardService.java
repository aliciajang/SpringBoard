package com.springbook.biz.board;

import java.util.List;

public interface BoardService {
	
	public void updateBoard(BoardVO vo);
	public void deleteBoard(BoardVO vo);
	public void insertBoard(BoardVO vo);
	public BoardVO getBoard(BoardVO vo);
	public List<BoardVO> getBoardList(BoardVO vo);
}
