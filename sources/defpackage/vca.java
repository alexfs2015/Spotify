package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.util.SortOption;
import java.util.Arrays;

/* renamed from: vca reason: default package */
public final class vca implements Parcelable {
    public static final Creator<vca> CREATOR = new Creator<vca>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new vca((SortOption) juo.b(parcel, SortOption.CREATOR), 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new vca[i];
        }
    };
    public static final vca a = a(null);
    private final SortOption b;

    private vca(SortOption sortOption) {
        this.b = sortOption;
    }

    /* synthetic */ vca(SortOption sortOption, byte b2) {
        this(sortOption);
    }

    public static vca a(SortOption sortOption) {
        return new vca(sortOption);
    }

    public final SortOption a() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vca)) {
            return false;
        }
        vca vca = (vca) obj;
        SortOption a2 = a();
        SortOption a3 = vca.a();
        return fbn.a(a2, a3) && a2.mIsReversible == a3.mIsReversible && a2.b() == a3.b();
    }

    public final int hashCode() {
        SortOption sortOption = this.b;
        if (sortOption == null) {
            return super.hashCode();
        }
        return Arrays.hashCode(new Object[]{sortOption, Boolean.valueOf(sortOption.mIsReversible), Boolean.valueOf(this.b.b())});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, (Parcelable) this.b, i);
    }
}
