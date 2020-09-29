package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: lrf reason: default package */
final class lrf extends lrh<lrf> {
    public static final Creator<lrf> CREATOR = new Creator<lrf>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new lrf[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new lrf(parcel, 0);
        }
    };

    /* synthetic */ lrf(Parcel parcel, byte b) {
        this(parcel);
    }

    lrf(List<lqv> list) {
        super(list);
    }

    private lrf(Parcel parcel) {
        super(parcel);
    }
}
