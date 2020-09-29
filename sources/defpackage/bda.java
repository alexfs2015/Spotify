package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bda reason: default package */
public final class bda<T> {
    private final CopyOnWriteArrayList<b<T>> a = new CopyOnWriteArrayList<>();

    /* renamed from: bda$a */
    public interface a<T> {
        void sendTo(T t);
    }

    /* renamed from: bda$b */
    static final class b<T> {
        public final Handler a;
        public final T b;

        public b(Handler handler, T t) {
            this.a = handler;
            this.b = t;
        }
    }

    public final void a(Handler handler, T t) {
        bcu.a((handler == null || t == null) ? false : true);
        a(t);
        this.a.add(new b(handler, t));
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

    public final void a(a<T> aVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.a.post(new $$Lambda$bda$O5xpcIVpAKNJsUeHmQO00k4leg(aVar, bVar.b));
        }
    }
}
