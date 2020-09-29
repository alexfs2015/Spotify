package defpackage;

import android.os.Parcelable;
import com.google.common.base.Optional;

/* renamed from: oiu reason: default package */
public abstract class oiu implements Parcelable {

    /* renamed from: oiu$a */
    public interface a {
        a a(Optional<String> optional);

        oiu a();

        a b(Optional<vns> optional);
    }

    public abstract Optional<String> a();

    public abstract Optional<vns> b();

    public abstract a c();

    public static a f() {
        return new a().a(Optional.e()).b(Optional.e());
    }
}
