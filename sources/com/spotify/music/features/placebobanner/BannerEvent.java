package com.spotify.music.features.placebobanner;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BannerEvent implements Parcelable, JacksonModel {

    public enum Type {
        CTA_CLICK("clicked"),
        CTA_CLICK_1("cta-click-1"),
        CTA_CLICK_2("cta-click-2"),
        CLOSE("closed");
        
        public final String mId;

        private Type(String str) {
            this.mId = str;
        }
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("configurationId")
    public abstract String configurationId();

    /* access modifiers changed from: 0000 */
    @JsonProperty("event")
    public abstract String event();

    BannerEvent() {
    }

    @JsonCreator
    public static BannerEvent create(@JsonProperty("event") String str, @JsonProperty("configurationId") String str2) {
        return new AutoValue_BannerEvent(str, str2);
    }
}
