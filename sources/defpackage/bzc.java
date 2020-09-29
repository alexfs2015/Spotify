package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bzc reason: default package */
public final class bzc implements Creator<bxb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        bsn[] bsnArr = null;
        bsn[] bsnArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 2:
                    i2 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 3:
                    i3 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 5:
                    iBinder = SafeParcelReader.i(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.b(parcel2, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.j(parcel2, readInt);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.a(parcel2, readInt, Account.CREATOR);
                    break;
                case 10:
                    bsnArr = (bsn[]) SafeParcelReader.b(parcel2, readInt, bsn.CREATOR);
                    break;
                case 11:
                    bsnArr2 = (bsn[]) SafeParcelReader.b(parcel2, readInt, bsn.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        bxb bxb = new bxb(i, i2, i3, str, iBinder, scopeArr, bundle, account, bsnArr, bsnArr2, z);
        return bxb;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bxb[i];
    }
}
