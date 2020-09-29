package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;

/* renamed from: vnr reason: default package */
public final class vnr {
    public static Optional<vns> a(Parcel parcel) {
        return Optional.c(jse.b(parcel, vnq.CREATOR));
    }

    public static void a(Optional<vns> optional, Parcel parcel) {
        jse.a(parcel, (Parcelable) optional.d(), 0);
    }
}
