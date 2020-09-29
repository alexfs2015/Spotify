package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: uzv reason: default package */
public abstract class uzv {
    public abstract String a();

    public abstract String b();

    @JsonCreator
    public static uzv create(@JsonProperty("name") String str, @JsonProperty("uri") String str2) {
        return new uzs(str, str2);
    }
}
