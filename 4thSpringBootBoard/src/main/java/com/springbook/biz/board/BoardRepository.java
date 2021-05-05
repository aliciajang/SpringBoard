package com.springbook.biz.board;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lombok.NonNull;


@Repository
public class BoardRepository {
	
	@PersistenceContext
	private EntityManager em;
		
	// 글 등록
	@Transactional
	public void insertBoard(BoardVO vo) {
		em.persist(vo);
	}
	
	// 글 수정
	@Transactional	
	public void updateBoard(BoardVO vo) {
		BoardVO boardBySeq = em.find(BoardVO.class, vo.getSeq());
		boardBySeq.setTitle(vo.getTitle());
		boardBySeq.setContent(vo.getContent());
		em.merge(boardBySeq);
	}

	// 글 삭제
	@Transactional
	public void deleteBoard(BoardVO vo) {
		em.remove(em.find(BoardVO.class, vo.getSeq()));
	
	}
	
	@Transactional
	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO) em.find(BoardVO.class, vo.getSeq());
	}
	
	@Transactional
	public List<BoardVO> getBoardList(BoardVO vo) {	
		return em.createQuery("from BoardVO b order by b.seq desc").getResultList();
	}	
	
}
