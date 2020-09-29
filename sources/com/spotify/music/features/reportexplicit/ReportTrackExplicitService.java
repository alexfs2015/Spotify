package com.spotify.music.features.reportexplicit;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.util.concurrent.TimeUnit;

public class ReportTrackExplicitService extends vto {
    public pve a;
    public jsz b;
    private final Handler c = new Handler();

    public ReportTrackExplicitService() {
        super("Spotify Helper");
    }

    private void a(wuh<Boolean> wuh) {
        try {
            if (((Boolean) xaa.a(wuh.a(500, TimeUnit.MILLISECONDS, wxt.a(Boolean.FALSE))).a()).booleanValue()) {
                b();
            } else {
                a();
            }
        } catch (Exception e) {
            a();
            Logger.e(e, "Error reporting track as explicit", new Object[0]);
        }
    }

    private void a() {
        a(SpotifyIconV2.X, R.string.report_explicit_error);
    }

    private void b() {
        a(SpotifyIconV2.CHECK, R.string.report_explicit_success);
    }

    private void a(SpotifyIconV2 spotifyIconV2, int i) {
        this.c.post(new Runnable(spotifyIconV2, i) {
            private final /* synthetic */ SpotifyIconV2 f$1;
            private final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                ReportTrackExplicitService.this.b(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(SpotifyIconV2 spotifyIconV2, int i) {
        this.b.a(spotifyIconV2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            String str = "TRACK_URI";
            if (intent.hasExtra(str)) {
                String str2 = "IS_EXPLICIT";
                if (intent.hasExtra(str2)) {
                    String stringExtra = intent.getStringExtra(str);
                    String stringExtra2 = intent.getStringExtra("CONTEXT_URI");
                    if (intent.getBooleanExtra(str2, false)) {
                        a(this.a.b(stringExtra, stringExtra2));
                        return;
                    }
                    a(this.a.a(stringExtra, stringExtra2));
                }
            }
        }
    }

    public static Intent a(Context context, String str, String str2, boolean z) {
        Intent putExtra = new Intent(context, ReportTrackExplicitService.class).putExtra("TRACK_URI", str).putExtra("IS_EXPLICIT", z);
        if (str2 != null) {
            putExtra.putExtra("CONTEXT_URI", str2);
        }
        return putExtra;
    }
}
