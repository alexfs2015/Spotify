package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;

/* renamed from: bxb reason: default package */
public final class bxb extends bxw {
    public static final Creator<bxb> CREATOR = new bzc();
    String a;
    IBinder b;
    Scope[] c;
    Bundle d;
    Account e;
    bsn[] f;
    bsn[] g;
    private final int h;
    private final int i;
    private int j;
    private boolean k;

    public bxb(int i2) {
        this.h = 4;
        this.j = bsp.b;
        this.i = i2;
        this.k = true;
    }

    bxb(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, bsn[] bsnArr, bsn[] bsnArr2, boolean z) {
        this.h = i2;
        this.i = i3;
        this.j = i4;
        String str2 = "com.google.android.gms";
        if (str2.equals(str)) {
            this.a = str2;
        } else {
            this.a = str;
        }
        if (i2 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = bww.a(a.a(iBinder));
            }
            this.e = account2;
        } else {
            this.b = iBinder;
            this.e = account;
        }
        this.c = scopeArr;
        this.d = bundle;
        this.f = bsnArr;
        this.g = bsnArr2;
        this.k = z;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.h);
        bxx.b(parcel, 2, this.i);
        bxx.b(parcel, 3, this.j);
        bxx.a(parcel, 4, this.a, false);
        bxx.a(parcel, 5, this.b, false);
        bxx.a(parcel, 6, (T[]) this.c, i2, false);
        bxx.a(parcel, 7, this.d, false);
        bxx.a(parcel, 8, (Parcelable) this.e, i2, false);
        bxx.a(parcel, 10, (T[]) this.f, i2, false);
        bxx.a(parcel, 11, (T[]) this.g, i2, false);
        bxx.a(parcel, 12, this.k);
        bxx.b(parcel, a2);
    }
}
