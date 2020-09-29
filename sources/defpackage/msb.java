package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: msb reason: default package */
public abstract class msb {
    public abstract String a();

    public abstract List<mry> b();

    @JsonCreator
    public static msb create(@JsonProperty("preceding_item_id") String str, @JsonProperty("feed_items") List<mry> list) {
        return new mrw(str, list);
    }
}
