package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dvi reason: default package */
public final class dvi extends djx implements dvh {
    dvi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    public final IBinder a(car car, car car2, car car3) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (IInterface) car2);
        djz.a(K_, (IInterface) car3);
        K_.writeInt(brz.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Parcel a = a(1, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
