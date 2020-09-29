package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dtx reason: default package */
public final class dtx extends dko implements dtv {
    dtx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    public final String a() {
        Parcel a = a(1, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
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
