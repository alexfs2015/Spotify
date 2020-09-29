package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: mxa reason: default package */
public abstract class mxa {
    @JsonCreator
    public static mxa create(@JsonProperty("insertions") List<mww> list, @JsonProperty("delete_item_ids") List<String> list2) {
        return new mwu(list, list2);
    }

    public abstract List<mww> a();

    public abstract List<String> b();
}
