package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: jnu reason: default package */
public abstract class jnu {
    @JsonCreator
    public static jnu create(@JsonProperty("display") jns jns) {
        return new jnq(jns);
    }

    public abstract jns a();
}
