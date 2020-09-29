package defpackage;

import com.google.common.base.Optional;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: pbw reason: default package */
final class pbw {
    final CompositeDisposable a = new CompositeDisposable();
    final ttc b;
    final ttd c;
    String d;
    Optional<way> e;
    private final vjj f;

    public pbw(final String str, final vjv vjv, vjj vjj, ttd ttd) {
        this.f = vjj;
        this.c = ttd;
        this.b = new ttb($$Lambda$pbw$fAOs4qWRMpWNOzqHUHfOUhx5gW0.INSTANCE, new tsz() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a() {
            }

            public final void a(boolean z) {
                pbw.this.a.a(pbw.this.f.a(pbw.this.d, pbw.this.e, z).a((Action) $$Lambda$pbw$DeqOZvtAP282PPKXARYGVlTz5QM.INSTANCE, (Consumer<? super Throwable>) $$Lambda$pbw$HSUaPvP87MW7uSa1bVtw3wc8aa8.INSTANCE));
            }

            public final void b(boolean z) {
                pbw.this.a.a((z ? vjv.a(str) : vjv.b(str)).a((Action) $$Lambda$pbw$1$A3Jng9eHHDz0VDp9aWgF1kM0SBs.INSTANCE, (Consumer<? super Throwable>) $$Lambda$pbw$1$utdbr9Z5y5sxYEXxytztymaVYmk.INSTANCE));
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(vli vli) {
    }

    public final void a(boolean z) {
        this.b.a(z);
    }
}
