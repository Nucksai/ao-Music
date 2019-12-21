package com.qf.service;

import com.qf.entity.Mv;
import org.apache.ibatis.annotations.Param;


import java.util.List;


public interface IMvService {
    /*删除Mv*/
    Integer deletMv(int mid);

    /*遍历单条*/
    Mv getMv(int mid);

    /*修改Mv*/
    Integer updateMv(Mv mv);

    /*添加Mv*/
    Integer addMv(Mv mv);

    /*获取mv分页和排行榜*/
    List<Mv> traMv(String str,int offset,int pageSize);

    /*总行数*/
    Integer getTotalCount();
}
