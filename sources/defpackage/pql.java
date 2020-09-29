package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: pql reason: default package */
public abstract class pql {
    @JsonProperty("locale")
    public abstract String a();

    @JsonProperty("label")
    public abstract String b();

    /* access modifiers changed from: 0000 */
    @JsonProperty("rtl")
    public abstract String c();

    @JsonCreator
    public static pql create(@JsonProperty("locale") String str, @JsonProperty("label") String str2, @JsonProperty("rtl") String str3) {
        return new pqk(str, str2, str3);
    }
}
