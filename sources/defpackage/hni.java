package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: hni reason: default package */
public final class hni implements Parcelable {
    public static final Creator<hni> CREATOR = new Creator<hni>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new hni(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hni[i];
        }
    };
    public String a;
    public String b;
    public String c;

    protected hni(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
