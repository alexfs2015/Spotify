package defpackage;

/* renamed from: dai reason: default package */
public final class dai extends dgr<dai> {
    public String a;
    private String b;
    private String c;
    private String d;
    private String e;

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        String str = this.a;
        if (str != null) {
            a2 += dgq.b(1, str);
        }
        String str2 = this.b;
        if (str2 != null) {
            a2 += dgq.b(2, str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            a2 += dgq.b(3, str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            a2 += dgq.b(4, str4);
        }
        String str5 = this.e;
        return str5 != null ? a2 + dgq.b(5, str5) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            if (a2 == 0) {
                return this;
            }
            if (a2 == 10) {
                this.a = dgo.d();
            } else if (a2 == 18) {
                this.b = dgo.d();
            } else if (a2 == 26) {
                this.c = dgo.d();
            } else if (a2 == 34) {
                this.d = dgo.d();
            } else if (a2 == 42) {
                this.e = dgo.d();
            } else if (!super.a(dgo, a2)) {
                return this;
            }
        }
    }

    public final void a(dgq dgq) {
        String str = this.a;
        if (str != null) {
            dgq.a(1, str);
        }
        String str2 = this.b;
        if (str2 != null) {
            dgq.a(2, str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            dgq.a(3, str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            dgq.a(4, str4);
        }
        String str5 = this.e;
        if (str5 != null) {
            dgq.a(5, str5);
        }
        super.a(dgq);
    }
}
