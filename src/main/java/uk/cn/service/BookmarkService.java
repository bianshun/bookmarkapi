package uk.cn.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uk.cn.domain.Bookmark;
import uk.cn.repository.BookmarkRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookmarkService {

    private final BookmarkRepository repository;

    public List<Bookmark> getAllBookmarks(){
        return repository.findAll();
    }
}
