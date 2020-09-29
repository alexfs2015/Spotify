package defpackage;

import android.content.Intent;

/* renamed from: fhp reason: default package */
final class fhp implements Runnable {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ Intent b;
    private final /* synthetic */ fhn c;

    fhp(fhn fhn, Intent intent, Intent intent2) {
        this.c = fhn;
        this.a = intent;
        this.b = intent2;
    }

    public final void run() {
        this.c.b(this.a);
        this.c.d(this.b);
    }
}
