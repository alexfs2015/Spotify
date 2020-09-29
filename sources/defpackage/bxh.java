package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bxh reason: default package */
public interface bxh extends IInterface {

    /* renamed from: bxh$a */
    public static abstract class a extends ejo implements bxh {

        /* renamed from: bxh$a$a reason: collision with other inner class name */
        public static class C0020a extends ejn implements bxh {
            C0020a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            public final Account a() {
                Parcel a = a(2, c());
                Account account = (Account) ejp.a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        public static bxh a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof bxh ? (bxh) queryLocalInterface : new C0020a(iBinder);
        }

        public final boolean a(int i, Parcel parcel, Parcel parcel2) {
            if (i != 2) {
                return false;
            }
            Account a = a();
            parcel2.writeNoException();
            ejp.b(parcel2, a);
            return true;
        }
    }

    Account a();
}
