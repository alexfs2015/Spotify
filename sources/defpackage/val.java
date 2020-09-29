package defpackage;

/* renamed from: val reason: default package */
public final class val implements vua<vae> {
    private final wlc<ka> a;

    private val(wlc<ka> wlc) {
        this.a = wlc;
    }

    public static val a(wlc<ka> wlc) {
        return new val(wlc);
    }

    public final /* synthetic */ Object get() {
        ka kaVar = (ka) this.a.get();
        return (vae) vuf.a(new vae(kaVar, kaVar.i()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
