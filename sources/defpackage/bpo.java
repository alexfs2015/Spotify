package defpackage;

import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: bpo reason: default package */
final class bpo implements ehx {
    private final /* synthetic */ boo a;

    bpo(boo boo) {
        this.a = boo;
    }

    public final void a() {
        f();
        boo.a(this.a);
        for (b a2 : this.a.b) {
            a2.a();
        }
        for (a a3 : this.a.c) {
            a3.a();
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

    public final void c() {
        for (b c : this.a.b) {
            c.c();
        }
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            it.next();
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

    public final void b(int[] iArr) {
        for (a b : this.a.c) {
            b.b(iArr);
        }
    }

    public final void c(int[] iArr) {
        for (a c : this.a.c) {
            c.c(iArr);
        }
    }

    public final void a(bno[] bnoArr) {
        for (a a2 : this.a.c) {
            a2.a(bnoArr);
        }
    }

    private final void f() {
        if (boo.c(this.a) != null) {
            bnq f = this.a.f();
            if (f != null) {
                f.k = boo.c(this.a).a();
                List<bne> b = boo.c(this.a).b();
                MediaInfo h = this.a.h();
                if (h != null) {
                    h.d = b;
                }
            }
        }
    }
}
