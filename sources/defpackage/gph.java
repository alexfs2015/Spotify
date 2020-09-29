package defpackage;

import io.reactivex.disposables.CompositeDisposable;

/* renamed from: gph reason: default package */
public final class gph implements defpackage.gpn.a {
    a a;
    final gpn b;
    final CompositeDisposable c = new CompositeDisposable();
    private final gpv d;

    /* renamed from: gph$a */
    public interface a {
        void a(boolean z);

        void ae();

        void af();

        void c();

        void e();

        void i(boolean z);

        void j(boolean z);
    }

    public gph(gpn gpn, gpv gpv) {
        this.b = gpn;
        this.d = gpv;
    }

    public final void a() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(false);
            this.a.j(false);
        }
    }

    public final void a(int i) {
        if (i == 400) {
            this.d.a(gpp.a((gpw) new b(), (gpt) new d()));
        }
        a aVar = this.a;
        if (aVar != null) {
            aVar.e();
            this.a.j(false);
        }
    }

    public final void a(String str) {
        this.a.j(true);
        this.b.a(str, this);
    }

    public final void b() {
        this.d.a(gpp.a(new b(), new defpackage.gps.a(), new b(), ""));
        a aVar = this.a;
        if (aVar != null) {
            aVar.c();
            this.a.j(false);
        }
    }

    public final void c() {
        this.d.a(gpp.a(new b(), new e(), new b(), ""));
        a aVar = this.a;
        if (aVar != null) {
            aVar.c();
            this.a.j(false);
        }
    }

    public final void d() {
        this.d.a(gpp.a((gpw) new b(), (gpt) new h()));
        a aVar = this.a;
        if (aVar != null) {
            aVar.ae();
            this.a.i(false);
            this.a.j(false);
        }
    }
}
