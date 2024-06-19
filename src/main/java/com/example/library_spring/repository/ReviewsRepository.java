package com.example.library_spring.repository;

//import com.example.library_spring.model.Review;

import com.example.library_spring.proto.UserAndBookAndReviewProto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewsRepository extends JpaRepository<UserAndBookAndReviewProto.Review, Long> {
}
