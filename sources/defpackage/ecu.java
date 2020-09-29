package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: ecu reason: default package */
public final class ecu extends djx implements ecs {
    ecu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final car a() {
        Parcel a = a(2, K_());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void a(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(21, K_);
    }

    public final void a(car car, cjt cjt, List<String> list) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (IInterface) cjt);
        K_.writeStringList(list);
        b(23, K_);
    }

    public final void a(car car, doy doy, String str, cjt cjt, String str2) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (Parcelable) doy);
        K_.writeString(str);
        djz.a(K_, (IInterface) cjt);
        K_.writeString(str2);
        b(10, K_);
    }

    public final void a(car car, doy doy, String str, ecv ecv) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (Parcelable) doy);
        K_.writeString(str);
        djz.a(K_, (IInterface) ecv);
        b(3, K_);
    }

    public final void a(car car, doy doy, String str, String str2, ecv ecv) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (Parcelable) doy);
        K_.writeString(str);
        K_.writeString(str2);
        djz.a(K_, (IInterface) ecv);
        b(7, K_);
    }

    public final void a(car car, doy doy, String str, String str2, ecv ecv, dup dup, List<String> list) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (Parcelable) doy);
        K_.writeString(str);
        K_.writeString(str2);
        djz.a(K_, (IInterface) ecv);
        djz.a(K_, (Parcelable) dup);
        K_.writeStringList(list);
        b(14, K_);
    }

    public final void a(car car, dpc dpc, doy doy, String str, ecv ecv) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (Parcelable) dpc);
        djz.a(K_, (Parcelable) doy);
        K_.writeString(str);
        djz.a(K_, (IInterface) ecv);
        b(1, K_);
    }

    public final void a(car car, dpc dpc, doy doy, String str, String str2, ecv ecv) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (Parcelable) dpc);
        djz.a(K_, (Parcelable) doy);
        K_.writeString(str);
        K_.writeString(str2);
        djz.a(K_, (IInterface) ecv);
        b(6, K_);
    }

    public final void a(doy doy, String str) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) doy);
        K_.writeString(str);
        b(11, K_);
    }

    public final void a(doy doy, String str, String str2) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) doy);
        K_.writeString(str);
        K_.writeString(str2);
        b(20, K_);
    }

    public final void a(boolean z) {
        Parcel K_ = K_();
        djz.a(K_, z);
        b(25, K_);
    }

    public final void b() {
        b(4, K_());
    }

    public final void c() {
        b(5, K_());
    }

    public final void d() {
        b(8, K_());
    }

    public final void e() {
        b(9, K_());
    }

    public final void f() {
        b(12, K_());
    }

    public final boolean g() {
        Parcel a = a(13, K_());
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final edb h() {
        edb edb;
        Parcel a = a(15, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            edb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            edb = queryLocalInterface instanceof edb ? (edb) queryLocalInterface : new ede(readStrongBinder);
        }
        a.recycle();
        return edb;
    }

    public final edf i() {
        edf edf;
        Parcel a = a(16, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            edf = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            edf = queryLocalInterface instanceof edf ? (edf) queryLocalInterface : new edh(readStrongBinder);
        }
        a.recycle();
        return edf;
    }

    public final Bundle j() {
        Parcel a = a(17, K_());
        Bundle bundle = (Bundle) djz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final Bundle k() {
        Parcel a = a(18, K_());
        Bundle bundle = (Bundle) djz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final Bundle l() {
        Parcel a = a(19, K_());
        Bundle bundle = (Bundle) djz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final boolean m() {
        Parcel a = a(22, K_());
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final dvw n() {
        Parcel a = a(24, K_());
        dvw a2 = dvx.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dqz o() {
        Parcel a = a(26, K_());
        dqz a2 = dra.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final edi p() {
        edi edi;
        Parcel a = a(27, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            edi = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            edi = queryLocalInterface instanceof edi ? (edi) queryLocalInterface : new edk(readStrongBinder);
        }
        a.recycle();
        return edi;
    }
}
