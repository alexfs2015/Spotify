package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dqy reason: default package */
public final class dqy extends dko implements dqx {
    dqy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder a(cbi cbi, dpt dpt, String str, edg edg, int i) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (Parcelable) dpt);
        K_.writeString(str);
        dkq.a(K_, (IInterface) edg);
        K_.writeInt(bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        K_.writeInt(i);
        Parcel a = a(2, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
