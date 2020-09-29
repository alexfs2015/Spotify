package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: sbt reason: default package */
public final class sbt implements sbs {
    private static b<Object, Set<String>> a = b.a("playlists_with_stories_key");
    private final sbx b;
    private final SerialDisposable c = new SerialDisposable();
    private final Set<String> d = Collections.synchronizedSet(new HashSet());
    private final SpSharedPreferences<Object> e;

    public sbt(sbx sbx, SpSharedPreferences<Object> spSharedPreferences) {
        this.b = (sbx) fbp.a(sbx);
        this.e = (SpSharedPreferences) fbp.a(spSharedPreferences);
        this.d.addAll(this.e.a(a, (Set<String>) new HashSet<String>(0)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        this.d.clear();
        this.d.addAll(list);
        this.e.a().a(a, (Set<String>) new HashSet<String>(list)).b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(jva jva) {
        return jva.b != LinkType.DUMMY;
    }

    public final void a() {
        this.c.a(this.b.a().c((Function<? super T, ? extends Iterable<? extends U>>) $$Lambda$Bp_jO0cXQc_bAPPWEPTkQnQjt0Y.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$flvVv339C4Bx_MHrQrtI7GLpGA.INSTANCE).a((Predicate<? super T>) $$Lambda$sbt$s13iBuOMNqcIdC97RebkMeta8A.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$pHr45_S4UbePTNGDHme5h_TSMVk.INSTANCE).b(16).a((Consumer<? super T>) new $$Lambda$sbt$oWD0bRNhzf2qW3NAtAJ0IrfztaA<Object>(this), (Consumer<? super Throwable>) $$Lambda$sbt$Orfob_3H9lwtW3Y_npKNz0MP20.INSTANCE));
    }

    public final boolean a(String str) {
        fbp.a(str);
        return this.d.contains(str);
    }

    public final void b() {
        this.c.a(Disposables.a());
    }
}
