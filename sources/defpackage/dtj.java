package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dtj reason: default package */
public final class dtj extends djx implements dth {
    dtj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void a(dte dte) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dte);
        b(1, K_);
    }
}
