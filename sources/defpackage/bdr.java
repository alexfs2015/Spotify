package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bdr reason: default package */
public final class bdr<T> {
    private final CopyOnWriteArrayList<b<T>> a = new CopyOnWriteArrayList<>();

    /* renamed from: bdr$a */
    public interface a<T> {
        void sendTo(T t);
    }

    /* renamed from: bdr$b */
    static final class b<T> {
        public final Handler a;
        public final T b;

        public b(Handler handler, T t) {
            this.a = handler;
            this.b = t;
        }
    }

    public final void a(Handler handler, T t) {
        bdl.a((handler == null || t == null) ? false : true);
        a(t);
        this.a.add(new b(handler, t));
    }

    public final void a(a<T> aVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.a.post(new $$Lambda$bdr$nFHFswXgkyKIJRnV9893jmNok4s(aVar, bVar.b));
        }
    }

    public final void a(T t) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.b == t) {
                this.a.remove(bVar);
            }
        }
    }
}
