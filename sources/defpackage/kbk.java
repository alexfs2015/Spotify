package defpackage;

/* renamed from: kbk reason: default package */
public final class kbk implements wig<kad> {
    private final wzi<fqn> a;

    private kbk(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static kbk a(wzi<fqn> wzi) {
        return new kbk(wzi);
    }

    public final /* synthetic */ Object get() {
        return (kad) wil.a(kad.d().a((String) ((fqn) this.a.get()).a(kaz.a)).a(true).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
