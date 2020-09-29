package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;

/* renamed from: azr reason: default package */
public final class azr extends apu implements Callback {
    private final Handler h;
    private final azq i;
    private final azn j;
    private final aqf k;
    private boolean l;
    private boolean m;
    private int n;
    private aqe o;
    private azm p;
    private azo q;
    private azp r;
    private azp s;
    private int t;

    public final boolean q() {
        return true;
    }

    public azr(azq azq, Looper looper) {
        this(azq, looper, azn.a);
    }

    private azr(azq azq, Looper looper, azn azn) {
        Handler handler;
        super(3);
        this.i = (azq) bcu.a(azq);
        if (looper == null) {
            handler = null;
        } else {
            handler = bdw.a(looper, (Callback) this);
        }
        this.h = handler;
        this.j = azn;
        this.k = new aqf();
    }

    public final int a(aqe aqe) {
        return this.j.a(aqe) ? a(null, aqe.i) ? 4 : 2 : bdg.c(aqe.f) ? 1 : 0;
    }

    public final void a(aqe[] aqeArr, long j2) {
        this.o = aqeArr[0];
        if (this.p != null) {
            this.n = 1;
        } else {
            this.p = this.j.b(this.o);
        }
    }

    public final void a(long j2, long j3) {
        boolean z;
        if (!this.m) {
            if (this.s == null) {
                this.p.a(j2);
                try {
                    this.s = (azp) this.p.b();
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
                azp azp = this.s;
                if (azp != null) {
                    if (azp.c()) {
                        if (!z && v() == Long.MAX_VALUE) {
                            if (this.n == 2) {
                                u();
                            } else {
                                s();
                                this.m = true;
                            }
                        }
                    } else if (this.s.b <= j2) {
                        azp azp2 = this.r;
                        if (azp2 != null) {
                            azp2.e();
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
                                this.q = (azo) this.p.a();
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
                            int a = a(this.k, (arv) this.q, false);
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

    public final void p() {
        this.o = null;
        a(Collections.emptyList());
        t();
    }

    public final boolean r() {
        return this.m;
    }

    private void s() {
        this.q = null;
        this.t = -1;
        azp azp = this.r;
        if (azp != null) {
            azp.e();
            this.r = null;
        }
        azp azp2 = this.s;
        if (azp2 != null) {
            azp2.e();
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

    private void a(List<azi> list) {
        Handler handler = this.h;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            b(list);
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void b(List<azi> list) {
        this.i.a(list);
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
}
