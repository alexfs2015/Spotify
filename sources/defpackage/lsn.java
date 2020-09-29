package defpackage;

/* renamed from: lsn reason: default package */
public final class lsn extends lsl {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final String f;

    public lsn(String str, String str2, String str3, String str4, boolean z, String str5) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lsl) {
            lsl lsl = (lsl) obj;
            return this.a.equals(lsl.a()) && this.b.equals(lsl.b()) && this.c.equals(lsl.c()) && this.d.equals(lsl.d()) && this.e == lsl.e() && this.f.equals(lsl.f());
        }
    }

    public final String f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
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
}
