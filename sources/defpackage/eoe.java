package defpackage;

/* renamed from: eoe reason: default package */
final class eoe implements epf {
    private static final eon b = new eof();
    private final eon a;

    public eoe() {
        this(new eog(enm.a(), a()));
    }

    private eoe(eon eon) {
        this.a = (eon) enp.a(eon, "messageInfoFactory");
    }

    private static eon a() {
        try {
            return (eon) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean a(eom eom) {
        return eom.a() == e.h;
    }

    public final <T> epe<T> a(Class<T> cls) {
        epg.a(cls);
        eom b2 = this.a.b(cls);
        return b2.b() ? enn.class.isAssignableFrom(cls) ? eot.a(epg.c(), enf.a(), b2.c()) : eot.a(epg.a(), enf.b(), b2.c()) : enn.class.isAssignableFrom(cls) ? a(b2) ? eos.a(b2, eox.b(), eoa.b(), epg.c(), enf.a(), eol.b()) : eos.a(b2, eox.b(), eoa.b(), epg.c(), null, eol.b()) : a(b2) ? eos.a(b2, eox.a(), eoa.a(), epg.a(), enf.b(), eol.a()) : eos.a(b2, eox.a(), eoa.a(), epg.b(), null, eol.a());
    }
}
