//package com.netsurfingzone.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.netsurfingzone.entity.TestCytbRatesHistory;
//import com.netsurfingzone.service.TestCytbRatesHistoryService;
//
//@RestController
//@RequestMapping(value = "/rate")
//public class TestCytbRatesHistoryController {
//
//	@Autowired
//	private TestCytbRatesHistoryService service;
//
//	@RequestMapping(value = "/saveRate", method = RequestMethod.POST)
//	@ResponseBody
//	public TestCytbRatesHistory saveBook(@RequestBody TestCytbRatesHistory input) {
//
//		TestCytbRatesHistory bookResponse = service.saveRate(input);
//		return bookResponse;
//	}
//
////	@RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
////	@ResponseBody
////	public TestCytbRatesHistory getBookDetails(@PathVariable int bookId) {
////		TestCytbRatesHistory bookResponse = bookService.getBookUsingFind(bookId);
////
////		return bookResponse;
////	}
////
////	@RequestMapping(value = "/update", method = RequestMethod.PUT)
////	@ResponseBody
////	public TestCytbRatesHistory updateBook(@RequestBody Book book) {
////		TestCytbRatesHistory bookResponse = (Book) bookService.updateBook(book);
////		return bookResponse;
////	}
//
//}
