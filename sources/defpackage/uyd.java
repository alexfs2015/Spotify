package defpackage;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.base.Optional;

/* renamed from: uyd reason: default package */
public abstract class uyd implements Parcelable {
    public abstract int a();

    public abstract int b();

    public static Optional<uyd> a(int i, int i2) {
        return Optional.b(new uyc(i, i2));
    }

    public static Creator<uyc> c() {
        return uyc.CREATOR;
    }
}
