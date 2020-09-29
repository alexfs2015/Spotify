package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ulr reason: default package */
final class ulr extends ulm {
    public static final Creator<ulr> CREATOR = new Creator<ulr>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ulr((Uri) parcel.readParcelable(uma.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ulr[i];
        }
    };

    ulr(Uri uri) {
        super(uri);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
