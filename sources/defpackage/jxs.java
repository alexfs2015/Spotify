package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: jxs reason: default package */
public final class jxs {
    final String a;
    final String b;

    @JsonCreator
    jxs(@JsonProperty(defaultValue = "Live event", value = "title") String str, @JsonProperty(defaultValue = "https://betamax.akamaized.net/cmaf/live/2003445/{eventid}/master.m3u8", value = "urlTemplate") String str2) {
        this.a = str;
        this.b = str2;
    }
}
