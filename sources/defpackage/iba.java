package defpackage;

/* renamed from: iba reason: default package */
abstract class iba extends ibc {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;
    final String i;

    iba(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        if (str5 != null) {
                            this.e = str5;
                            if (str6 != null) {
                                this.f = str6;
                                if (str7 != null) {
                                    this.g = str7;
                                    if (str8 != null) {
                                        this.h = str8;
                                        if (str9 != null) {
                                            this.i = str9;
                                            return;
                                        }
                                        throw new NullPointerException("Null disclosure");
                                    }
                                    throw new NullPointerException("Null lineItemId");
                                }
                                throw new NullPointerException("Null sponsoredTag");
                            }
                            throw new NullPointerException("Null albumTitle");
                        }
                        throw new NullPointerException("Null albumImageUri");
                    }
                    throw new NullPointerException("Null albumUri");
                }
                throw new NullPointerException("Null artistName");
            }
            throw new NullPointerException("Null artistUri");
        }
        throw new NullPointerException("Null adId");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final String i() {
        return this.i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Marquee{adId=");
        sb.append(this.a);
        sb.append(", artistUri=");
        sb.append(this.b);
        sb.append(", artistName=");
        sb.append(this.c);
        sb.append(", albumUri=");
        sb.append(this.d);
        sb.append(", albumImageUri=");
        sb.append(this.e);
        sb.append(", albumTitle=");
        sb.append(this.f);
        sb.append(", sponsoredTag=");
        sb.append(this.g);
        sb.append(", lineItemId=");
        sb.append(this.h);
        sb.append(", disclosure=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ibc) {
            ibc ibc = (ibc) obj;
            return this.a.equals(ibc.a()) && this.b.equals(ibc.b()) && this.c.equals(ibc.c()) && this.d.equals(ibc.d()) && this.e.equals(ibc.e()) && this.f.equals(ibc.f()) && this.g.equals(ibc.g()) && this.h.equals(ibc.h()) && this.i.equals(ibc.i());
        }
    }

    public int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }
}
