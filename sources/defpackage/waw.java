package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: waw reason: default package */
final class waw extends wav {
    public static final Creator<waw> CREATOR = new Creator<waw>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new waw(readString, z, (way) parcel.readParcelable(way.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new waw[i];
        }
    };

    waw(String str, boolean z, way way) {
        super(str, z, way);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
    }
}
