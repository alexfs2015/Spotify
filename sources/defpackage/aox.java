package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aox reason: default package */
public final class aox extends aoy<aox, Object> {
    public static final Creator<aox> CREATOR = new Creator<aox>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aox[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aox(parcel);
        }
    };

    aox(Parcel parcel) {
        super(parcel);
    }
}
