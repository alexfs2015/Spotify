package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: mjd reason: default package */
public final class mjd {
    @JsonProperty("id")
    public String a;
    @JsonProperty("name")
    private String b;

    @JsonCreator
    public mjd() {
        String str = "";
        this.a = str;
        this.b = str;
    }

    @JsonIgnore
    public mjd(String str, String str2) {
        String str3 = "";
        this.a = str3;
        this.b = str3;
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjd)) {
            return false;
        }
        mjd mjd = (mjd) obj;
        return fbn.a(this.a, mjd.a) && fbn.a(this.b, mjd.b);
    }

    public final int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(this.b);
        return sb.toString().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
