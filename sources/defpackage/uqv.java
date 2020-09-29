package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.util.SortOption;
import java.util.Arrays;

/* renamed from: uqv reason: default package */
public final class uqv implements Parcelable {
    public static final Creator<uqv> CREATOR = new Creator<uqv>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new uqv[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new uqv((SortOption) jse.b(parcel, SortOption.CREATOR), 0);
        }
    };
    public static final uqv a = a(null);
    private final SortOption b;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ uqv(SortOption sortOption, byte b2) {
        this(sortOption);
    }

    private uqv(SortOption sortOption) {
        this.b = sortOption;
    }

    public final SortOption a() {
        return this.b;
    }

    public static uqv a(SortOption sortOption) {
        return new uqv(sortOption);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqv)) {
            return false;
        }
        uqv uqv = (uqv) obj;
        SortOption a2 = a();
        SortOption a3 = uqv.a();
        return faw.a(a2, a3) && a2.mIsReversible == a3.mIsReversible && a2.b() == a3.b();
    }

    public final int hashCode() {
        SortOption sortOption = this.b;
        if (sortOption == null) {
            return super.hashCode();
        }
        return Arrays.hashCode(new Object[]{sortOption, Boolean.valueOf(sortOption.mIsReversible), Boolean.valueOf(this.b.b())});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, (Parcelable) this.b, i);
    }
}
