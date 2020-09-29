package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: nne reason: default package */
public abstract class nne {
    @JsonProperty("name")
    public abstract String a();

    @JsonProperty("color")
    public abstract String b();

    @JsonProperty("ntracks")
    public abstract int c();

    @JsonProperty("score")
    public abstract int d();

    @JsonProperty("ranked_users")
    public abstract List<nnc> e();

    @JsonCreator
    public static nne create(@JsonProperty("name") String str, @JsonProperty("color") String str2, @JsonProperty("ntracks") int i, @JsonProperty("score") int i2, @JsonProperty("ranked_users") List<nnc> list) {
        nmz nmz = new nmz(str, str2, i, i2, list);
        return nmz;
    }
}
