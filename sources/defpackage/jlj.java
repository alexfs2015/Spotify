package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: jlj reason: default package */
public abstract class jlj {
    public abstract List<jli> a();

    @JsonCreator
    public static jlj create(@JsonProperty("promotions") List<jli> list) {
        return new jlf(list);
    }
}
