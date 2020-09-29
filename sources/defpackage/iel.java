package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: iel reason: default package */
abstract class iel extends ien {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;

    iel(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @JsonProperty("stream")
    public final String a() {
        return this.a;
    }

    @JsonProperty("midroll-watchnow")
    public final String b() {
        return this.b;
    }

    @JsonProperty("watchnow")
    public final String c() {
        return this.c;
    }

    @JsonProperty("preroll")
    public final String d() {
        return this.d;
    }

    @JsonProperty("mobile-screensaver")
    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ien) {
            ien ien = (ien) obj;
            String str = this.a;
            if (str != null ? str.equals(ien.a()) : ien.a() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(ien.b()) : ien.b() == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(ien.c()) : ien.c() == null) {
                        String str4 = this.d;
                        if (str4 != null ? str4.equals(ien.d()) : ien.d() == null) {
                            String str5 = this.e;
                            return str5 != null ? str5.equals(ien.e()) : ien.e() == null;
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.d;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 ^ i;
    }
}
