package com.jaystech.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaystech.in.dto.StudentOrder;

public interface StudentOrderRepo extends JpaRepository<StudentOrder, Long> {

	public StudentOrder findByRazorPayOrderId(String razorPayOrderId);

}
