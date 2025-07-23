package Snippet.demo;

import jakarta.persistence.*;
import jdk.jshell.Snippet;

import java.util.List;

@Entity
public class User {
    @Id
    private String userStrId;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Snippet> snippets;

    // Constructors
    public User() {}
    public User(String userStrId) {
        this.userStrId = userStrId;
    }

    // Getters and Setters
    public String getUserStrId() {
        return userStrId;
    }

    public void setUserStrId(String userStrId) {
        this.userStrId = userStrId;
    }

    public List<Snippet> getSnippets() {
        return snippets;
    }

    public void setSnippets(List<Snippet> snippets) {
        this.snippets = snippets;
    }
}
