package com.spotify.music.internal.receiver;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.spotify.base.java.logging.Logger;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;

public class MediaButtonReceiver extends BroadcastReceiver {
    public hfx a;
    public vjo b;
    public mc c;
    public rmw d;
    public Scheduler e;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    public void onReceive(Context context, Intent intent) {
        boolean z = true;
        Logger.b("onReceive %s", intent.toUri(0));
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getRepeatCount() <= 0 || keyCode == 85 || keyCode == 79) {
                if (this.a == null || this.b == null || this.c == null) {
                    vtj.a((BroadcastReceiver) this, context);
                }
                Iterator it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if ("com.spotify.mobile.android.service.SpotifyService".equals(((RunningServiceInfo) it.next()).service.getClassName())) {
                        break;
                    }
                }
                if (!z) {
                    $$Lambda$MediaButtonReceiver$QnJqGYgmqRRn4NBiXqLa23XubOM r3 = new Callable(context, keyEvent, keyCode, goAsync()) {
                        private final /* synthetic */ Context f$1;
                        private final /* synthetic */ KeyEvent f$2;
                        private final /* synthetic */ int f$3;
                        private final /* synthetic */ PendingResult f$4;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                        }

                        public final Object call() {
                            return MediaButtonReceiver.this.a(this.f$1, this.f$2, this.f$3, this.f$4);
                        }
                    };
                    Completable.a((Callable<? extends CompletableSource>) r3).b(this.e).c((Action) $$Lambda$MediaButtonReceiver$CN7MFsLJKMsYiPnWvNIN7cJTDHA.INSTANCE);
                    return;
                }
                a(context, keyEvent, keyCode);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(Context context, KeyEvent keyEvent, int i, PendingResult pendingResult) {
        if (!rmw.a(new File(this.d.a.getFilesDir(), "settings/prefs"))) {
            a(context, keyEvent, i);
        } else {
            Logger.b("Ignoring event because user is logged out.", new Object[0]);
        }
        pendingResult.finish();
        return Completable.a();
    }

    private void a(Context context, KeyEvent keyEvent, int i) {
        if (i == 86 || i == 127) {
            rmv.a(this.c, keyEvent);
            return;
        }
        Logger.b("onReceive %d %d", Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getKeyCode()));
        Intent a2 = this.a.a(context, "com.spotify.mobile.android.service.action.media_button");
        a2.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
        try {
            Logger.b("Sending received intent to service", new Object[0]);
            context.startService(a2);
        } catch (IllegalStateException unused) {
            Logger.b("Send failed, using fallback", new Object[0]);
            this.b.a(context, a2, "media-button", "action=", Integer.valueOf(keyEvent.getAction()), "code=", Integer.valueOf(i));
        }
    }
}
