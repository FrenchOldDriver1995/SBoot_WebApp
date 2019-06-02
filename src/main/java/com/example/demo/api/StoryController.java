package com.example.demo.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.business.FeedService;
import com.example.demo.business.PublicationService;
import com.example.demo.business.Story;

import java.security.Principal;
import java.util.List;

@RestController
public class StoryController {
	
//这个文件用于映射

    @Autowired
    PublicationService publicationService;

    @Autowired
    FeedService feedService;

    @PostMapping("/story")
    public void share(@RequestBody String content) {
        publicationService.share(new Story(content));
    }

    @GetMapping("/feed")
    public List<Story> feed() {
        return feedService.fetchAll();
    }

//    @GetMapping
//    public List<Story> feed(Principal principal){//这行代码会导致没有界面
//        String username = principal.getName();
//        return feedService.fetchAll();
//    }

    @GetMapping("/toto")
    public void toto(@RequestParam("param1") Long param1, @RequestParam("param2") String param2) {
        System.out.println("");
    }


}