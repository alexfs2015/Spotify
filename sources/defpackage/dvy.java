package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dvy reason: default package */
public final class dvy extends djx implements dvw {
    dvy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final String a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        Parcel a = a(1, K_);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final List<String> a() {
        Parcel a = a(3, K_());
        ArrayList createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }

    public final boolean a(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        Parcel a = a(10, K_);
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final car b() {
        Parcel a = a(11, K_());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dva b(String str) {
        dva dva;
        Parcel K_ = K_();
        K_.writeString(str);
        Parcel a = a(2, K_);
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

    public final dqz c() {
        Parcel a = a(7, K_());
        dqz a2 = dra.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void c(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        b(5, K_);
    }

    public final void d() {
        b(6, K_());
    }

    public final car e() {
        Parcel a = a(9, K_());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void f() {
        b(8, K_());
    }

    public final String l() {
        Parcel a = a(4, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
