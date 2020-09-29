package defpackage;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.b;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: mm reason: default package */
public final class mm extends BroadcastReceiver {

    /* renamed from: mm$a */
    static class a extends b {
        MediaBrowserCompat c;
        private final Context d;
        private final Intent e;
        private final PendingResult f;

        a(Context context, Intent intent, PendingResult pendingResult) {
            this.d = context;
            this.e = intent;
            this.f = pendingResult;
        }

        public final void a() {
            try {
                MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.d, this.c.b.e());
                KeyEvent keyEvent = (KeyEvent) this.e.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    mediaControllerCompat.a.a(keyEvent);
                    d();
                    return;
                }
                throw new IllegalArgumentException("KeyEvent may not be null");
            } catch (RemoteException e2) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e2);
            }
        }

        public final void b() {
            d();
        }

        public final void c() {
            d();
        }

        private void d() {
            this.c.a();
            this.f.finish();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String str = "android.intent.action.MEDIA_BUTTON";
            if (str.equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
                ComponentName a2 = a(context, str);
                if (a2 != null) {
                    intent.setComponent(a2);
                    if (VERSION.SDK_INT >= 26) {
                        context.startForegroundService(intent);
                        return;
                    } else {
                        context.startService(intent);
                        return;
                    }
                } else {
                    ComponentName a3 = a(context, "android.media.browse.MediaBrowserService");
                    if (a3 != null) {
                        PendingResult goAsync = goAsync();
                        Context applicationContext = context.getApplicationContext();
                        a aVar = new a(applicationContext, intent, goAsync);
                        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a3, aVar, null);
                        aVar.c = mediaBrowserCompat;
                        mediaBrowserCompat.b.c();
                        return;
                    }
                    throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
                }
            }
        }
        new StringBuilder("Ignore unsupported intent: ").append(intent);
    }

    public static ComponentName a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryBroadcastReceivers.get(0);
            return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        queryBroadcastReceivers.size();
        return null;
    }

    private static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder("Expected 1 service that handles ");
            sb.append(str);
            sb.append(", found ");
            sb.append(queryIntentServices.size());
            throw new IllegalStateException(sb.toString());
        }
    }
}
