package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: sbe reason: default package */
public abstract class sbe {
    @JsonCreator
    public static sbe create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("image") String str3, @JsonProperty("followerCount") String str4) {
        return new saz(str, str2, str3, str4);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();
}
