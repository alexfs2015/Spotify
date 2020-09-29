package defpackage;

/* renamed from: ddp reason: default package */
final class ddp implements det {
    private static final ddy b = new ddq();
    private final ddy a;

    public ddp() {
        this(new ddr(dcx.a(), a()));
    }

    private ddp(ddy ddy) {
        this.a = (ddy) dda.a(ddy, "messageInfoFactory");
    }

    private static ddy a() {
        try {
            return (ddy) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean a(ddx ddx) {
        return ddx.a() == e.h;
    }

    public final <T> des<T> a(Class<T> cls) {
        deu.a(cls);
        ddx b2 = this.a.b(cls);
        if (b2.b()) {
            return dcy.class.isAssignableFrom(cls) ? deg.a(deu.c(), dcr.a(), b2.c()) : deg.a(deu.a(), dcr.b(), b2.c());
        }
        if (dcy.class.isAssignableFrom(cls)) {
            boolean a2 = a(b2);
            dei b3 = dek.b();
            ddl b4 = ddl.b();
            dfk c = deu.c();
            return a2 ? ded.a(b2, b3, b4, c, dcr.a(), ddw.b()) : ded.a(b2, b3, b4, c, null, ddw.b());
        }
        boolean a3 = a(b2);
        dei a4 = dek.a();
        ddl a5 = ddl.a();
        return a3 ? ded.a(b2, a4, a5, deu.a(), dcr.b(), ddw.a()) : ded.a(b2, a4, a5, deu.b(), null, ddw.a());
    }
}
