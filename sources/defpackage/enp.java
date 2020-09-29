package defpackage;

/* renamed from: enp reason: default package */
final class enp implements enw {
    private enw[] a;

    enp(enw... enwArr) {
        this.a = enwArr;
    }

    public final boolean a(Class<?> cls) {
        for (enw a2 : this.a) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final env b(Class<?> cls) {
        enw[] enwArr;
        for (enw enw : this.a) {
            if (enw.a(cls)) {
                return enw.b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
