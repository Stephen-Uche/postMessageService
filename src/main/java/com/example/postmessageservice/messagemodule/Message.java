package com.example.postmessageservice.messagemodule;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "message")
@JsonInclude(JsonInclude.Include.NON_NULL)
//@Document(collection = "Message")

public class Message {

    @Id
    private String id;

    private String sendersUsername;
    private String receiversUsername;

    private String message;

    private String dateAndTime;

//    public Message() {}
//
//    public Message(String id, String sendersUsername, String receiversUsername, String message, String dateAndTime) {
//        this.id = id;
//        this.sendersUsername = sendersUsername;
//        this.receiversUsername = receiversUsername;
//        this.message = message;
//        this.dateAndTime = dateAndTime;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Message{" +
//                "id='" + id + '\'' +
//                ", sendersUsername='" + sendersUsername + '\'' +
//                ", receiversUsername='" + receiversUsername + '\'' +
//                ", message='" + message + '\'' +
//                ", dateAndTime='" + dateAndTime + '\'' +
//                '}';
//    }
//


}

