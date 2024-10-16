package com.ramjay.flyvevej.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder @Entity @Table(name = "boger")
public class Bog {

    @Id
    private String isbn;
    private String title;
}
