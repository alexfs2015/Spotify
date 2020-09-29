package defpackage;

/* renamed from: ddr reason: default package */
final class ddr implements ddy {
    private ddy[] a;

    ddr(ddy... ddyArr) {
        this.a = ddyArr;
    }

    public final boolean a(Class<?> cls) {
        for (ddy a2 : this.a) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final ddx b(Class<?> cls) {
        ddy[] ddyArr;
        for (ddy ddy : this.a) {
            if (ddy.a(cls)) {
                return ddy.b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
