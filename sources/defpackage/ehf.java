package defpackage;

import android.os.Parcel;

/* renamed from: ehf reason: default package */
public abstract class ehf extends egx implements ehc {
    public ehf() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a(parcel.readLong(), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
