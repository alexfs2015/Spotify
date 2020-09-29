package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: jlh reason: default package */
public abstract class jlh {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    @JsonCreator
    public static jlh create(@JsonProperty("locale") String str, @JsonProperty("fieldName") String str2, @JsonProperty("value") String str3) {
        return new jld(str, str2, str3);
    }
}
