package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;

/* renamed from: bai reason: default package */
public final class bai extends aql implements Callback {
    private final Handler h;
    private final bah i;
    private final bae j;
    private final aqw k;
    private boolean l;
    private boolean m;
    private int n;
    private aqv o;
    private bad p;
    private baf q;
    private bag r;
    private bag s;
    private int t;

    public bai(bah bah, Looper looper) {
        this(bah, looper, bae.a);
    }

    private bai(bah bah, Looper looper, bae bae) {
        super(3);
        this.i = (bah) bdl.a(bah);
        this.h = looper == null ? null : ben.a(looper, (Callback) this);
        this.j = bae;
        this.k = new aqw();
    }

    private void a(List<azz> list) {
        Handler handler = this.h;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            b(list);
        }
    }

    private void b(List<azz> list) {
        this.i.a(list);
    }

    private void s() {
        this.q = null;
        this.t = -1;
        bag bag = this.r;
        if (bag != null) {
            bag.e();
            this.r = null;
        }
        bag bag2 = this.s;
        if (bag2 != null) {
            bag2.e();
            this.s = null;
        }
    }

    private void t() {
        s();
        this.p.d();
        this.p = null;
        this.n = 0;
    }

    private void u() {
        t();
        this.p = this.j.b(this.o);
    }

    private long v() {
        int i2 = this.t;
        if (i2 == -1 || i2 >= this.r.b()) {
            return Long.MAX_VALUE;
        }
        return this.r.b_(this.t);
    }

    public final int a(aqv aqv) {
        return this.j.a(aqv) ? a(null, aqv.i) ? 4 : 2 : bdx.c(aqv.f) ? 1 : 0;
    }

    public final void a(long j2, long j3) {
        boolean z;
        if (!this.m) {
            if (this.s == null) {
                this.p.a(j2);
                try {
                    this.s = (bag) this.p.b();
                } catch (SubtitleDecoderException e) {
                    throw ExoPlaybackException.a(e, this.b);
                }
            }
            if (this.c == 2) {
                if (this.r != null) {
                    long v = v();
                    z = false;
                    while (v <= j2) {
                        this.t++;
                        v = v();
                        z = true;
                    }
                } else {
                    z = false;
                }
                bag bag = this.s;
                if (bag != null) {
                    if (bag.c()) {
                        if (!z && v() == Long.MAX_VALUE) {
                            if (this.n == 2) {
                                u();
                            } else {
                                s();
                                this.m = true;
                            }
                        }
                    } else if (this.s.b <= j2) {
                        bag bag2 = this.r;
                        if (bag2 != null) {
                            bag2.e();
                        }
                        this.r = this.s;
                        this.s = null;
                        this.t = this.r.a(j2);
                        z = true;
                    }
                }
                if (z) {
                    a(this.r.b(j2));
                }
                if (this.n != 2) {
                    while (!this.l) {
                        try {
                            if (this.q == null) {
                                this.q = (baf) this.p.a();
                                if (this.q == null) {
                                    return;
                                }
                            }
                            if (this.n == 1) {
                                this.q.a = 4;
                                this.p.a(this.q);
                                this.q = null;
                                this.n = 2;
                                return;
                            }
                            int a = a(this.k, (asm) this.q, false);
                            if (a == -4) {
                                if (this.q.c()) {
                                    this.l = true;
                                } else {
                                    this.q.f = this.k.a.j;
                                    this.q.f();
                                }
                                this.p.a(this.q);
                                this.q = null;
                            } else if (a == -3) {
                                break;
                            }
                        } catch (SubtitleDecoderException e2) {
                            throw ExoPlaybackException.a(e2, this.b);
                        }
                    }
                }
            }
        }
    }

    public final void a(long j2, boolean z) {
        a(Collections.emptyList());
        this.l = false;
        this.m = false;
        if (this.n != 0) {
            u();
            return;
        }
        s();
        this.p.c();
    }

    public final void a(aqv[] aqvArr, long j2) {
        this.o = aqvArr[0];
        if (this.p != null) {
            this.n = 1;
        } else {
            this.p = this.j.b(this.o);
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final void p() {
        this.o = null;
        a(Collections.emptyList());
        t();
    }

    public final boolean q() {
        return true;
    }

    public final boolean r() {
        return this.m;
    }
}
