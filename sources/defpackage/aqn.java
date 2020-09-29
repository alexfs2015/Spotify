package defpackage;

import android.os.Handler;

/* renamed from: aqn reason: default package */
public final class aqn {
    final b a;
    final aqu b;
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

    /* renamed from: aqn$a */
    public interface a {
        void a(aqn aqn);
    }

    /* renamed from: aqn$b */
    public interface b {
        void handleMessage(int i, Object obj);
    }

    public aqn(a aVar, b bVar, aqu aqu, int i2, Handler handler) {
        this.i = aVar;
        this.a = bVar;
        this.b = aqu;
        this.e = handler;
        this.f = i2;
    }

    public final aqn a(int i2) {
        bcu.b(!this.j);
        this.c = i2;
        return this;
    }

    public final aqn a(Object obj) {
        bcu.b(!this.j);
        this.d = obj;
        return this;
    }

    public final aqn a(long j2) {
        bcu.b(!this.j);
        this.g = j2;
        return this;
    }

    public final aqn a(boolean z) {
        bcu.b(!this.j);
        this.h = z;
        return this;
    }

    public final aqn a() {
        bcu.b(!this.j);
        if (this.g == -9223372036854775807L) {
            bcu.a(this.h);
        }
        this.j = true;
        this.i.a(this);
        return this;
    }

    public final synchronized boolean b() {
        return false;
    }

    public final synchronized boolean c() {
        bcu.b(this.j);
        bcu.b(this.e.getLooper().getThread() != Thread.currentThread());
        while (!this.l) {
            wait();
        }
        return this.k;
    }

    public final synchronized void b(boolean z) {
        this.k = z | this.k;
        this.l = true;
        notifyAll();
    }
}
