package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dvx reason: default package */
public final class dvx extends dko implements dvv {
    dvx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final cbi a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        Parcel a = a(2, K_);
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void a() {
        b(4, K_());
    }

    public final void a(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(3, K_);
    }

    public final void a(cbi cbi, int i) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        K_.writeInt(i);
        b(5, K_);
    }

    public final void a(String str, cbi cbi) {
        Parcel K_ = K_();
        K_.writeString(str);
        dkq.a(K_, (IInterface) cbi);
        b(1, K_);
    }

    public final void b(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(6, K_);
    }
}
