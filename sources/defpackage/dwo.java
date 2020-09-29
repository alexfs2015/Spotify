package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dwo reason: default package */
public final class dwo extends djx implements dwn {
    dwo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public final void a(dqd dqd, car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dqd);
        djz.a(K_, (IInterface) car);
        b(1, K_);
    }
}
