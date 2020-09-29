package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: jnv reason: default package */
public abstract class jnv {
    @JsonCreator
    public static jnv create(@JsonProperty("promotions") List<jnu> list) {
        return new jnr(list);
    }

    public abstract List<jnu> a();
}
