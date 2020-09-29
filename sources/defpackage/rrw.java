package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: rrw reason: default package */
public abstract class rrw {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract int d();

    public abstract int e();

    public abstract String f();

    @JsonCreator
    public static rrw create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("image") String str3, @JsonProperty("trackCount") int i, @JsonProperty("duration") int i2, @JsonProperty("ownerName") String str4) {
        rrr rrr = new rrr(str, str2, str3, i, i2, str4);
        return rrr;
    }
}
