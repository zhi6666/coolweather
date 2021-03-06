package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ZhiQiang on 2017/4/26.
 */

public class Now {

    /* 由于 JSON 中的一些字段可能不太适合直接作为 Java 字段来命名，因此使用 @SerializedName 注解的方式来让 JSON 字段和 Java 字段之间建立映射关系*/
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("hum")
    public String humidity;

    @SerializedName("cond")
    public More more;

    public Wind wind;

    public class More {
        @SerializedName("code")
        public String weatherConditionCode;

        @SerializedName("txt")
        public String info;
    }

    public class Wind {
        @SerializedName("dir")
        public String windDir;

        @SerializedName("sc")
        public String windSpeedDegree;

        @SerializedName("spd")
        public String windSpeed;

        @SerializedName("deg")
        public String windDirDegree;
    }

}
