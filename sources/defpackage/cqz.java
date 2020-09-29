package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@cfp
/* renamed from: cqz reason: default package */
public class cqz<T> implements cqv<T> {
    int a = 0;
    private final Object b = new Object();
    private final BlockingQueue<cra> c = new LinkedBlockingQueue();
    private T d;

    public final void a() {
        synchronized (this.b) {
            if (this.a == 0) {
                this.a = -1;
                for (cra cra : this.c) {
                    cra.b.a();
                }
                this.c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    public final void a(cqy<T> cqy, cqw cqw) {
        synchronized (this.b) {
            if (this.a == 1) {
                cqy.a(this.d);
            } else if (this.a == -1) {
                cqw.a();
            } else if (this.a == 0) {
                this.c.add(new cra(cqy, cqw));
            }
        }
    }

    public final void a(T t) {
        synchronized (this.b) {
            if (this.a == 0) {
                this.d = t;
                this.a = 1;
                for (cra cra : this.c) {
                    cra.a.a(t);
                }
                this.c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }
}
