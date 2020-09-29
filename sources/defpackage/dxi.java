package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dxi reason: default package */
public final class dxi extends dko implements dxg {
    dxi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void a(dxl dxl) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dxl);
        b(1, K_);
    }
}
