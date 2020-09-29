package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: hcv reason: default package */
public class hcv implements Parcelable, hck {
    public static final Creator<hcv> CREATOR = new Creator<hcv>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return hcv.create(parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hcv[i];
        }
    };
    private static final hcv UNKNOWN;
    private final String mCategory;
    private Integer mHashCode;
    private final String mId;

    static {
        String str = "";
        UNKNOWN = create(str, str);
    }

    public hcv(String str, String str2) {
        this.mId = str;
        this.mCategory = str2;
    }

    public static hcv create(String str, String str2) {
        return new hcv((String) fbp.a(str), (String) fbp.a(str2));
    }

    public static hcv fromNullable(hck hck) {
        return hck != null ? immutable(hck) : unknown();
    }

    public static hcv immutable(hck hck) {
        return hck instanceof hcv ? (hcv) hck : create(hck.id(), hck.category());
    }

    static hcv unknown() {
        return UNKNOWN;
    }

    public String category() {
        return this.mCategory;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcv)) {
            return false;
        }
        hcv hcv = (hcv) obj;
        return fbn.a(this.mId, hcv.mId) && fbn.a(this.mCategory, hcv.mCategory);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mId, this.mCategory}));
        }
        return this.mHashCode.intValue();
    }

    public String id() {
        return this.mId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mCategory);
    }
}
