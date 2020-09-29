package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dqw reason: default package */
public final class dqw extends dko implements dqu {
    dqw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final String D() {
        Parcel a = a(31, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final drd E() {
        drd drd;
        Parcel a = a(32, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            drd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            drd = queryLocalInterface instanceof drd ? (drd) queryLocalInterface : new drf(readStrongBinder);
        }
        a.recycle();
        return drd;
    }

    public final dqj F() {
        dqj dqj;
        Parcel a = a(33, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dqj = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            dqj = queryLocalInterface instanceof dqj ? (dqj) queryLocalInterface : new dql(readStrongBinder);
        }
        a.recycle();
        return dqj;
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

    public final void a(cdg cdg) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cdg);
        b(14, K_);
    }

    public final void a(cdm cdm, String str) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cdm);
        K_.writeString(str);
        b(15, K_);
    }

    public final void a(cjn cjn) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cjn);
        b(24, K_);
    }

    public final void a(dpt dpt) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) dpt);
        b(13, K_);
    }

    public final void a(dqg dqg) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dqg);
        b(20, K_);
    }

    public final void a(dqj dqj) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dqj);
        b(7, K_);
    }

    public final void a(dqz dqz) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dqz);
        b(36, K_);
    }

    public final void a(drd drd) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) drd);
        b(8, K_);
    }

    public final void a(drj drj) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) drj);
        b(21, K_);
    }

    public final void a(drw drw) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) drw);
        b(30, K_);
    }

    public final void a(dsp dsp) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) dsp);
        b(29, K_);
    }

    public final void a(dty dty) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dty);
        b(19, K_);
    }

    public final void a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        b(25, K_);
    }

    public final void b(boolean z) {
        Parcel K_ = K_();
        dkq.a(K_, z);
        b(22, K_);
    }

    public final boolean b(dpp dpp) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) dpp);
        Parcel a = a(4, K_);
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }

    public final void c(boolean z) {
        Parcel K_ = K_();
        dkq.a(K_, z);
        b(34, K_);
    }

    public final void j() {
        b(2, K_());
    }

    public final cbi k() {
        Parcel a = a(1, K_());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dpt l() {
        Parcel a = a(12, K_());
        dpt dpt = (dpt) dkq.a(a, dpt.CREATOR);
        a.recycle();
        return dpt;
    }

    public final boolean m() {
        Parcel a = a(3, K_());
        boolean a2 = dkq.a(a);
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
        Bundle bundle = (Bundle) dkq.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final void r() {
        b(10, K_());
    }

    public final boolean s() {
        Parcel a = a(23, K_());
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }

    public final drq t() {
        drq drq;
        Parcel a = a(26, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            drq = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            drq = queryLocalInterface instanceof drq ? (drq) queryLocalInterface : new drs(readStrongBinder);
        }
        a.recycle();
        return drq;
    }
}
