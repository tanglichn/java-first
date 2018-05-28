package com.qingguatang.java5minute.course2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Li
 * @date 2018/5/28
 */
@Controller
public class SongControl {

    @RequestMapping(value = "/song")
    public String getSong(@RequestParam(name = "id", required = false) String songId){
        //判断songID
        if(songId == null){
            songId = "1";
        }

        if(songId.equals("1")) {
            return "course2/1.html";
        }else{
            return "course2/other.html";
        }

    }
}
