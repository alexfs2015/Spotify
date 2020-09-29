package defpackage;

/* renamed from: hxv reason: default package */
abstract class hxv extends hxz {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;

    hxv(String str, String str2, String str3, String str4, String str5) {
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
                            return;
                        }
                        throw new NullPointerException("Null clickUrl");
                    }
                    throw new NullPointerException("Null callToActionText");
                }
                throw new NullPointerException("Null advertiserName");
            }
            throw new NullPointerException("Null imageUri");
        }
        throw new NullPointerException("Null id");
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

    public String toString() {
        StringBuilder sb = new StringBuilder("LeaveBehindAd{id=");
        sb.append(this.a);
        sb.append(", imageUri=");
        sb.append(this.b);
        sb.append(", advertiserName=");
        sb.append(this.c);
        sb.append(", callToActionText=");
        sb.append(this.d);
        sb.append(", clickUrl=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hxz) {
            hxz hxz = (hxz) obj;
            return this.a.equals(hxz.a()) && this.b.equals(hxz.b()) && this.c.equals(hxz.c()) && this.d.equals(hxz.d()) && this.e.equals(hxz.e());
        }
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
