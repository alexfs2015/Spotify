package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: rzt reason: default package */
public final class rzt {
    @JsonProperty("integration_type")
    public final String a;
    @JsonProperty("client_id")
    public final String b;
    @JsonProperty("name")
    public final String c;
    @JsonProperty("transport_type")
    public final String d;
    @JsonProperty("category")
    public final String e;
    @JsonProperty("company")
    public final String f;
    @JsonProperty("model")
    public final String g;
    @JsonProperty("version")
    public final String h;
    @JsonProperty("connection_label")
    private final String i;

    /* renamed from: rzt$a */
    public static class a {
        final String a;
        String b;
        public String c;
        String d;
        String e;
        String f;
        String g;
        String h;
        public String i;

        public a(String str) {
            String str2 = "";
            this.b = str2;
            this.c = str2;
            String str3 = "unknown";
            this.d = str3;
            this.e = str2;
            this.f = str3;
            this.g = str2;
            this.h = str2;
            this.i = str2;
            if (str == null) {
                str = str2;
            }
            this.a = str;
        }

        public final a a(String str) {
            if (str == null) {
                str = "";
            }
            this.b = str;
            return this;
        }

        public final rzt a() {
            return new rzt(this, 0);
        }

        public final a b(String str) {
            if (str == null) {
                str = "unknown";
            }
            this.d = str;
            return this;
        }

        public final a c(String str) {
            if (str == null) {
                str = "unknown";
            }
            this.f = str;
            return this;
        }

        public final a d(String str) {
            if (str == null) {
                str = "";
            }
            this.g = str;
            return this;
        }

        public final a e(String str) {
            if (str == null) {
                str = "";
            }
            this.h = str;
            return this;
        }
    }

    private rzt(a aVar) {
        this.a = aVar.a;
        this.b = aVar.c;
        this.c = aVar.b;
        this.d = aVar.d;
        this.i = aVar.e;
        this.e = aVar.f;
        this.f = aVar.g;
        this.g = aVar.h;
        this.h = aVar.i;
    }

    /* synthetic */ rzt(a aVar, byte b2) {
        this(aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzt)) {
            return false;
        }
        rzt rzt = (rzt) obj;
        if (!this.a.equals(rzt.a) || !this.b.equals(rzt.b) || !this.c.equals(rzt.c) || !this.d.equals(rzt.d)) {
            return false;
        }
        String str = this.i;
        if (str == null ? rzt.i != null : !str.equals(rzt.i)) {
            return false;
        }
        if (this.e.equals(rzt.e) && this.f.equals(rzt.f) && this.g.equals(rzt.g)) {
            return this.h.equals(rzt.h);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.i;
        return ((((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }
}
