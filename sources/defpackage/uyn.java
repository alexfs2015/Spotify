package defpackage;

import android.os.Parcel;
import com.google.common.base.Optional;

/* renamed from: uyn reason: default package */
public final class uyn {
    public static Optional<Boolean> a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return Optional.e();
        }
        boolean z = true;
        if (readInt != 1) {
            z = false;
        }
        return Optional.b(Boolean.valueOf(z));
    }

    public static void a(Optional<Boolean> optional, Parcel parcel) {
        int i = optional.b() ? ((Boolean) optional.c()).booleanValue() ? 1 : 0 : -1;
        parcel.writeInt(i);
    }
}
