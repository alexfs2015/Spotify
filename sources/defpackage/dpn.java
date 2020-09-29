package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@cfp
/* renamed from: dpn reason: default package */
public final class dpn extends RemoteCreator<dqx> {
    public dpn() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final dqu a(Context context, dpt dpt, String str, edg edg, int i) {
        try {
            IBinder a = ((dqx) a(context)).a(cbj.a(context), dpt, str, edg, i);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof dqu ? (dqu) queryLocalInterface : new dqw(a);
        } catch (RemoteException | RemoteCreatorException unused) {
            cpn.a(3);
            return null;
        }
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof dqx ? (dqx) queryLocalInterface : new dqy(iBinder);
    }
}
