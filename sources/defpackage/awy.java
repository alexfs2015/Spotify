package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: awy reason: default package */
public final class awy extends awv {
    public static final Creator<awy> CREATOR = new Creator<awy>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awy[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awy();
        }
    };

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
