package defpackage;

import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$ggr$vzA5_CrTOn6Fv9Hdwhi8IgiGfBc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ggr$vzA5_CrTOn6Fv9Hdwhi8IgiGfBc implements Function {
    private final /* synthetic */ ggu f$0;

    public /* synthetic */ $$Lambda$ggr$vzA5_CrTOn6Fv9Hdwhi8IgiGfBc(ggu ggu) {
        this.f$0 = ggu;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(((c) obj).a).d(10, TimeUnit.SECONDS, Schedulers.a()).c((Function<? super T, ? extends R>) $$Lambda$ggr$N9tdsN3fsipy9XR35bBT3ATZoO8.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$ggr$YSfgOyEYR0GS3eSNZp7hKTllP0g.INSTANCE);
    }
}
