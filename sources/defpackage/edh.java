package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: edh reason: default package */
public final class edh extends djx implements edf {
    edh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final String a() {
        Parcel a = a(2, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(9, K_);
    }

    public final void a(car car, car car2, car car3) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (IInterface) car2);
        djz.a(K_, (IInterface) car3);
        b(22, K_);
    }

    public final List b() {
        Parcel a = a(3, K_());
        ArrayList b = djz.b(a);
        a.recycle();
        return b;
    }

    public final void b(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(10, K_);
    }

    public final String c() {
        Parcel a = a(4, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void c(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(14, K_);
    }

    public final dva d() {
        Parcel a = a(5, K_());
        dva a2 = dvb.a(a.readStrongBinder());
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
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final boolean i() {
        Parcel a = a(12, K_());
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final Bundle j() {
        Parcel a = a(13, K_());
        Bundle bundle = (Bundle) djz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final car k() {
        Parcel a = a(15, K_());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dqz l() {
        Parcel a = a(16, K_());
        dqz a2 = dra.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final duw m() {
        Parcel a = a(19, K_());
        duw a2 = dux.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final car n() {
        Parcel a = a(20, K_());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final car o() {
        Parcel a = a(21, K_());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
