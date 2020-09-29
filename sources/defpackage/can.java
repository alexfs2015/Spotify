package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: can reason: default package */
public final class can extends bxf {
    public static final Creator<can> CREATOR = new cao();
    private final String a;
    private final cah b;
    private final boolean c;

    can(String str, IBinder iBinder, boolean z) {
        this.a = str;
        this.b = a(iBinder);
        this.c = z;
    }

    can(String str, cah cah, boolean z) {
        this.a = str;
        this.b = cah;
        this.c = z;
    }

    private static cah a(IBinder iBinder) {
        byte[] bArr;
        String str = "Could not unwrap certificate";
        String str2 = "GoogleCertificatesQuery";
        cai cai = null;
        if (iBinder == null) {
            return null;
        }
        try {
            car a2 = byr.a(iBinder).a();
            if (a2 == null) {
                bArr = null;
            } else {
                bArr = (byte[]) cas.a(a2);
            }
            if (bArr != null) {
                cai = new cai(bArr);
            } else {
                Log.e(str2, str);
            }
            return cai;
        } catch (RemoteException e) {
            Log.e(str2, str, e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 1, this.a, false);
        cah cah = this.b;
        if (cah == null) {
            iBinder = null;
        } else {
            iBinder = cah.asBinder();
        }
        bxg.a(parcel, 2, iBinder, false);
        bxg.a(parcel, 3, this.c);
        bxg.b(parcel, a2);
    }
}
