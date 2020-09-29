package defpackage;

/* renamed from: tqy reason: default package */
final class tqy extends tqz {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    tqy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.h = i9;
        this.i = i10;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final int i() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration{cardWidth=");
        sb.append(this.a);
        sb.append(", descriptionSize=");
        sb.append(this.b);
        sb.append(", podcastImageSize=");
        sb.append(this.c);
        sb.append(", podcastImagePlaceHolderSize=");
        sb.append(this.d);
        sb.append(", titleAppearance=");
        sb.append(this.e);
        sb.append(", titleColor=");
        sb.append(this.f);
        sb.append(", metadataVisibility=");
        sb.append(this.g);
        sb.append(", textOffset=");
        sb.append(this.h);
        sb.append(", titleTopMargin=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tqz) {
            tqz tqz = (tqz) obj;
            return this.a == tqz.a() && this.b == tqz.b() && this.c == tqz.c() && this.d == tqz.d() && this.e == tqz.e() && this.f == tqz.f() && this.g == tqz.g() && this.h == tqz.h() && this.i == tqz.i();
        }
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i;
    }
}
