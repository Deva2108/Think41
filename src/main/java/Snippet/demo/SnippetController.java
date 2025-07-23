package Snippet.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/snippets")
public class SnippetController {

    @Autowired
    private SnippetService snippetService;

    @PostMapping("/{userId}")
    public Snippet saveSnippet(@PathVariable String userId, @RequestBody Snippet snippet) {
        return snippetService.saveSnippet(userId, snippet);
    }

    @GetMapping("/{userId}")
    public List<Snippet> getSnippets(@PathVariable String userId) {
        return snippetService.getSnippetsByUser(userId);
    }

    @GetMapping("/search")
    public List<Snippet> search(@RequestParam String keyword) {
        return snippetService.searchSnippets(keyword);
    }
}
