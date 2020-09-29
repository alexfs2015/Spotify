package com.spotify.mobile.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class SortOption implements Parcelable, Serializable {
    public static final Creator<SortOption> CREATOR = new Creator<SortOption>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SortOption[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SortOption(parcel);
        }
    };
    private static final long serialVersionUID = -2805295673093531891L;
    public final boolean mIsReversible;
    public final String mKey;
    public final int mResourceId;
    private boolean mReversed;
    public SortOption mSecondarySortOption;

    public int describeContents() {
        return 0;
    }

    public SortOption(String str) {
        this(str, 0, false);
    }

    public SortOption(String str, boolean z) {
        this(str, 0, z);
    }

    public SortOption(String str, int i) {
        this(str, i, true);
    }

    public SortOption(String str, int i, boolean z) {
        this.mKey = str;
        this.mResourceId = i;
        this.mIsReversible = z;
        this.mReversed = false;
    }

    public SortOption(SortOption sortOption) {
        this.mKey = sortOption.mKey;
        this.mResourceId = sortOption.mResourceId;
        this.mIsReversible = sortOption.mIsReversible;
        this.mReversed = sortOption.b();
        SortOption sortOption2 = sortOption.mSecondarySortOption;
        if (sortOption2 != null) {
            this.mSecondarySortOption = new SortOption(sortOption2);
        }
    }

    public final String a() {
        return b(this.mReversed);
    }

    private String b(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mKey);
        sb.append((!this.mIsReversible || !z) ? "" : " REVERSE");
        return sb.toString();
    }

    public final boolean b() {
        if (!this.mIsReversible) {
            return false;
        }
        return this.mReversed;
    }

    public final SortOption a(boolean z) {
        a(z, false);
        return this;
    }

    public final SortOption a(boolean z, boolean z2) {
        if (z2) {
            SortOption sortOption = this.mSecondarySortOption;
            if (sortOption != null) {
                sortOption.a(z, true);
            }
        }
        if (!this.mIsReversible) {
            return this;
        }
        this.mReversed = z;
        return this;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof SortOption) && ((SortOption) obj).mKey.equals(this.mKey)) {
            return true;
        }
        return false;
    }

    public static SortOption a(String str, List<SortOption> list) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(" REVERSE");
        boolean z = false;
        if (lastIndexOf > 0) {
            str = str.substring(0, lastIndexOf);
            z = true;
        }
        int indexOf = list.indexOf(new SortOption(str));
        if (indexOf >= 0) {
            return new SortOption((SortOption) list.get(indexOf)).a(z, true);
        }
        return null;
    }

    public static SortOption a(SpSharedPreferences<Object> spSharedPreferences, b<Object, String> bVar, SortOption sortOption, List<SortOption> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (SortOption sortOption2 : list) {
            arrayList.add(sortOption2.a());
            if (sortOption2.mIsReversible) {
                arrayList.add(sortOption2.b(true));
            }
        }
        if (sortOption == null) {
            str = "";
        } else {
            str = sortOption.a();
        }
        return a((String) SpSharedPreferences.a(spSharedPreferences.a(bVar, str), str, (String[]) arrayList.toArray(new String[0])), list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mKey);
        parcel.writeInt(this.mResourceId);
        jse.a(parcel, this.mIsReversible);
        jse.a(parcel, this.mReversed);
        jse.a(parcel, (Parcelable) this.mSecondarySortOption, 0);
    }

    protected SortOption(Parcel parcel) {
        this.mKey = parcel.readString();
        this.mResourceId = parcel.readInt();
        this.mIsReversible = jse.a(parcel);
        this.mReversed = jse.a(parcel);
        this.mSecondarySortOption = (SortOption) jse.b(parcel, CREATOR);
    }

    public int hashCode() {
        return this.mKey.hashCode();
    }
}
