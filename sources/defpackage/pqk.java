package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: pqk reason: default package */
final class pqk extends pql {
    private final String a;
    private final String b;
    private final String c;

    pqk(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null rtl");
            }
            throw new NullPointerException("Null label");
        }
        throw new NullPointerException("Null locale");
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("locale")
    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("label")
    public final String b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("rtl")
    public final String c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QsLocale{locale=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", rtl=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pql) {
            pql pql = (pql) obj;
            return this.a.equals(pql.a()) && this.b.equals(pql.b()) && this.c.equals(pql.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
