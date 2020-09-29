package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: eed reason: default package */
public final class eed extends djx implements eec {
    eed(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    public final void a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        b(3, K_);
    }
}
