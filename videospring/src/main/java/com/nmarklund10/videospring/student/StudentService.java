package com.nmarklund10.videospring.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Student> getStudents() {
		return List.of(
			new Student(
                1L,
                "Mariam",
                "mariam.jamal@gmail.com",
                LocalDate.of(2002, Month.FEBRUARY, 15),
                20
            )
		);
	}
}
