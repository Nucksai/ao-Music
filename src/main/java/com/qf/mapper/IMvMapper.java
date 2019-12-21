package com.qf.mapper;

import com.qf.entity.Mv;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*Mv 接口*/
public interface IMvMapper {
    /*删除Mv*/
    Integer deletMv(@Param("mid") int mid);

    /*遍历单条*/
    Mv getMv(@Param("mid") int mid);

    /*修改Mv*/
    Integer updateMv(@Param("mv") Mv mv);

    /*添加Mv*/
    Integer addMv(@Param("mv")Mv mv);

    /*获取mv分页*/
    List<Mv> traMv(@Param("offset") int offset,@Param("pageSize") int pageSize);

    /*排行榜*/
    List<Mv> upMv(@Param("offset") int offset,@Param("pageSize") int pageSize);

    /*总行数*/
    Integer getTotalCount();

}
