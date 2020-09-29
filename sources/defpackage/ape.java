package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia;
import java.util.Arrays;
import java.util.List;

/* renamed from: ape reason: default package */
public final class ape extends apb<ape, Object> {
    public static final Creator<ape> CREATOR = new Creator<ape>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ape(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ape[i];
        }
    };
    public final List<ShareMedia> a;

    ape(Parcel parcel) {
        super(parcel);
        this.a = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.a.toArray(), i);
    }
}
