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

/* renamed from: bso reason: default package */
public final class bso extends bsp {
    public static final int a = bsp.b;
    private static final Object c = new Object();
    private static final bso d = new bso();

    /* renamed from: bso$a */
    class a extends egv {
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
            int a2 = bso.this.a(this.a);
            if (bso.this.a(a2)) {
                bso.this.a(this.a, a2);
            }
        }
    }

    bso() {
    }

    public static Dialog a(Activity activity, OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(bwz.c(activity, 18));
        builder.setPositiveButton("", null);
        AlertDialog create = builder.create();
        a(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public static Dialog a(Context context, int i, bxa bxa, OnCancelListener onCancelListener) {
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
        builder.setMessage(bwz.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e = bwz.e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, bxa);
        }
        String a2 = bwz.a(context, i);
        if (a2 != null) {
            builder.setTitle(a2);
        }
        return builder.create();
    }

    public static bso a() {
        return d;
    }

    public static void a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        if (activity instanceof kf) {
            bss.a(dialog, onCancelListener).a(((kf) activity).i(), str);
            return;
        }
        bsm.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    private final void a(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            b(context);
        } else if (pendingIntent != null) {
            String b = bwz.b(context, i);
            String d2 = bwz.d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            c cVar = new c(context);
            cVar.o = true;
            c a2 = cVar.b(true).a((CharSequence) b).a((e) new b().a((CharSequence) d2));
            if (cab.a(context)) {
                bxo.a(caf.f());
                a2.a(context.getApplicationInfo().icon).h = 2;
                if (cab.b(context)) {
                    a2.a((int) R.drawable.common_full_open_on_phone, (CharSequence) resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    a2.f = pendingIntent;
                }
            } else {
                c a3 = a2.a(17301642).d(resources.getString(R.string.common_google_play_services_notification_ticker)).a(System.currentTimeMillis());
                a3.f = pendingIntent;
                a3.b((CharSequence) d2);
            }
            if (caf.i()) {
                bxo.a(caf.i());
                String c2 = c();
                if (c2 == null) {
                    c2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(c2);
                    String a4 = bwz.a(context);
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
                bsq.sCanceledAvailabilityNotification.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b2);
        }
    }

    private final String c() {
        synchronized (c) {
        }
        return null;
    }

    public final int a(Context context) {
        return super.a(context);
    }

    public final Dialog a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return a((Context) activity, i, bxa.a(activity, super.a((Context) activity, i, "d"), i2), onCancelListener);
    }

    public final PendingIntent a(Context context, int i, int i2) {
        return super.a(context, i, i2);
    }

    public final Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    public final bvi a(Context context, bvj bvj) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        bvi bvi = new bvi(bvj);
        context.registerReceiver(bvi, intentFilter);
        bvi.a = context;
        if (bsq.isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return bvi;
        }
        bvj.a();
        bvi.a();
        return null;
    }

    public final exz<Void> a(bsx<?> bsx, bsx<?>... bsxArr) {
        bxo.a(bsx, (Object) "Requested API must not be null.");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(bsx);
        arrayList.addAll(Arrays.asList(bsxArr));
        return btj.a().a((Iterable<? extends bsx<?>>) arrayList).a((exu<TResult, TContinuationResult>) new cat<TResult,TContinuationResult>());
    }

    public final void a(Context context, int i) {
        a(context, i, a(context, i, 0, "n"));
    }

    public final boolean a(int i) {
        return super.a(i);
    }

    public final boolean a(Activity activity, btm btm, int i, OnCancelListener onCancelListener) {
        Dialog a2 = a((Context) activity, i, bxa.a(btm, super.a((Context) activity, i, "d"), 2), onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a2 = connectionResult.a() ? connectionResult.c : super.a(context, connectionResult.b, 0);
        if (a2 == null) {
            return false;
        }
        a(context, connectionResult.b, GoogleApiActivity.a(context, a2, i));
        return true;
    }

    public final int b(Context context, int i) {
        return super.b(context, i);
    }

    public final String b(int i) {
        return super.b(i);
    }

    public final void b(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000);
    }

    public final boolean b(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
