package idusw.springboot.boardthymleaf.controller;

import idusw.springboot.boardthymleaf.entity.MemoEntity;
import idusw.springboot.boardthymleaf.repository.MemoRepository;
import idusw.springboot.boardthymleaf.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.stream.IntStream;

@Controller
public class HomeController {
    MemoService memoService;
    public  HomeController(MemoService memoService){ // constructor DI
        this.memoService = memoService;
    }
    /*
    @Autowired
    MemoRepository memoRepository; // field DI(Dependency Injection)
    */
    @GetMapping("/init")
    public String goHome(){
        memoService.initailize();
        return "index";
    }

}
