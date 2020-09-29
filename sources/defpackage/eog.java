package defpackage;

/* renamed from: eog reason: default package */
final class eog implements eon {
    private eon[] a;

    eog(eon... eonArr) {
        this.a = eonArr;
    }

    public final boolean a(Class<?> cls) {
        for (eon a2 : this.a) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final eom b(Class<?> cls) {
        eon[] eonArr;
        for (eon eon : this.a) {
            if (eon.a(cls)) {
                return eon.b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
