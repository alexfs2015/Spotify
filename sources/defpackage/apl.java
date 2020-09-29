package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: apl reason: default package */
public final class apl extends apm<apl, Object> {
    public static final Creator<apl> CREATOR = new Creator<apl>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apl(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apl[i];
        }
    };

    apl(Parcel parcel) {
        super(parcel);
    }
}
