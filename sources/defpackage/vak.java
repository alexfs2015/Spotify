package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: vak reason: default package */
public abstract class vak {
    /* access modifiers changed from: 0000 */
    @JsonProperty("id")
    public abstract String a();

    /* access modifiers changed from: 0000 */
    @JsonProperty("type")
    public abstract String b();

    @JsonCreator
    public static vak create(String str, String str2) {
        return new vag(str, str2);
    }
}
