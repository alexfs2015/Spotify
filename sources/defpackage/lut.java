package defpackage;

import java.util.List;

/* renamed from: lut reason: default package */
abstract class lut extends luu {
    final String a;
    final String b;
    final String c;
    final boolean d;
    final String e;
    final String f;
    final List<String> g;
    final String h;

    lut(String str, String str2, String str3, boolean z, String str4, String str5, List<String> list, String str6) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = z;
                    if (str4 != null) {
                        this.e = str4;
                        if (str5 != null) {
                            this.f = str5;
                            if (list != null) {
                                this.g = list;
                                if (str6 != null) {
                                    this.h = str6;
                                    return;
                                }
                                throw new NullPointerException("Null image");
                            }
                            throw new NullPointerException("Null artistNames");
                        }
                        throw new NullPointerException("Null artistName");
                    }
                    throw new NullPointerException("Null albumName");
                }
                throw new NullPointerException("Null previewId");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
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

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof luu) {
            luu luu = (luu) obj;
            return this.a.equals(luu.a()) && this.b.equals(luu.b()) && this.c.equals(luu.c()) && this.d == luu.d() && this.e.equals(luu.e()) && this.f.equals(luu.f()) && this.g.equals(luu.g()) && this.h.equals(luu.h());
        }
    }

    public final String f() {
        return this.f;
    }

    public final List<String> g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ACTrack{uri=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", previewId=");
        sb.append(this.c);
        sb.append(", explicit=");
        sb.append(this.d);
        sb.append(", albumName=");
        sb.append(this.e);
        sb.append(", artistName=");
        sb.append(this.f);
        sb.append(", artistNames=");
        sb.append(this.g);
        sb.append(", image=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}