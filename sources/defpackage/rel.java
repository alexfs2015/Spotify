package defpackage;

/* renamed from: rel reason: default package */
public final class rel implements wig<rhv> {
    private final wzi<rht> a;

    private rel(wzi<rht> wzi) {
        this.a = wzi;
    }

    public static rel a(wzi<rht> wzi) {
        return new rel(wzi);
    }

    public final /* synthetic */ Object get() {
        return (rhv) wil.a(new rhv() {
            public final String a(String str) {
                return (String) fbp.a(rht.this.c.a(rht.this.b, str).a(rht.a, ""));
            }

            public final void a(String str, String str2) {
                rht.this.c.a(rht.this.b, str).a().a(rht.a, str2).b();
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }
}
