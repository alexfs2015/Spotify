package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: rxq reason: default package */
final class rxq extends rxs {
    private final int a;
    private final int b;
    private final Bitmap c;
    private final Drawable d;

    /* renamed from: rxq$a */
    static final class a implements defpackage.rxs.a {
        private Integer a;
        private Integer b;
        private Bitmap c;
        private Drawable d;

        a() {
        }

        public final defpackage.rxs.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final defpackage.rxs.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.rxs.a a(Bitmap bitmap) {
            this.c = bitmap;
            return this;
        }

        public final defpackage.rxs.a a(Drawable drawable) {
            this.d = drawable;
            return this;
        }

        public final rxs a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" vibrantColor");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" dominantColor");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                rxq rxq = new rxq(this.a.intValue(), this.b.intValue(), this.c, this.d, 0);
                return rxq;
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ rxq(int i, int i2, Bitmap bitmap, Drawable drawable, byte b2) {
        this(i, i2, bitmap, drawable);
    }

    private rxq(int i, int i2, Bitmap bitmap, Drawable drawable) {
        this.a = i;
        this.b = i2;
        this.c = bitmap;
        this.d = drawable;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final Bitmap c() {
        return this.c;
    }

    public final Drawable d() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoverArtModel{vibrantColor=");
        sb.append(this.a);
        sb.append(", dominantColor=");
        sb.append(this.b);
        sb.append(", bitmap=");
        sb.append(this.c);
        sb.append(", holderDrawable=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rxs) {
            rxs rxs = (rxs) obj;
            if (this.a == rxs.a() && this.b == rxs.b()) {
                Bitmap bitmap = this.c;
                if (bitmap != null ? bitmap.equals(rxs.c()) : rxs.c() == null) {
                    Drawable drawable = this.d;
                    return drawable != null ? drawable.equals(rxs.d()) : rxs.d() == null;
                }
            }
        }
    }

    public final int hashCode() {
        int i = (((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003;
        Bitmap bitmap = this.c;
        int i2 = 0;
        int hashCode = (i ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003;
        Drawable drawable = this.d;
        if (drawable != null) {
            i2 = drawable.hashCode();
        }
        return hashCode ^ i2;
    }
}
