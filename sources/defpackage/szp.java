package defpackage;

import android.content.res.Resources;

/* renamed from: szp reason: default package */
public final class szp implements a, a<tcf> {
    private final tca a;
    private final spi b;
    private final uto c;
    private final tbc d;
    private tcf e;
    private szq f;

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        tcf tcf = (tcf) obj;
        this.e = tcf;
        Resources resources = (Resources) this.d.a.get();
        String str2 = "";
        if (resources == null) {
            str = str2;
        } else {
            str = tcf.a(resources);
        }
        this.f.a(str);
        Resources resources2 = (Resources) this.d.a.get();
        if (resources2 != null) {
            str2 = tcf.b(resources2);
        }
        if (fax.a(str2)) {
            this.f.a();
        } else {
            this.f.b(str2);
        }
    }

    public szp(tca tca, spi spi, uto uto, tbc tbc) {
        this.c = uto;
        this.b = spi;
        this.a = tca;
        this.d = tbc;
    }

    public final void a() {
        tcf tcf = this.e;
        if (tcf != null && tcf.a()) {
            String str = this.e.a;
            this.c.a(str);
            this.b.a(str);
        }
    }

    public final void a(szq szq) {
        this.f = (szq) fay.a(szq);
        this.f.a((a) this);
        this.a.a((a<T>) this);
    }
}
