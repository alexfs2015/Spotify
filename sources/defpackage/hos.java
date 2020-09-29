package defpackage;

import android.content.Intent;
import android.view.InputDevice;
import android.view.KeyEvent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;
import java.util.List;

/* renamed from: hos reason: default package */
public final class hos implements SpotifyServiceIntentProcessor {
    private final who<hjb> a;
    private final jkm b;
    private final jkp c;

    public hos(who<hjb> who, jkm jkm, jkp jkp) {
        this.a = who;
        this.b = jkm;
        this.c = jkp;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(List list) {
    }

    public final Result a(boolean z, Intent intent) {
        return a(z, intent, $$Lambda$hos$kiWrvUA6r72tWsLhkNmAjnuIg.INSTANCE);
    }

    public final Result a(boolean z, Intent intent, a aVar) {
        fbp.a(intent.getAction() != null && intent.getAction().equals("com.spotify.mobile.android.service.action.media_button"));
        if (!z) {
            return Result.NOT_PROCESSED;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            jjd jjd = this.b.e;
            jkf jkf = this.c.b;
            InputDevice device = keyEvent != null ? keyEvent.getDevice() : null;
            if (device != null) {
                if ("AVRCP".equals(device.getName()) && jjd.d != null && jjd.d.c) {
                    jjg jjg = jjd.d;
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 126) {
                        if (keyCode != 127) {
                            switch (keyCode) {
                                case 85:
                                    if (!jkf.g()) {
                                        if (jkf.e) {
                                            jjg.b.a(jjg.a, 0);
                                            break;
                                        }
                                    } else {
                                        jjg.b.a(jjg.a, 1);
                                        break;
                                    }
                                    break;
                                case 86:
                                    break;
                                case 87:
                                    jjg.b.b(jjg.a, 1);
                                    break;
                                case 88:
                                    jjg.b.b(jjg.a, -1);
                                    break;
                            }
                        }
                        jjg.b.a(jjg.a, 0);
                    } else {
                        jjg.b.a(jjg.a, 1);
                    }
                }
            }
            hjb hjb = (hjb) this.a.get();
            aVar.getClass();
            hjb.a(keyEvent, new $$Lambda$gxKDgkbpGuz5yOjyLkdW_iRO8pE(aVar));
        }
        return Result.PROCESSED;
    }
}
