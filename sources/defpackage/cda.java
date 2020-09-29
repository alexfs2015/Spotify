package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: cda reason: default package */
public abstract class cda extends dkp implements ccz {
    public cda() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static ccz a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof ccz ? (ccz) queryLocalInterface : new cdb(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a((Bundle) dkq.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                f();
                break;
            case 3:
                g();
                break;
            case 4:
                h();
                break;
            case 5:
                i();
                break;
            case 6:
                Bundle bundle = (Bundle) dkq.a(parcel, Bundle.CREATOR);
                b(bundle);
                parcel2.writeNoException();
                dkq.b(parcel2, bundle);
                break;
            case 7:
                j();
                break;
            case 8:
                k();
                break;
            case 9:
                l();
                break;
            case 10:
                d();
                break;
            case 11:
                boolean e = e();
                parcel2.writeNoException();
                dkq.a(parcel2, e);
                break;
            case 12:
                a(parcel.readInt(), parcel.readInt(), (Intent) dkq.a(parcel, Intent.CREATOR));
                break;
            case 13:
                a(a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
