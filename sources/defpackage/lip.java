package defpackage;

import com.google.common.base.Optional;
import java.util.concurrent.ExecutorService;

/* renamed from: lip reason: default package */
public final class lip implements vua<Optional<ExecutorService>> {
    private static final lip a = new lip();

    public static lip a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Optional) vuf.a(Optional.e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
