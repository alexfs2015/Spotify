package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* renamed from: aww reason: default package */
public final class aww extends aql implements Callback {
    private final awt h;
    private final awv i;
    private final Handler j;
    private final aqw k;
    private final awu l;
    private final awr[] m;
    private final long[] n;
    private int o;
    private int p;
    private aws q;
    private boolean r;

    public aww(awv awv, Looper looper) {
        this(awv, looper, awt.a);
    }

    private aww(awv awv, Looper looper, awt awt) {
        super(4);
        this.i = (awv) bdl.a(awv);
        this.j = looper == null ? null : ben.a(looper, (Callback) this);
        this.h = (awt) bdl.a(awt);
        this.k = new aqw();
        this.l = new awu();
        this.m = new awr[5];
        this.n = new long[5];
    }

    private void a(awr awr) {
        this.i.a(awr);
    }

    private void s() {
        Arrays.fill(this.m, null);
        this.o = 0;
        this.p = 0;
    }

    public final int a(aqv aqv) {
        if (this.h.a(aqv)) {
            return a(null, aqv.i) ? 4 : 2;
        }
        return 0;
    }

    public final void a(long j2, long j3) {
        if (!this.r && this.p < 5) {
            this.l.a();
            if (a(this.k, (asm) this.l, false) == -4) {
                if (this.l.c()) {
                    this.r = true;
                } else if (!this.l.n_()) {
                    this.l.f = this.k.a.j;
                    this.l.f();
                    int i2 = (this.o + this.p) % 5;
                    this.m[i2] = this.q.a(this.l);
                    this.n[i2] = this.l.d;
                    this.p++;
                }
            }
        }
        if (this.p > 0) {
            long[] jArr = this.n;
            int i3 = this.o;
            if (jArr[i3] <= j2) {
                awr awr = this.m[i3];
                Handler handler = this.j;
                if (handler != null) {
                    handler.obtainMessage(0, awr).sendToTarget();
                } else {
                    a(awr);
                }
                awr[] awrArr = this.m;
                int i4 = this.o;
                awrArr[i4] = null;
                this.o = (i4 + 1) % 5;
                this.p--;
            }
        }
    }

    public final void a(long j2, boolean z) {
        s();
        this.r = false;
    }

    public final void a(aqv[] aqvArr, long j2) {
        this.q = this.h.b(aqvArr[0]);
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            a((awr) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final void p() {
        s();
        this.q = null;
    }

    public final boolean q() {
        return true;
    }

    public final boolean r() {
        return this.r;
    }
}
