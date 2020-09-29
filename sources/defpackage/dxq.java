package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.RemoteCreator;

@cfp
/* renamed from: dxq reason: default package */
public final class dxq extends RemoteCreator<dwd> {
    public dxq() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof dwd ? (dwd) queryLocalInterface : new dwe(iBinder);
    }
}
