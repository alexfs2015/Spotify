package defpackage;

/* renamed from: agd reason: default package */
public final class agd {
    public ags a;

    private agd(ags ags) {
        this.a = ags;
    }

    public static agd a(String str) {
        String className = new RuntimeException().getStackTrace()[1].getClassName();
        return new agd(ags.a(str, className.substring(className.lastIndexOf(".") + 1), "carcore"));
    }

    public final void a(String str, Object... objArr) {
        this.a.a(str, objArr);
    }

    public final void b(String str, Object... objArr) {
        this.a.b(str, objArr);
    }

    public final void c(String str, Object... objArr) {
        this.a.c(str, objArr);
    }
}
