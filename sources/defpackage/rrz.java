package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: rrz reason: default package */
public abstract class rrz {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract rrw g();

    public abstract List<rrv> h();

    public abstract List<Object> i();

    @JsonCreator
    public static rrz create(@JsonProperty("id") String str, @JsonProperty("type") String str2, @JsonProperty("text") String str3, @JsonProperty("recReason") String str4, @JsonProperty("timestamp") String str5, @JsonProperty("color") String str6, @JsonProperty("entity") rrw rrw, @JsonProperty("creators") List<rrv> list, @JsonProperty("tracks") List<Object> list2) {
        rru rru = new rru(str, str2, str3, str4, str5, str6, rrw, list, list2);
        return rru;
    }
}
