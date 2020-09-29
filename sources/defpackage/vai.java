package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: vai reason: default package */
public abstract class vai {
    /* access modifiers changed from: 0000 */
    @JsonProperty("selection")
    public abstract List<vak> a();

    @JsonCreator
    public static vai create(List<vak> list) {
        return new vaf(list);
    }
}
