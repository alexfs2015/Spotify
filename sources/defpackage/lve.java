package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: lve reason: default package */
final class lve extends lvg<lve> {
    public static final Creator<lve> CREATOR = new Creator<lve>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new lve(parcel, 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new lve[i];
        }
    };

    private lve(Parcel parcel) {
        super(parcel);
    }

    /* synthetic */ lve(Parcel parcel, byte b) {
        this(parcel);
    }

    lve(List<luu> list) {
        super(list);
    }
}
