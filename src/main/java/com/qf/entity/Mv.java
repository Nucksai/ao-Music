package com.qf.entity;

import lombok.Data;

/**
 * @ClassName One
 * @Data 2019/12/19 11:55
 * @Version 1.0
 */
/**
 * m_id          MVid
 * m_name        mv名称
 * m_images      mv图片
 * mv_address    mv地址 二进制上传地址
 * mv_singerId  歌手id
 * mv_type      mv类型
 * my_hot       可以添加1为热门
 * my_maddress  地区名称

 */
@Data
public class Mv {

     private Integer id;
     private String name;
     private String images;
     private String address;
     private Integer singerId;
     private String  type;
     private Integer hot;
    private  String  maddress;

     public Mv(Integer id, String name, String images, String address, Integer singerId, String type, Integer hot, String maddress) {
          this.id = id;
          this.name = name;
          this.images = images;
          this.address = address;
          this.singerId = singerId;
          this.type = type;
          this.hot = hot;
          this.maddress = maddress;
     }

     public Mv() {
     }
}
