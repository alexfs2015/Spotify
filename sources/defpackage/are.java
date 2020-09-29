package defpackage;

import android.os.Handler;

/* renamed from: are reason: default package */
public final class are {
    final b a;
    final arl b;
    int c;
    Object d;
    Handler e;
    int f;
    long g = -9223372036854775807L;
    boolean h = true;
    private final a i;
    private boolean j;
    private boolean k;
    private boolean l;

    /* renamed from: are$a */
    public interface a {
        void a(are are);
    }

    /* renamed from: are$b */
    public interface b {
        void handleMessage(int i, Object obj);
    }

    public are(a aVar, b bVar, arl arl, int i2, Handler handler) {
        this.i = aVar;
        this.a = bVar;
        this.b = arl;
        this.e = handler;
        this.f = i2;
    }

    public final are a() {
        bdl.b(!this.j);
        if (this.g == -9223372036854775807L) {
            bdl.a(this.h);
        }
        this.j = true;
        this.i.a(this);
        return this;
    }

    public final are a(int i2) {
        bdl.b(!this.j);
        this.c = i2;
        return this;
    }

    public final are a(long j2) {
        bdl.b(!this.j);
        this.g = j2;
        return this;
    }

    public final are a(Object obj) {
        bdl.b(!this.j);
        this.d = obj;
        return this;
    }

    public final are a(boolean z) {
        bdl.b(!this.j);
        this.h = z;
        return this;
    }

    public final synchronized void b(boolean z) {
        this.k = z | this.k;
        this.l = true;
        notifyAll();
    }

    public final synchronized boolean b() {
        return false;
    }

    public final synchronized boolean c() {
        bdl.b(this.j);
        bdl.b(this.e.getLooper().getThread() != Thread.currentThread());
        while (!this.l) {
            wait();
        }
        return this.k;
    }
}
