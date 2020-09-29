package com.spotify.music.features.homemix.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class HomeMixTuning {

    public enum Style {
        DEFAULT("default"),
        CHILL("chill"),
        UPBEAT("upbeat");
        
        private static final Style[] d = null;
        public final String mValue;

        static {
            d = values();
        }

        private Style(String str) {
            this.mValue = str;
        }

        @JsonCreator
        public static Style fromValue(String str) {
            Style[] styleArr;
            if (str != null) {
                for (Style style : d) {
                    if (style.mValue.equalsIgnoreCase(str)) {
                        return style;
                    }
                }
            }
            return DEFAULT;
        }
    }

    public interface a {
        a a(List<String> list);

        HomeMixTuning a();
    }

    @JsonProperty("style")
    public abstract String a();

    @JsonProperty("member_blacklist")
    public abstract List<String> b();

    @JsonCreator
    public static HomeMixTuning create(Style style, List<String> list) {
        defpackage.nna.a aVar = new defpackage.nna.a();
        String str = style.mValue;
        if (str != null) {
            aVar.a = str;
            return aVar.a(list).a();
        }
        throw new NullPointerException("Null style");
    }
}
