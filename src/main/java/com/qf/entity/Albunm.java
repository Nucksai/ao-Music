package com.qf.entity;

import lombok.Data;

/**
 * @ClassName One
 * @Data 2019/12/19 13:58
 * @Version 1.0
 */
/**
 * a_id     专辑id
 * a_name   专辑名称
 * a_imger  专辑图片
 * a_singerId   歌手
 * a_address    地区
 * a_type   流派
 * a_hot    可以添加1为热门
 */

@Data
public class Albunm {
     private String id;
     private String name;
     private String imger;
     private String singerId;
     private String address;
     private String type;
     private String hot;
}
