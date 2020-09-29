package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ees reason: default package */
public final class ees extends dko implements eer {
    ees(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    public final void a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        b(2, K_);
    }
}
