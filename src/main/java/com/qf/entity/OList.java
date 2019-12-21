package com.qf.entity;

import lombok.Data;

/**
 * @ClassName One
 * @Data 2019/12/19 13:54
 * @Version 1.0
 */
/**
 * l_id 歌曲id
 * l_images 歌单图片
 * l_userId 创建歌单者
 * l_count  播放次数
 * l_hot    可以添加1为热门
 */
@Data
public class OList {

     private Integer id;
     private String images;
     private Integer userId;
     private Integer count;
     private Integer hot;
}
