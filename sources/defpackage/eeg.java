package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: eeg reason: default package */
public final class eeg extends djx implements eee {
    eeg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final eeo a() {
        Parcel a = a(2, K_());
        eeo eeo = (eeo) djz.a(a, eeo.CREATOR);
        a.recycle();
        return eeo;
    }

    public final void a(car car, String str, Bundle bundle, eeh eeh) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        K_.writeString(str);
        djz.a(K_, (Parcelable) bundle);
        djz.a(K_, (IInterface) eeh);
        b(1, K_);
    }

    public final void a(byte[] bArr, String str, Bundle bundle, car car, eea eea, ecv ecv, dpc dpc) {
        Parcel K_ = K_();
        K_.writeByteArray(bArr);
        K_.writeString(str);
        djz.a(K_, (Parcelable) bundle);
        djz.a(K_, (IInterface) car);
        djz.a(K_, (IInterface) eea);
        djz.a(K_, (IInterface) ecv);
        djz.a(K_, (Parcelable) dpc);
        b(4, K_);
    }

    public final void a(byte[] bArr, String str, Bundle bundle, car car, eec eec, ecv ecv) {
        Parcel K_ = K_();
        K_.writeByteArray(bArr);
        K_.writeString(str);
        djz.a(K_, (Parcelable) bundle);
        djz.a(K_, (IInterface) car);
        djz.a(K_, (IInterface) eec);
        djz.a(K_, (IInterface) ecv);
        b(6, K_);
    }

    public final eeo b() {
        Parcel a = a(3, K_());
        eeo eeo = (eeo) djz.a(a, eeo.CREATOR);
        a.recycle();
        return eeo;
    }

    public final dqz c() {
        Parcel a = a(5, K_());
        dqz a2 = dra.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void d() {
        b(7, K_());
    }
}
