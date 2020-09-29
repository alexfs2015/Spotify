package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: jlg reason: default package */
public abstract class jlg {
    public abstract List<jlh> a();

    @JsonCreator
    public static jlg create(@JsonProperty("fields") List<jlh> list) {
        return new jlc(list);
    }
}
