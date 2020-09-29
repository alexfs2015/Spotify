package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import io.reactivex.ObservableEmitter;

/* renamed from: -$$Lambda$jyf$5utQK8bBd5Q7HeHZHyzPFlvuLDs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jyf$5utQK8bBd5Q7HeHZHyzPFlvuLDs implements OnSharedPreferenceChangeListener {
    private final /* synthetic */ jyf f$0;
    private final /* synthetic */ ObservableEmitter f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$jyf$5utQK8bBd5Q7HeHZHyzPFlvuLDs(jyf jyf, ObservableEmitter observableEmitter, String str) {
        this.f$0 = jyf;
        this.f$1 = observableEmitter;
        this.f$2 = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f$0.a(this.f$1, this.f$2, sharedPreferences, str);
    }
}
