package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: ckx reason: default package */
final class ckx implements Runnable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ cqc b;

    ckx(Context context, cqc cqc) {
        this.a = context;
        this.b = cqc;
    }

    public final void run() {
        try {
            this.b.b(AdvertisingIdClient.getAdvertisingIdInfo(this.a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.b.a(e);
            cow.a("Exception while getting advertising Id info", e);
        }
    }
}
