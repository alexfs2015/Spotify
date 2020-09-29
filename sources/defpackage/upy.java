package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: upy reason: default package */
public abstract class upy<T extends Parcelable> {
    private final Creator<? extends T> a;

    protected upy(Creator<? extends T> creator) {
        this.a = creator;
    }

    public final T a(Parcel parcel) {
        return jse.b(parcel, this.a);
    }
}
