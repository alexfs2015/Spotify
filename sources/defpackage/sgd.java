package defpackage;

import com.google.common.base.Optional;

/* renamed from: sgd reason: default package */
public final class sgd {
    public final sgc a;
    public final sfa b;
    public final kxx c;
    public final int d;
    public final sge e;

    private sgd(String str, sge sge, Optional<Integer> optional, sfa sfa, kxx kxx, int i) {
        sgc sgc;
        if (optional.b()) {
            sgc = sgc.a(str, sge.a(), ((Integer) optional.c()).intValue());
        } else {
            sgc = sgc.a(str, sge.a());
        }
        this(sgc, sfa, kxx, 4, sge);
    }

    private sgd(sgc sgc, sfa sfa, kxx kxx, int i, sge sge) {
        this.a = (sgc) fay.a(sgc);
        this.b = (sfa) fay.a(sfa);
        this.c = (kxx) fay.a(kxx);
        this.d = i;
        this.e = sge;
    }

    public static sgd a(sge sge, sfa sfa, kxx kxx) {
        sgd sgd = new sgd("", sge, Optional.e(), sfa, kxx, 4);
        return sgd;
    }

    public static sgd a(sgc sgc, sfa sfa, kxx kxx) {
        sgd sgd = new sgd(sgc, sfa, kxx, 20, sge.a(sgc.b()));
        return sgd;
    }

    public final int a() {
        return (this.a.c().b() ? ((Integer) this.a.c().c()).intValue() : 0) + this.d;
    }
}
