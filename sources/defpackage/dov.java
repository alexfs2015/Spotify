package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@cey
/* renamed from: dov reason: default package */
public final class dov extends RemoteCreator<dqb> {
    public dov() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof dqb ? (dqb) queryLocalInterface : new dqc(iBinder);
    }

    public final dpy a(Context context, String str, ecp ecp) {
        try {
            IBinder a = ((dqb) a(context)).a(cas.a(context), str, ecp);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof dpy ? (dpy) queryLocalInterface : new dqa(a);
        } catch (RemoteException | RemoteCreatorException unused) {
            cow.a(5);
            return null;
        }
    }
}
