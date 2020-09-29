package defpackage;

import io.reactivex.disposables.CompositeDisposable;

/* renamed from: gns reason: default package */
public final class gns implements defpackage.gny.a {
    a a;
    final gny b;
    final CompositeDisposable c = new CompositeDisposable();
    private final gog d;

    /* renamed from: gns$a */
    public interface a {
        void a(boolean z);

        void ae();

        void af();

        void c();

        void e();

        void i(boolean z);

        void j(boolean z);
    }

    public gns(gny gny, gog gog) {
        this.b = gny;
        this.d = gog;
    }

    public final void a(String str) {
        this.a.j(true);
        this.b.a(str, this);
    }

    public final void a() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(false);
            this.a.j(false);
        }
    }

    public final void b() {
        this.d.a(goa.a(new b(), new defpackage.god.a(), new b(), ""));
        a aVar = this.a;
        if (aVar != null) {
            aVar.c();
            this.a.j(false);
        }
    }

    public final void c() {
        this.d.a(goa.a(new b(), new e(), new b(), ""));
        a aVar = this.a;
        if (aVar != null) {
            aVar.c();
            this.a.j(false);
        }
    }

    public final void d() {
        this.d.a(goa.a((goh) new b(), (goe) new h()));
        a aVar = this.a;
        if (aVar != null) {
            aVar.ae();
            this.a.i(false);
            this.a.j(false);
        }
    }

    public final void a(int i) {
        if (i == 400) {
            this.d.a(goa.a((goh) new b(), (goe) new d()));
        }
        a aVar = this.a;
        if (aVar != null) {
            aVar.e();
            this.a.j(false);
        }
    }
}
