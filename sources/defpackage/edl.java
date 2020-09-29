package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: edl reason: default package */
public final class edl extends dko implements edj {
    edl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final cbi a() {
        Parcel a = a(2, K_());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void a(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(21, K_);
    }

    public final void a(cbi cbi, ckk ckk, List<String> list) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (IInterface) ckk);
        K_.writeStringList(list);
        b(23, K_);
    }

    public final void a(cbi cbi, dpp dpp, String str, ckk ckk, String str2) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (Parcelable) dpp);
        K_.writeString(str);
        dkq.a(K_, (IInterface) ckk);
        K_.writeString(str2);
        b(10, K_);
    }

    public final void a(cbi cbi, dpp dpp, String str, edm edm) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (Parcelable) dpp);
        K_.writeString(str);
        dkq.a(K_, (IInterface) edm);
        b(3, K_);
    }

    public final void a(cbi cbi, dpp dpp, String str, String str2, edm edm) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (Parcelable) dpp);
        K_.writeString(str);
        K_.writeString(str2);
        dkq.a(K_, (IInterface) edm);
        b(7, K_);
    }

    public final void a(cbi cbi, dpp dpp, String str, String str2, edm edm, dvg dvg, List<String> list) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (Parcelable) dpp);
        K_.writeString(str);
        K_.writeString(str2);
        dkq.a(K_, (IInterface) edm);
        dkq.a(K_, (Parcelable) dvg);
        K_.writeStringList(list);
        b(14, K_);
    }

    public final void a(cbi cbi, dpt dpt, dpp dpp, String str, edm edm) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (Parcelable) dpt);
        dkq.a(K_, (Parcelable) dpp);
        K_.writeString(str);
        dkq.a(K_, (IInterface) edm);
        b(1, K_);
    }

    public final void a(cbi cbi, dpt dpt, dpp dpp, String str, String str2, edm edm) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (Parcelable) dpt);
        dkq.a(K_, (Parcelable) dpp);
        K_.writeString(str);
        K_.writeString(str2);
        dkq.a(K_, (IInterface) edm);
        b(6, K_);
    }

    public final void a(dpp dpp, String str) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) dpp);
        K_.writeString(str);
        b(11, K_);
    }

    public final void a(dpp dpp, String str, String str2) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) dpp);
        K_.writeString(str);
        K_.writeString(str2);
        b(20, K_);
    }

    public final void a(boolean z) {
        Parcel K_ = K_();
        dkq.a(K_, z);
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
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }

    public final eds h() {
        eds eds;
        Parcel a = a(15, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            eds = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            eds = queryLocalInterface instanceof eds ? (eds) queryLocalInterface : new edv(readStrongBinder);
        }
        a.recycle();
        return eds;
    }

    public final edw i() {
        edw edw;
        Parcel a = a(16, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            edw = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            edw = queryLocalInterface instanceof edw ? (edw) queryLocalInterface : new edy(readStrongBinder);
        }
        a.recycle();
        return edw;
    }

    public final Bundle j() {
        Parcel a = a(17, K_());
        Bundle bundle = (Bundle) dkq.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final Bundle k() {
        Parcel a = a(18, K_());
        Bundle bundle = (Bundle) dkq.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final Bundle l() {
        Parcel a = a(19, K_());
        Bundle bundle = (Bundle) dkq.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final boolean m() {
        Parcel a = a(22, K_());
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }

    public final dwn n() {
        Parcel a = a(24, K_());
        dwn a2 = dwo.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final drq o() {
        Parcel a = a(26, K_());
        drq a2 = drr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final edz p() {
        edz edz;
        Parcel a = a(27, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            edz = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            edz = queryLocalInterface instanceof edz ? (edz) queryLocalInterface : new eeb(readStrongBinder);
        }
        a.recycle();
        return edz;
    }
}
