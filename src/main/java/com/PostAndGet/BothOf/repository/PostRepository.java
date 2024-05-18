package com.PostAndGet.BothOf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PostAndGet.BothOf.entity.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Integer> {

}
