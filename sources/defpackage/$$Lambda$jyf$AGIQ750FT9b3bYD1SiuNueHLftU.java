package defpackage;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$jyf$AGIQ750FT9b3bYD1SiuNueHLftU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jyf$AGIQ750FT9b3bYD1SiuNueHLftU implements Cancellable {
    private final /* synthetic */ jyf f$0;
    private final /* synthetic */ OnSharedPreferenceChangeListener f$1;

    public /* synthetic */ $$Lambda$jyf$AGIQ750FT9b3bYD1SiuNueHLftU(jyf jyf, OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f$0 = jyf;
        this.f$1 = onSharedPreferenceChangeListener;
    }

    public final void cancel() {
        this.f$0.a(this.f$1);
    }
}
