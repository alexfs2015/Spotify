package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.base.Optional;

/* renamed from: uyo reason: default package */
public abstract class uyo<T extends Parcelable> {
    public abstract Creator<? extends T> a();

    public final Optional<T> a(Parcel parcel) {
        return Optional.c(jse.b(parcel, a()));
    }

    public static void a(Optional<T> optional, Parcel parcel) {
        jse.a(parcel, (Parcelable) optional.d(), 0);
    }
}
