package uk.cn.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.cn.dto.BookmarkDTO;
import uk.cn.dto.BookmarkMapper;
import uk.cn.dto.BookmarksDTO;
import uk.cn.repository.BookmarkRepository;

import java.awt.print.Book;


@Service
@RequiredArgsConstructor
@Transactional
public class BookmarkService {

    private final BookmarkRepository repository;

    @Transactional(readOnly = true)
    public BookmarksDTO getBookmarksByPage(Integer page){
        int pageNo = page < 1 ? 0 : page -1;
        int maxNoPerPage = 10;
        Pageable pageable = PageRequest.of(pageNo, maxNoPerPage, Sort.Direction.ASC, "createdAt");
        Page<BookmarkDTO> bookmarkPage = repository.findBookmark(pageable);
        return new BookmarksDTO(bookmarkPage);
    }
}
