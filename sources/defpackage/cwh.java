package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cwh reason: default package */
public final class cwh extends dko implements cwg {
    cwh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final cwe a(cwc cwc) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) cwc);
        Parcel a = a(1, K_);
        cwe cwe = (cwe) dkq.a(a, cwe.CREATOR);
        a.recycle();
        return cwe;
    }
}
