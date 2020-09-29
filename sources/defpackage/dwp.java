package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dwp reason: default package */
public final class dwp extends dko implements dwn {
    dwp(IBinder iBinder) {
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

    public final boolean a(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        Parcel a = a(10, K_);
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }

    public final cbi b() {
        Parcel a = a(11, K_());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dvr b(String str) {
        dvr dvr;
        Parcel K_ = K_();
        K_.writeString(str);
        Parcel a = a(2, K_);
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

    public final drq c() {
        Parcel a = a(7, K_());
        drq a2 = drr.a(a.readStrongBinder());
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

    public final cbi e() {
        Parcel a = a(9, K_());
        cbi a2 = a.a(a.readStrongBinder());
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
