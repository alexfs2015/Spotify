package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kim reason: default package */
final class kim extends kih {
    public static final Creator<kim> CREATOR = new Creator<kim>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            kim kim = new kim(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return kim;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kim[i];
        }
    };

    kim(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str, str2, str3, str4, str5, str6);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
