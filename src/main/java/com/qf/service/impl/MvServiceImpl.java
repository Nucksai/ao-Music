package com.qf.service.impl;

import com.qf.entity.Mv;
import com.qf.mapper.IMvMapper;
import com.qf.service.IMvService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName One
 * @Data 2019/12/20 0:54
 * @Version 1.0
 */
@Service
@Slf4j
public class MvServiceImpl implements IMvService {
    @Resource
    private  IMvMapper mvMapper;


    @Override
    public Integer deletMv(int mid) {
        return mvMapper.deletMv(mid);
    }

    @Override
    public Mv getMv(int mid) {
        return mvMapper.getMv(mid);
    }

    @Override
    public Integer updateMv(Mv mv) {
        return mvMapper.updateMv(mv);
    }

    @Override
    public Integer addMv(Mv mv) {
        return mvMapper.addMv(mv);
    }

    @Override
    public List<Mv> traMv(String str, int offset, int pageSize) {
        List<Mv> list = "tra".equals(str)?mvMapper.traMv(offset,pageSize):mvMapper.upMv(offset,pageSize);
        return list;
    }


    @Override
    public Integer getTotalCount() {
        return mvMapper.getTotalCount();
    }
}
