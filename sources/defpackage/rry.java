package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: rry reason: default package */
public abstract class rry {
    public abstract List<rrz> a();

    public abstract int b();

    public abstract String c();

    public abstract String d();

    @JsonCreator
    public static rry create(@JsonProperty("stories") List<rrz> list, @JsonProperty("limit") int i, @JsonProperty("after") String str, @JsonProperty("nextUrl") String str2) {
        return new rrt(list, i, str, str2);
    }
}
