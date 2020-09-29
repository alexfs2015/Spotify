package defpackage;

import com.bmwgroup.connected.car.internal.SdkManager;
import java.lang.reflect.Type;

/* renamed from: adp reason: default package */
public abstract class adp implements acq {
    protected final agd a = agd.a("connected.car.sdk");
    protected final String b;
    private String c;
    private acq d;
    private aew e;
    private acr f;

    public adp(acq acq, acr acr) {
        this.d = acq;
        this.f = acr;
        this.b = SdkManager.INSTANCE.c();
        this.a.b("InternalScreen(mIdent=%s, this=%s, parent=%s, l=%s)", this.b, this, acq, acr);
    }

    private aew b() {
        c();
        return this.e;
    }

    private void c() {
        if (this.e == null) {
            this.e = (aew) agu.a().a((Type) aes.class);
        }
    }

    public final void a() {
        this.a.b("hideWaitingAnimation()", new Object[0]);
        c();
        b().a();
    }

    public final void a(acr acr) {
        this.a.b("setListener(%s)", null);
        this.f = null;
    }

    public final void a(String str) {
        this.a.b("setTitle(%s)", str);
        c();
        b().c(this.b, str);
    }

    public final void a(String str, String str2) {
        this.a.b("showWaitingAnimation(%s, %s)", str, str2);
        c();
        b().b(str, str2);
    }

    public final void b(String str) {
        this.a.b("setLastClickableIdent(%s)", str);
        this.c = str;
    }
}
