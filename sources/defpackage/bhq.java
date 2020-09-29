package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: bhq reason: default package */
final class bhq implements Runnable {
    private final /* synthetic */ Drawable a;
    private final /* synthetic */ bhp b;

    bhq(bhp bhp, Drawable drawable) {
        this.b = bhp;
        this.a = drawable;
    }

    public final void run() {
        this.b.a.a.getWindow().setBackgroundDrawable(this.a);
    }
}
