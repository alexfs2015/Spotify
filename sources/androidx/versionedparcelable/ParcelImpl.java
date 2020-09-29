package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelImpl implements Parcelable {
    public static final Creator<ParcelImpl> CREATOR = new Creator<ParcelImpl>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ParcelImpl[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }
    };
    public final rz a;

    public int describeContents() {
        return 0;
    }

    public ParcelImpl(rz rzVar) {
        this.a = rzVar;
    }

    protected ParcelImpl(Parcel parcel) {
        this.a = new ry(parcel).i();
    }

    public void writeToParcel(Parcel parcel, int i) {
        new ry(parcel).a(this.a);
    }
}
