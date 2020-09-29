package defpackage;

/* renamed from: dei reason: default package */
final class dei implements dep {
    private dep[] a;

    dei(dep... depArr) {
        this.a = depArr;
    }

    public final boolean a(Class<?> cls) {
        for (dep a2 : this.a) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final deo b(Class<?> cls) {
        dep[] depArr;
        for (dep dep : this.a) {
            if (dep.a(cls)) {
                return dep.b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
