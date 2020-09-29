package defpackage;

import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$ggr$PkYfxw8ivEEE0eH4XgcgYZxEilU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ggr$PkYfxw8ivEEE0eH4XgcgYZxEilU implements Function {
    private final /* synthetic */ ggu f$0;
    private final /* synthetic */ ggt f$1;

    public /* synthetic */ $$Lambda$ggr$PkYfxw8ivEEE0eH4XgcgYZxEilU(ggu ggu, ggt ggt) {
        this.f$0 = ggu;
        this.f$1 = ggt;
    }

    public final Object apply(Object obj) {
        return this.f$0.b(((a) obj).a).d(10, TimeUnit.SECONDS, Schedulers.a()).c((Function<? super T, ? extends R>) new $$Lambda$ggr$aG2HALEKIBaV5hef8QH8lM29HW8<Object,Object>(this.f$1)).e((Function<? super Throwable, ? extends T>) $$Lambda$ggr$fSGklhn8XH6LXveRE5O5GwQM2VM.INSTANCE);
    }
}
