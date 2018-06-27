package com.qingguatang.java5minute.course7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Li
 * @date 2018/06/25
 */
@Controller
public class MusicControl {

    private static final Map<String,String> musics = new HashMap<>();

    @RequestMapping(value = "/song/music")
    @ResponseBody
    public String getMusicSrc(String songId) {return musics.get(songId);}

    @PostConstruct

    public void init(){
        musics.put("35847388",
                "http://m10.music.126.net/20180625232725/aee9a64105373eed3a2a5f7f01e3d6d9/ymusic/de9a/6885/e183/effb8f74546c98fd619d51f22e2bfaaf.mp3" );

        musics.put("16435039",
                "http://m10.music.126.net/20180627004055/fea7ad8a98eebe3650c3fdd476f2ff4c/ymusic/0cce/0768/52ed/db86bd40d6ba02bc4dc09cc942216662.mp3");
    }
}
