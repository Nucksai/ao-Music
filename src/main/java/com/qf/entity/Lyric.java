package com.qf.entity;

import lombok.Data;

/**
 * @ClassName One
 * @Data 2019/12/19 13:49
 * @Version 1.0
 */
/**
 * ly_id        歌词id
 * ly_name      歌词名称
 * ly_address   歌词地址
 */

@Data
public class Lyric {

 private Integer id;
 private String name;
 private String address;
}
