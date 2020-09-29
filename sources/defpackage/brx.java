package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: brx reason: default package */
public final class brx extends bry {
    public static final int a = bry.b;
    private static final Object c = new Object();
    private static final brx d = new brx();

    /* renamed from: brx$a */
    class a extends ege {
        private final Context a;

        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            if (message.what != 1) {
                int i = message.what;
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                return;
            }
            int a2 = brx.this.a(this.a);
            if (brx.this.a(a2)) {
                brx.this.a(this.a, a2);
            }
        }
    }

    public static brx a() {
        return d;
    }

    brx() {
    }

    public final boolean b(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final void a(Context context, int i) {
        a(context, i, a(context, i, 0, "n"));
    }

    public static Dialog a(Activity activity, OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(bwi.c(activity, 18));
        builder.setPositiveButton("", null);
        AlertDialog create = builder.create();
        a(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final bur a(Context context, bus bus) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        bur bur = new bur(bus);
        context.registerReceiver(bur, intentFilter);
        bur.a = context;
        if (brz.isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return bur;
        }
        bus.a();
        bur.a();
        return null;
    }

    public final exi<Void> a(bsg<?> bsg, bsg<?>... bsgArr) {
        bwx.a(bsg, (Object) "Requested API must not be null.");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(bsg);
        arrayList.addAll(Arrays.asList(bsgArr));
        return bss.a().a((Iterable<? extends bsg<?>>) arrayList).a((exd<TResult, TContinuationResult>) new cac<TResult,TContinuationResult>());
    }

    private final String c() {
        synchronized (c) {
        }
        return null;
    }

    public final int a(Context context) {
        return super.a(context);
    }

    public final int b(Context context, int i) {
        return super.b(context, i);
    }

    public final boolean a(int i) {
        return super.a(i);
    }

    public final Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    public final PendingIntent a(Context context, int i, int i2) {
        return super.a(context, i, i2);
    }

    public final String b(int i) {
        return super.b(i);
    }

    public static Dialog a(Context context, int i, bwj bwj, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(bwi.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e = bwi.e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, bwj);
        }
        String a2 = bwi.a(context, i);
        if (a2 != null) {
            builder.setTitle(a2);
        }
        return builder.create();
    }

    public static void a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        if (activity instanceof ka) {
            bsb.a(dialog, onCancelListener).a(((ka) activity).i(), str);
            return;
        }
        brv.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    private final void a(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            b(context);
        } else if (pendingIntent != null) {
            String b = bwi.b(context, i);
            String d2 = bwi.d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            c cVar = new c(context);
            cVar.o = true;
            c a2 = cVar.b(true).a((CharSequence) b).a((e) new b().a((CharSequence) d2));
            if (bzk.a(context)) {
                bwx.a(bzo.f());
                a2.a(context.getApplicationInfo().icon).h = 2;
                if (bzk.b(context)) {
                    a2.a((int) R.drawable.common_full_open_on_phone, (CharSequence) resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    a2.f = pendingIntent;
                }
            } else {
                c a3 = a2.a(17301642).d(resources.getString(R.string.common_google_play_services_notification_ticker)).a(System.currentTimeMillis());
                a3.f = pendingIntent;
                a3.b((CharSequence) d2);
            }
            if (bzo.i()) {
                bwx.a(bzo.i());
                String c2 = c();
                if (c2 == null) {
                    c2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(c2);
                    String a4 = bwi.a(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(c2, a4, 4));
                    } else if (!a4.equals(notificationChannel.getName())) {
                        notificationChannel.setName(a4);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                a2.t = c2;
            }
            Notification b2 = a2.b();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                brz.sCanceledAvailabilityNotification.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b2);
        }
    }

    public final void b(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000);
    }

    public final Dialog a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return a((Context) activity, i, bwj.a(activity, super.a((Context) activity, i, "d"), i2), onCancelListener);
    }

    public final boolean a(Activity activity, bsv bsv, int i, OnCancelListener onCancelListener) {
        Dialog a2 = a((Context) activity, i, bwj.a(bsv, super.a((Context) activity, i, "d"), 2), onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent pendingIntent;
        if (connectionResult.a()) {
            pendingIntent = connectionResult.c;
        } else {
            pendingIntent = super.a(context, connectionResult.b, 0);
        }
        if (pendingIntent == null) {
            return false;
        }
        a(context, connectionResult.b, GoogleApiActivity.a(context, pendingIntent, i));
        return true;
    }
}
