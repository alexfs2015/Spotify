package defpackage;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;

/* renamed from: aqy reason: default package */
public final class aqy {
    public static final aqy a = new aqy(0, 0, new a().a, 0);
    public final int b;
    public final int c;
    private int d;
    private AudioAttributes e;

    /* renamed from: aqy$a */
    public static final class a {
        int a = 1;
        private int b = 0;
        private int c = 0;
    }

    /* synthetic */ aqy(int i, int i2, int i3, byte b2) {
        this(i, i2, i3);
    }

    private aqy(int i, int i2, int i3) {
        this.b = i;
        this.d = i2;
        this.c = i3;
    }

    public final AudioAttributes a() {
        if (this.e == null) {
            this.e = new Builder().setContentType(this.b).setFlags(this.d).setUsage(this.c).build();
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aqy aqy = (aqy) obj;
            return this.b == aqy.b && this.d == aqy.d && this.c == aqy.c;
        }
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31) + this.d) * 31) + this.c;
    }
}
