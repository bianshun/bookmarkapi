package uk.cn.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uk.cn.domain.Bookmark;
import uk.cn.dto.BookmarksDTO;
import uk.cn.service.BookmarkService;

import java.util.List;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class Controller {

    private final BookmarkService service;

    @GetMapping()
    public BookmarksDTO getBookmarksByPage(@RequestParam(name = "page", defaultValue = "1") Integer pageNo ){
        return service.getBookmarksByPage(pageNo);
    }
}
