package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bxj reason: default package */
public interface bxj extends IInterface {

    /* renamed from: bxj$a */
    public static abstract class a extends ejo implements bxj {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        public final boolean a(int i, Parcel parcel, Parcel parcel2) {
            if (i == 1) {
                a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) ejp.a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                a(parcel.readInt(), (Bundle) ejp.a(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                a(parcel.readInt(), parcel.readStrongBinder(), (bza) ejp.a(parcel, bza.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a(int i, Bundle bundle);

    void a(int i, IBinder iBinder, Bundle bundle);

    void a(int i, IBinder iBinder, bza bza);
}
