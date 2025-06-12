package uk.cn.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uk.cn.domain.Bookmark;
import uk.cn.dto.BookmarksDTO;
import uk.cn.repository.BookmarkRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BookmarkService {

    private final BookmarkRepository repository;
    private final int maxNoPerPage = 10;

    @Transactional(readOnly = true)
    public BookmarksDTO getBookmarksByPage(Integer page){
        int pageNo = page < 1 ? 0 : page -1;
        Pageable pageable = PageRequest.of(pageNo, maxNoPerPage, Sort.Direction.ASC, "createdAt");
        return new BookmarksDTO(repository.findAll(pageable));
    }
}
