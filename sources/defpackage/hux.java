package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hux reason: default package */
public final class hux implements Parcelable, huw {
    public static final Creator<hux> CREATOR = new Creator<hux>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList arrayList = new ArrayList();
            parcel.readTypedList(arrayList, huv.CREATOR);
            return new hux(readString, readString2, arrayList);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hux[i];
        }
    };
    public final String a;
    public final List<huv> b;
    private final String c;

    public hux(String str, String str2, List<huv> list) {
        this.a = str;
        this.c = str2;
        this.b = list;
    }

    public final String a() {
        String str = this.c;
        return str != null ? str : "";
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        parcel.writeTypedList(this.b);
    }
}
