package defpackage;

/* renamed from: trn reason: default package */
final class trn extends trt {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final trq e;
    private final int f;
    private final int g;
    private final trq h;
    private final int i;

    trn(String str, String str2, String str3, boolean z, trq trq, int i2, int i3, trq trq2, int i4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = z;
                    if (trq != null) {
                        this.e = trq;
                        this.f = i2;
                        this.g = i3;
                        if (trq2 != null) {
                            this.h = trq2;
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

    public final trq e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final trq h() {
        return this.h;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof trt) {
            trt trt = (trt) obj;
            return this.a.equals(trt.a()) && this.b.equals(trt.b()) && this.c.equals(trt.c()) && this.d == trt.d() && this.e.equals(trt.e()) && this.f == trt.f() && this.g == trt.g() && this.h.equals(trt.h()) && this.i == trt.i();
        }
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i;
    }
}
