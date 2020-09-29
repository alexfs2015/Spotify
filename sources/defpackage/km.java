package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

/* renamed from: km reason: default package */
final class km implements Parcelable {
    public static final Creator<km> CREATOR = new Creator<km>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new km(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new km[i];
        }
    };
    ArrayList<kp> a;
    ArrayList<String> b;
    kd[] c;
    String d = null;
    int e;

    public km() {
    }

    public km(Parcel parcel) {
        this.a = parcel.createTypedArrayList(kp.CREATOR);
        this.b = parcel.createStringArrayList();
        this.c = (kd[]) parcel.createTypedArray(kd.CREATOR);
        this.d = parcel.readString();
        this.e = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
