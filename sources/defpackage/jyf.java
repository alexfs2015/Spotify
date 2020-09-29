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

/* renamed from: jyf reason: default package */
public final class jyf<S, T> implements ObservableOnSubscribe<Update<T>> {
    private final SpSharedPreferences<S> a;
    private final b<S, T> b;
    private final BiFunction<SpSharedPreferences<S>, b<S, T>, T> c;

    public jyf(SpSharedPreferences<S> spSharedPreferences, b<S, T> bVar, BiFunction<SpSharedPreferences<S>, b<S, T>, T> biFunction) {
        this.a = (SpSharedPreferences) fbp.a(spSharedPreferences);
        this.b = (b) fbp.a(bVar);
        this.c = (BiFunction) fbp.a(biFunction);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
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

    public final void subscribe(ObservableEmitter<Update<T>> observableEmitter) {
        $$Lambda$jyf$5utQK8bBd5Q7HeHZHyzPFlvuLDs r1 = new $$Lambda$jyf$5utQK8bBd5Q7HeHZHyzPFlvuLDs(this, observableEmitter, this.b.a);
        this.a.a.registerOnSharedPreferenceChangeListener(r1);
        observableEmitter.a((Cancellable) new $$Lambda$jyf$AGIQ750FT9b3bYD1SiuNueHLftU(this, r1));
    }
}
