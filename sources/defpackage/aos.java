package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aos reason: default package */
public final class aos implements aou {
    public static final Creator<aos> CREATOR = new Creator<aos>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aos[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aos(parcel);
        }
    };
    public final String a;
    public final String b;
    public final Uri c;
    public final aor d;
    public final aor e;

    public final int describeContents() {
        return 0;
    }

    aos(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = (aor) parcel.readParcelable(aor.class.getClassLoader());
        this.e = (aor) parcel.readParcelable(aor.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
    }
}
