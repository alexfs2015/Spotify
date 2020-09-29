package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import io.reactivex.ObservableEmitter;

/* renamed from: -$$Lambda$jvx$RgL-EWeqW9HyAFZ48rMt8PaizjY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jvx$RgLEWeqW9HyAFZ48rMt8PaizjY implements OnSharedPreferenceChangeListener {
    private final /* synthetic */ jvx f$0;
    private final /* synthetic */ ObservableEmitter f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$jvx$RgLEWeqW9HyAFZ48rMt8PaizjY(jvx jvx, ObservableEmitter observableEmitter, String str) {
        this.f$0 = jvx;
        this.f$1 = observableEmitter;
        this.f$2 = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f$0.a(this.f$1, this.f$2, sharedPreferences, str);
    }
}
