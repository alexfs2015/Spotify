package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.SortOption;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: rkk reason: default package */
final class rkk extends rki {
    public static final Creator<rkk> CREATOR = new Creator<rkk>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            rkk.g;
            ArrayList a = Lists.a();
            parcel.readTypedList(a, SortOption.CREATOR);
            ImmutableList a2 = ImmutableList.a((Collection<? extends E>) a);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            rkk.h;
            ArrayList a3 = Lists.a();
            parcel.readTypedList(a3, b.i());
            rkk rkk = new rkk(a2, readString, readString2, readString3, ImmutableList.a((Collection<? extends E>) a3));
            return rkk;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new rkk[i];
        }
    };
    /* access modifiers changed from: private */
    public static final d g = new d();
    /* access modifiers changed from: private */
    public static final c h = new c();

    rkk(ImmutableList<SortOption> immutableList, String str, String str2, String str3, ImmutableList<b> immutableList2) {
        super(immutableList, str, str2, str3, immutableList2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeTypedList(this.e);
    }
}
