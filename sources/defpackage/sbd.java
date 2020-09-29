package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: sbd reason: default package */
public abstract class sbd {
    @JsonCreator
    public static sbd create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("image") String str3, @JsonProperty("trackCount") int i, @JsonProperty("duration") int i2, @JsonProperty("ownerName") String str4) {
        say say = new say(str, str2, str3, i, i2, str4);
        return say;
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract int d();

    public abstract int e();

    public abstract String f();
}
