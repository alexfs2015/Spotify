package defpackage;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;

/* renamed from: -$$Lambda$udg$ySHYC51X1uTFheMxq3YpvoHTZ5A reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$udg$ySHYC51X1uTFheMxq3YpvoHTZ5A implements CompletableTransformer {
    private final /* synthetic */ uwj f$0;
    private final /* synthetic */ ucy f$1;

    public /* synthetic */ $$Lambda$udg$ySHYC51X1uTFheMxq3YpvoHTZ5A(uwj uwj, ucy ucy) {
        this.f$0 = uwj;
        this.f$1 = ucy;
    }

    public final CompletableSource apply(Completable completable) {
        return udg.a(this.f$0, this.f$1, completable);
    }
}
