package uk.cn.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uk.cn.domain.Bookmark;
import uk.cn.dto.BookmarkDTO;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    @Query("select new uk.cn.dto.BookmarkDTO(b.id, b.title, b.url, b.createdAt) from Bookmark b")
    Page<BookmarkDTO> findBookmark(Pageable pageable);
}
