package defpackage;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$jvx$czk2SM_9P0lCsn3Qg10U5mnbcOI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jvx$czk2SM_9P0lCsn3Qg10U5mnbcOI implements Cancellable {
    private final /* synthetic */ jvx f$0;
    private final /* synthetic */ OnSharedPreferenceChangeListener f$1;

    public /* synthetic */ $$Lambda$jvx$czk2SM_9P0lCsn3Qg10U5mnbcOI(jvx jvx, OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f$0 = jvx;
        this.f$1 = onSharedPreferenceChangeListener;
    }

    public final void cancel() {
        this.f$0.a(this.f$1);
    }
}
