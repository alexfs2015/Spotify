package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: eex reason: default package */
public final class eex extends dko implements eev {
    eex(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final eff a() {
        Parcel a = a(2, K_());
        eff eff = (eff) dkq.a(a, eff.CREATOR);
        a.recycle();
        return eff;
    }

    public final void a(cbi cbi, String str, Bundle bundle, eey eey) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        K_.writeString(str);
        dkq.a(K_, (Parcelable) bundle);
        dkq.a(K_, (IInterface) eey);
        b(1, K_);
    }

    public final void a(byte[] bArr, String str, Bundle bundle, cbi cbi, eer eer, edm edm, dpt dpt) {
        Parcel K_ = K_();
        K_.writeByteArray(bArr);
        K_.writeString(str);
        dkq.a(K_, (Parcelable) bundle);
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (IInterface) eer);
        dkq.a(K_, (IInterface) edm);
        dkq.a(K_, (Parcelable) dpt);
        b(4, K_);
    }

    public final void a(byte[] bArr, String str, Bundle bundle, cbi cbi, eet eet, edm edm) {
        Parcel K_ = K_();
        K_.writeByteArray(bArr);
        K_.writeString(str);
        dkq.a(K_, (Parcelable) bundle);
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (IInterface) eet);
        dkq.a(K_, (IInterface) edm);
        b(6, K_);
    }

    public final eff b() {
        Parcel a = a(3, K_());
        eff eff = (eff) dkq.a(a, eff.CREATOR);
        a.recycle();
        return eff;
    }

    public final drq c() {
        Parcel a = a(5, K_());
        drq a2 = drr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void d() {
        b(7, K_());
    }
}
