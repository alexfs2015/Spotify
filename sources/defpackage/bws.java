package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bws reason: default package */
public interface bws extends IInterface {

    /* renamed from: bws$a */
    public static abstract class a extends eix implements bws {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        public final boolean a(int i, Parcel parcel, Parcel parcel2) {
            if (i == 1) {
                a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) eiy.a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                a(parcel.readInt(), (Bundle) eiy.a(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                a(parcel.readInt(), parcel.readStrongBinder(), (byj) eiy.a(parcel, byj.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a(int i, Bundle bundle);

    void a(int i, IBinder iBinder, Bundle bundle);

    void a(int i, IBinder iBinder, byj byj);
}
