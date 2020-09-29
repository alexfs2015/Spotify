package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: rri reason: default package */
public class rri implements Parcelable {
    public static final Creator<rri> CREATOR = new Creator<rri>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rri[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new rri(parcel.readString(), parcel.readParcelable(rri.class.getClassLoader()));
        }
    };
    public final String a;
    public final Parcelable b;

    public int describeContents() {
        return 0;
    }

    public rri(String str, Parcelable parcelable) {
        this.a = (String) fay.a(str);
        this.b = parcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
