package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dvq reason: default package */
public final class dvq extends djx implements dvo {
    dvq(IBinder iBinder) {
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
        djz.a(K_, (Parcelable) bundle);
        b(14, K_);
    }

    public final List b() {
        Parcel a = a(4, K_());
        ArrayList b = djz.b(a);
        a.recycle();
        return b;
    }

    public final boolean b(Bundle bundle) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) bundle);
        Parcel a = a(15, K_);
        boolean a2 = djz.a(a);
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
        djz.a(K_, (Parcelable) bundle);
        b(16, K_);
    }

    public final dva d() {
        dva dva;
        Parcel a = a(6, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dva = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            dva = queryLocalInterface instanceof dva ? (dva) queryLocalInterface : new dvc(readStrongBinder);
        }
        a.recycle();
        return dva;
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

    public final dqz i() {
        Parcel a = a(13, K_());
        dqz a2 = dra.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final car j() {
        Parcel a = a(2, K_());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final Bundle n() {
        Parcel a = a(11, K_());
        Bundle bundle = (Bundle) djz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final car p() {
        Parcel a = a(18, K_());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final String q() {
        Parcel a = a(19, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final duw r() {
        duw duw;
        Parcel a = a(17, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            duw = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            duw = queryLocalInterface instanceof duw ? (duw) queryLocalInterface : new duy(readStrongBinder);
        }
        a.recycle();
        return duw;
    }

    public final void s() {
        b(12, K_());
    }
}