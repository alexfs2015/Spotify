package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: mwo reason: default package */
public abstract class mwo {
    @JsonCreator
    public static mwo create(@JsonProperty("uri") String str, @JsonProperty("display_name") String str2, @JsonProperty("image_url") String str3) {
        return new mwp(str, str2, str3);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();
}
