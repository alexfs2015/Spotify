package defpackage;

import com.bmwgroup.connected.car.internal.SdkManager;
import java.lang.reflect.Type;

/* renamed from: afl reason: default package */
public class afl implements agn {
    protected static final agd b = agd.a("connected.car.sdk");
    private aew a;
    protected final String c;
    private final afm<Boolean> d = new afm<>();

    public afl(String str) {
        b.a("InternalWidget(%s)", str);
        this.c = str;
        SdkManager.INSTANCE.a(this.c, this);
    }

    private void a() {
        if (this.a == null) {
            this.a = (aew) agu.a().a((Type) aes.class);
        }
    }

    public void a(boolean z) {
        b.a("setVisible(%s)", Boolean.valueOf(z));
        if (this.d.a(Boolean.valueOf(z))) {
            g().c(this.c, z);
        }
    }

    public final String f() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final aew g() {
        a();
        return this.a;
    }
}
