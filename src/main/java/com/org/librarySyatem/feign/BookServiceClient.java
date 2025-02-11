package com.org.librarySyatem.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.Map;

@FeignClient(name = "book-service", url = "http://localhost:8080/api/books")
public interface BookServiceClient {

    @GetMapping("/by-author")
    List<Map<String, Object>> getBooksByAuthor(@RequestParam String authorName);
}
