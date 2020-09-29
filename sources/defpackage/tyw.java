package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: tyw reason: default package */
final class tyw extends tyr {
    public static final Creator<tyw> CREATOR = new Creator<tyw>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new tyw[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new tyw((Uri) parcel.readParcelable(tzf.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    tyw(Uri uri) {
        super(uri);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
