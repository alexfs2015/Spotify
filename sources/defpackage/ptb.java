package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ptb reason: default package */
final class ptb extends psy {
    public static final Creator<ptb> CREATOR = new Creator<ptb>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ptb(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ptb[i];
        }
    };

    ptb(int i, String str, String str2, String str3) {
        super(i, str, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
