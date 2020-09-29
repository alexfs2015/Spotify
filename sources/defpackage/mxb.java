package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: mxb reason: default package */
public abstract class mxb {
    @JsonCreator
    public static mxb create(@JsonProperty("uri") String str, @JsonProperty("title") String str2, @JsonProperty("artists") List<mwo> list) {
        return new mwv(str, str2, list);
    }

    public abstract String a();

    public abstract String b();

    public abstract List<mwo> c();
}
