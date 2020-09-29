package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@cfp
/* renamed from: dxp reason: default package */
public final class dxp extends RemoteCreator<dvy> {
    public dxp() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final dvv a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder a = ((dvy) a(context)).a(cbj.a(context), cbj.a(frameLayout), cbj.a(frameLayout2));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof dvv ? (dvv) queryLocalInterface : new dvx(a);
        } catch (RemoteException | RemoteCreatorException unused) {
            cpn.a(5);
            return null;
        }
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof dvy ? (dvy) queryLocalInterface : new dvz(iBinder);
    }
}
