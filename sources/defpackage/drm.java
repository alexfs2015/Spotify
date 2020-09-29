package defpackage;

import android.os.Parcel;

/* renamed from: drm reason: default package */
public abstract class drm extends dkp implements drl {
    public drm() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a();
                break;
            case 2:
                a(parcel.readFloat());
                break;
            case 3:
                a(parcel.readString());
                break;
            case 4:
                a(dkq.a(parcel));
                break;
            case 5:
                a(a.a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                a(parcel.readString(), a.a(parcel.readStrongBinder()));
                break;
            case 7:
                float b = b();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                break;
            case 8:
                boolean c = c();
                parcel2.writeNoException();
                dkq.a(parcel2, c);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
