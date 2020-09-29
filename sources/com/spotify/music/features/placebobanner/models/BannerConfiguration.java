package com.spotify.music.features.placebobanner.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonDeserialize(using = BannerConfiguration_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BannerConfiguration implements JacksonModel {

    public interface a {
        a a(int i);

        a a(long j);

        a a(String str);

        a a(List<PlaceboBannerView> list);

        BannerConfiguration a();

        a b(int i);

        a b(long j);

        a b(List<String> list);

        a c(long j);
    }

    public static a builder() {
        return new a().a(0).a(0).b(0).b(0).c(0);
    }

    @JsonCreator
    public static BannerConfiguration create(@JsonProperty("configurationId") String str, @JsonProperty("backgroundColor") Integer num, @JsonProperty("receivedOn") Long l, @JsonProperty("expiresAfterSec") Long l2, @JsonProperty("views") List<PlaceboBannerView> list, @JsonProperty("showDelaySeconds") Integer num2, @JsonProperty("targetUris") List<String> list2, @JsonProperty("timeWindowSeconds") Long l3) {
        a a2 = builder().a(str).a(list);
        if (num != null) {
            a2.a(num.intValue());
        }
        if (l != null) {
            a2.a(l.longValue());
        }
        if (l2 != null) {
            a2.b(l2.longValue());
        }
        if (num2 != null) {
            a2.b(num2.intValue());
        }
        if (list2 != null) {
            a2.b(list2);
        }
        if (l3 != null) {
            a2.c(l3.longValue());
        }
        return a2.a();
    }

    @JsonProperty("backgroundColor")
    public abstract int backgroundColor();

    @JsonProperty("configurationId")
    public abstract String configurationId();

    @JsonProperty("expiresAfterSec")
    public abstract long expiresAfterSec();

    @JsonProperty("views")
    public abstract List<PlaceboBannerView> placeboBannerViews();

    @JsonProperty("receivedOn")
    public abstract long receivedOn();

    @JsonProperty("showDelaySeconds")
    public abstract int showDelaySeconds();

    @JsonProperty("targetUris")
    public abstract List<String> targetUris();

    @JsonProperty("timeWindowSeconds")
    public abstract long timeWindowSeconds();

    public abstract a toBuilder();
}
