package defpackage;

import android.media.AudioManager;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: iga reason: default package */
public final class iga {
    private final AudioManager a;
    private final hxf b;
    private Disposable c;

    public iga(hxf hxf, AudioManager audioManager) {
        this.b = hxf;
        this.a = audioManager;
    }

    public final void a(String str, String str2) {
        a(str, str2, null, 0, null);
    }

    public final void a(String str, String str2, String str3) {
        a(str, str2, str3, 0, null);
    }

    public final void a(String str, String str2, String str3, long j, Map<String, String> map) {
        HashMap hashMap;
        if (map == null || map.isEmpty()) {
            hashMap = new HashMap(2);
        } else {
            hashMap = new HashMap(map);
        }
        Map map2 = hashMap;
        map2.put("volume", a());
        map2.put("duration", str3);
        this.c = this.b.a(str, str2, j, map2).a((Action) new $$Lambda$iga$lSxdVhLYSslVcQcCtC_jAI9NbAs(str), (Consumer<? super Throwable>) new $$Lambda$iga$7Lt4yY2uxcKcRyFJ0SSCtccZvHQ<Object>(str));
    }

    private String a() {
        return new DecimalFormat("0.00").format((double) (((float) this.a.getStreamVolume(3)) / ((float) this.a.getStreamMaxVolume(3))));
    }
}
