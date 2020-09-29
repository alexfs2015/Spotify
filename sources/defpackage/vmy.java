package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: vmy reason: default package */
public abstract class vmy {
    @JsonCreator
    public static vmy create(String str, String str2) {
        return new vmu(str, str2);
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("id")
    public abstract String a();

    /* access modifiers changed from: 0000 */
    @JsonProperty("type")
    public abstract String b();
}
