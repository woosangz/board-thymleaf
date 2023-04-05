package idusw.springboot.boardthymleaf.controller;

import idusw.springboot.boardthymleaf.entity.Memo;
import idusw.springboot.boardthymleaf.repository.MemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.stream.IntStream;

@Controller
public class HomeController {
    @Autowired
    MemoRepository memoRepository;
    @GetMapping("/")
    public String goHome(){
        IntStream.rangeClosed(1, 10).forEach(i -> {
            Memo memo = Memo.builder().memoText("sample" + i).build();
            memoRepository.save(memo);
        });
        return "index";
    }

}
