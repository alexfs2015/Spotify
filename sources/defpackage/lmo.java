package defpackage;

import com.google.common.base.Optional;
import java.util.concurrent.ExecutorService;

/* renamed from: lmo reason: default package */
public final class lmo implements wig<Optional<ExecutorService>> {
    private static final lmo a = new lmo();

    public static lmo a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Optional) wil.a(Optional.e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
