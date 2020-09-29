package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: fov reason: default package */
public interface fov extends IInterface {

    /* renamed from: fov$a */
    public static abstract class a extends Binder implements fov {

        /* renamed from: fov$a$a reason: collision with other inner class name */
        static class C0030a implements fov {
            private IBinder a;

            C0030a(IBinder iBinder) {
                this.a = iBinder;
            }

            public final void a(int i, boolean z, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISACallback");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.a;
            }

            public final void b(int i, boolean z, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISACallback");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void c(int i, boolean z, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISACallback");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void d(int i, boolean z, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.msc.sa.aidl.ISACallback");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.msc.sa.aidl.ISACallback");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Bundle bundle = null;
            boolean z = false;
            String str = "com.msc.sa.aidl.ISACallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(readInt, z, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(str);
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                b(readInt2, z, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(str);
                int readInt3 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                c(readInt3, z, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(str);
                int readInt4 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                d(readInt4, z, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    void a(int i, boolean z, Bundle bundle);

    void b(int i, boolean z, Bundle bundle);

    void c(int i, boolean z, Bundle bundle);

    void d(int i, boolean z, Bundle bundle);
}
