package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dwh reason: default package */
public final class dwh extends dko implements dwf {
    dwh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    public final String a() {
        Parcel a = a(3, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(Bundle bundle) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) bundle);
        b(14, K_);
    }

    public final List b() {
        Parcel a = a(4, K_());
        ArrayList b = dkq.b(a);
        a.recycle();
        return b;
    }

    public final boolean b(Bundle bundle) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) bundle);
        Parcel a = a(15, K_);
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }

    public final String c() {
        Parcel a = a(5, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void c(Bundle bundle) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) bundle);
        b(16, K_);
    }

    public final dvr d() {
        dvr dvr;
        Parcel a = a(6, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dvr = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            dvr = queryLocalInterface instanceof dvr ? (dvr) queryLocalInterface : new dvt(readStrongBinder);
        }
        a.recycle();
        return dvr;
    }

    public final String e() {
        Parcel a = a(7, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final double f() {
        Parcel a = a(8, K_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    public final String g() {
        Parcel a = a(9, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String h() {
        Parcel a = a(10, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final drq i() {
        Parcel a = a(13, K_());
        drq a2 = drr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final cbi j() {
        Parcel a = a(2, K_());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final Bundle n() {
        Parcel a = a(11, K_());
        Bundle bundle = (Bundle) dkq.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final cbi p() {
        Parcel a = a(18, K_());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final String q() {
        Parcel a = a(19, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final dvn r() {
        dvn dvn;
        Parcel a = a(17, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dvn = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            dvn = queryLocalInterface instanceof dvn ? (dvn) queryLocalInterface : new dvp(readStrongBinder);
        }
        a.recycle();
        return dvn;
    }

    public final void s() {
        b(12, K_());
    }
}
