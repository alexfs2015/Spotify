package defpackage;

import defpackage.waw;
import defpackage.wbc;
import io.netty.channel.ChannelPipelineException;
import java.net.SocketAddress;

/* renamed from: wbk reason: default package */
public class wbk<I extends waw, O extends wbc> extends wap {
    /* access modifiers changed from: private */
    public static final wjw d;
    private static /* synthetic */ boolean h;
    protected I b;
    /* access modifiers changed from: protected */
    public O c;
    private a e;
    /* access modifiers changed from: private */
    public a f;
    private volatile boolean g;

    /* renamed from: wbk$a */
    static class a implements wav {
        boolean a;
        /* access modifiers changed from: private */
        public final wav b;
        private final wat c;

        a(wav wav, wat wat) {
            this.b = wav;
            this.c = wat;
        }

        public final wan a() {
            return this.b.a();
        }

        public final whw d() {
            return this.b.d();
        }

        public final wat t() {
            return this.b.t();
        }

        public final boolean r() {
            return this.a || this.b.r();
        }

        public final wav e() {
            this.b.e();
            return this;
        }

        public final wav f() {
            this.b.f();
            return this;
        }

        public final wav g() {
            this.b.g();
            return this;
        }

        public final wav h() {
            this.b.h();
            return this;
        }

        public wav a(Throwable th) {
            this.b.a(th);
            return this;
        }

        public final wav c(Object obj) {
            this.b.c(obj);
            return this;
        }

        public final wav d(Object obj) {
            this.b.d(obj);
            return this;
        }

        public final wav j() {
            this.b.j();
            return this;
        }

        public final wav l() {
            this.b.l();
            return this;
        }

        public final war i() {
            return this.b.i();
        }

        public final war a(SocketAddress socketAddress, wbi wbi) {
            return this.b.a(socketAddress, wbi);
        }

        public final war a(SocketAddress socketAddress, SocketAddress socketAddress2, wbi wbi) {
            return this.b.a(socketAddress, socketAddress2, wbi);
        }

        public final war a(wbi wbi) {
            return this.b.a(wbi);
        }

        public final war b(wbi wbi) {
            return this.b.b(wbi);
        }

        public final wav m() {
            this.b.m();
            return this;
        }

        public final war a(Object obj) {
            return this.b.a(obj);
        }

        public final war a(Object obj, wbi wbi) {
            return this.b.a(obj, wbi);
        }

        public final wav o() {
            this.b.o();
            return this;
        }

        public final war b(Object obj) {
            return this.b.b(obj);
        }

        public final wbf b() {
            return this.b.b();
        }

        public final vyw c() {
            return this.b.c();
        }

        public final wbi k() {
            return this.b.k();
        }

        public final wbi n() {
            return this.b.n();
        }

        public final <T> wgx<T> a(wgy<T> wgy) {
            return this.b.a(wgy);
        }

        /* access modifiers changed from: 0000 */
        public final void p() {
            whw d = d();
            if (d.j()) {
                q();
            } else {
                d.execute(new Runnable() {
                    public final void run() {
                        a.this.q();
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        public void q() {
            if (!this.a) {
                this.a = true;
                try {
                    this.c.f(this);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.c.getClass().getName());
                    sb.append(".handlerRemoved() has thrown an exception.");
                    a((Throwable) new ChannelPipelineException(sb.toString(), th));
                }
            }
        }
    }

    static {
        Class<wbk> cls = wbk.class;
        h = !cls.desiredAssertionStatus();
        d = wjx.a(cls);
    }

    protected wbk() {
    }

    public final void e(wav wav) {
        if (this.b != null) {
            this.f = new a(wav, this.c);
            this.e = new a(wav, this.b) {
                public final wav a(Throwable th) {
                    if (!wbk.this.f.a) {
                        try {
                            wbk.this.c.a(wbk.this.f, th);
                        } catch (Throwable th2) {
                            if (wbk.d.b()) {
                                wbk.d.b("An exception {}was thrown by a user handler's exceptionCaught() method while handling the following exception:", wjp.a(th2), th);
                            } else if (wbk.d.d()) {
                                wbk.d.c("An exception '{}' [enable DEBUG level for full stacktrace] was thrown by a user handler's exceptionCaught() method while handling the following exception:", th2, th);
                            }
                        }
                    } else {
                        super.a(th);
                    }
                    return this;
                }
            };
            this.g = true;
            try {
                this.b.e(this.e);
            } finally {
                this.c.e(this.f);
            }
        } else {
            StringBuilder sb = new StringBuilder("init() must be invoked before being added to a ");
            sb.append(wbf.class.getSimpleName());
            sb.append(" if ");
            sb.append(wbk.class.getSimpleName());
            sb.append(" was constructed with the default constructor.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void f(wav wav) {
        try {
            this.e.p();
        } finally {
            this.f.p();
        }
    }

    public final void g(wav wav) {
        if (!h && wav != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.g(this.e);
        } else {
            this.e.e();
        }
    }

    public final void h(wav wav) {
        if (!h && wav != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.h(this.e);
        } else {
            this.e.f();
        }
    }

    public final void a(wav wav) {
        if (!h && wav != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.a(this.e);
        } else {
            this.e.g();
        }
    }

    public final void b(wav wav) {
        if (!h && wav != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.b(this.e);
        } else {
            this.e.h();
        }
    }

    public final void a(wav wav, Throwable th) {
        if (!h && wav != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.a((wav) this.e, th);
        } else {
            this.e.a(th);
        }
    }

    public final void b(wav wav, Object obj) {
        if (!h && wav != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.b(this.e, obj);
        } else {
            this.e.c(obj);
        }
    }

    public final void a(wav wav, Object obj) {
        if (!h && wav != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.a((wav) this.e, obj);
        } else {
            this.e.d(obj);
        }
    }

    public final void i(wav wav) {
        if (!h && wav != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.i(this.e);
        } else {
            this.e.j();
        }
    }

    public final void j(wav wav) {
        if (!h && wav != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.j(this.e);
        } else {
            this.e.l();
        }
    }

    public final void a(wav wav, SocketAddress socketAddress, SocketAddress socketAddress2, wbi wbi) {
        if (!h && wav != this.f.b) {
            throw new AssertionError();
        } else if (!this.f.a) {
            this.c.a(this.f, socketAddress, socketAddress2, wbi);
        } else {
            this.f.a(socketAddress2, wbi);
        }
    }

    public final void a(wav wav, wbi wbi) {
        if (!h && wav != this.f.b) {
            throw new AssertionError();
        } else if (!this.f.a) {
            this.c.a(this.f, wbi);
        } else {
            this.f.a(wbi);
        }
    }

    public final void b(wav wav, wbi wbi) {
        if (!h && wav != this.f.b) {
            throw new AssertionError();
        } else if (!this.f.a) {
            this.c.b(this.f, wbi);
        } else {
            this.f.b(wbi);
        }
    }

    public final void c(wav wav) {
        if (!h && wav != this.f.b) {
            throw new AssertionError();
        } else if (!this.f.a) {
            this.c.c(this.f);
        } else {
            this.f.m();
        }
    }

    public final void a(wav wav, Object obj, wbi wbi) {
        if (!h && wav != this.f.b) {
            throw new AssertionError();
        } else if (!this.f.a) {
            this.c.a(this.f, obj, wbi);
        } else {
            this.f.a(obj, wbi);
        }
    }

    public final void d(wav wav) {
        if (!h && wav != this.f.b) {
            throw new AssertionError();
        } else if (!this.f.a) {
            this.c.d(this.f);
        } else {
            this.f.o();
        }
    }
}
