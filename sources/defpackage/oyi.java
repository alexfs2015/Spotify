package defpackage;

/* renamed from: oyi reason: default package */
final class oyi extends oym {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;

    oyi(String str, String str2, String str3, String str4, String str5, boolean z) {
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
                            this.f = z;
                            return;
                        }
                        throw new NullPointerException("Null description");
                    }
                    throw new NullPointerException("Null publisher");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null showUri");
        }
        throw new NullPointerException("Null imageUri");
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

    public final boolean f() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastEntityToolbarModel{imageUri=");
        sb.append(this.a);
        sb.append(", showUri=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", publisher=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", isFollowing=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oym) {
            oym oym = (oym) obj;
            return this.a.equals(oym.a()) && this.b.equals(oym.b()) && this.c.equals(oym.c()) && this.d.equals(oym.d()) && this.e.equals(oym.e()) && this.f == oym.f();
        }
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237);
    }
}
