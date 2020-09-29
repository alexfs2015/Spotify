package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bwt reason: default package */
public interface bwt extends IInterface {

    /* renamed from: bwt$a */
    public static abstract class a extends Binder implements bwt {

        /* renamed from: bwt$a$a reason: collision with other inner class name */
        static class C0021a implements bwt {
            private final IBinder a;

            C0021a(IBinder iBinder) {
                this.a = iBinder;
            }

            public final IBinder asBinder() {
                return this.a;
            }

            public final void a(bws bws, bwk bwk) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(bws != null ? bws.asBinder() : null);
                    if (bwk != null) {
                        obtain.writeInt(1);
                        bwk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            bws bws;
            if (i > 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder readStrongBinder = parcel.readStrongBinder();
            bwk bwk = null;
            if (readStrongBinder == null) {
                bws = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                if (queryLocalInterface instanceof bws) {
                    bws = (bws) queryLocalInterface;
                } else {
                    bws = new byt(readStrongBinder);
                }
            }
            if (i == 46) {
                if (parcel.readInt() != 0) {
                    bwk = (bwk) bwk.CREATOR.createFromParcel(parcel);
                }
                a(bws, bwk);
                parcel2.writeNoException();
                return true;
            } else if (i == 47) {
                if (parcel.readInt() != 0) {
                    byy.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            } else {
                parcel.readInt();
                if (i != 4) {
                    parcel.readString();
                }
                if (i != 1) {
                    if (!(i == 2 || i == 23 || i == 25 || i == 27)) {
                        if (i != 30) {
                            if (i != 34) {
                                if (!(i == 41 || i == 43 || i == 37 || i == 38)) {
                                    switch (i) {
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                            break;
                                        case 9:
                                            parcel.readString();
                                            parcel.createStringArray();
                                            parcel.readString();
                                            parcel.readStrongBinder();
                                            parcel.readString();
                                            if (parcel.readInt() != 0) {
                                                Bundle.CREATOR.createFromParcel(parcel);
                                                break;
                                            }
                                            break;
                                        case 10:
                                            parcel.readString();
                                            parcel.createStringArray();
                                            break;
                                        case 19:
                                            parcel.readStrongBinder();
                                            if (parcel.readInt() != 0) {
                                                Bundle.CREATOR.createFromParcel(parcel);
                                                break;
                                            }
                                            break;
                                        case 20:
                                            break;
                                    }
                                }
                            } else {
                                parcel.readString();
                            }
                        }
                        parcel.createStringArray();
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                            Bundle.CREATOR.createFromParcel(parcel);
                        }
                    }
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                } else {
                    parcel.readString();
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                }
                throw new UnsupportedOperationException();
            }
        }
    }

    void a(bws bws, bwk bwk);
}
