package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: dwt reason: default package */
public final class dwt extends djx implements dws {
    dwt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    public final void a() {
        b(2, K_());
    }

    public final void a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        b(1, K_);
    }
}
