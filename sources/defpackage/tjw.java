package defpackage;

import android.content.res.Resources;

/* renamed from: tjw reason: default package */
public final class tjw implements a, a<tmm> {
    private final tmh a;
    private final szp b;
    private final vet c;
    private final tlj d;
    private tmm e;
    private tjx f;

    public tjw(tmh tmh, szp szp, vet vet, tlj tlj) {
        this.c = vet;
        this.b = szp;
        this.a = tmh;
        this.d = tlj;
    }

    public final void a() {
        tmm tmm = this.e;
        if (tmm != null && tmm.a()) {
            String str = this.e.a;
            this.c.a(str);
            this.b.a(str);
        }
    }

    public final void a(tjx tjx) {
        this.f = (tjx) fbp.a(tjx);
        this.f.a((a) this);
        this.a.a((a<T>) this);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        tmm tmm = (tmm) obj;
        this.e = tmm;
        Resources resources = (Resources) this.d.a.get();
        String str = "";
        this.f.a(resources == null ? str : tmm.a(resources));
        Resources resources2 = (Resources) this.d.a.get();
        if (resources2 != null) {
            str = tmm.b(resources2);
        }
        if (fbo.a(str)) {
            this.f.a();
        } else {
            this.f.b(str);
        }
    }
}
