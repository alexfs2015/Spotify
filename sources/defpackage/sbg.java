package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: sbg reason: default package */
public abstract class sbg {
    @JsonCreator
    public static sbg create(@JsonProperty("id") String str, @JsonProperty("type") String str2, @JsonProperty("text") String str3, @JsonProperty("recReason") String str4, @JsonProperty("timestamp") String str5, @JsonProperty("color") String str6, @JsonProperty("entity") sbd sbd, @JsonProperty("creators") List<sbc> list, @JsonProperty("tracks") List<Object> list2) {
        sbb sbb = new sbb(str, str2, str3, str4, str5, str6, sbd, list, list2);
        return sbb;
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract sbd g();

    public abstract List<sbc> h();

    public abstract List<Object> i();
}
