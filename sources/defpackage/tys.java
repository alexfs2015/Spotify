package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: tys reason: default package */
final class tys extends tyn {
    public static final Creator<tys> CREATOR = new Creator<tys>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new tys[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new tys((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }
    };

    public final int describeContents() {
        return 0;
    }

    tys(CharSequence charSequence) {
        super(charSequence);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.a, parcel, i);
    }
}
