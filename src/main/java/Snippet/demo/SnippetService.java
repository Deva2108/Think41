package Snippet.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SnippetService {

    @Autowired
    private SnippetRepository snippetRepository;

    @Autowired
    private UserRepository userRepository;

    public Snippet saveSnippet(String userId, Snippet snippet) {
        User user = userRepository.findById(userId).orElseGet(() -> new User(userId));
        snippet.setUser(user);
        return snippetRepository.save(snippet);
    }

    public List<Snippet> getSnippetsByUser(String userId) {
        return snippetRepository.findByUserUserStrId(userId);
    }

    public List<Snippet> searchSnippets(String keyword) {
        return snippetRepository.findBySnippetNameContainingIgnoreCase(keyword);
    }
}
