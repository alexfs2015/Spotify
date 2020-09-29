package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: izb reason: default package */
final class izb extends iyy {
    public static final Creator<izb> CREATOR = new Creator<izb>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new izb(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, izb.d.a(parcel));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new izb[i];
        }
    };
    /* access modifiers changed from: private */
    public static final b d = new b();

    izb(String str, String str2, List<izc> list) {
        super(str, str2, list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        if (this.b == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.b);
        }
        parcel.writeTypedList(this.c);
    }
}
