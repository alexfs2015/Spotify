package defpackage;

/* renamed from: aew reason: default package */
public final class aew extends aes implements afy {
    private final aey<Boolean> a = new aey<>();
    private final aey<Boolean> d = new aey<>();
    private final aey<String> e = new aey<>();
    private final aey<Integer> f = new aey<>();

    public aew(String str) {
        super(str);
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

    public final void a(String str) {
        if (this.e.a(str)) {
            g().d(this.c, str);
        }
    }

    public final void a(int i) {
        if (this.f.a(Integer.valueOf(i))) {
            g().a(this.c, i);
        }
    }

    public final void a(acd acd) {
        super.a(acd);
    }
}
