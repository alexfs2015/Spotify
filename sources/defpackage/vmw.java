package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: vmw reason: default package */
public abstract class vmw {
    @JsonCreator
    public static vmw create(List<vmy> list) {
        return new vmt(list);
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("selection")
    public abstract List<vmy> a();
}
