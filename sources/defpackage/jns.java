package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: jns reason: default package */
public abstract class jns {
    @JsonCreator
    public static jns create(@JsonProperty("fields") List<jnt> list) {
        return new jno(list);
    }

    public abstract List<jnt> a();
}
