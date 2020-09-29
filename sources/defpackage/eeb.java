package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: eeb reason: default package */
public final class eeb extends djx implements eea {
    eeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    public final void a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        b(2, K_);
    }
}
