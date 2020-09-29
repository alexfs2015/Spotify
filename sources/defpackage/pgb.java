package defpackage;

import android.view.View;
import com.spotify.mobile.android.util.SortOption;

/* renamed from: pgb reason: default package */
public final class pgb implements pdu {
    public final pdx a;
    public final defpackage.txz.a b = new defpackage.txz.a();
    public final defpackage.tyd.a c = new defpackage.tyd.a();
    public final defpackage.tyb.a d = new defpackage.tyb.a();
    public vav e;
    public boolean f;
    private final who<a> g;

    /* renamed from: pgb$a */
    public interface a {
        void a(SortOption sortOption);
    }

    public pgb(who<a> who, pdx pdx) {
        this.g = who;
        this.a = pdx;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        pdx pdx = this.a;
        if (view.getContext() != null) {
            pdx.l.a(pdx.k);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.e.a(view);
    }

    public final void a() {
        ((a) this.g.get()).a(this.a.j);
    }

    public void a(vml vml) {
        this.b.a = this.a.i.b;
        this.b.c = this.a.c() || vml.getUnrangedLength() > 0;
        this.b.b = new $$Lambda$pgb$sdxpo2I0eMDtQSfg7UHeAGqnMSI(this);
    }

    public void b() {
        this.c.a = new $$Lambda$pgb$lCROh3eZ0vjsphmKRsVZfTOwnSc(this);
    }
}
