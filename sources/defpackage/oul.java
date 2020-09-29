package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Completable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: oul reason: default package */
final class oul {
    final CompositeDisposable a = new CompositeDisposable();
    final tik b;
    final til c;
    String d;
    Optional<vns> e;
    private final uxh f;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(uzf uzf) {
    }

    public oul(final String str, final uxt uxt, uxh uxh, til til) {
        this.f = uxh;
        this.c = til;
        this.b = new tij($$Lambda$oul$kLV_JHjI8qwRrN_8oYkahPmHu_4.INSTANCE, new tih() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a() {
            }

            public final void a(boolean z) {
                oul.this.a.a(oul.this.f.a(oul.this.d, oul.this.e, z).a((Action) $$Lambda$oul$sVirKh__7sgwUEwRmLb06Euqkg.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oul$IxHPvwPwpBNTOlOmI2jWTYZcEzw.INSTANCE));
            }

            public final void b(boolean z) {
                Completable completable;
                if (z) {
                    completable = uxt.a(str);
                } else {
                    completable = uxt.b(str);
                }
                oul.this.a.a(completable.a((Action) $$Lambda$oul$1$aW9LWwESeNlLy_gvfWnwFe5q0Sw.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oul$1$_4d5pUmstRD2KADNgYL1rQEn9pg.INSTANCE));
            }
        });
    }

    public final void a(boolean z) {
        this.b.a(z);
    }
}
