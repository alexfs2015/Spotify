package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: msc reason: default package */
public abstract class msc {
    public abstract String a();

    public abstract String b();

    public abstract List<mrr> c();

    @JsonCreator
    public static msc create(@JsonProperty("uri") String str, @JsonProperty("title") String str2, @JsonProperty("artists") List<mrr> list) {
        return new mrx(str, str2, list);
    }
}
