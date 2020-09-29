package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: hnc reason: default package */
public final class hnc extends hna {
    private final hou a;
    private final String b;
    private final Set<rqi> c = new HashSet();
    private wuk d;

    public hnc(hou hou, String str, rqi rqi) {
        this.a = (hou) fay.a(hou);
        this.b = (String) fay.a(str);
        this.c.add(fay.a(rqi));
    }

    /* access modifiers changed from: protected */
    public final void a(String str, AudioStream audioStream) {
        for (rqi rqi : this.c) {
            hou hou = this.a;
            String str2 = this.b;
            hou.a.a(hou.a(str2, rqi, "end_stream", juq.a(str), audioStream.name().toLowerCase(Locale.US)));
            Logger.a("LogHelper.logExternalAccessoryEndStream sessionId: %s playbackId: %s", str2, str);
        }
    }

    public final void a(wud<PlayerState> wud) {
        b();
        this.d = wud.a((wun<? super T>) new $$Lambda$oe9QMAPK7sd4VqVKwY3it5ktYoE<Object>(this), (wun<Throwable>) $$Lambda$hnc$zZ1nesa_USBQ0OiptrvCWPfRNI.INSTANCE);
    }

    public final void b() {
        wuk wuk = this.d;
        if (wuk != null && !wuk.isUnsubscribed()) {
            this.d.unsubscribe();
            this.d = null;
        }
    }
}
