package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: drf reason: default package */
public final class drf extends dko implements drd {
    drf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public final void a(String str, String str2) {
        Parcel K_ = K_();
        K_.writeString(str);
        K_.writeString(str2);
        b(1, K_);
    }
}
