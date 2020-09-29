package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: rsk reason: default package */
public final class rsk extends Drawable {
    public final rsn a;
    public rsb b;
    private final Paint c;
    private final int d;

    public rsk(int i) {
        this(new rsn(), i);
    }

    private rsk(rsn rsn, int i) {
        this.c = new Paint(1);
        this.d = i;
        this.a = rsn;
        this.b = new rsb(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            rsb r0 = r4.b
            if (r0 == 0) goto L_0x000d
            android.animation.ValueAnimator r0 = r0.a
            if (r0 == 0) goto L_0x000d
            float r0 = r0.getAnimatedFraction()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            rsn r1 = r4.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0020
            rsn r1 = r4.a
            android.graphics.Paint r2 = r4.c
            int r3 = r4.d
            float r3 = (float) r3
            r1.a(r5, r2, r0, r3)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsk.draw(android.graphics.Canvas):void");
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.a(getBounds());
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
