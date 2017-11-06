package com.tanyy.domain;

public enum DJType {
  JINBAOWUQU(1,"劲爆舞曲"),
  JIUBANUANCHANG(2,"酒吧暖场"),
  SONG_TYPE_LIANBAN(3,"歌曲连版"),
  CLUB_DANCE(4,"Club/dance"),
  ELECTRO_HOUSE(5,"Electro/house"),
  MASH_UP(6,"Mash-up"),
  CLUB_HOUSE(7,"Clubhouse"),
  DUBSTEP(8,"Dubstep"),
  EDM(9,"EDM"),
  YUENANDIANGU(10,"越南电鼓"),
  XIANCHANGHANMAI(11,"现场喊麦"),
  SHISHANGHUNDA(12,"时尚混搭"),
  PROGRESSIVE_TRANCE(13,"Progressive/Trance") ;
  
  private int code;
  private String name;
  
  private DJType(int code, String name) {
    this.code = code;
    this.name = name;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public static DJType getDjTypeFromStr(String s){
    for(DJType temp:DJType.values()){
      if(temp.getName().equals(s)){
        return temp;
      };
    }
    return null;
  }
  
}
