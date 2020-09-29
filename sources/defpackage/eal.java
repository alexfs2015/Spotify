package defpackage;

import java.util.Map;

/* renamed from: eal reason: default package */
final /* synthetic */ class eal implements Runnable {
    private final eak a;
    private final bhc b;
    private final Map c;

    eal(eak eak, bhc bhc, Map map) {
        this.a = eak;
        this.b = bhc;
        this.c = map;
    }

    public final void run() {
        eak eak = this.a;
        this.b.zza(eak.n(), this.c);
    }
}
