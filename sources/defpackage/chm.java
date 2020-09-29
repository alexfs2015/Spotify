package defpackage;

import java.util.Map;

/* renamed from: chm reason: default package */
final class chm implements bgl<Object> {
    private final /* synthetic */ chj a;

    chm(chj chj) {
        this.a = chj;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.a.b) {
            if (!this.a.e.isDone()) {
                chp chp = new chp(-2, map);
                if (this.a.c.equals(chp.f)) {
                    this.a.e.b(chp);
                }
            }
        }
    }
}
