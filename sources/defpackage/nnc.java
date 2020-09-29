package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: nnc reason: default package */
public abstract class nnc {
    public abstract String a();

    public abstract String b();

    public abstract int c();

    @JsonCreator
    public static nnc create(@JsonProperty("username") String str, @JsonProperty("affinity") String str2, @JsonProperty("score") int i) {
        return new nmx(str, str2, i);
    }
}
