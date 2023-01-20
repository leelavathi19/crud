package com.mongo.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.crud.model.StudentModel;

public interface StudentRepository extends MongoRepository<StudentModel, Integer>{

}