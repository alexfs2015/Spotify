package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dtg reason: default package */
public final class dtg extends djx implements dte {
    dtg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    public final String a() {
        Parcel a = a(1, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(3, K_);
    }

    public final String b() {
        Parcel a = a(2, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void c() {
        b(4, K_());
    }

    public final void d() {
        b(5, K_());
    }
}
