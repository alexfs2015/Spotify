package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

public class MediaIntentReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            boe b = bnv.a(context).b();
            char c = 65535;
            switch (action.hashCode()) {
                case -1699820260:
                    if (action.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                        c = 4;
                        break;
                    }
                    break;
                case -945151566:
                    if (action.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                        c = 1;
                        break;
                    }
                    break;
                case -945080078:
                    if (action.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                        c = 2;
                        break;
                    }
                    break;
                case -668151673:
                    if (action.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                        c = 5;
                        break;
                    }
                    break;
                case -124479363:
                    if (action.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                        c = 6;
                        break;
                    }
                    break;
                case 235550565:
                    if (action.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1362116196:
                    if (action.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1997055314:
                    if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            String str = "Must be called from the main thread.";
            String str2 = "googlecast-extra_skip_step_ms";
            switch (c) {
                case 0:
                    bod a = b.a();
                    if (a instanceof bnx) {
                        a((bnx) a);
                    }
                    return;
                case 1:
                    bod a2 = b.a();
                    if (a2 instanceof bnx) {
                        boo b2 = b((bnx) a2);
                        if (b2 != null && !b2.l()) {
                            bwx.b(str);
                            if (!b2.n()) {
                                boo.a(17, (String) null);
                            } else {
                                b2.a((g) new bor(b2, b2.a, null));
                            }
                        }
                    }
                    return;
                case 2:
                    bod a3 = b.a();
                    if (a3 instanceof bnx) {
                        boo b3 = b((bnx) a3);
                        if (b3 != null && !b3.l()) {
                            bwx.b(str);
                            if (!b3.n()) {
                                boo.a(17, (String) null);
                            } else {
                                b3.a((g) new boq(b3, b3.a, null));
                            }
                        }
                    }
                    return;
                case 3:
                    long longExtra = intent.getLongExtra(str2, 0);
                    bod a4 = b.a();
                    if (a4 instanceof bnx) {
                        a((bnx) a4, longExtra);
                    }
                    return;
                case 4:
                    long longExtra2 = intent.getLongExtra(str2, 0);
                    bod a5 = b.a();
                    if (a5 instanceof bnx) {
                        a((bnx) a5, -longExtra2);
                    }
                    return;
                case 5:
                    b.a(true);
                    return;
                case 6:
                    b.a(false);
                    return;
                case 7:
                    bod a6 = b.a();
                    if (a6 instanceof bnx) {
                        String str3 = "android.intent.extra.KEY_EVENT";
                        if (intent.hasExtra(str3)) {
                            KeyEvent keyEvent = (KeyEvent) intent.getExtras().get(str3);
                            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                                a((bnx) a6);
                            }
                        }
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private static void a(bnx bnx) {
        boo b = b(bnx);
        if (b != null) {
            b.k();
        }
    }

    private static void a(bnx bnx, long j) {
        if (j != 0) {
            boo b = b(bnx);
            if (b != null && !b.j() && !b.l()) {
                b.a(b.d() + j, 0, null);
            }
        }
    }

    private static boo b(bnx bnx) {
        if (bnx == null || !bnx.f()) {
            return null;
        }
        return bnx.a();
    }
}
