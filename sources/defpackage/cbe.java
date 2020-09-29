package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: cbe reason: default package */
public final class cbe extends bxw {
    public static final Creator<cbe> CREATOR = new cbf();
    private final String a;
    private final cay b;
    private final boolean c;

    cbe(String str, IBinder iBinder, boolean z) {
        this.a = str;
        this.b = a(iBinder);
        this.c = z;
    }

    cbe(String str, cay cay, boolean z) {
        this.a = str;
        this.b = cay;
        this.c = z;
    }

    private static cay a(IBinder iBinder) {
        String str = "Could not unwrap certificate";
        String str2 = "GoogleCertificatesQuery";
        caz caz = null;
        if (iBinder == null) {
            return null;
        }
        try {
            cbi a2 = bzi.a(iBinder).a();
            byte[] bArr = a2 == null ? null : (byte[]) cbj.a(a2);
            if (bArr != null) {
                caz = new caz(bArr);
            } else {
                Log.e(str2, str);
            }
            return caz;
        } catch (RemoteException e) {
            Log.e(str2, str, e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 1, this.a, false);
        cay cay = this.b;
        bxx.a(parcel, 2, cay == null ? null : cay.asBinder(), false);
        bxx.a(parcel, 3, this.c);
        bxx.b(parcel, a2);
    }
}
