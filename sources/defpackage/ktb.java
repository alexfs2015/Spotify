package defpackage;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import io.reactivex.Flowable;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: ktb reason: default package */
final class ktb implements ksv {
    private final Flowable<ShortcutInfo> a;
    private final ShortcutManager b;
    private final int c;
    private final SerialDisposable d = new SerialDisposable();

    ktb(Flowable<ShortcutInfo> flowable, ShortcutManager shortcutManager, int i) {
        this.a = flowable;
        this.b = shortcutManager;
        this.c = i;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        this.b.removeAllDynamicShortcuts();
        this.b.setDynamicShortcuts(list);
    }

    public final void a() {
        this.d.a(this.a.b(this.c, 1).a((Consumer<? super T>) new $$Lambda$ktb$uh04nF8pthPOGY8RLgb2cyffR5s<Object>(this), (Consumer<? super Throwable>) $$Lambda$ktb$99VPkn0IB577PNESXR8_1IZ_X_U.INSTANCE));
    }

    public final void b() {
        this.d.bd_();
    }

    public final void c() {
        this.d.bd_();
        this.b.removeAllDynamicShortcuts();
    }
}
