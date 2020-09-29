package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: dqo reason: default package */
public final class dqo extends djx implements dqm {
    dqo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public final void a(String str, String str2) {
        Parcel K_ = K_();
        K_.writeString(str);
        K_.writeString(str2);
        b(1, K_);
    }
}
