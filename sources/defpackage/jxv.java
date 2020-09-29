package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: jxv reason: default package */
final class jxv implements Creator<String> {
    jxv() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return parcel.readString();
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new String[i];
    }
}
