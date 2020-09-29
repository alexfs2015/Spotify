package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;

/* renamed from: bwk reason: default package */
public final class bwk extends bxf {
    public static final Creator<bwk> CREATOR = new byl();
    String a;
    IBinder b;
    Scope[] c;
    Bundle d;
    Account e;
    brw[] f;
    brw[] g;
    private final int h;
    private final int i;
    private int j;
    private boolean k;

    public bwk(int i2) {
        this.h = 4;
        this.j = bry.b;
        this.i = i2;
        this.k = true;
    }

    bwk(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, brw[] brwArr, brw[] brwArr2, boolean z) {
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
                account2 = bwf.a(a.a(iBinder));
            }
            this.e = account2;
        } else {
            this.b = iBinder;
            this.e = account;
        }
        this.c = scopeArr;
        this.d = bundle;
        this.f = brwArr;
        this.g = brwArr2;
        this.k = z;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.h);
        bxg.b(parcel, 2, this.i);
        bxg.b(parcel, 3, this.j);
        bxg.a(parcel, 4, this.a, false);
        bxg.a(parcel, 5, this.b, false);
        bxg.a(parcel, 6, (T[]) this.c, i2, false);
        bxg.a(parcel, 7, this.d, false);
        bxg.a(parcel, 8, (Parcelable) this.e, i2, false);
        bxg.a(parcel, 10, (T[]) this.f, i2, false);
        bxg.a(parcel, 11, (T[]) this.g, i2, false);
        bxg.a(parcel, 12, this.k);
        bxg.b(parcel, a2);
    }
}
