package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: sbf reason: default package */
public abstract class sbf {
    @JsonCreator
    public static sbf create(@JsonProperty("stories") List<sbg> list, @JsonProperty("limit") int i, @JsonProperty("after") String str, @JsonProperty("nextUrl") String str2) {
        return new sba(list, i, str, str2);
    }

    public abstract List<sbg> a();

    public abstract int b();

    public abstract String c();

    public abstract String d();
}
