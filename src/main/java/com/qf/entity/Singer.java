package com.qf.entity;

import lombok.Data;

/**
 * @ClassName One
 * @Data 2019/12/19 11:50
 * @Version 1.0
 */
/**
 *     si_id        歌手id
 *     si_name      歌手名称不能重复
 *     si_sex       默认为1男/0为女
 *     si_imger     歌手图片
 *     si_introduec 歌手介绍
 *     si_type      歌手类型
 *     si_letter    首字母
 *     si_hot       可以添加1为热门
 */
@Data
public class Singer {

 private Integer id;
 private String name;
 private Integer sex;
 private String imger;
 private String introduec;
 private String type;
 private String letter;
 private Integer hot;

 public Singer() {
 }

 public Singer(Integer id, String name, Integer sex, String imger, String introduec, String type, String letter, Integer hot) {
  this.id = id;
  this.name = name;
  this.sex = sex;
  this.imger = imger;
  this.introduec = introduec;
  this.type = type;
  this.letter = letter;
  this.hot = hot;
 }

 public Singer(String name, Integer sex, String imger, String introduec, String type, String letter) {
  this.name = name;
  this.sex = sex;
  this.imger = imger;
  this.introduec = introduec;
  this.type = type;
  this.letter = letter;
 }


 public Singer(String name, Integer sex, String introduec, String type, String letter) {
  this.name = name;
  this.sex = sex;
  this.introduec = introduec;
  this.type = type;
  this.letter = letter;
 }
}
