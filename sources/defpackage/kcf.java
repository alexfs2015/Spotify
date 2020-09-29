package defpackage;

/* renamed from: kcf reason: default package */
final class kcf extends kcm {
    private final int a;
    private final int b;
    private final int c;
    private final float d;
    private final String e;

    kcf(int i, int i2, int i3, float f, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = str;
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

    public final float d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kcm) {
            kcm kcm = (kcm) obj;
            if (this.a == kcm.a() && this.b == kcm.b() && this.c == kcm.c() && Float.floatToIntBits(this.d) == Float.floatToIntBits(kcm.d())) {
                String str = this.e;
                return str != null ? str.equals(kcm.e()) : kcm.e() == null;
            }
        }
    }

    public final int hashCode() {
        int floatToIntBits = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d)) * 1000003;
        String str = this.e;
        return floatToIntBits ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoFormat{bitrate=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", frameRate=");
        sb.append(this.d);
        sb.append(", codecs=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
