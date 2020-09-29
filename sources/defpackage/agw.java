package defpackage;

/* renamed from: agw reason: default package */
public final class agw {
    public ags a;

    private agw(ags ags) {
        this.a = ags;
    }

    public static agw a(String str) {
        String className = new RuntimeException().getStackTrace()[1].getClassName();
        return new agw(ags.a(str, className.substring(className.lastIndexOf(".") + 1), "carcore_kju"));
    }

    public final void a(String str, Object... objArr) {
        this.a.b(str, objArr);
    }
}
