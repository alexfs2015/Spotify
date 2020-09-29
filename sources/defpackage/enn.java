package defpackage;

/* renamed from: enn reason: default package */
final class enn implements eoo {
    private static final enw b = new eno();
    private final enw a;

    public enn() {
        this(new enp(emv.a(), a()));
    }

    private enn(enw enw) {
        this.a = (enw) emy.a(enw, "messageInfoFactory");
    }

    public final <T> eon<T> a(Class<T> cls) {
        eop.a(cls);
        env b2 = this.a.b(cls);
        if (b2.b()) {
            if (emw.class.isAssignableFrom(cls)) {
                return eoc.a(eop.c(), emo.a(), b2.c());
            }
            return eoc.a(eop.a(), emo.b(), b2.c());
        } else if (emw.class.isAssignableFrom(cls)) {
            if (a(b2)) {
                return eob.a(b2, eog.b(), enj.b(), eop.c(), emo.a(), enu.b());
            }
            return eob.a(b2, eog.b(), enj.b(), eop.c(), null, enu.b());
        } else if (a(b2)) {
            return eob.a(b2, eog.a(), enj.a(), eop.a(), emo.b(), enu.a());
        } else {
            return eob.a(b2, eog.a(), enj.a(), eop.b(), null, enu.a());
        }
    }

    private static boolean a(env env) {
        return env.a() == e.h;
    }

    private static enw a() {
        try {
            return (enw) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }
}
