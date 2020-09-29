package defpackage;

import android.text.TextUtils;

/* renamed from: fpc reason: default package */
public final class fpc extends fpj<fpc> {
    private int a = 0;

    public fpc(String str) {
        if (!TextUtils.isEmpty(str)) {
            a("controllerType", str);
            return;
        }
        throw new IllegalArgumentException("controller type not valid");
    }

    public final fpc a(int i) {
        this.a = i | this.a;
        return (fpc) a("flags", this.a);
    }

    public final fpc b(int i) {
        return (fpc) a("state", Integer.toString(i));
    }
}
