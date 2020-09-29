package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cvq reason: default package */
public final class cvq extends djx implements cvp {
    cvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final cvn a(cvl cvl) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) cvl);
        Parcel a = a(1, K_);
        cvn cvn = (cvn) djz.a(a, cvn.CREATOR);
        a.recycle();
        return cvn;
    }
}
