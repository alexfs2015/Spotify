package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: vmj reason: default package */
public abstract class vmj {
    @JsonCreator
    public static vmj create(@JsonProperty("name") String str, @JsonProperty("uri") String str2) {
        return new vmg(str, str2);
    }

    public abstract String a();

    public abstract String b();
}
