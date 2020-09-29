package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vkf reason: default package */
final class vkf extends vke {
    public static final Creator<vkf> CREATOR = new Creator<vkf>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new vkf(parcel.readInt(), parcel.readInt());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vkf[i];
        }
    };

    vkf(int i, int i2) {
        super(i, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
