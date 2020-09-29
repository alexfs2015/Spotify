package defpackage;

import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;

/* renamed from: gnt reason: default package */
public final class gnt<H extends Parcelable> implements defpackage.gns.a {
    final gnl<H> a;
    final gnu<H> b;
    final a c;
    public c d;
    defpackage.gns.c e;
    private final defpackage.gnl.c f = new b(this, 0);

    /* renamed from: gnt$a */
    public interface a {
        void a();

        void b();
    }

    /* renamed from: gnt$b */
    class b extends gnn {
        private b() {
        }

        /* synthetic */ b(gnt gnt, byte b) {
            this();
        }

        public final void a() {
            gnt.this.a();
        }

        public final void a(defpackage.gnl.a aVar) {
            gnt.this.c.a();
            gnt gnt = gnt.this;
            ((defpackage.gns.c) fbp.a(gnt.e)).a(false);
            gnt.b.c(false);
            ((c) fbp.a(gnt.this.d)).a();
        }

        public final void a(Throwable th) {
            Logger.e(th, "OTP request error", new Object[0]);
            gnt.this.c.b();
            gnt.this.a();
            ((c) fbp.a(gnt.this.d)).a(th);
        }
    }

    /* renamed from: gnt$c */
    public interface c {
        void a();

        void a(Throwable th);
    }

    public gnt(gnl<H> gnl, gnu<H> gnu, a aVar) {
        this.a = gnl;
        this.b = gnu;
        this.c = (a) fbp.a(aVar);
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        ((defpackage.gns.c) fbp.a(this.e)).a(false);
        this.b.c(true);
    }

    public final void a(defpackage.gns.c cVar) {
        fbp.b(this.d != null);
        this.e = (defpackage.gns.c) fbp.a(cVar);
        this.b.a(this);
        cVar.a((defpackage.gns.b) this.b);
    }

    public final void a(boolean z) {
        ((defpackage.gns.c) fbp.a(this.e)).a(true);
        this.b.c(false);
        ((defpackage.gns.c) fbp.a(this.e)).a(this.b, z);
        this.a.a(this.f);
    }

    public final void b(boolean z) {
        this.a.b(this.f);
        ((defpackage.gns.c) fbp.a(this.e)).b(this.b, z);
    }
}
