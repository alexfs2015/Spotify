package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: fhf reason: default package */
final class fhf implements Creator<fhe> {
    fhf() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new fhe[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new fhe(readStrongBinder);
        }
        return null;
    }
}
