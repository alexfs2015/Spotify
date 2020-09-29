package defpackage;

import android.text.TextUtils;

/* renamed from: foi reason: default package */
public final class foi extends fop<foi> {
    private int a = 0;

    public foi(String str) {
        if (!TextUtils.isEmpty(str)) {
            a("controllerType", str);
            return;
        }
        throw new IllegalArgumentException("controller type not valid");
    }

    public final foi a(int i) {
        this.a = i | this.a;
        return (foi) a("flags", this.a);
    }

    public final foi b(int i) {
        return (foi) a("state", Integer.toString(i));
    }
}
