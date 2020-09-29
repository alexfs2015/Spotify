package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@cey
/* renamed from: cqi reason: default package */
public class cqi<T> implements cqe<T> {
    int a = 0;
    private final Object b = new Object();
    private final BlockingQueue<cqj> c = new LinkedBlockingQueue();
    private T d;

    public final void a() {
        synchronized (this.b) {
            if (this.a == 0) {
                this.a = -1;
                for (cqj cqj : this.c) {
                    cqj.b.a();
                }
                this.c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    public final void a(cqh<T> cqh, cqf cqf) {
        synchronized (this.b) {
            if (this.a == 1) {
                cqh.a(this.d);
            } else if (this.a == -1) {
                cqf.a();
            } else if (this.a == 0) {
                this.c.add(new cqj(cqh, cqf));
            }
        }
    }

    public final void a(T t) {
        synchronized (this.b) {
            if (this.a == 0) {
                this.d = t;
                this.a = 1;
                for (cqj cqj : this.c) {
                    cqj.a.a(t);
                }
                this.c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }
}
