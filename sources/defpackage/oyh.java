package defpackage;

import android.net.Uri;

/* renamed from: oyh reason: default package */
public final class oyh extends oyj {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Uri e;

    public oyh(String str, String str2, String str3, String str4, Uri uri) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        if (uri != null) {
                            this.e = uri;
                            return;
                        }
                        throw new NullPointerException("Null imageUri");
                    }
                    throw new NullPointerException("Null descriptionPublisher");
                }
                throw new NullPointerException("Null description");
            }
            throw new NullPointerException("Null publisher");
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

    public final String d() {
        return this.d;
    }

    public final Uri e() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastEntityHeaderModel{title=");
        sb.append(this.a);
        sb.append(", publisher=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", descriptionPublisher=");
        sb.append(this.d);
        sb.append(", imageUri=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oyj) {
            oyj oyj = (oyj) obj;
            return this.a.equals(oyj.a()) && this.b.equals(oyj.b()) && this.c.equals(oyj.c()) && this.d.equals(oyj.d()) && this.e.equals(oyj.e());
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
