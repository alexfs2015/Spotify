package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@Deprecated
/* renamed from: anz reason: default package */
public final class anz implements aou {
    @Deprecated
    public static final Creator<anz> CREATOR = new Creator<anz>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new anz[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new anz(parcel);
        }
    };
    final String a;
    final String b;

    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    anz(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
