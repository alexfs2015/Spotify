package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: vbd reason: default package */
public abstract class vbd<T extends Parcelable> {
    private final Creator<? extends T> a;

    protected vbd(Creator<? extends T> creator) {
        this.a = creator;
    }

    public final T a(Parcel parcel) {
        return juo.b(parcel, this.a);
    }
}
