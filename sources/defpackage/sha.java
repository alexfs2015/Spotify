package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: sha reason: default package */
final class sha extends shc {
    private final int a;
    private final int b;
    private final Bitmap c;
    private final Drawable d;

    /* renamed from: sha$a */
    static final class a implements defpackage.shc.a {
        private Integer a;
        private Integer b;
        private Bitmap c;
        private Drawable d;

        a() {
        }

        public final defpackage.shc.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final defpackage.shc.a a(Bitmap bitmap) {
            this.c = bitmap;
            return this;
        }

        public final defpackage.shc.a a(Drawable drawable) {
            this.d = drawable;
            return this;
        }

        public final shc a() {
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
                sha sha = new sha(this.a.intValue(), this.b.intValue(), this.c, this.d, 0);
                return sha;
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.shc.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }
    }

    private sha(int i, int i2, Bitmap bitmap, Drawable drawable) {
        this.a = i;
        this.b = i2;
        this.c = bitmap;
        this.d = drawable;
    }

    /* synthetic */ sha(int i, int i2, Bitmap bitmap, Drawable drawable, byte b2) {
        this(i, i2, bitmap, drawable);
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof shc) {
            shc shc = (shc) obj;
            if (this.a == shc.a() && this.b == shc.b()) {
                Bitmap bitmap = this.c;
                if (bitmap != null ? bitmap.equals(shc.c()) : shc.c() == null) {
                    Drawable drawable = this.d;
                    return drawable != null ? drawable.equals(shc.d()) : shc.d() == null;
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
}
