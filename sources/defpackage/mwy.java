package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: mwy reason: default package */
public abstract class mwy {
    @JsonCreator
    public static mwy create(@JsonProperty("section_title") String str, @JsonProperty("artists") List<mwo> list) {
        return new mws(str, list);
    }

    public abstract String a();

    public abstract List<mwo> b();
}
