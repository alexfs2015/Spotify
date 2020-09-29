package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bwq reason: default package */
public interface bwq extends IInterface {

    /* renamed from: bwq$a */
    public static abstract class a extends eix implements bwq {

        /* renamed from: bwq$a$a reason: collision with other inner class name */
        public static class C0020a extends eiw implements bwq {
            C0020a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            public final Account a() {
                Parcel a = a(2, c());
                Account account = (Account) eiy.a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        public static bwq a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof bwq) {
                return (bwq) queryLocalInterface;
            }
            return new C0020a(iBinder);
        }

        public final boolean a(int i, Parcel parcel, Parcel parcel2) {
            if (i != 2) {
                return false;
            }
            Account a = a();
            parcel2.writeNoException();
            eiy.b(parcel2, a);
            return true;
        }
    }

    Account a();
}
