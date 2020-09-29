package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dxa reason: default package */
public final class dxa extends dko implements dwy {
    dxa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void a(dwn dwn, String str) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dwn);
        K_.writeString(str);
        b(1, K_);
    }
}
