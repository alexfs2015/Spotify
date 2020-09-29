package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ede reason: default package */
public final class ede extends djx implements edb {
    ede(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
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
        b(11, K_);
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
        b(12, K_);
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
        b(16, K_);
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

    public final double f() {
        Parcel a = a(7, K_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    public final String g() {
        Parcel a = a(8, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String h() {
        Parcel a = a(9, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void i() {
        b(10, K_());
    }

    public final boolean j() {
        Parcel a = a(13, K_());
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final boolean k() {
        Parcel a = a(14, K_());
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final Bundle l() {
        Parcel a = a(15, K_());
        Bundle bundle = (Bundle) djz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final dqz m() {
        Parcel a = a(17, K_());
        dqz a2 = dra.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final car n() {
        Parcel a = a(18, K_());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final duw o() {
        Parcel a = a(19, K_());
        duw a2 = dux.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final car p() {
        Parcel a = a(20, K_());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final car q() {
        Parcel a = a(21, K_());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
