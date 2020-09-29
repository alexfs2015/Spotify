package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dqc reason: default package */
public final class dqc extends djx implements dqb {
    dqc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder a(car car, String str, ecp ecp) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        K_.writeString(str);
        djz.a(K_, (IInterface) ecp);
        K_.writeInt(brz.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Parcel a = a(1, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
