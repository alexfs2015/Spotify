package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: jvn reason: default package */
final class jvn implements Creator<String> {
    jvn() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new String[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return parcel.readString();
    }
}
