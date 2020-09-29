package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: uln reason: default package */
final class uln extends uli {
    public static final Creator<uln> CREATOR = new Creator<uln>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new uln((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new uln[i];
        }
    };

    uln(CharSequence charSequence) {
        super(charSequence);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.a, parcel, i);
    }
}
