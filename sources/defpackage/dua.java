package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dua reason: default package */
public final class dua extends dko implements dty {
    dua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void a(dtv dtv) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dtv);
        b(1, K_);
    }
}
