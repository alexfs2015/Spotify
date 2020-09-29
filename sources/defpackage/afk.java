package defpackage;

/* renamed from: afk reason: default package */
public final class afk extends afg implements agm {
    private final afm<Boolean> a = new afm<>();
    private final afm<Boolean> d = new afm<>();
    private final afm<String> e = new afm<>();
    private final afm<Integer> f = new afm<>();

    public afk(String str) {
        super(str);
    }

    public final void a(int i) {
        if (this.f.a(Integer.valueOf(i))) {
            g().a(this.c, i);
        }
    }

    public final void a(acr acr) {
        super.a(acr);
    }

    public final void a(String str) {
        if (this.e.a(str)) {
            g().d(this.c, str);
        }
    }

    public final void b(boolean z) {
        if (this.a.a(Boolean.valueOf(z))) {
            g().b(this.c, z);
        }
    }

    public final void c(boolean z) {
        if (this.d.a(Boolean.valueOf(z))) {
            g().a(this.c, z);
        }
    }
}
