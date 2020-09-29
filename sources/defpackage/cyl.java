package defpackage;

/* renamed from: cyl reason: default package */
public final class cyl extends dgr<cyl> {
    public String a;
    public Long b;
    private String c;
    private String d;
    private String e;
    private Long f;
    private Long g;
    private String h;
    private Long i;
    private String j;

    public cyl() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.Z = -1;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        String str = this.a;
        if (str != null) {
            a2 += dgq.b(1, str);
        }
        Long l = this.b;
        if (l != null) {
            a2 += dgq.d(2, l.longValue());
        }
        String str2 = this.c;
        if (str2 != null) {
            a2 += dgq.b(3, str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            a2 += dgq.b(4, str3);
        }
        String str4 = this.e;
        if (str4 != null) {
            a2 += dgq.b(5, str4);
        }
        Long l2 = this.f;
        if (l2 != null) {
            a2 += dgq.d(6, l2.longValue());
        }
        Long l3 = this.g;
        if (l3 != null) {
            a2 += dgq.d(7, l3.longValue());
        }
        String str5 = this.h;
        if (str5 != null) {
            a2 += dgq.b(8, str5);
        }
        Long l4 = this.i;
        if (l4 != null) {
            a2 += dgq.d(9, l4.longValue());
        }
        String str6 = this.j;
        return str6 != null ? a2 + dgq.b(10, str6) : a2;
    }

    public final /* synthetic */ dgw a(dgo dgo) {
        while (true) {
            int a2 = dgo.a();
            switch (a2) {
                case 0:
                    return this;
                case 10:
                    this.a = dgo.d();
                    break;
                case 16:
                    this.b = Long.valueOf(dgo.g());
                    break;
                case 26:
                    this.c = dgo.d();
                    break;
                case 34:
                    this.d = dgo.d();
                    break;
                case 42:
                    this.e = dgo.d();
                    break;
                case 48:
                    this.f = Long.valueOf(dgo.g());
                    break;
                case 56:
                    this.g = Long.valueOf(dgo.g());
                    break;
                case b.bu /*66*/:
                    this.h = dgo.d();
                    break;
                case b.bA /*72*/:
                    this.i = Long.valueOf(dgo.g());
                    break;
                case 82:
                    this.j = dgo.d();
                    break;
                default:
                    if (super.a(dgo, a2)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    public final void a(dgq dgq) {
        String str = this.a;
        if (str != null) {
            dgq.a(1, str);
        }
        Long l = this.b;
        if (l != null) {
            dgq.b(2, l.longValue());
        }
        String str2 = this.c;
        if (str2 != null) {
            dgq.a(3, str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            dgq.a(4, str3);
        }
        String str4 = this.e;
        if (str4 != null) {
            dgq.a(5, str4);
        }
        Long l2 = this.f;
        if (l2 != null) {
            dgq.b(6, l2.longValue());
        }
        Long l3 = this.g;
        if (l3 != null) {
            dgq.b(7, l3.longValue());
        }
        String str5 = this.h;
        if (str5 != null) {
            dgq.a(8, str5);
        }
        Long l4 = this.i;
        if (l4 != null) {
            dgq.b(9, l4.longValue());
        }
        String str6 = this.j;
        if (str6 != null) {
            dgq.a(10, str6);
        }
        super.a(dgq);
    }
}
