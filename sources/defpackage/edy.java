package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: edy reason: default package */
public final class edy extends dko implements edw {
    edy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final String a() {
        Parcel a = a(2, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(9, K_);
    }

    public final void a(cbi cbi, cbi cbi2, cbi cbi3) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (IInterface) cbi2);
        dkq.a(K_, (IInterface) cbi3);
        b(22, K_);
    }

    public final List b() {
        Parcel a = a(3, K_());
        ArrayList b = dkq.b(a);
        a.recycle();
        return b;
    }

    public final void b(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(10, K_);
    }

    public final String c() {
        Parcel a = a(4, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void c(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(14, K_);
    }

    public final dvr d() {
        Parcel a = a(5, K_());
        dvr a2 = dvs.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final String e() {
        Parcel a = a(6, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String f() {
        Parcel a = a(7, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void g() {
        b(8, K_());
    }

    public final boolean h() {
        Parcel a = a(11, K_());
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }

    public final boolean i() {
        Parcel a = a(12, K_());
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }

    public final Bundle j() {
        Parcel a = a(13, K_());
        Bundle bundle = (Bundle) dkq.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final cbi k() {
        Parcel a = a(15, K_());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final drq l() {
        Parcel a = a(16, K_());
        drq a2 = drr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dvn m() {
        Parcel a = a(19, K_());
        dvn a2 = dvo.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final cbi n() {
        Parcel a = a(20, K_());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final cbi o() {
        Parcel a = a(21, K_());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
