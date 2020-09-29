package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;

/* renamed from: vks reason: default package */
public final class vks {
    public static Optional<vkg> a(Parcel parcel) {
        return Optional.c(juo.b(parcel, vkg.c()));
    }

    public static void a(Optional<vkg> optional, Parcel parcel) {
        juo.a(parcel, (Parcelable) optional.d(), 0);
    }
}
