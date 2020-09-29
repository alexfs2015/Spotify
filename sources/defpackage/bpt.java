package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bpt reason: default package */
public interface bpt extends IInterface {

    /* renamed from: bpt$a */
    public static abstract class a extends egx implements bpt {
        public a() {
            super("com.google.android.gms.cast.framework.media.IImagePicker");
        }

        public final boolean a(int i, Parcel parcel, Parcel parcel2) {
            if (i == 1) {
                bwu a = a((boc) ehz.a(parcel, boc.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                ehz.b(parcel2, a);
            } else if (i == 2) {
                cbi b = b();
                parcel2.writeNoException();
                ehz.a(parcel2, (IInterface) b);
            } else if (i == 3) {
                int a2 = a();
                parcel2.writeNoException();
                parcel2.writeInt(a2);
            } else if (i != 4) {
                return false;
            } else {
                bwu a3 = a((boc) ehz.a(parcel, boc.CREATOR), (boz) ehz.a(parcel, boz.CREATOR));
                parcel2.writeNoException();
                ehz.b(parcel2, a3);
            }
            return true;
        }
    }

    int a();

    bwu a(boc boc, int i);

    bwu a(boc boc, boz boz);

    cbi b();
}
