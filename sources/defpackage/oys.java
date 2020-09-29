package defpackage;

import android.view.View;
import com.spotify.mobile.android.util.SortOption;

/* renamed from: oys reason: default package */
public final class oys implements owh {
    public final owk a;
    public final defpackage.tlm.a b = new defpackage.tlm.a();
    public final defpackage.tlq.a c = new defpackage.tlq.a();
    public final defpackage.tlo.a d = new defpackage.tlo.a();
    public upq e;
    public boolean f;
    private final vti<a> g;

    /* renamed from: oys$a */
    public interface a {
        void a(SortOption sortOption);
    }

    public oys(vti<a> vti, owk owk) {
        this.g = vti;
        this.a = owk;
    }

    public void a(uzx uzx) {
        this.b.a = this.a.i.b;
        this.b.c = this.a.c() || uzx.getUnrangedLength() > 0;
        this.b.b = new $$Lambda$oys$ZR6imSSdeBisSdqrcLiZLptAk(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.e.a(view);
    }

    public void b() {
        this.c.a = new $$Lambda$oys$x4NmpbvGzDXD7ZC9LLiDF6VfNDQ(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        owk owk = this.a;
        if (view.getContext() != null) {
            owk.l.a(owk.k);
        }
    }

    public final void a() {
        ((a) this.g.get()).a(this.a.j);
    }
}
