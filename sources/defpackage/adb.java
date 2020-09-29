package defpackage;

import com.bmwgroup.connected.car.internal.SdkManager;
import java.lang.reflect.Type;

/* renamed from: adb reason: default package */
public abstract class adb implements acc {
    protected final afp a = afp.a("connected.car.sdk");
    protected final String b;
    private String c;
    private acc d;
    private aei e;
    private acd f;

    public adb(acc acc, acd acd) {
        this.d = acc;
        this.f = acd;
        this.b = SdkManager.INSTANCE.c();
        this.a.b("InternalScreen(mIdent=%s, this=%s, parent=%s, l=%s)", this.b, this, acc, acd);
    }

    public final void a(String str, String str2) {
        this.a.b("showWaitingAnimation(%s, %s)", str, str2);
        c();
        b().b(str, str2);
    }

    public final void a(String str) {
        this.a.b("setTitle(%s)", str);
        c();
        b().c(this.b, str);
    }

    public final void a() {
        this.a.b("hideWaitingAnimation()", new Object[0]);
        c();
        b().a();
    }

    public final void b(String str) {
        this.a.b("showError(%s)", str);
        c();
        b().b(str);
    }

    public final void a(acd acd) {
        this.a.b("setListener(%s)", null);
        this.f = null;
    }

    public final void c(String str) {
        this.a.b("setLastClickableIdent(%s)", str);
        this.c = str;
    }

    private aei b() {
        c();
        return this.e;
    }

    private void c() {
        if (this.e == null) {
            this.e = (aei) agg.a().a((Type) aee.class);
        }
    }
}
