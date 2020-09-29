package defpackage;

import android.content.Intent;

/* renamed from: fgv reason: default package */
final class fgv implements Runnable {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ Intent b;
    private final /* synthetic */ fgt c;

    fgv(fgt fgt, Intent intent, Intent intent2) {
        this.c = fgt;
        this.a = intent;
        this.b = intent2;
    }

    public final void run() {
        this.c.b(this.a);
        this.c.d(this.b);
    }
}
