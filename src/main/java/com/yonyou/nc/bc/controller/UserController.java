package com.yonyou.nc.bc.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.nc.bc.entity.User;
import com.yonyou.nc.bc.service.IUserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	private static final Logger logger = Logger.getLogger(UserController.class);
	    @Resource  
	    private IUserService userService;  

	    
//	    查询user
	    @GetMapping("/{id}")
		public @ResponseBody
		User show(@PathVariable(value = "id") int userId) {
	    	logger.info("id= "+userId);
	    	 User user = this.userService.getUserById(userId);  
	    	 return user;
		}
	    
	    @PostMapping
		public ResponseEntity createCustomer(@RequestBody User user) {

	    	logger.info("post  "+user);
			return new ResponseEntity(user, HttpStatus.OK);
		}
	    
	    @DeleteMapping("/{id}")
		public ResponseEntity deleteCustomer(@PathVariable Long id) {

	    	logger.info("delete  "+id);
			return new ResponseEntity(id, HttpStatus.NOT_FOUND);

		}

		@PutMapping
		public ResponseEntity updateCustomer( @RequestBody User customer) {
			customer.setName("update");
//			customer = customerDAO.update(id, customer);
			logger.info("put  "+customer);
		

			return new ResponseEntity(customer, HttpStatus.OK);
		}
	    
	}  

