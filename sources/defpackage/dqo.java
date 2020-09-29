package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dqo reason: default package */
public final class dqo extends dko implements dqm {
    dqo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final String a() {
        Parcel a = a(2, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(dpp dpp) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) dpp);
        b(1, K_);
    }

    public final void a(dpp dpp, int i) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) dpp);
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
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }
}
