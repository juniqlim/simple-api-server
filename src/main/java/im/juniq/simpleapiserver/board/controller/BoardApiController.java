package im.juniq.simpleapiserver.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BoardApiController {

    @GetMapping("/board/{name}")
    public String postsInBoard() {
        return "hello";
    }
}
