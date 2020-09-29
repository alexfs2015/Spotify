package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: jli reason: default package */
public abstract class jli {
    public abstract jlg a();

    @JsonCreator
    public static jli create(@JsonProperty("display") jlg jlg) {
        return new jle(jlg);
    }
}
