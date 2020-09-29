package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: iwq reason: default package */
final class iwq extends iwn {
    public static final Creator<iwq> CREATOR = new Creator<iwq>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new iwq[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new iwq(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, iwq.d.a(parcel));
        }
    };
    /* access modifiers changed from: private */
    public static final b d = new b();

    iwq(String str, String str2, List<iwr> list) {
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
