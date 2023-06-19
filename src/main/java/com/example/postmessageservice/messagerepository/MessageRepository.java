package com.example.postmessageservice.messagerepository;

import com.example.postmessageservice.messagemodule.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service

public interface MessageRepository extends MongoRepository<Message,String> {

    @Query("""
            {
            "sendersUsername": { "$in":[ ?0, ?1 ] },
            "receiversUsername": { "$in": [ ?1, ?0] }
            }
            """)
    Page<Message> findMessages(
            @Param("sendersUsername") String sendersUsername,
            @Param("receiversUsername") String receiversUsername,
            Pageable pageable);

}
