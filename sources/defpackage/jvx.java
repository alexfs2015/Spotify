package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.Update;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.Update.Type;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Cancellable;

/* renamed from: jvx reason: default package */
public final class jvx<S, T> implements ObservableOnSubscribe<Update<T>> {
    private final SpSharedPreferences<S> a;
    private final b<S, T> b;
    private final BiFunction<SpSharedPreferences<S>, b<S, T>, T> c;

    public jvx(SpSharedPreferences<S> spSharedPreferences, b<S, T> bVar, BiFunction<SpSharedPreferences<S>, b<S, T>, T> biFunction) {
        this.a = (SpSharedPreferences) fay.a(spSharedPreferences);
        this.b = (b) fay.a(bVar);
        this.c = (BiFunction) fay.a(biFunction);
    }

    public final void subscribe(ObservableEmitter<Update<T>> observableEmitter) {
        $$Lambda$jvx$RgLEWeqW9HyAFZ48rMt8PaizjY r1 = new $$Lambda$jvx$RgLEWeqW9HyAFZ48rMt8PaizjY(this, observableEmitter, this.b.a);
        this.a.a.registerOnSharedPreferenceChangeListener(r1);
        observableEmitter.a((Cancellable) new $$Lambda$jvx$czk2SM_9P0lCsn3Qg10U5mnbcOI(this, r1));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter, String str, SharedPreferences sharedPreferences, String str2) {
        if (observableEmitter.b() || !str.equals(str2)) {
            return;
        }
        if (!sharedPreferences.contains(str2)) {
            observableEmitter.a(new Update(Type.NOT_IN_PREFS, null));
            return;
        }
        try {
            Object apply = this.c.apply(this.a, this.b);
            observableEmitter.a(new Update(apply == null ? Type.SET_TO_NULL : Type.CHANGED, apply));
        } catch (Exception e) {
            observableEmitter.a((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
