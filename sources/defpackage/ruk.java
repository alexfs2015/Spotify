package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: ruk reason: default package */
public abstract class ruk implements run {
    private final Collection<run> a = new ArrayList();

    public void a(aio aio, boolean z) {
        synchronized (this.a) {
            for (run a2 : this.a) {
                a2.a(aio, z);
            }
        }
    }

    public final void a(run run) {
        synchronized (this.a) {
            this.a.add(run);
        }
    }

    public final void b(run run) {
        synchronized (this.a) {
            this.a.remove(run);
        }
    }
}
