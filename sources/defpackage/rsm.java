package defpackage;

import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Single;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: rsm reason: default package */
public final class rsm implements rsl {
    private final rsq a;
    private final SerialDisposable b = new SerialDisposable();
    private final Set<String> c = Collections.synchronizedSet(new HashSet());

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    public rsm(rsq rsq) {
        this.a = (rsq) fay.a(rsq);
    }

    public final void a() {
        this.c.clear();
        SerialDisposable serialDisposable = this.b;
        Single b2 = this.a.a().c((Function<? super T, ? extends Iterable<? extends U>>) $$Lambda$Bp_jO0cXQc_bAPPWEPTkQnQjt0Y.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$qT_V51sAOPTV6f1FXxlSk0rKxNI.INSTANCE).a((Predicate<? super T>) $$Lambda$rsm$Gm9eszhOS9_l4qK1_9Kt8gwCi1E.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$bl3WbELGSxK4EpGPBaEZXLBa1Yg.INSTANCE).b(16);
        Set<String> set = this.c;
        set.getClass();
        serialDisposable.a(b2.a((Consumer<? super T>) new $$Lambda$3jI_KqYqYSq3d8RdUY4TE5_04Ig<Object>(set), (Consumer<? super Throwable>) $$Lambda$rsm$5aow8vgCS0e_A8D8jwwIxl_4.INSTANCE));
    }

    public final boolean a(String str) {
        fay.a(str);
        return this.c.contains(str);
    }

    public final boolean b() {
        return this.c.isEmpty();
    }

    public final void c() {
        this.b.a(Disposables.a());
        this.c.clear();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(jst jst) {
        return jst.b != LinkType.DUMMY;
    }
}
