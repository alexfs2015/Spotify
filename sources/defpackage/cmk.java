package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: cmk reason: default package */
final class cmk extends cmg {
    private Context a;

    cmk(Context context) {
        this.a = context;
    }

    public final void a() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            cml.a("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        cpg.a(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        sb.toString();
        cpn.a(5);
    }

    public final void s_() {
    }
}
