package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bpc reason: default package */
public interface bpc extends IInterface {

    /* renamed from: bpc$a */
    public static abstract class a extends egg implements bpc {
        public a() {
            super("com.google.android.gms.cast.framework.media.IImagePicker");
        }

        public final boolean a(int i, Parcel parcel, Parcel parcel2) {
            if (i == 1) {
                bwd a = a((bnl) ehi.a(parcel, bnl.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                ehi.b(parcel2, a);
            } else if (i == 2) {
                car b = b();
                parcel2.writeNoException();
                ehi.a(parcel2, (IInterface) b);
            } else if (i == 3) {
                int a2 = a();
                parcel2.writeNoException();
                parcel2.writeInt(a2);
            } else if (i != 4) {
                return false;
            } else {
                bwd a3 = a((bnl) ehi.a(parcel, bnl.CREATOR), (boi) ehi.a(parcel, boi.CREATOR));
                parcel2.writeNoException();
                ehi.b(parcel2, a3);
            }
            return true;
        }
    }

    int a();

    bwd a(bnl bnl, int i);

    bwd a(bnl bnl, boi boi);

    car b();
}
