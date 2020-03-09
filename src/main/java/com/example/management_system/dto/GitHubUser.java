package com.example.management_system.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class GitHubUser {
    private String name;
    private Long id;
    private String bio;
}
