package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: jnt reason: default package */
public abstract class jnt {
    @JsonCreator
    public static jnt create(@JsonProperty("locale") String str, @JsonProperty("fieldName") String str2, @JsonProperty("value") String str3) {
        return new jnp(str, str2, str3);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();
}
