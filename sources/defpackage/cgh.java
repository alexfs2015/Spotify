package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cgh reason: default package */
public final class cgh extends djx implements cgf {
    cgh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    public final void a(cfy cfy) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) cfy);
        b(1, K_);
    }
}
