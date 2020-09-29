package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia;
import java.util.Arrays;
import java.util.List;

/* renamed from: aoq reason: default package */
public final class aoq extends aon<aoq, Object> {
    public static final Creator<aoq> CREATOR = new Creator<aoq>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aoq[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aoq(parcel);
        }
    };
    public final List<ShareMedia> a;

    public final int describeContents() {
        return 0;
    }

    aoq(Parcel parcel) {
        super(parcel);
        this.a = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.a.toArray(), i);
    }
}
