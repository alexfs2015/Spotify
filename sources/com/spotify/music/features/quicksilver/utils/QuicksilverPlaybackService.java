package com.spotify.music.features.quicksilver.utils;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.List;

public class QuicksilverPlaybackService extends vtp {
    public gsu a;
    public Player b;
    private int c = -1;
    private Disposable d = Disposables.b();

    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent(context, QuicksilverPlaybackService.class);
        intent.putExtra("entity_uri", str);
        context.startService(intent);
    }

    public static void a(Context context) {
        context.stopService(new Intent(context, QuicksilverPlaybackService.class));
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        this.c = i2;
        if (intent != null) {
            String str = "entity_uri";
            if (intent.hasExtra(str)) {
                String stringExtra = intent.getStringExtra(str);
                Optional a2 = this.a.a(stringExtra);
                if (!a2.b()) {
                    a(i2);
                } else {
                    a();
                    this.d = vun.b(((gst) a2.c()).resolve()).a((Consumer<? super T>) new Consumer(i2, stringExtra) {
                        private final /* synthetic */ int f$1;
                        private final /* synthetic */ String f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void accept(Object obj) {
                            QuicksilverPlaybackService.this.a(this.f$1, this.f$2, (PlayerContext) obj);
                        }
                    }, (Consumer<? super Throwable>) new Consumer(stringExtra, i2) {
                        private final /* synthetic */ String f$1;
                        private final /* synthetic */ int f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void accept(Object obj) {
                            QuicksilverPlaybackService.this.a(this.f$1, this.f$2, (Throwable) obj);
                        }
                    });
                }
                return 2;
            }
        }
        a(i2);
        return 2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final int i, final String str, PlayerContext playerContext) {
        this.b.play(playerContext, null, new ActionCallback() {
            public final void onActionSuccess() {
                QuicksilverPlaybackService.this.a(i);
            }

            public final void onActionForbidden(List<String> list) {
                Logger.e("Unable to Play Song: %s ... because of %s", str, list);
                QuicksilverPlaybackService.this.a(i);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i, Throwable th) {
        Logger.e("Unable to Play Song: %s ... because of %s", str, th.getMessage());
        a(i);
    }

    /* access modifiers changed from: private */
    public void a(int i) {
        if (this.c == i) {
            stopSelf();
        }
    }

    private void a() {
        if (!this.d.b()) {
            this.d.bf_();
        }
    }

    public void onDestroy() {
        a();
        super.onDestroy();
    }
}
