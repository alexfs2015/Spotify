package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: bgz reason: default package */
final class bgz implements Runnable {
    private final /* synthetic */ Drawable a;
    private final /* synthetic */ bgy b;

    bgz(bgy bgy, Drawable drawable) {
        this.b = bgy;
        this.a = drawable;
    }

    public final void run() {
        this.b.a.a.getWindow().setBackgroundDrawable(this.a);
    }
}
