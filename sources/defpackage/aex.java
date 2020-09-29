package defpackage;

import com.bmwgroup.connected.car.internal.SdkManager;
import java.lang.reflect.Type;

/* renamed from: aex reason: default package */
public class aex implements afz {
    protected static final afp b = afp.a("connected.car.sdk");
    private aei a;
    protected final String c;
    private final aey<Boolean> d = new aey<>();

    public aex(String str) {
        b.a("InternalWidget(%s)", str);
        this.c = str;
        SdkManager.INSTANCE.a(this.c, this);
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
    public final aei g() {
        a();
        return this.a;
    }

    private void a() {
        if (this.a == null) {
            this.a = (aei) agg.a().a((Type) aee.class);
        }
    }
}
