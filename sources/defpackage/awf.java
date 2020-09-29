package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* renamed from: awf reason: default package */
public final class awf extends apu implements Callback {
    private final awc h;
    private final awe i;
    private final Handler j;
    private final aqf k;
    private final awd l;
    private final awa[] m;
    private final long[] n;
    private int o;
    private int p;
    private awb q;
    private boolean r;

    public final boolean q() {
        return true;
    }

    public awf(awe awe, Looper looper) {
        this(awe, looper, awc.a);
    }

    private awf(awe awe, Looper looper, awc awc) {
        Handler handler;
        super(4);
        this.i = (awe) bcu.a(awe);
        if (looper == null) {
            handler = null;
        } else {
            handler = bdw.a(looper, (Callback) this);
        }
        this.j = handler;
        this.h = (awc) bcu.a(awc);
        this.k = new aqf();
        this.l = new awd();
        this.m = new awa[5];
        this.n = new long[5];
    }

    public final int a(aqe aqe) {
        if (this.h.a(aqe)) {
            return a(null, aqe.i) ? 4 : 2;
        }
        return 0;
    }

    public final void a(aqe[] aqeArr, long j2) {
        this.q = this.h.b(aqeArr[0]);
    }

    public final void a(long j2, boolean z) {
        s();
        this.r = false;
    }

    public final void a(long j2, long j3) {
        if (!this.r && this.p < 5) {
            this.l.a();
            if (a(this.k, (arv) this.l, false) == -4) {
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
                awa awa = this.m[i3];
                Handler handler = this.j;
                if (handler != null) {
                    handler.obtainMessage(0, awa).sendToTarget();
                } else {
                    a(awa);
                }
                awa[] awaArr = this.m;
                int i4 = this.o;
                awaArr[i4] = null;
                this.o = (i4 + 1) % 5;
                this.p--;
            }
        }
    }

    public final void p() {
        s();
        this.q = null;
    }

    public final boolean r() {
        return this.r;
    }

    private void s() {
        Arrays.fill(this.m, null);
        this.o = 0;
        this.p = 0;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            a((awa) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void a(awa awa) {
        this.i.a(awa);
    }
}
