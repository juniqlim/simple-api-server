package im.juniq.simpleapiserver.board.repository;

import im.juniq.simpleapiserver.board.model.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    void test기본() {
        Post post = Post.builder()
                .title("제목")
                .content("내용")
                .build();

        Post savedPost = postRepository.save(post);

        assertEquals(post, savedPost);
    }
}