package defpackage;

import java.util.Map;

/* renamed from: dzu reason: default package */
final /* synthetic */ class dzu implements Runnable {
    private final dzt a;
    private final bgl b;
    private final Map c;

    dzu(dzt dzt, bgl bgl, Map map) {
        this.a = dzt;
        this.b = bgl;
        this.c = map;
    }

    public final void run() {
        dzt dzt = this.a;
        this.b.zza(dzt.n(), this.c);
    }
}
