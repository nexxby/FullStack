package com.foodscout.foodscout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodscout.foodscout.model.AttachedFile;
import com.foodscout.foodscout.model.Comment;

@Repository
public interface CommentRepository  extends JpaRepository<Comment, Long>{

}
