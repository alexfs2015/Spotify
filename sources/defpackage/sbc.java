package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: sbc reason: default package */
public abstract class sbc {
    @JsonCreator
    public static sbc create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("image") String str3, @JsonProperty("trackCount") int i, @JsonProperty("duration") int i2, @JsonProperty("following") boolean z) {
        sax sax = new sax(str, str2, str3, i, i2, z);
        return sax;
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract int d();

    public abstract int e();

    public abstract boolean f();
}
