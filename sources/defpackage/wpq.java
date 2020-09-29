package defpackage;

import defpackage.wpc;
import defpackage.wpi;
import io.netty.channel.ChannelPipelineException;
import java.net.SocketAddress;

/* renamed from: wpq reason: default package */
public class wpq<I extends wpc, O extends wpi> extends wov {
    /* access modifiers changed from: private */
    public static final wyc d;
    private static /* synthetic */ boolean h;
    protected I b;
    /* access modifiers changed from: protected */
    public O c;
    private a e;
    /* access modifiers changed from: private */
    public a f;
    private volatile boolean g;

    /* renamed from: wpq$a */
    static class a implements wpb {
        boolean a;
        /* access modifiers changed from: private */
        public final wpb b;
        private final woz c;

        a(wpb wpb, woz woz) {
            this.b = wpb;
            this.c = woz;
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

        public final wot a() {
            return this.b.a();
        }

        public final wox a(Object obj) {
            return this.b.a(obj);
        }

        public final wox a(Object obj, wpo wpo) {
            return this.b.a(obj, wpo);
        }

        public final wox a(SocketAddress socketAddress, SocketAddress socketAddress2, wpo wpo) {
            return this.b.a(socketAddress, socketAddress2, wpo);
        }

        public final wox a(SocketAddress socketAddress, wpo wpo) {
            return this.b.a(socketAddress, wpo);
        }

        public final wox a(wpo wpo) {
            return this.b.a(wpo);
        }

        public wpb a(Throwable th) {
            this.b.a(th);
            return this;
        }

        public final <T> wvd<T> a(wve<T> wve) {
            return this.b.a(wve);
        }

        public final wox b(Object obj) {
            return this.b.b(obj);
        }

        public final wox b(wpo wpo) {
            return this.b.b(wpo);
        }

        public final wpl b() {
            return this.b.b();
        }

        public final wnc c() {
            return this.b.c();
        }

        public final wpb c(Object obj) {
            this.b.c(obj);
            return this;
        }

        public final wpb d(Object obj) {
            this.b.d(obj);
            return this;
        }

        public final wwc d() {
            return this.b.d();
        }

        public final wpb e() {
            this.b.e();
            return this;
        }

        public final wpb f() {
            this.b.f();
            return this;
        }

        public final wpb g() {
            this.b.g();
            return this;
        }

        public final wpb h() {
            this.b.h();
            return this;
        }

        public final wox i() {
            return this.b.i();
        }

        public final wpb j() {
            this.b.j();
            return this;
        }

        public final wpo k() {
            return this.b.k();
        }

        public final wpb l() {
            this.b.l();
            return this;
        }

        public final wpb m() {
            this.b.m();
            return this;
        }

        public final wpo n() {
            return this.b.n();
        }

        public final wpb o() {
            this.b.o();
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final void p() {
            wwc d = d();
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

        public final boolean r() {
            return this.a || this.b.r();
        }

        public final woz t() {
            return this.b.t();
        }
    }

    static {
        Class<wpq> cls = wpq.class;
        h = !cls.desiredAssertionStatus();
        d = wyd.a(cls);
    }

    protected wpq() {
    }

    public final void a(wpb wpb) {
        if (!h && wpb != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.a(this.e);
        } else {
            this.e.g();
        }
    }

    public final void a(wpb wpb, Object obj) {
        if (!h && wpb != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.a((wpb) this.e, obj);
        } else {
            this.e.d(obj);
        }
    }

    public final void a(wpb wpb, Object obj, wpo wpo) {
        if (!h && wpb != this.f.b) {
            throw new AssertionError();
        } else if (!this.f.a) {
            this.c.a(this.f, obj, wpo);
        } else {
            this.f.a(obj, wpo);
        }
    }

    public final void a(wpb wpb, Throwable th) {
        if (!h && wpb != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.a((wpb) this.e, th);
        } else {
            this.e.a(th);
        }
    }

    public final void a(wpb wpb, SocketAddress socketAddress, SocketAddress socketAddress2, wpo wpo) {
        if (!h && wpb != this.f.b) {
            throw new AssertionError();
        } else if (!this.f.a) {
            this.c.a(this.f, socketAddress, socketAddress2, wpo);
        } else {
            this.f.a(socketAddress2, wpo);
        }
    }

    public final void a(wpb wpb, wpo wpo) {
        if (!h && wpb != this.f.b) {
            throw new AssertionError();
        } else if (!this.f.a) {
            this.c.a(this.f, wpo);
        } else {
            this.f.a(wpo);
        }
    }

    public final void b(wpb wpb) {
        if (!h && wpb != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.b(this.e);
        } else {
            this.e.h();
        }
    }

    public final void b(wpb wpb, Object obj) {
        if (!h && wpb != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.b(this.e, obj);
        } else {
            this.e.c(obj);
        }
    }

    public final void b(wpb wpb, wpo wpo) {
        if (!h && wpb != this.f.b) {
            throw new AssertionError();
        } else if (!this.f.a) {
            this.c.b(this.f, wpo);
        } else {
            this.f.b(wpo);
        }
    }

    public final void c(wpb wpb) {
        if (!h && wpb != this.f.b) {
            throw new AssertionError();
        } else if (!this.f.a) {
            this.c.c(this.f);
        } else {
            this.f.m();
        }
    }

    public final void d(wpb wpb) {
        if (!h && wpb != this.f.b) {
            throw new AssertionError();
        } else if (!this.f.a) {
            this.c.d(this.f);
        } else {
            this.f.o();
        }
    }

    public final void e(wpb wpb) {
        if (this.b != null) {
            this.f = new a(wpb, this.c);
            this.e = new a(wpb, this.b) {
                public final wpb a(Throwable th) {
                    if (!wpq.this.f.a) {
                        try {
                            wpq.this.c.a(wpq.this.f, th);
                        } catch (Throwable th2) {
                            if (wpq.d.b()) {
                                wpq.d.b("An exception {}was thrown by a user handler's exceptionCaught() method while handling the following exception:", wxv.a(th2), th);
                            } else if (wpq.d.d()) {
                                wpq.d.c("An exception '{}' [enable DEBUG level for full stacktrace] was thrown by a user handler's exceptionCaught() method while handling the following exception:", th2, th);
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
            sb.append(wpl.class.getSimpleName());
            sb.append(" if ");
            sb.append(wpq.class.getSimpleName());
            sb.append(" was constructed with the default constructor.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void f(wpb wpb) {
        try {
            this.e.p();
        } finally {
            this.f.p();
        }
    }

    public final void g(wpb wpb) {
        if (!h && wpb != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.g(this.e);
        } else {
            this.e.e();
        }
    }

    public final void h(wpb wpb) {
        if (!h && wpb != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.h(this.e);
        } else {
            this.e.f();
        }
    }

    public final void i(wpb wpb) {
        if (!h && wpb != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.i(this.e);
        } else {
            this.e.j();
        }
    }

    public final void j(wpb wpb) {
        if (!h && wpb != this.e.b) {
            throw new AssertionError();
        } else if (!this.e.a) {
            this.b.j(this.e);
        } else {
            this.e.l();
        }
    }
}
