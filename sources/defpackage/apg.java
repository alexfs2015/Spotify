package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: apg reason: default package */
public final class apg implements api {
    public static final Creator<apg> CREATOR = new Creator<apg>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apg(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apg[i];
        }
    };
    public final String a;
    public final String b;
    public final Uri c;
    public final apf d;
    public final apf e;

    apg(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = (apf) parcel.readParcelable(apf.class.getClassLoader());
        this.e = (apf) parcel.readParcelable(apf.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
    }
}
