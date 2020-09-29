package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dwc reason: default package */
public final class dwc extends djx implements dwa {
    dwc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void a(dvo dvo) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dvo);
        b(1, K_);
    }
}
