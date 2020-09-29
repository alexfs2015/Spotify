package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: lrm reason: default package */
final class lrm extends lrh<lrm> {
    public static final Creator<lrm> CREATOR = new Creator<lrm>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new lrm[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new lrm(parcel, 0);
        }
    };
    final lqs c;

    /* synthetic */ lrm(Parcel parcel, byte b) {
        this(parcel);
    }

    lrm(lqs lqs) {
        super(lqs.b());
        this.c = lqs;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        jse.a(parcel, (Parcelable) this.c, i);
    }

    private lrm(Parcel parcel) {
        super(parcel);
        this.c = (lqs) fay.a(jse.b(parcel, lqs.c));
    }
}
