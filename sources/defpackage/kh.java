package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

/* renamed from: kh reason: default package */
final class kh implements Parcelable {
    public static final Creator<kh> CREATOR = new Creator<kh>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new kh[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new kh(parcel);
        }
    };
    ArrayList<kk> a;
    ArrayList<String> b;
    jy[] c;
    String d = null;
    int e;

    public final int describeContents() {
        return 0;
    }

    public kh() {
    }

    public kh(Parcel parcel) {
        this.a = parcel.createTypedArrayList(kk.CREATOR);
        this.b = parcel.createStringArrayList();
        this.c = (jy[]) parcel.createTypedArray(jy.CREATOR);
        this.d = parcel.readString();
        this.e = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
