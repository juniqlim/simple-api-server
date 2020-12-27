package im.juniq.simpleapiserver.board.repository;

import im.juniq.simpleapiserver.board.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
