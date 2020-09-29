package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dqa reason: default package */
public final class dqa extends djx implements dpy {
    dqa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public final dpv a() {
        dpv dpv;
        Parcel a = a(1, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dpv = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            dpv = queryLocalInterface instanceof dpv ? (dpv) queryLocalInterface : new dpx(readStrongBinder);
        }
        a.recycle();
        return dpv;
    }

    public final void a(bfe bfe) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) bfe);
        b(9, K_);
    }

    public final void a(dps dps) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dps);
        b(2, K_);
    }

    public final void a(dqs dqs) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dqs);
        b(7, K_);
    }

    public final void a(dup dup) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) dup);
        b(6, K_);
    }

    public final void a(dwa dwa) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dwa);
        b(3, K_);
    }

    public final void a(dwd dwd) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dwd);
        b(4, K_);
    }

    public final void a(dwn dwn, dpc dpc) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dwn);
        djz.a(K_, (Parcelable) dpc);
        b(8, K_);
    }

    public final void a(dwp dwp) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dwp);
        b(10, K_);
    }

    public final void a(String str, dwk dwk, dwh dwh) {
        Parcel K_ = K_();
        K_.writeString(str);
        djz.a(K_, (IInterface) dwk);
        djz.a(K_, (IInterface) dwh);
        b(5, K_);
    }
}
