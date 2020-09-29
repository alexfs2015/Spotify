package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dqf reason: default package */
public final class dqf extends djx implements dqd {
    dqf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final String D() {
        Parcel a = a(31, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final dqm E() {
        dqm dqm;
        Parcel a = a(32, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dqm = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            dqm = queryLocalInterface instanceof dqm ? (dqm) queryLocalInterface : new dqo(readStrongBinder);
        }
        a.recycle();
        return dqm;
    }

    public final dps F() {
        dps dps;
        Parcel a = a(33, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dps = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            dps = queryLocalInterface instanceof dps ? (dps) queryLocalInterface : new dpu(readStrongBinder);
        }
        a.recycle();
        return dps;
    }

    public final void I() {
        b(9, K_());
    }

    public final String J_() {
        Parcel a = a(35, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String a() {
        Parcel a = a(18, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(ccp ccp) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) ccp);
        b(14, K_);
    }

    public final void a(ccv ccv, String str) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) ccv);
        K_.writeString(str);
        b(15, K_);
    }

    public final void a(ciw ciw) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) ciw);
        b(24, K_);
    }

    public final void a(dpc dpc) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) dpc);
        b(13, K_);
    }

    public final void a(dpp dpp) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dpp);
        b(20, K_);
    }

    public final void a(dps dps) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dps);
        b(7, K_);
    }

    public final void a(dqi dqi) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dqi);
        b(36, K_);
    }

    public final void a(dqm dqm) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dqm);
        b(8, K_);
    }

    public final void a(dqs dqs) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dqs);
        b(21, K_);
    }

    public final void a(drf drf) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) drf);
        b(30, K_);
    }

    public final void a(dry dry) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) dry);
        b(29, K_);
    }

    public final void a(dth dth) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dth);
        b(19, K_);
    }

    public final void a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        b(25, K_);
    }

    public final void b(boolean z) {
        Parcel K_ = K_();
        djz.a(K_, z);
        b(22, K_);
    }

    public final boolean b(doy doy) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) doy);
        Parcel a = a(4, K_);
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final void c(boolean z) {
        Parcel K_ = K_();
        djz.a(K_, z);
        b(34, K_);
    }

    public final void j() {
        b(2, K_());
    }

    public final car k() {
        Parcel a = a(1, K_());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dpc l() {
        Parcel a = a(12, K_());
        dpc dpc = (dpc) djz.a(a, dpc.CREATOR);
        a.recycle();
        return dpc;
    }

    public final boolean m() {
        Parcel a = a(3, K_());
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final void n() {
        b(11, K_());
    }

    public final void o() {
        b(5, K_());
    }

    public final void p() {
        b(6, K_());
    }

    public final Bundle q() {
        Parcel a = a(37, K_());
        Bundle bundle = (Bundle) djz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final void r() {
        b(10, K_());
    }

    public final boolean s() {
        Parcel a = a(23, K_());
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final dqz t() {
        dqz dqz;
        Parcel a = a(26, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dqz = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            dqz = queryLocalInterface instanceof dqz ? (dqz) queryLocalInterface : new drb(readStrongBinder);
        }
        a.recycle();
        return dqz;
    }
}
