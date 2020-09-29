package defpackage;

import android.content.Context;
import com.bmwgroup.connected.car.internal.SdkManager;
import java.lang.reflect.Type;

/* renamed from: ads reason: default package */
public final class ads extends adr implements acw {
    public ads(Context context, acu acu) {
        super(context, acu);
    }

    public final void a(int i) {
        c().a(i);
    }

    public final void a(acr acr) {
        this.b = SdkManager.INSTANCE.a(acr);
        if (acr != null) {
            SdkManager.INSTANCE.a(this.b, acr, true);
            ((aew) agu.a(this.c).a((Type) aes.class)).a(SdkManager.INSTANCE.mApplicationName, this.b);
            return;
        }
        a.b("called setListener(NULL)", new Object[0]);
    }

    public final void a(String str, String str2, String str3) {
        c().a(str, str2, str3);
    }

    public final void a(byte[] bArr) {
        c().a(bArr);
    }
}
