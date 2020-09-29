package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.base.Optional;

/* renamed from: vkr reason: default package */
public abstract class vkr<T extends Parcelable> {
    public static void a(Optional<T> optional, Parcel parcel) {
        juo.a(parcel, (Parcelable) optional.d(), 0);
    }

    public abstract Creator<? extends T> a();

    public final Optional<T> a(Parcel parcel) {
        return Optional.c(juo.b(parcel, a()));
    }
}
