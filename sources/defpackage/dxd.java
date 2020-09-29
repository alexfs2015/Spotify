package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dxd reason: default package */
public final class dxd extends dko implements dxb {
    dxd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void a(dwn dwn) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dwn);
        b(1, K_);
    }
}
