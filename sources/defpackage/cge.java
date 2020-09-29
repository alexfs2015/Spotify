package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cge reason: default package */
public final class cge extends djx implements cgc {
    cge(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final cfy a(cfu cfu) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) cfu);
        Parcel a = a(1, K_);
        cfy cfy = (cfy) djz.a(a, cfy.CREATOR);
        a.recycle();
        return cfy;
    }

    public final void a(cfu cfu, cgf cgf) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) cfu);
        djz.a(K_, (IInterface) cgf);
        b(2, K_);
    }

    public final void a(cgn cgn, cgi cgi) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) cgn);
        djz.a(K_, (IInterface) cgi);
        b(4, K_);
    }

    public final void b(cgn cgn, cgi cgi) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) cgn);
        djz.a(K_, (IInterface) cgi);
        b(5, K_);
    }
}
