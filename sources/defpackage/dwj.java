package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dwj reason: default package */
public final class dwj extends djx implements dwh {
    dwj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void a(dvw dvw, String str) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dvw);
        K_.writeString(str);
        b(1, K_);
    }
}
