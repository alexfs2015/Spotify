package defpackage;

import android.os.Parcelable;
import com.google.common.base.Optional;

/* renamed from: opy reason: default package */
public abstract class opy implements Parcelable {

    /* renamed from: opy$a */
    public interface a {
        a a(Optional<String> optional);

        opy a();

        a b(Optional<way> optional);
    }

    public static a f() {
        return new a().a(Optional.e()).b(Optional.e());
    }

    public abstract Optional<String> a();

    public abstract Optional<way> b();

    public abstract a c();
}
