package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: mrr reason: default package */
public abstract class mrr {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    @JsonCreator
    public static mrr create(@JsonProperty("uri") String str, @JsonProperty("display_name") String str2, @JsonProperty("image_url") String str3) {
        return new mrs(str, str2, str3);
    }
}
