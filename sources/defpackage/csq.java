package defpackage;

@cfp
/* renamed from: csq reason: default package */
public final class csq extends cmg {
    final csh a;
    final cst b;
    private final String c;

    csq(csh csh, cst cst, String str) {
        this.a = csh;
        this.b = cst;
        this.c = str;
        bkc.z().a.add(this);
    }

    public final void a() {
        try {
            this.b.a(this.c);
        } finally {
            cmu.a.post(new csr(this));
        }
    }

    public final void s_() {
        this.b.a();
    }
}
