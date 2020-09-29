package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: edi reason: default package */
public final class edi extends dko implements edg {
    edi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public final edj a(String str) {
        edj edj;
        Parcel K_ = K_();
        K_.writeString(str);
        Parcel a = a(1, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            edj = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            edj = queryLocalInterface instanceof edj ? (edj) queryLocalInterface : new edl(readStrongBinder);
        }
        a.recycle();
        return edj;
    }

    public final boolean b(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        Parcel a = a(2, K_);
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }

    public final eev c(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        Parcel a = a(3, K_);
        eev a2 = eew.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
