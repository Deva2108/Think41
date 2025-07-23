package Snippet.demo;




import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SnippetRepository extends JpaRepository<Snippet, String> {
    List<Snippet> findByUserUserStrId(String userStrId);
    List<Snippet> findBySnippetNameContainingIgnoreCase(String keyword);
}

