package defpackage;

import com.bmwgroup.connected.car.internal.SdkManager;

/* renamed from: afg reason: default package */
public abstract class afg extends afl implements agf {
    private Object a;

    public afg(String str) {
        super(str);
    }

    public void a(acr acr) {
        b.b("setScreenListener(mIdent=%s, l=%s)", this.c, acr);
        String a2 = SdkManager.INSTANCE.a(this.c, acr, false);
        if (acr != null && a2 != null) {
            g().a(this.c, a2);
        }
    }

    public final void a(Object obj) {
        this.a = obj;
    }

    public final Object e() {
        return this.a;
    }
}
