package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: hac reason: default package */
public class hac implements Parcelable, gzr {
    public static final Creator<hac> CREATOR = new Creator<hac>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hac[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return hac.create(parcel.readString(), parcel.readString());
        }
    };
    private static final hac UNKNOWN;
    private final String mCategory;
    private Integer mHashCode;
    private final String mId;

    public int describeContents() {
        return 0;
    }

    static {
        String str = "";
        UNKNOWN = create(str, str);
    }

    static hac unknown() {
        return UNKNOWN;
    }

    public static hac fromNullable(gzr gzr) {
        return gzr != null ? immutable(gzr) : unknown();
    }

    public static hac immutable(gzr gzr) {
        if (gzr instanceof hac) {
            return (hac) gzr;
        }
        return create(gzr.id(), gzr.category());
    }

    public static hac create(String str, String str2) {
        return new hac((String) fay.a(str), (String) fay.a(str2));
    }

    public hac(String str, String str2) {
        this.mId = str;
        this.mCategory = str2;
    }

    public String id() {
        return this.mId;
    }

    public String category() {
        return this.mCategory;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mCategory);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hac)) {
            return false;
        }
        hac hac = (hac) obj;
        return faw.a(this.mId, hac.mId) && faw.a(this.mCategory, hac.mCategory);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mId, this.mCategory}));
        }
        return this.mHashCode.intValue();
    }
}
