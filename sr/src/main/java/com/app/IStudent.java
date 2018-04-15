package com.app;

import org.springframework.data.repository.CrudRepository;

// no need to write crud methods
// Repository class ve Dao işlemlerine gerek yok
public interface IStudent extends CrudRepository<Student, Long> {

}
