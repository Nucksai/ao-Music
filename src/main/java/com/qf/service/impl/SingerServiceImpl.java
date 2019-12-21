package com.qf.service.impl;

import com.qf.entity.Singer;
import com.qf.mapper.ISingerMapper;
import com.qf.service.ISingerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName One
 * @Data 2019/12/19 16:40
 * @Version 1.0
 */
@Service
@Slf4j
public class SingerServiceImpl implements ISingerService {
    @Resource
    private ISingerMapper singerMapper;

    /*添加*/
    @Override
    public Integer addSinger(Singer sin) {
        return singerMapper.addSinger(sin);
    }

    /*删除*/
    @Override
    public Integer deleteSinger(int sid) {
        return singerMapper.deleteSinger(sid);
    }


    /*遍历所有歌手*/
    @Override
    public List<Singer> traSinger(String str, int offset, int pageSize) {
        if("tra".equals(str)){
            offset = (offset-1)*pageSize;
            List<Singer> list = singerMapper.traSinger(offset, pageSize);
            return list;
        }else {
            List<Singer> list = singerMapper.upSinger(offset, pageSize);
            return list;
        }

    }

    /*查询单个歌手信息*/
    @Override
    public Singer getSinger(int sid) {
        List<Singer> list= singerMapper.getSinger(sid);
        Singer singer = list.get(0);
        return singer;
    }

    @Override
    public Integer getTotalCount() {
        return singerMapper.getTotalCount();
    }


}
