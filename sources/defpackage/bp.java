package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;

/* renamed from: bp reason: default package */
public final class bp {
    private final CompoundButton a;
    private ColorStateList b = null;
    private Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    public bp(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[SYNTHETIC, Splitter:B:12:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[Catch:{ all -> 0x0080 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.util.AttributeSet r4, int r5) {
        /*
            r3 = this;
            android.widget.CompoundButton r0 = r3.a
            android.content.Context r0 = r0.getContext()
            int[] r1 = defpackage.o.a.aO
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = defpackage.o.a.aQ     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            int r5 = defpackage.o.a.aQ     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            android.widget.CompoundButton r0 = r3.a     // Catch:{ NotFoundException -> 0x002e }
            android.widget.CompoundButton r1 = r3.a     // Catch:{ NotFoundException -> 0x002e }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x002e }
            android.graphics.drawable.Drawable r5 = defpackage.ab.b(r1, r5)     // Catch:{ NotFoundException -> 0x002e }
            r0.setButtonDrawable(r5)     // Catch:{ NotFoundException -> 0x002e }
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 != 0) goto L_0x0050
            int r5 = defpackage.o.a.aP     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            int r5 = defpackage.o.a.aP     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            android.widget.CompoundButton r0 = r3.a     // Catch:{ all -> 0x0080 }
            android.widget.CompoundButton r1 = r3.a     // Catch:{ all -> 0x0080 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0080 }
            android.graphics.drawable.Drawable r5 = defpackage.ab.b(r1, r5)     // Catch:{ all -> 0x0080 }
            r0.setButtonDrawable(r5)     // Catch:{ all -> 0x0080 }
        L_0x0050:
            int r5 = defpackage.o.a.aR     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0063
            android.widget.CompoundButton r5 = r3.a     // Catch:{ all -> 0x0080 }
            int r0 = defpackage.o.a.aR     // Catch:{ all -> 0x0080 }
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)     // Catch:{ all -> 0x0080 }
            defpackage.jh.a(r5, r0)     // Catch:{ all -> 0x0080 }
        L_0x0063:
            int r5 = defpackage.o.a.aS     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x007c
            android.widget.CompoundButton r5 = r3.a     // Catch:{ all -> 0x0080 }
            int r0 = defpackage.o.a.aS     // Catch:{ all -> 0x0080 }
            r1 = -1
            int r0 = r4.getInt(r0, r1)     // Catch:{ all -> 0x0080 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = defpackage.ca.a(r0, r1)     // Catch:{ all -> 0x0080 }
            defpackage.jh.a(r5, r0)     // Catch:{ all -> 0x0080 }
        L_0x007c:
            r4.recycle()
            return
        L_0x0080:
            r5 = move-exception
            r4.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp.a(android.util.AttributeSet, int):void");
    }

    public final void a(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        b();
    }

    public final void a(Mode mode) {
        this.c = mode;
        this.e = true;
        b();
    }

    public final void a() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        b();
    }

    private void b() {
        Drawable a2 = jh.a(this.a);
        if (a2 == null) {
            return;
        }
        if (this.d || this.e) {
            Drawable mutate = gm.f(a2).mutate();
            if (this.d) {
                gm.a(mutate, this.b);
            }
            if (this.e) {
                gm.a(mutate, this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }

    public final int a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a2 = jh.a(this.a);
        return a2 != null ? i + a2.getIntrinsicWidth() : i;
    }
}
