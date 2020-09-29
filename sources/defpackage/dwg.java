package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dwg reason: default package */
public final class dwg extends djx implements dwd {
    dwg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void a(dvs dvs) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dvs);
        b(1, K_);
    }
}
