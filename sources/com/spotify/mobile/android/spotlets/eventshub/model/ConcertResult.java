package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ConcertResult implements Parcelable, JacksonModel {
    @JsonCreator
    public static ConcertResult create(@JsonProperty("concert") Concert concert, @JsonProperty("clickThruUrl") String str, @JsonProperty("source") String str2, @JsonProperty("nearUser") Boolean bool, @JsonProperty("discovery") Boolean bool2) {
        if (concert == null) {
            concert = Concert.EMPTY;
        }
        Concert concert2 = concert;
        String str3 = str;
        AutoValue_ConcertResult autoValue_ConcertResult = new AutoValue_ConcertResult(concert, str, str2, bool, bool2);
        return autoValue_ConcertResult;
    }

    @JsonIgnore
    static SourceType createSourceFromString(String str) {
        SourceType[] sourceTypeArr;
        SourceType sourceType = SourceType.ALL;
        if (fbo.a(str)) {
            return sourceType;
        }
        for (SourceType sourceType2 : SourceType.d) {
            if (fbn.a(sourceType2.mSourceName, str)) {
                return sourceType2;
            }
        }
        return sourceType;
    }

    @JsonProperty("clickThruUrl")
    public abstract String getClickThroughUrl();

    @JsonProperty("concert")
    public abstract Concert getConcert();

    @JsonProperty("discovery")
    public abstract Boolean getDiscovery();

    @JsonProperty("nearUser")
    public abstract Boolean getNearUser();

    @JsonProperty("source")
    public abstract String getSource();

    @JsonIgnore
    public SourceType getSourceType() {
        return createSourceFromString(getSource());
    }
}
