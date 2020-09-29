package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@cfp
/* renamed from: ccy reason: default package */
public final class ccy extends RemoteCreator<cdc> {
    public ccy() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final ccz a(Activity activity) {
        try {
            IBinder a = ((cdc) a((Context) activity)).a(cbj.a(activity));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof ccz ? (ccz) queryLocalInterface : new cdb(a);
        } catch (RemoteException unused) {
            cpn.a(5);
            return null;
        } catch (RemoteCreatorException unused2) {
            cpn.a(5);
            return null;
        }
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof cdc ? (cdc) queryLocalInterface : new cdd(iBinder);
    }
}
