package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: cip reason: default package */
public final class cip extends djx implements cio {
    cip(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void a(cil cil, String str) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) cil);
        K_.writeString(str);
        b(1, K_);
    }
}
