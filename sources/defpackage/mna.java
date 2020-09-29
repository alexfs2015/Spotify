package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mna reason: default package */
final class mna extends mmu {
    public static final Creator<mna> CREATOR = new Creator<mna>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mna[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            ArrayList readArrayList = parcel.readArrayList(mng.class.getClassLoader());
            boolean z = true;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z = false;
            }
            mna mna = new mna(readString, readString2, readString3, readArrayList, z2, z);
            return mna;
        }
    };

    public final int describeContents() {
        return 0;
    }

    mna(String str, String str2, String str3, List<uzb> list, boolean z, boolean z2) {
        super(str, str2, str3, list, z, z2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeList(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
