package defpackage;

import android.content.ComponentName;

/* renamed from: euy reason: default package */
final class euy implements Runnable {
    private final /* synthetic */ ComponentName a;
    private final /* synthetic */ euw b;

    euy(euw euw, ComponentName componentName) {
        this.b = euw;
        this.a = componentName;
    }

    public final void run() {
        euj.a(this.b.c, this.a);
    }
}
