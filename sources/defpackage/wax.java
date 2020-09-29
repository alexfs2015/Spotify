package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;

/* renamed from: wax reason: default package */
public final class wax {
    public static Optional<way> a(Parcel parcel) {
        return Optional.c(juo.b(parcel, waw.CREATOR));
    }

    public static void a(Optional<way> optional, Parcel parcel) {
        juo.a(parcel, (Parcelable) optional.d(), 0);
    }
}
