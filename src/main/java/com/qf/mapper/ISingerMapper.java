package com.qf.mapper;

import com.qf.entity.Singer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*歌手接口*/
public interface ISingerMapper {
      /*添加歌手*/
      Integer   addSinger(@Param("sin")Singer singer);

      /*删除*/
      Integer deleteSinger(@Param("sid") int sid);

      /*遍历所有歌手*/
      List<Singer> traSinger(@Param("offset") int offset,@Param("pageSize") int pageSize);

      /*查询单个歌手*/
      List<Singer>  getSinger(@Param("sid") int sid);

      /*修改歌手信息*/
      Integer updateSinger(@Param("sin") Singer singer);


      /*歌手热度排行*/
      List<Singer> upSinger(@Param("offset") int offset,@Param("pageSize") int pageSize);

      /*查询总条数*/
      Integer getTotalCount();

}
