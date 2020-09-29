package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dqt reason: default package */
public final class dqt extends dko implements dqs {
    dqt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder a(cbi cbi, String str, edg edg) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        K_.writeString(str);
        dkq.a(K_, (IInterface) edg);
        K_.writeInt(bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Parcel a = a(1, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
