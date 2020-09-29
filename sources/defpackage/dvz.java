package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dvz reason: default package */
public final class dvz extends dko implements dvy {
    dvz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    public final IBinder a(cbi cbi, cbi cbi2, cbi cbi3) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (IInterface) cbi2);
        dkq.a(K_, (IInterface) cbi3);
        K_.writeInt(bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Parcel a = a(1, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
