package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;

/* renamed from: uyp reason: default package */
public final class uyp {
    public static Optional<uyd> a(Parcel parcel) {
        return Optional.c(jse.b(parcel, uyd.c()));
    }

    public static void a(Optional<uyd> optional, Parcel parcel) {
        jse.a(parcel, (Parcelable) optional.d(), 0);
    }
}
