package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: clo reason: default package */
final class clo implements Runnable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ cqt b;

    clo(Context context, cqt cqt) {
        this.a = context;
        this.b = cqt;
    }

    public final void run() {
        try {
            this.b.b(AdvertisingIdClient.getAdvertisingIdInfo(this.a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.b.a(e);
            cpn.a("Exception while getting advertising Id info", e);
        }
    }
}
