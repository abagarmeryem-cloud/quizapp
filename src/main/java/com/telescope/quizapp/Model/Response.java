package com.telescope.quizapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_responses")
public class Response {
    private Long id;
    private String response;
    public Response(Long id, String response) {
        this.id = id;
        this.response = response;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getResponse() {
        return response;
    }
    public void setResponse(String response) {
        this.response = response;
    }
}
