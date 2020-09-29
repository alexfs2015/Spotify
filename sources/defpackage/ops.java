package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.base.Optional;

/* renamed from: ops reason: default package */
final class ops extends opr {
    public static final Creator<ops> CREATOR = new Creator<ops>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            ops.c;
            Optional c = Optional.c(parcel.readString());
            ops.d;
            return new ops(c, wax.a(parcel));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ops[i];
        }
    };
    /* access modifiers changed from: private */
    public static final vbe c = new vbe();
    /* access modifiers changed from: private */
    public static final wax d = new wax();

    ops(Optional<String> optional, Optional<way> optional2) {
        super(optional, optional2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString((String) this.a.d());
        wax.a(this.b, parcel);
    }
}
