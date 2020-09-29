package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: cjg reason: default package */
public final class cjg extends dko implements cjf {
    cjg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void a(cjc cjc, String str) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cjc);
        K_.writeString(str);
        b(1, K_);
    }
}
