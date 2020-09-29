package defpackage;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import io.reactivex.Flowable;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: kps reason: default package */
final class kps implements kpm {
    private final Flowable<ShortcutInfo> a;
    private final ShortcutManager b;
    private final int c;
    private final SerialDisposable d = new SerialDisposable();

    kps(Flowable<ShortcutInfo> flowable, ShortcutManager shortcutManager, int i) {
        this.a = flowable;
        this.b = shortcutManager;
        this.c = i;
    }

    public final void a() {
        this.d.a(this.a.b(this.c, 1).a((Consumer<? super T>) new $$Lambda$kps$PPq41LBlF6N4NTyGus8QmCy2rvM<Object>(this), (Consumer<? super Throwable>) $$Lambda$kps$JW0NQAGOmm90lgDqUEokKkbD0vA.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        this.b.removeAllDynamicShortcuts();
        this.b.setDynamicShortcuts(list);
    }

    public final void b() {
        this.d.bf_();
    }

    public final void c() {
        this.d.bf_();
        this.b.removeAllDynamicShortcuts();
    }
}
