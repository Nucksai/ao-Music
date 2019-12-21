package com.qf.mapper;

import com.qf.entity.Lyric;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName One
 * @Data 2019/12/20 9:07
 * @Version 1.0
 */
public interface ILyricMapper {
    /*查询歌词*/
    List<Lyric> traLyric(@Param("offest")int offest,@Param("pageSize") int pageSize);

    /*查询单条数据*/
    Lyric getLyric(@Param("lid") int lid);

    /*删除歌词*/
    Integer deleteLyric(@Param("lid") int lid);

    /*添加歌词*/
    Integer addLyric(@Param("lyric")Lyric lyric);

    /*修改歌词*/
    Integer updateLyric(@Param("lyric")Lyric lyric);


}
