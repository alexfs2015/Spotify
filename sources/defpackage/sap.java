package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: sap reason: default package */
public class sap implements Parcelable {
    public static final Creator<sap> CREATOR = new Creator<sap>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new sap(parcel.readString(), parcel.readParcelable(sap.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new sap[i];
        }
    };
    public final String a;
    public final Parcelable b;

    public sap(String str, Parcelable parcelable) {
        this.a = (String) fbp.a(str);
        this.b = parcelable;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
