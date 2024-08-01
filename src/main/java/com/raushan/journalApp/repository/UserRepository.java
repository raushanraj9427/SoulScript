package com.raushan.journalApp.repository;

import com.raushan.journalApp.entity.JournalEntry;
import com.raushan.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String userName);
}
