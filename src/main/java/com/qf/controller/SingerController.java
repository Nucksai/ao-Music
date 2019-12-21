package com.qf.controller;

import com.qf.entity.Singer;
import com.qf.service.ISingerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

import java.util.List;
import java.util.UUID;

/**
 * @ClassName One
 * @Data 2019/12/19 16:46
 * @Version 1.0
 */
@RestController
@RequestMapping("/singerController")
@Slf4j
public class SingerController {
    private final static int PAGASIZE=3;
    @Resource
    ISingerService singerService;

    /*添加用户图片*/
    @RequestMapping(value = "/getFileName",method = RequestMethod.POST)
    private String getFileName(MultipartFile upload,HttpServletRequest request,Singer singer) throws IOException {
        String path = request.getSession().getServletContext().getRealPath("images");
        File file = new File(path);
        if(!file.exists()){
            file.mkdir();
        }
        String filename = upload.getOriginalFilename();
        filename=UUID.randomUUID().toString()+"_"+filename;
        upload.transferTo(new File(file,filename));

        return filename;
    }
    /*添加用户*/
    @RequestMapping(value = "/addSinger",method = RequestMethod.POST)
    public String addSingera(Singer singer){
        Integer integer = singerService.addSinger(singer);
        return integer+"";
    }

    /*总页数*/
    @RequestMapping(value = "/getTotalCount")
    public Integer getTotalCount(){
        Integer totalCount = singerService.getTotalCount();
        totalCount=totalCount%PAGASIZE ==0?totalCount/PAGASIZE:totalCount/PAGASIZE+1;
        return  totalCount;
    }

    /*删除用户*/
    @RequestMapping(value = "/deleteSinger/{delete}")
    private Integer deleteSinger(@PathVariable int delete){
        Integer integer = singerService.deleteSinger(delete);
        return integer;

    }

    /*分页展示*/
    @RequestMapping(value = "/traSinger/{offset}")
    private List<Singer> traSinger(@PathVariable int offset){
        String tra = "tra";
        int pagaSize=3;
        log.debug(offset+"---------------------------------------");
        List<Singer> singers = singerService.traSinger(tra,offset,pagaSize);
        for (Singer sin: singers) {
            log.debug(sin.toString());
        }
        return singers;
    }


    /*获取单条数据*/
    @RequestMapping(value = "getSinger/{number}")
    public Singer getSinger(@PathVariable int number){
        Singer singer = singerService.getSinger(number);
        log.debug(singer.toString());
        return singer;
    }

    /*热选*/
    @RequestMapping(value = "/upSinger")
    public void  upSinger(){
        String up = "up";
        List<Singer> singers = singerService.traSinger(up,0, 3);
        for(Singer str:singers){
            log.debug(str.toString());
        }
    }

    @RequestMapping(value = "/updataSinger",method = RequestMethod.POST)
    public void updataSinger(Singer singer){

    }
}
