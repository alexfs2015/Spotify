package defpackage;

/* renamed from: lon reason: default package */
public final class lon extends lol {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final String f;

    public lon(String str, String str2, String str3, String str4, boolean z, String str5) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = z;
                        if (str5 != null) {
                            this.f = str5;
                            return;
                        }
                        throw new NullPointerException("Null artistUri");
                    }
                    throw new NullPointerException("Null imageUri");
                }
                throw new NullPointerException("Null artistName");
            }
            throw new NullPointerException("Null albumName");
        }
        throw new NullPointerException("Null albumUri");
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

    public final boolean e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumToolbarModel{albumUri=");
        sb.append(this.a);
        sb.append(", albumName=");
        sb.append(this.b);
        sb.append(", artistName=");
        sb.append(this.c);
        sb.append(", imageUri=");
        sb.append(this.d);
        sb.append(", isLargeImage=");
        sb.append(this.e);
        sb.append(", artistUri=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lol) {
            lol lol = (lol) obj;
            return this.a.equals(lol.a()) && this.b.equals(lol.b()) && this.c.equals(lol.c()) && this.d.equals(lol.d()) && this.e == lol.e() && this.f.equals(lol.f());
        }
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
    }
}
