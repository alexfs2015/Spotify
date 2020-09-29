package defpackage;

import com.google.common.base.Optional;

/* renamed from: hil reason: default package */
public final class hil {
    jza a;
    private final jzf b;
    private final jyh c;
    private final jrp d;

    public hil(jzf jzf, jyh jyh, jrp jrp) {
        this.b = jzf;
        this.c = jyh;
        this.d = jrp;
    }

    public final void a(boolean z) {
        this.b.a(z);
    }

    public final void a(jxr jxr) {
        fay.a(jxr);
        jzf jzf = this.b;
        jzf.f = null;
        jzf.a(jxr);
    }

    public final void a(fpt fpt) {
        if (fpt != null) {
            this.c.b = ((Boolean) fpt.a(jyz.e)).booleanValue();
            this.c.c = ((Integer) fpt.a(jyz.d)).intValue();
            this.c.a = Optional.c(fpt.a(jyz.b));
            jyd a2 = jyd.d().a((String) fpt.a(jyz.a)).a(true).a();
            if (!this.b.a()) {
                jzf jzf = this.b;
                jzf.f = this.a;
                jzf.a(a2);
            }
            jzf jzf2 = this.b;
            jzf2.e = a2;
            if (jzf2.d != null) {
                jzf2.d.a(a2);
            }
        }
    }
}
