package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: rrx reason: default package */
public abstract class rrx {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    @JsonCreator
    public static rrx create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("image") String str3, @JsonProperty("followerCount") String str4) {
        return new rrs(str, str2, str3, str4);
    }
}
