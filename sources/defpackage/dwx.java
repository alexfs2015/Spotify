package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dwx reason: default package */
public final class dwx extends dko implements dwu {
    dwx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void a(dwj dwj) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dwj);
        b(1, K_);
    }
}
