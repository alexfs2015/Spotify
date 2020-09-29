package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dnv reason: default package */
public final class dnv extends dko implements dnu {
    dnv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final dno a(dnr dnr) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) dnr);
        Parcel a = a(1, K_);
        dno dno = (dno) dkq.a(a, dno.CREATOR);
        a.recycle();
        return dno;
    }
}
