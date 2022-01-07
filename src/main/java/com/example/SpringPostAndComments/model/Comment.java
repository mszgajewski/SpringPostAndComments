package com.example.SpringPostAndComments.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Comment {

    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long postId;
    private String content;
    private LocalDateTime created;


}