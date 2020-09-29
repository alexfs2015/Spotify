package defpackage;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.base.Optional;

/* renamed from: vkg reason: default package */
public abstract class vkg implements Parcelable {
    public static Optional<vkg> a(int i, int i2) {
        return Optional.b(new vkf(i, i2));
    }

    public static Creator<vkf> c() {
        return vkf.CREATOR;
    }

    public abstract int a();

    public abstract int b();
}
