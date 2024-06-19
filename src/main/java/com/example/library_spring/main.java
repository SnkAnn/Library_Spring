package com.example.library_spring;

import com.example.library_spring.proto.UserAndBookAndReviewProto;

public class main {
    public static void main(String[] args) {
        UserAndBookAndReviewProto.User user= UserAndBookAndReviewProto.User.newBuilder().build();
       System.out.println( user.getId());
       System.out.println( user.getDescription());

    }
}
