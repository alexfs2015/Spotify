package defpackage;

/* renamed from: deg reason: default package */
final class deg implements dfk {
    private static final dep b = new deh();
    private final dep a;

    public deg() {
        this(new dei(ddo.a(), a()));
    }

    private deg(dep dep) {
        this.a = (dep) ddr.a(dep, "messageInfoFactory");
    }

    private static dep a() {
        try {
            return (dep) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean a(deo deo) {
        return deo.a() == e.h;
    }

    public final <T> dfj<T> a(Class<T> cls) {
        dfl.a(cls);
        deo b2 = this.a.b(cls);
        if (b2.b()) {
            return ddp.class.isAssignableFrom(cls) ? dex.a(dfl.c(), ddi.a(), b2.c()) : dex.a(dfl.a(), ddi.b(), b2.c());
        }
        if (ddp.class.isAssignableFrom(cls)) {
            boolean a2 = a(b2);
            dez b3 = dfb.b();
            dec b4 = dec.b();
            dgb c = dfl.c();
            return a2 ? deu.a(b2, b3, b4, c, ddi.a(), den.b()) : deu.a(b2, b3, b4, c, null, den.b());
        }
        boolean a3 = a(b2);
        dez a4 = dfb.a();
        dec a5 = dec.a();
        return a3 ? deu.a(b2, a4, a5, dfl.a(), ddi.b(), den.a()) : deu.a(b2, a4, a5, dfl.b(), null, den.a());
    }
}
