package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dku reason: default package */
public final class dku extends dko implements dks {
    dku(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    public final void a() {
        b(3, K_());
    }

    public final void a(int i) {
        Parcel K_ = K_();
        K_.writeInt(i);
        b(6, K_);
    }

    public final void a(cbi cbi, String str) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        K_.writeString(str);
        b(2, K_);
    }

    public final void a(byte[] bArr) {
        Parcel K_ = K_();
        K_.writeByteArray(bArr);
        b(5, K_);
    }

    public final void b() {
        Parcel K_ = K_();
        K_.writeIntArray(null);
        b(4, K_);
    }

    public final void b(int i) {
        Parcel K_ = K_();
        K_.writeInt(i);
        b(7, K_);
    }

    public final void b(cbi cbi, String str) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        K_.writeString(str);
        K_.writeString(null);
        b(8, K_);
    }
}
