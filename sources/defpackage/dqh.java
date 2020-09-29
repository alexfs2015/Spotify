package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dqh reason: default package */
public final class dqh extends djx implements dqg {
    dqh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder a(car car, dpc dpc, String str, ecp ecp, int i) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (Parcelable) dpc);
        K_.writeString(str);
        djz.a(K_, (IInterface) ecp);
        K_.writeInt(brz.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        K_.writeInt(i);
        Parcel a = a(2, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
