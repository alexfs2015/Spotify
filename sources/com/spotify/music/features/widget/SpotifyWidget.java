package com.spotify.music.features.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.MainActivity;
import com.spotify.music.R;
import io.reactivex.Observable;

public class SpotifyWidget extends AppWidgetProvider {
    public qqr a;
    public Observable<Boolean> b;
    public hfx c;
    public vjo d;

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            vtj.a((BroadcastReceiver) this, context);
            String action = intent.getAction();
            if ("android.appwidget.action.APPWIDGET_UPDATE".equals(action)) {
                qqr qqr = this.a;
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget);
                qqr.a(context, remoteViews);
                qqr.b(context, remoteViews);
            } else if ("android.appwidget.action.APPWIDGET_ENABLED".equals(action) && a()) {
                a(context, "com.spotify.mobile.android.service.action.request.update.WIDGET");
            } else if ("com.spotify.mobile.android.ui.widget.PREVIOUS".equals(action)) {
                qqr.b(context, intent);
                a(context, "com.spotify.mobile.android.service.action.player.PREVIOUS");
            } else if ("com.spotify.mobile.android.ui.widget.PAUSE".equals(action)) {
                qqr.b(context, intent);
                a(context, "com.spotify.mobile.android.service.action.player.PAUSE");
            } else if ("com.spotify.mobile.android.ui.widget.RESUME".equals(action)) {
                qqr.b(context, intent);
                a(context, "com.spotify.mobile.android.service.action.player.RESUME");
            } else if ("com.spotify.mobile.android.ui.widget.NEXT".equals(action)) {
                qqr.b(context, intent);
                a(context, "com.spotify.mobile.android.service.action.player.NEXT");
            } else if ("com.spotify.mobile.android.ui.widget.BROKER".equals(action)) {
                if (a()) {
                    Intent intent2 = (Intent) intent.getParcelableExtra("broker.pending.intent");
                    Assertion.a((Object) intent2);
                    try {
                        a(context, intent2);
                        context.startActivity(intent2);
                    } catch (IllegalArgumentException e) {
                        Assertion.a("invalid broker intent", (Throwable) e);
                    }
                } else {
                    context.startActivity(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()));
                }
            }
        }
    }

    private void a(Context context, String str) {
        Intent a2 = this.c.a(context, str);
        vjo.a(a2);
        this.d.a(context, a2, "SpotifyWidget", new Object[0]);
    }

    private boolean a() {
        return ((Boolean) this.b.e(Boolean.FALSE).e()).booleanValue();
    }

    public static PendingIntent a(Context context, int i, Intent intent, int i2) {
        Assertion.a((Object) context);
        Assertion.a((Object) intent);
        a(context, intent);
        Intent intent2 = new Intent("com.spotify.mobile.android.ui.widget.BROKER");
        intent2.setComponent(new ComponentName(context, SpotifyWidget.class));
        intent2.putExtra("broker.pending.intent", intent);
        return PendingIntent.getBroadcast(context, 2, intent2, 134217728);
    }

    private static void a(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        ComponentName componentName = new ComponentName(context, MainActivity.class);
        if (component == null || !component.equals(componentName)) {
            StringBuilder sb = new StringBuilder("Invalid component + ");
            sb.append(component);
            sb.append(", must be ");
            sb.append(componentName);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
