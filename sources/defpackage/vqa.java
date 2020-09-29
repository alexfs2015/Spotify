package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: vqa reason: default package */
public final class vqa implements wig<ExecutorService> {
    private static final vqa a = new vqa();

    public static vqa a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (ExecutorService) wil.a(Executors.newSingleThreadExecutor(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
