package com.spotify.mobile.android.playlist.service;

import android.app.IntentService;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import java.util.Collections;
import java.util.concurrent.Callable;

@Deprecated
public class PlaylistService extends IntentService {
    public uxt a;
    public uxh b;

    public PlaylistService() {
        super("PlaylistService");
    }

    public void onCreate() {
        vtj.a((Service) this);
        super.onCreate();
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        Completable completable;
        Assertion.a((Object) intent);
        String str = (String) fay.a(intent.getAction());
        String str2 = (String) fay.a(intent.getStringExtra("playlist_uri"));
        boolean booleanExtra = intent.getBooleanExtra("new_state", false);
        if ("com.spotify.mobile.android.spotlets.playlist.service.action.INSERT".equals(str)) {
            completable = this.a.a(str2).a((CompletableSource) Completable.a((Callable<? extends CompletableSource>) new Callable(booleanExtra, this.b, str2) {
                private final /* synthetic */ boolean f$0;
                private final /* synthetic */ uxh f$1;
                private final /* synthetic */ String f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final Object call() {
                    return PlaylistService.a(this.f$0, this.f$1, this.f$2);
                }
            }));
        } else if ("com.spotify.mobile.android.spotlets.playlist.service.action.REMOVE".equals(str)) {
            completable = this.a.b(str2);
        } else if ("com.spotify.mobile.android.spotlets.playlist.service.action.COLLABORATIVE".equals(str)) {
            completable = this.b.a(str2, booleanExtra).a((CompletableSource) Completable.a((Callable<? extends CompletableSource>) new Callable(booleanExtra, str2) {
                private final /* synthetic */ boolean f$1;
                private final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final Object call() {
                    return PlaylistService.this.a(this.f$1, this.f$2);
                }
            }));
        } else if ("com.spotify.mobile.android.spotlets.playlist.service.action.PUBLISH".equals(str)) {
            completable = this.a.a(str2, booleanExtra);
        } else if ("com.spotify.mobile.android.spotlets.playlist.service.action.REMOVE_ITEM".equals(str)) {
            completable = this.b.b(str2, Collections.singletonList(intent.getStringExtra("row_id")));
        } else {
            StringBuilder sb = new StringBuilder("Unsupported action ");
            sb.append(str);
            sb.append(" in PlaylistService.");
            Assertion.a(sb.toString());
            return;
        }
        try {
            completable.c();
        } catch (Throwable th) {
            Logger.e(th, "Failed to apply operation '%s' for playlist '%s'", str, str2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(boolean z, String str) {
        if (z) {
            return this.a.a(str, false);
        }
        return Completable.a();
    }

    @Deprecated
    public static void a(Context context, String str) {
        a(context, "com.spotify.mobile.android.spotlets.playlist.service.action.INSERT", str, null);
    }

    @Deprecated
    public static void a(Context context, String str, boolean z) {
        a(context, "com.spotify.mobile.android.spotlets.playlist.service.action.INSERT", str, Boolean.TRUE);
    }

    @Deprecated
    public static void b(Context context, String str) {
        a(context, "com.spotify.mobile.android.spotlets.playlist.service.action.REMOVE", str, null);
    }

    @Deprecated
    public static void b(Context context, String str, boolean z) {
        a(context, "com.spotify.mobile.android.spotlets.playlist.service.action.COLLABORATIVE", str, Boolean.valueOf(z));
    }

    @Deprecated
    public static void c(Context context, String str, boolean z) {
        a(context, "com.spotify.mobile.android.spotlets.playlist.service.action.PUBLISH", str, Boolean.valueOf(z));
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        Intent intent = new Intent(context, PlaylistService.class);
        intent.setAction("com.spotify.mobile.android.spotlets.playlist.service.action.REMOVE_ITEM");
        intent.putExtra("playlist_uri", (String) fay.a(str));
        intent.putExtra("row_id", (String) fay.a(str2));
        context.startService(intent);
    }

    private static void a(Context context, String str, String str2, Boolean bool) {
        Intent intent = new Intent(context, PlaylistService.class);
        intent.setAction((String) fay.a(str));
        intent.putExtra("playlist_uri", (String) fay.a(str2));
        if (bool != null) {
            intent.putExtra("new_state", bool);
        }
        context.startService(intent);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(boolean z, uxh uxh, String str) {
        if (!z) {
            return Completable.a();
        }
        return uxh.a(str, Optional.e(), true);
    }
}
