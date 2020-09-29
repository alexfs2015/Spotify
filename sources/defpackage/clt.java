package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: clt reason: default package */
final class clt extends clp {
    private Context a;

    clt(Context context) {
        this.a = context;
    }

    public final void s_() {
    }

    public final void a() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            clu.a("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        cop.a(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        sb.toString();
        cow.a(5);
    }
}
