package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dne reason: default package */
public final class dne extends djx implements dnd {
    dne(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final dmx a(dna dna) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) dna);
        Parcel a = a(1, K_);
        dmx dmx = (dmx) djz.a(a, dmx.CREATOR);
        a.recycle();
        return dmx;
    }
}
