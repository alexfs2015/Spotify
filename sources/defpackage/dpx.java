package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dpx reason: default package */
public final class dpx extends djx implements dpv {
    dpx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final String a() {
        Parcel a = a(2, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(doy doy) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) doy);
        b(1, K_);
    }

    public final void a(doy doy, int i) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) doy);
        K_.writeInt(i);
        b(5, K_);
    }

    public final String b() {
        Parcel a = a(4, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean c() {
        Parcel a = a(3, K_());
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }
}
