package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: lry reason: default package */
final class lry extends lrh<lry> {
    public static final Creator<lry> CREATOR = new Creator<lry>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new lry[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new lry(parcel, 0);
        }
    };
    final String c;
    final String d;

    /* synthetic */ lry(Parcel parcel, byte b) {
        this(parcel);
    }

    lry(String str, String str2, List<lqv> list) {
        super(list);
        this.c = str;
        this.d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    private lry(Parcel parcel) {
        super(parcel);
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
