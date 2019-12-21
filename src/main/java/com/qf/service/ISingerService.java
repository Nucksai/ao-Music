package com.qf.service;

import com.qf.entity.Singer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISingerService {
     /*添加*/
     Integer addSinger(Singer sin);

     /*删除*/
     Integer deleteSinger(int sid);

     /*遍历分页歌手*/
     List<Singer> traSinger(String str ,int offset,int pageSize);

     /*查询单个歌手*/
     Singer  getSinger(int sid);

     /*查询总条数*/
     Integer getTotalCount();




}
