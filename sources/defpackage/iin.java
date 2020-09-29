package defpackage;

import android.media.AudioManager;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: iin reason: default package */
public final class iin {
    private final AudioManager a;
    private final hzr b;
    private Disposable c;

    public iin(hzr hzr, AudioManager audioManager) {
        this.b = hzr;
        this.a = audioManager;
    }

    private String a() {
        return new DecimalFormat("0.00").format((double) (((float) this.a.getStreamVolume(3)) / ((float) this.a.getStreamMaxVolume(3))));
    }

    public final void a(String str, String str2) {
        a(str, str2, null, 0, null);
    }

    public final void a(String str, String str2, String str3) {
        a(str, str2, str3, 0, null);
    }

    public final void a(String str, String str2, String str3, long j, Map<String, String> map) {
        Map hashMap = (map == null || map.isEmpty()) ? new HashMap(2) : new HashMap(map);
        hashMap.put("volume", a());
        hashMap.put("duration", str3);
        this.c = this.b.a(str, str2, j, hashMap).a((Action) new $$Lambda$iin$Y3rndyE0Bm5oZRK3EtYolpsn5y4(str), (Consumer<? super Throwable>) new $$Lambda$iin$_Wa7BKoInSO239AlshveIGXYQKI<Object>(str));
    }
}
