package im.juniq.simpleapiserver.board.repository;

import im.juniq.simpleapiserver.board.model.Board;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
class BoardRepositoryTest {

    @Autowired BoardRepository boardRepository;

    @Test
    void test기본() {
        Board board = Board.builder()
                .name("일반게시판")
                .build();
        boardRepository.save(board);

        Optional<Board> findedBoard = boardRepository.findById(board.getId());
        Assertions.assertEquals(board, findedBoard.get());
    }
}