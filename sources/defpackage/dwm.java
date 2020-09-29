package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dwm reason: default package */
public final class dwm extends djx implements dwk {
    dwm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void a(dvw dvw) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dvw);
        b(1, K_);
    }
}
