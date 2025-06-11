package uk.cn.sql;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uk.cn.domain.Bookmark;
import uk.cn.repository.BookmarkRepository;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Bookmark(null, "Sanxiangu", "http://webjb.org/sanxian", Instant.now()));
        repository.save(new Bookmark(null, "wenxuecity", "http://wenxuecity.com", Instant.now()));
        repository.save(new Bookmark(null, "youtube", "https://youtube.com", Instant.now()));
        repository.save(new Bookmark(null, "Quarkus", "https://quarkus.io/", Instant.now()));
        repository.save(new Bookmark(null, "baeldung", "https://www.baeldung.com", Instant.now()));
        repository.save(new Bookmark(null, "Sanxiangu", "http://webjb.org/sanxian", Instant.now()));
        repository.save(new Bookmark(null, "wenxuecity", "http://wenxuecity.com", Instant.now()));
        repository.save(new Bookmark(null, "youtube", "https://youtube.com", Instant.now()));
        repository.save(new Bookmark(null, "Quarkus", "https://quarkus.io/", Instant.now()));
        repository.save(new Bookmark(null, "baeldung", "https://www.baeldung.com", Instant.now()));
        repository.save(new Bookmark(null, "Sanxiangu", "http://webjb.org/sanxian", Instant.now()));
        repository.save(new Bookmark(null, "wenxuecity", "http://wenxuecity.com", Instant.now()));
        repository.save(new Bookmark(null, "youtube", "https://youtube.com", Instant.now()));
        repository.save(new Bookmark(null, "Quarkus", "https://quarkus.io/", Instant.now()));
        repository.save(new Bookmark(null, "baeldung", "https://www.baeldung.com", Instant.now()));
        repository.save(new Bookmark(null, "Sanxiangu", "http://webjb.org/sanxian", Instant.now()));
        repository.save(new Bookmark(null, "wenxuecity", "http://wenxuecity.com", Instant.now()));
        repository.save(new Bookmark(null, "youtube", "https://youtube.com", Instant.now()));
        repository.save(new Bookmark(null, "Quarkus", "https://quarkus.io/", Instant.now()));
        repository.save(new Bookmark(null, "baeldung", "https://www.baeldung.com", Instant.now()));
   }
}



