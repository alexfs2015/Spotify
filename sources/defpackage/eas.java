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

/* renamed from: eas reason: default package */
public final class eas {
    private final AtomicInteger a;
    private final Set<dwv<?>> b;
    private final PriorityBlockingQueue<dwv<?>> c;
    private final PriorityBlockingQueue<dwv<?>> d;
    private final dch e;
    private final dsc f;
    private final cck g;
    private final dsv[] h;
    private djd i;
    private final List<Object> j;

    private eas(dch dch, dsc dsc) {
        this(dch, dsc, (cck) new doe(new Handler(Looper.getMainLooper())));
    }

    public eas(dch dch, dsc dsc, byte b2) {
        this(dch, dsc);
    }

    private eas(dch dch, dsc dsc, cck cck) {
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue<>();
        this.d = new PriorityBlockingQueue<>();
        this.j = new ArrayList();
        this.e = dch;
        this.f = dsc;
        this.h = new dsv[4];
        this.g = cck;
    }

    public final <T> dwv<T> a(dwv<T> dwv) {
        dwv.g = this;
        synchronized (this.b) {
            this.b.add(dwv);
        }
        dwv.f = Integer.valueOf(this.a.incrementAndGet());
        dwv.b("add-to-queue");
        (!dwv.h ? this.d : this.c).add(dwv);
        return dwv;
    }

    public final void a() {
        djd djd = this.i;
        if (djd != null) {
            djd.a();
        }
        dsv[] dsvArr = this.h;
        for (int i2 = 0; i2 < 4; i2++) {
            dsv dsv = dsvArr[i2];
            if (dsv != null) {
                dsv.a = true;
                dsv.interrupt();
            }
        }
        this.i = new djd(this.c, this.d, this.e, this.g);
        this.i.start();
        for (int i3 = 0; i3 < 4; i3++) {
            dsv dsv2 = new dsv(this.d, this.f, this.e, this.g);
            this.h[i3] = dsv2;
            dsv2.start();
        }
    }

    /* access modifiers changed from: 0000 */
    public final <T> void b(dwv<T> dwv) {
        synchronized (this.b) {
            this.b.remove(dwv);
        }
        synchronized (this.j) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
