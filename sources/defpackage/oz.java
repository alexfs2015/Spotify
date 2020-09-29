package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: oz reason: default package */
public interface oz extends IInterface {

    /* renamed from: oz$a */
    public static abstract class a extends Binder implements oz {

        /* renamed from: oz$a$a reason: collision with other inner class name */
        static class C0074a implements oz {
            private IBinder a;

            C0074a(IBinder iBinder) {
                this.a = iBinder;
            }

            public final void a(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static oz a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof oz)) ? new C0074a(iBinder) : (oz) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = "androidx.room.IMultiInstanceInvalidationCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                a(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    void a(String[] strArr);
}
