package com.example.redditclone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

import java.time.Instant;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Subreddit
{
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long userId;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String email;

    private Instant created;
    private boolean enabled;

}
