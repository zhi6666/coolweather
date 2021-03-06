package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ZhiQiang on 2017/4/26.
 */

public class Basic {

    /* 由于 JSON 中的一些字段可能不太适合直接作为 Java 字段来命名，因此使用 @SerializedName 注解的方式来让 JSON 字段和 Java 字段之间建立映射关系*/
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
