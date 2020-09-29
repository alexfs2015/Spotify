package defpackage;

import android.content.Context;
import com.bmwgroup.connected.car.internal.SdkManager;
import java.lang.reflect.Type;

/* renamed from: ade reason: default package */
public final class ade extends add implements aci {
    public ade(Context context, acg acg) {
        super(context, acg);
    }

    public final void a(String str, String str2, String str3) {
        c().a(str, str2, str3);
    }

    public final void a(byte[] bArr) {
        c().a(bArr);
    }

    public final void a(int i) {
        c().a(i);
    }

    public final void a(acd acd) {
        this.b = SdkManager.INSTANCE.a(acd);
        if (acd != null) {
            SdkManager.INSTANCE.a(this.b, acd, true);
            ((aei) agg.a(this.c).a((Type) aee.class)).a(SdkManager.INSTANCE.mApplicationName, this.b);
            return;
        }
        a.b("called setListener(NULL)", new Object[0]);
    }
}
