package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dwt reason: default package */
public final class dwt extends dko implements dwr {
    dwt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void a(dwf dwf) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dwf);
        b(1, K_);
    }
}
