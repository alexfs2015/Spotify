package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: ozm reason: default package */
public abstract class ozm {
    public abstract List<uzv> a();

    @JsonCreator
    public static ozm create(@JsonProperty("topics") List<uzv> list) {
        return new ozl(list);
    }
}
