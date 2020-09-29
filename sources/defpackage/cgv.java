package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cgv reason: default package */
public final class cgv extends dko implements cgt {
    cgv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final cgp a(cgl cgl) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) cgl);
        Parcel a = a(1, K_);
        cgp cgp = (cgp) dkq.a(a, cgp.CREATOR);
        a.recycle();
        return cgp;
    }

    public final void a(cgl cgl, cgw cgw) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) cgl);
        dkq.a(K_, (IInterface) cgw);
        b(2, K_);
    }

    public final void a(che che, cgz cgz) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) che);
        dkq.a(K_, (IInterface) cgz);
        b(4, K_);
    }

    public final void b(che che, cgz cgz) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) che);
        dkq.a(K_, (IInterface) cgz);
        b(5, K_);
    }
}
