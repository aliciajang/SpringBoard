package com.springbook.biz.user;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public UserVO getUser(UserVO vo) {	
		return (UserVO) em.find(UserVO.class, vo.getId());

    }

	@Transactional
	public void createUser(UserVO vo) {
		em.persist(vo);
	}
	
	@Transactional
	public void changePassword(UserVO vo) {		
		UserVO findUser = em.find(UserVO.class, vo.getId());
		findUser.setPassword(vo.getPassword());
		em.merge(findUser);		
	}
}
