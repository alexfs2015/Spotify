package defpackage;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.MainActivity;
import com.spotify.music.R;
import com.spotify.music.features.widget.SpotifyWidget;

/* renamed from: qqr reason: default package */
public final class qqr {
    private static final int[] a = {R.drawable.widget_pause_disabled, R.drawable.widget_pause_normal};
    private static final int[] b = {R.drawable.widget_play_disabled, R.drawable.widget_play_normal};
    private static final int[] c = {R.string.content_description_pause_button_disabled, R.string.content_description_pause_button};
    private static final int[] d = {R.string.content_description_play_button_disabled, R.string.content_description_play_button};
    private final hfx e;

    public qqr(hfx hfx) {
        this.e = hfx;
    }

    public static void b(Context context, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("paused", true);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget);
        a(remoteViews, booleanExtra);
        a(context, (wuo<AppWidgetManager, int[]>) new $$Lambda$qqr$EfpJ2qPZ6Gy73nXk3vjZS1vhjg<AppWidgetManager,int[]>(remoteViews));
    }

    public void a(Context context, RemoteViews remoteViews) {
        PendingIntent d2 = this.e.d(context);
        remoteViews.setOnClickPendingIntent(R.id.widget_layout, d2);
        remoteViews.setOnClickPendingIntent(R.id.btn_prev_disabled, d2);
        remoteViews.setOnClickPendingIntent(R.id.btn_play_disabled, d2);
        remoteViews.setOnClickPendingIntent(R.id.btn_next_disabled, d2);
    }

    private static void a(RemoteViews remoteViews, String str, String str2) {
        remoteViews.setTextViewText(R.id.title, str);
        remoteViews.setTextViewText(R.id.artist, str2);
    }

    private static void a(RemoteViews remoteViews, boolean z) {
        remoteViews.setViewVisibility(R.id.btn_play_normal, 8);
        remoteViews.setViewVisibility(R.id.btn_prev_normal, 8);
        remoteViews.setViewVisibility(R.id.btn_next_normal, 8);
        remoteViews.setViewVisibility(R.id.btn_play_disabled, 0);
        remoteViews.setViewVisibility(R.id.btn_prev_disabled, 0);
        remoteViews.setViewVisibility(R.id.btn_next_disabled, 0);
        remoteViews.setImageViewResource(R.id.btn_play_disabled, z ? b[0] : a[0]);
        remoteViews.setOnClickPendingIntent(R.id.btn_prev_disabled, null);
        remoteViews.setOnClickPendingIntent(R.id.btn_play_disabled, null);
        remoteViews.setOnClickPendingIntent(R.id.btn_next_disabled, null);
    }

    public static void b(Context context, RemoteViews remoteViews) {
        a(context, (wuo<AppWidgetManager, int[]>) new $$Lambda$qqr$ALiZeM2BheVGJxkBHskpbKMT0fY<AppWidgetManager,int[]>(remoteViews));
    }

    private static void a(Context context, wuo<AppWidgetManager, int[]> wuo) {
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        if (instance != null) {
            try {
                wuo.call(instance, instance.getAppWidgetIds(new ComponentName(context, SpotifyWidget.class)));
            } catch (RuntimeException e2) {
                Logger.e(e2, "failing to update widget", new Object[0]);
            }
        }
    }

    private static void a(Context context, RemoteViews remoteViews, String str, int i, boolean z) {
        Intent intent = new Intent(context, SpotifyWidget.class);
        intent.setAction(str);
        intent.putExtra("paused", z);
        remoteViews.setOnClickPendingIntent(i, PendingIntent.getBroadcast(context, 1, intent, 134217728));
    }

    private static String a(Intent intent, String str) {
        return intent.getStringExtra(str) == null ? "" : intent.getStringExtra(str);
    }

    public final void a(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget);
        boolean booleanExtra = intent2.getBooleanExtra("paused", true);
        if (intent2.getBooleanExtra("logged_out", false)) {
            a(remoteViews, booleanExtra);
            a(context2, remoteViews);
            a(remoteViews, context2.getString(R.string.app_name), "");
        } else {
            String str = PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY;
            if (!intent2.hasExtra(str)) {
                a(context2, remoteViews);
            } else {
                String a2 = a(intent2, "track_name");
                String a3 = a(intent2, "artist_name");
                String stringExtra = intent2.getStringExtra("album_name");
                StringBuilder sb = new StringBuilder(a3);
                if (stringExtra != null && !stringExtra.isEmpty()) {
                    sb.append(" — ");
                    sb.append(stringExtra);
                }
                a(remoteViews, a2, sb.toString());
                String stringExtra2 = intent2.getStringExtra(str);
                a(remoteViews, booleanExtra);
                boolean booleanExtra2 = intent2.getBooleanExtra("is_prev_enabled", false);
                boolean booleanExtra3 = intent2.getBooleanExtra("is_next_enabled", false);
                boolean booleanExtra4 = intent2.getBooleanExtra("is_ad_playing", false);
                boolean booleanExtra5 = intent2.getBooleanExtra("is_ad_skippable", false);
                char isEmpty = true ^ stringExtra2.isEmpty();
                int i = R.id.btn_play_disabled;
                if (isEmpty != 0 && !booleanExtra4) {
                    remoteViews.setViewVisibility(R.id.btn_play_disabled, 8);
                    remoteViews.setViewVisibility(R.id.btn_play_normal, 0);
                    if (booleanExtra2) {
                        remoteViews.setViewVisibility(R.id.btn_prev_disabled, 8);
                        remoteViews.setViewVisibility(R.id.btn_prev_normal, 0);
                    }
                    if (booleanExtra3) {
                        remoteViews.setViewVisibility(R.id.btn_next_disabled, 8);
                        remoteViews.setViewVisibility(R.id.btn_next_normal, 0);
                    }
                    i = R.id.btn_play_normal;
                } else if (booleanExtra4 && booleanExtra5) {
                    remoteViews.setViewVisibility(R.id.btn_next_disabled, 8);
                    remoteViews.setViewVisibility(R.id.btn_next_normal, 0);
                }
                remoteViews.setImageViewResource(i, booleanExtra ? b[isEmpty] : a[isEmpty]);
                remoteViews.setContentDescription(i, context2.getString(booleanExtra ? d[isEmpty] : c[isEmpty]));
                a(context2, remoteViews, "com.spotify.mobile.android.ui.widget.PREVIOUS", R.id.btn_prev_normal, booleanExtra);
                a(context2, remoteViews, booleanExtra ? "com.spotify.mobile.android.ui.widget.RESUME" : "com.spotify.mobile.android.ui.widget.PAUSE", R.id.btn_play_normal, booleanExtra);
                a(context2, remoteViews, "com.spotify.mobile.android.ui.widget.NEXT", R.id.btn_next_normal, booleanExtra);
                Bitmap bitmap = (Bitmap) intent2.getParcelableExtra("cover");
                if (bitmap == null) {
                    remoteViews.setImageViewResource(R.id.coverart, R.drawable.widget_placeholder);
                } else {
                    remoteViews.setImageViewBitmap(R.id.coverart, bitmap);
                }
                Intent intent3 = new Intent(context2, MainActivity.class);
                intent3.setFlags(805306368);
                PendingIntent a4 = SpotifyWidget.a(context2, 2, intent3, 134217728);
                if (!stringExtra2.isEmpty()) {
                    intent3.setAction("com.spotify.mobile.android.ui.action.player.SHOW");
                }
                remoteViews.setOnClickPendingIntent(R.id.coverart, a4);
                remoteViews.setOnClickPendingIntent(R.id.title, a4);
                remoteViews.setOnClickPendingIntent(R.id.artist, a4);
            }
        }
        b(context2, remoteViews);
    }
}
