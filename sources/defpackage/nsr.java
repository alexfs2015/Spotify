package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: nsr reason: default package */
public abstract class nsr {
    @JsonCreator
    public static nsr create(@JsonProperty("username") String str, @JsonProperty("affinity") String str2, @JsonProperty("score") int i) {
        return new nsm(str, str2, i);
    }

    public abstract String a();

    public abstract String b();

    public abstract int c();
}
