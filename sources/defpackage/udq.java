package defpackage;

/* renamed from: udq reason: default package */
final class udq extends udw {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final udt e;
    private final int f;
    private final int g;
    private final udt h;
    private final int i;

    udq(String str, String str2, String str3, boolean z, udt udt, int i2, int i3, udt udt2, int i4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = z;
                    if (udt != null) {
                        this.e = udt;
                        this.f = i2;
                        this.g = i3;
                        if (udt2 != null) {
                            this.h = udt2;
                            this.i = i4;
                            return;
                        }
                        throw new NullPointerException("Null episodeImageState");
                    }
                    throw new NullPointerException("Null podcastImageState");
                }
                throw new NullPointerException("Null metadata");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null title");
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

    public final boolean d() {
        return this.d;
    }

    public final udt e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udw) {
            udw udw = (udw) obj;
            return this.a.equals(udw.a()) && this.b.equals(udw.b()) && this.c.equals(udw.c()) && this.d == udw.d() && this.e.equals(udw.e()) && this.f == udw.f() && this.g == udw.g() && this.h.equals(udw.h()) && this.i == udw.i();
        }
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final udt h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i;
    }

    public final int i() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewModel{title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", metadata=");
        sb.append(this.c);
        sb.append(", downloaded=");
        sb.append(this.d);
        sb.append(", podcastImageState=");
        sb.append(this.e);
        sb.append(", podcastBgColor=");
        sb.append(this.f);
        sb.append(", podcastTextColor=");
        sb.append(this.g);
        sb.append(", episodeImageState=");
        sb.append(this.h);
        sb.append(", progress=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
