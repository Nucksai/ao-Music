package com.qf.entity;

import lombok.Data;

/**
 * @ClassName One
 * @Data 2019/12/19 11:39
 * @Version 1.0
 */
/**
 * s_id 歌曲id
 * s_name  歌曲名称
 * s_singerId 歌手id
 * s_address 歌曲地址
 * s_count  播放次数
 * s_albumId 专辑id
 * s_label  可以添加标签，然后用数字去划分类型
 * s_hot    可以添加1为热门
 */

@Data
public class Song {

     private Integer id;
     private String name;
     private int singerId;
     private String address;
     private int count;
     private int albumId;
     private int label;
     private int hot;

}
