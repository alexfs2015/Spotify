package defpackage;

import android.content.Intent;
import android.view.InputDevice;
import android.view.KeyEvent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;
import java.util.List;

/* renamed from: hma reason: default package */
public final class hma implements SpotifyServiceIntentProcessor {
    private final vti<hgf> a;
    private final jhw b;
    private final jhz c;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(List list) {
    }

    public hma(vti<hgf> vti, jhw jhw, jhz jhz) {
        this.a = vti;
        this.b = jhw;
        this.c = jhz;
    }

    public final Result a(boolean z, Intent intent, a aVar) {
        fay.a(intent.getAction() != null && intent.getAction().equals("com.spotify.mobile.android.service.action.media_button"));
        if (!z) {
            return Result.NOT_PROCESSED;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            jgo jgo = this.b.e;
            jhp jhp = this.c.b;
            InputDevice device = keyEvent != null ? keyEvent.getDevice() : null;
            if (device != null) {
                if ("AVRCP".equals(device.getName()) && jgo.d != null && jgo.d.c) {
                    jgr jgr = jgo.d;
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 126) {
                        if (keyCode != 127) {
                            switch (keyCode) {
                                case 85:
                                    if (!jhp.g()) {
                                        if (jhp.e) {
                                            jgr.b.a(jgr.a, 0);
                                            break;
                                        }
                                    } else {
                                        jgr.b.a(jgr.a, 1);
                                        break;
                                    }
                                    break;
                                case 86:
                                    break;
                                case 87:
                                    jgr.b.b(jgr.a, 1);
                                    break;
                                case 88:
                                    jgr.b.b(jgr.a, -1);
                                    break;
                            }
                        }
                        jgr.b.a(jgr.a, 0);
                    } else {
                        jgr.b.a(jgr.a, 1);
                    }
                }
            }
            hgf hgf = (hgf) this.a.get();
            aVar.getClass();
            hgf.a(keyEvent, new $$Lambda$BoME_VwK8yY8axStp_uFBN2_npw(aVar));
        }
        return Result.PROCESSED;
    }

    public final Result a(boolean z, Intent intent) {
        return a(z, intent, $$Lambda$hma$x_ZvtdOUeA8_No55Fltl0ABbSbk.INSTANCE);
    }
}
