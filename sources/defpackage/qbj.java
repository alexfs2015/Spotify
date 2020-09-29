package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: qbj reason: default package */
public class qbj {
    @JsonProperty("type")
    public final String a;
    @JsonProperty("target")
    public final String b;
    @JsonProperty("metadata")
    public final Map<String, String> c;

    @JsonCreator
    public qbj(@JsonProperty("type") String str, @JsonProperty("target") String str2, @JsonProperty("metadata") Map<String, String> map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }
}
