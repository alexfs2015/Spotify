package defpackage;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qfu$_uwhW1UT9040KKO6uLnFT5yGO4o reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qfu$_uwhW1UT9040KKO6uLnFT5yGO4o implements Consumer {
    private final /* synthetic */ qfu f$0;
    private final /* synthetic */ boolean f$1;

    public /* synthetic */ $$Lambda$qfu$_uwhW1UT9040KKO6uLnFT5yGO4o(qfu qfu, boolean z) {
        this.f$0 = qfu;
        this.f$1 = z;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (Response) obj);
    }
}
