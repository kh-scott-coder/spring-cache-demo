//package com.netsurfingzone.serviceimpl;
//
//import java.awt.print.Book;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.netsurfingzone.entity.TestCytbRatesHistory;
//import com.netsurfingzone.repository.TestCytbRatesHistoryRespository;
//import com.netsurfingzone.service.TestCytbRatesHistoryService;
//
//@Service
//public class TestCytbRatesHistoryServiceImpl implements TestCytbRatesHistoryService {
//
//	@Autowired
//	private TestCytbRatesHistoryRespository respository;
//
//	@PersistenceContext
//	private EntityManager entityManager;
//
//	@Override
//	public TestCytbRatesHistory saveRate(TestCytbRatesHistory rate) {
//		rate = respository.save(rate);
//		return rate;
//	}
//
//	@Override
//	public TestCytbRatesHistory findById(int rateId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	@Transactional
//	public TestCytbRatesHistory getRateUsingHQL(int rateId) {
//		String hql = "FROM Book b WHERE b.bookId = :rateId";
//		Query query = entityManager.createQuery(hql, TestCytbRatesHistory.class);
//		query.setParameter("bookId", rateId);
//		query.setHint("org.hibernate.cacheable", "true");
//		List<TestCytbRatesHistory> books = query.getResultList();
//		return books.get(0);
//
//	}
//
//	@Override
//	public TestCytbRatesHistory updateRate(TestCytbRatesHistory rate) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public TestCytbRatesHistory getRateUsingFind(int rateIdo) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
