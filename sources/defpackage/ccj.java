package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ccj reason: default package */
public abstract class ccj extends djy implements cci {
    public ccj() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static cci a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof cci ? (cci) queryLocalInterface : new cck(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a((Bundle) djz.a(parcel, Bundle.CREATOR));
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
                Bundle bundle = (Bundle) djz.a(parcel, Bundle.CREATOR);
                b(bundle);
                parcel2.writeNoException();
                djz.b(parcel2, bundle);
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
                djz.a(parcel2, e);
                break;
            case 12:
                a(parcel.readInt(), parcel.readInt(), (Intent) djz.a(parcel, Intent.CREATOR));
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
