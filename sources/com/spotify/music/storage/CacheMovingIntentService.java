package com.spotify.music.storage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.spotify.android.storage.MovingOrchestrator;
import com.spotify.android.storage.MovingOrchestrator.SyncingResult;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.io.File;

public class CacheMovingIntentService extends vto {
    public MovingOrchestrator a;
    public unt b;
    public hfx c;
    public vjs d;

    static class a implements gaj {
        boolean b;
        private final c c;
        private final long d;
        private final NotificationManager e;
        private long f;
        private int g;

        public a(c cVar, long j, NotificationManager notificationManager) {
            this.c = cVar;
            this.d = j;
            this.e = notificationManager;
        }

        public final void a(File file) {
            this.f += (long) ((int) file.length());
            int i = (int) ((this.f * 100) / this.d);
            if (!this.b && i > this.g) {
                this.c.a(100, i, false);
                this.e.notify(R.id.notification_cache_move, this.c.b());
                this.g = i;
            }
        }
    }

    public static void a(Context context, String str, long j) {
        Intent intent = new Intent("move", null, context, CacheMovingIntentService.class);
        intent.putExtra("volume", str);
        intent.putExtra("estimated-size", j);
        context.startService(intent);
    }

    public CacheMovingIntentService() {
        super("CacheMovingIntentService.CACHE_MOVING_INTENT_SERVICE");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        SyncingResult a2;
        if ("move".equals(intent.getAction())) {
            File file = new File(intent.getStringExtra("volume"), this.b.f.d());
            if (file.exists() || file.mkdirs()) {
                String string = getString(R.string.cache_migration_notification_text);
                c a3 = new c(this, "spotify_updates_channel").a((CharSequence) getString(R.string.cache_migration_notification_title)).b((CharSequence) string).d(getString(R.string.cache_migration_notification_title)).a((e) new b().a((CharSequence) string)).a((int) R.drawable.icn_notification);
                a3.i = false;
                c a4 = a3.a(100, 0, false);
                this.d.a(R.id.notification_cache_move, a4.b(), true);
                int i = 50;
                a aVar = new a(a4, intent.getLongExtra("estimated-size", 0), (NotificationManager) getSystemService("notification"));
                do {
                    a2 = this.a.a(file.getAbsolutePath(), aVar);
                    if (a2 != SyncingResult.SOMETHING_SYNCED) {
                        break;
                    }
                    aVar.b = true;
                    i--;
                } while (i > 0);
                this.d.a((int) R.id.notification_cache_move);
                stopForeground(true);
                if (a2 == SyncingResult.AN_ERROR_WHILE_SYNCING) {
                    a();
                } else {
                    Intent c2 = this.c.c(this);
                    c2.addFlags(268468224);
                    c2.addCategory("android.intent.category.DEFAULT");
                    startActivity(c2);
                    Process.killProcess(Process.myPid());
                }
            } else {
                a();
            }
        } else {
            Assertion.a();
        }
    }

    private void a() {
        String string = getString(R.string.cache_migration_failed_subtitle);
        c a2 = new c(this, "spotify_updates_channel").a((CharSequence) getString(R.string.cache_migration_failed)).b((CharSequence) string).d(getString(R.string.cache_migration_failed)).a((e) new b().a((CharSequence) string)).a((int) R.drawable.icn_notification);
        a2.i = false;
        this.d.a(42, a2.b(), false);
        this.a.c();
    }
}
