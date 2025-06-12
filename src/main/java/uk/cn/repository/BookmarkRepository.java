package uk.cn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.cn.domain.Bookmark;

import java.util.List;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    //public List<Bookmark> getBookmarkByPage(Integer pageNo);
}
