package uk.cn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.cn.domain.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
}
