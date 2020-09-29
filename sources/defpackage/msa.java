package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: msa reason: default package */
public abstract class msa {
    public abstract List<msb> a();

    public abstract List<msb> b();

    @JsonCreator
    public static msa create(@JsonProperty("insertions") List<msb> list, @JsonProperty("deletions") List<msb> list2) {
        return new mrv(list, list2);
    }
}
