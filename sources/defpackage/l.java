package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: l reason: default package */
public abstract class l {
    public boolean a;
    private CopyOnWriteArrayList<j> b = new CopyOnWriteArrayList<>();

    public l(boolean z) {
        this.a = z;
    }

    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    public final void a(j jVar) {
        this.b.add(jVar);
    }

    public abstract void b();

    public final void b(j jVar) {
        this.b.remove(jVar);
    }
}
