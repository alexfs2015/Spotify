package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dxf reason: default package */
public final class dxf extends dko implements dxe {
    dxf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public final void a(dqu dqu, cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dqu);
        dkq.a(K_, (IInterface) cbi);
        b(1, K_);
    }
}
