package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: pgv reason: default package */
public abstract class pgv {
    @JsonCreator
    public static pgv create(@JsonProperty("topics") List<vmj> list) {
        return new pgu(list);
    }

    public abstract List<vmj> a();
}
