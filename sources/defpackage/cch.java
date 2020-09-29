package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@cey
/* renamed from: cch reason: default package */
public final class cch extends RemoteCreator<ccl> {
    public cch() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof ccl ? (ccl) queryLocalInterface : new ccm(iBinder);
    }

    public final cci a(Activity activity) {
        try {
            IBinder a = ((ccl) a((Context) activity)).a(cas.a(activity));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof cci ? (cci) queryLocalInterface : new cck(a);
        } catch (RemoteException unused) {
            cow.a(5);
            return null;
        } catch (RemoteCreatorException unused2) {
            cow.a(5);
            return null;
        }
    }
}
