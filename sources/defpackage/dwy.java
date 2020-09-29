package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@cey
/* renamed from: dwy reason: default package */
public final class dwy extends RemoteCreator<dvh> {
    public dwy() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof dvh ? (dvh) queryLocalInterface : new dvi(iBinder);
    }

    public final dve a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder a = ((dvh) a(context)).a(cas.a(context), cas.a(frameLayout), cas.a(frameLayout2));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof dve ? (dve) queryLocalInterface : new dvg(a);
        } catch (RemoteException | RemoteCreatorException unused) {
            cow.a(5);
            return null;
        }
    }
}
