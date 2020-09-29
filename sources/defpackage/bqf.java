package defpackage;

import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: bqf reason: default package */
final class bqf implements eio {
    private final /* synthetic */ bpf a;

    bqf(bpf bpf) {
        this.a = bpf;
    }

    private final void f() {
        if (bpf.c(this.a) != null) {
            boh f = this.a.f();
            if (f != null) {
                f.k = bpf.c(this.a).a();
                List<bnv> b = bpf.c(this.a).b();
                MediaInfo h = this.a.h();
                if (h != null) {
                    h.d = b;
                }
            }
        }
    }

    public final void a() {
        f();
        bpf.a(this.a);
        for (b a2 : this.a.b) {
            a2.a();
        }
        for (a a3 : this.a.c) {
            a3.a();
        }
    }

    public final void a(int[] iArr) {
        for (a a2 : this.a.c) {
            a2.a(iArr);
        }
    }

    public final void a(int[] iArr, int i) {
        for (a a2 : this.a.c) {
            a2.a(iArr, i);
        }
    }

    public final void a(bof[] bofArr) {
        for (a a2 : this.a.c) {
            a2.a(bofArr);
        }
    }

    public final void b() {
        f();
        for (b b : this.a.b) {
            b.b();
        }
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b(int[] iArr) {
        for (a b : this.a.c) {
            b.b(iArr);
        }
    }

    public final void c() {
        for (b c : this.a.b) {
            c.c();
        }
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c(int[] iArr) {
        for (a c : this.a.c) {
            c.c(iArr);
        }
    }

    public final void d() {
        for (b d : this.a.b) {
            d.d();
        }
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void e() {
        for (b e : this.a.b) {
            e.e();
        }
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
