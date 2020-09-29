package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: eab reason: default package */
public final class eab {
    private final AtomicInteger a;
    private final Set<dwe<?>> b;
    private final PriorityBlockingQueue<dwe<?>> c;
    private final PriorityBlockingQueue<dwe<?>> d;
    private final dbq e;
    private final drl f;
    private final cbt g;
    private final dse[] h;
    private dim i;
    private final List<Object> j;

    private eab(dbq dbq, drl drl) {
        this(dbq, drl, (cbt) new dnn(new Handler(Looper.getMainLooper())));
    }

    public eab(dbq dbq, drl drl, byte b2) {
        this(dbq, drl);
    }

    private eab(dbq dbq, drl drl, cbt cbt) {
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue<>();
        this.d = new PriorityBlockingQueue<>();
        this.j = new ArrayList();
        this.e = dbq;
        this.f = drl;
        this.h = new dse[4];
        this.g = cbt;
    }

    /* access modifiers changed from: 0000 */
    public final <T> void b(dwe<T> dwe) {
        synchronized (this.b) {
            this.b.remove(dwe);
        }
        synchronized (this.j) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void a() {
        dim dim = this.i;
        if (dim != null) {
            dim.a();
        }
        dse[] dseArr = this.h;
        for (int i2 = 0; i2 < 4; i2++) {
            dse dse = dseArr[i2];
            if (dse != null) {
                dse.a = true;
                dse.interrupt();
            }
        }
        this.i = new dim(this.c, this.d, this.e, this.g);
        this.i.start();
        for (int i3 = 0; i3 < 4; i3++) {
            dse dse2 = new dse(this.d, this.f, this.e, this.g);
            this.h[i3] = dse2;
            dse2.start();
        }
    }

    public final <T> dwe<T> a(dwe<T> dwe) {
        dwe.g = this;
        synchronized (this.b) {
            this.b.add(dwe);
        }
        dwe.f = Integer.valueOf(this.a.incrementAndGet());
        dwe.b("add-to-queue");
        (!dwe.h ? this.d : this.c).add(dwe);
        return dwe;
    }
}
