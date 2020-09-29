package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: mer reason: default package */
public final class mer {
    @JsonProperty("id")
    public String a;
    @JsonProperty("name")
    private String b;

    @JsonCreator
    public mer() {
        String str = "";
        this.a = str;
        this.b = str;
    }

    @JsonIgnore
    public mer(String str, String str2) {
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
        if (!(obj instanceof mer)) {
            return false;
        }
        mer mer = (mer) obj;
        return faw.a(this.a, mer.a) && faw.a(this.b, mer.b);
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
