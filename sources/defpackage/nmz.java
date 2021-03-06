package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: nmz reason: default package */
final class nmz extends nne {
    private final String a;
    private final String b;
    private final int c;
    private final int d;
    private final List<nnc> e;

    nmz(String str, String str2, int i, int i2, List<nnc> list) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = i;
                this.d = i2;
                if (list != null) {
                    this.e = list;
                    return;
                }
                throw new NullPointerException("Null affinityUsers");
            }
            throw new NullPointerException("Null color");
        }
        throw new NullPointerException("Null name");
    }

    @JsonProperty("name")
    public final String a() {
        return this.a;
    }

    @JsonProperty("color")
    public final String b() {
        return this.b;
    }

    @JsonProperty("ntracks")
    public final int c() {
        return this.c;
    }

    @JsonProperty("score")
    public final int d() {
        return this.d;
    }

    @JsonProperty("ranked_users")
    public final List<nnc> e() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeMixTaste{name=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", nTracks=");
        sb.append(this.c);
        sb.append(", score=");
        sb.append(this.d);
        sb.append(", affinityUsers=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nne) {
            nne nne = (nne) obj;
            return this.a.equals(nne.a()) && this.b.equals(nne.b()) && this.c == nne.c() && this.d == nne.d() && this.e.equals(nne.e());
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }
}
