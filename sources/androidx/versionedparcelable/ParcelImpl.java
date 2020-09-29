package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelImpl implements Parcelable {
    public static final Creator<ParcelImpl> CREATOR = new Creator<ParcelImpl>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ParcelImpl[i];
        }
    };
    public final se a;

    protected ParcelImpl(Parcel parcel) {
        this.a = new sd(parcel).i();
    }

    public ParcelImpl(se seVar) {
        this.a = seVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new sd(parcel).a(this.a);
    }
}
