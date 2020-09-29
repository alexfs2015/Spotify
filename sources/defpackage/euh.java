package defpackage;

import android.content.ComponentName;

/* renamed from: euh reason: default package */
final class euh implements Runnable {
    private final /* synthetic */ ComponentName a;
    private final /* synthetic */ euf b;

    euh(euf euf, ComponentName componentName) {
        this.b = euf;
        this.a = componentName;
    }

    public final void run() {
        ets.a(this.b.c, this.a);
    }
}
