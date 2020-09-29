package defpackage;

import com.bmwgroup.connected.car.internal.SdkManager;

/* renamed from: aes reason: default package */
public abstract class aes extends aex implements afr {
    private Object a;

    public aes(String str) {
        super(str);
    }

    public final Object e() {
        return this.a;
    }

    public final void a(Object obj) {
        this.a = obj;
    }

    public void a(acd acd) {
        b.b("setScreenListener(mIdent=%s, l=%s)", this.c, acd);
        String a2 = SdkManager.INSTANCE.a(this.c, acd, false);
        if (acd != null && a2 != null) {
            g().a(this.c, a2);
        }
    }
}
