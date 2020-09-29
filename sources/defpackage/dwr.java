package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dwr reason: default package */
public final class dwr extends djx implements dwp {
    dwr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void a(dwu dwu) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dwu);
        b(1, K_);
    }
}
