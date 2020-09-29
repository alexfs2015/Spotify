package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hsf reason: default package */
public final class hsf implements Parcelable, hse {
    public static final Creator<hsf> CREATOR = new Creator<hsf>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hsf[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList arrayList = new ArrayList();
            parcel.readTypedList(arrayList, hsd.CREATOR);
            return new hsf(readString, readString2, arrayList);
        }
    };
    public final String a;
    public final List<hsd> b;
    private final String c;

    public final int describeContents() {
        return 0;
    }

    public hsf(String str, String str2, List<hsd> list) {
        this.a = str;
        this.c = str2;
        this.b = list;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        String str = this.c;
        return str != null ? str : "";
    }

    public final String toString() {
        return b();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        parcel.writeTypedList(this.b);
    }
}
