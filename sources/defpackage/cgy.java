package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cgy reason: default package */
public final class cgy extends dko implements cgw {
    cgy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    public final void a(cgp cgp) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) cgp);
        b(1, K_);
    }
}
