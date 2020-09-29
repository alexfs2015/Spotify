package com.spotify.music.features.bmw.lockscreen;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.Locale;

public final class LockScreenController extends jyr {
    /* access modifiers changed from: private */
    public State a = State.DONT_SHOW;
    private final a b = new a(this, 0);
    /* access modifiers changed from: private */
    public WeakReference<Activity> c = new WeakReference<>(null);
    /* access modifiers changed from: private */
    public int d;
    /* access modifiers changed from: private */
    public boolean e;

    /* renamed from: com.spotify.music.features.bmw.lockscreen.LockScreenController$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.features.bmw.lockscreen.LockScreenController$State[] r0 = com.spotify.music.features.bmw.lockscreen.LockScreenController.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.bmw.lockscreen.LockScreenController$State r1 = com.spotify.music.features.bmw.lockscreen.LockScreenController.State.DONT_SHOW     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.bmw.lockscreen.LockScreenController$State r1 = com.spotify.music.features.bmw.lockscreen.LockScreenController.State.SHOW     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.bmw.lockscreen.LockScreenController.AnonymousClass1.<clinit>():void");
        }
    }

    enum State {
        DONT_SHOW,
        SHOW
    }

    class a extends BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(LockScreenController lockScreenController, byte b) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if (context != null) {
                boolean booleanExtra = intent.getBooleanExtra("lockscreen_required", false);
                String stringExtra = intent.getStringExtra("sender_id");
                if (booleanExtra) {
                    Logger.b("Lock screen required by %s", stringExtra);
                    LockScreenController.this.a = State.SHOW;
                    String stringExtra2 = intent.getStringExtra("logo_make");
                    if (stringExtra2 != null) {
                        LockScreenController lockScreenController = LockScreenController.this;
                        String lowerCase = stringExtra2.toLowerCase(Locale.ENGLISH);
                        int i = "ford".equals(lowerCase) ? R.drawable.lockscreen_logo_ford : "lincoln".equals(lowerCase) ? R.drawable.lockscreen_logo_lincoln : "bmw".equals(lowerCase) ? R.drawable.lockscreen_logo_bmw : "mini".equals(lowerCase) ? R.drawable.lockscreen_logo_mini : 0;
                        lockScreenController.d = i;
                        Logger.b("logo make = %s => res = %x", stringExtra2, Integer.valueOf(LockScreenController.this.d));
                    } else {
                        LockScreenController.this.d = intent.getIntExtra("logo_resource_id", -1);
                    }
                    LockScreenController.this.e = intent.getBooleanExtra("dismissible_lockscreen", false);
                    Activity activity = (Activity) LockScreenController.this.c.get();
                    if (activity != null) {
                        LockScreenController.b(activity, LockScreenController.this.d, LockScreenController.this.e);
                    }
                    return;
                }
                Logger.b("Lock screen removed by %s", stringExtra);
                LockScreenController.this.a = State.DONT_SHOW;
                Activity activity2 = (Activity) LockScreenController.this.c.get();
                if (LockScreenController.a(activity2)) {
                    activity2.finish();
                }
            }
        }
    }

    public LockScreenController(Context context) {
        fbp.a(context);
        mh.a(context).a(this.b, new IntentFilter("com.spotify.mobile.android.REQUIRE_LOCK_SCREEN"));
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent("com.spotify.mobile.android.REQUIRE_LOCK_SCREEN");
        intent.putExtra("lockscreen_required", false);
        intent.putExtra("sender_id", str);
        mh.a(context).a(intent);
    }

    public static void a(Context context, String str, int i, boolean z) {
        Intent intent = new Intent("com.spotify.mobile.android.REQUIRE_LOCK_SCREEN");
        intent.putExtra("lockscreen_required", true);
        intent.putExtra("sender_id", str);
        intent.putExtra("logo_resource_id", i);
        intent.putExtra("dismissible_lockscreen", true);
        mh.a(context).a(intent);
    }

    static /* synthetic */ boolean a(Activity activity) {
        return activity instanceof LockScreenActivity;
    }

    /* access modifiers changed from: private */
    public static void b(Context context, int i, boolean z) {
        Logger.c("Starting lock screen.", new Object[0]);
        context.startActivity(c(context, i, z));
    }

    private static Intent c(Context context, int i, boolean z) {
        Intent intent = new Intent(context, LockScreenActivity.class);
        intent.putExtra("logo_resource_id", i);
        intent.putExtra("dismissible_lockscreen", z);
        return intent;
    }

    public final void onActivityPaused(Activity activity) {
        if (this.c.get() != null && activity.equals(this.c.get())) {
            this.c.clear();
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (activity != null) {
            this.c = new WeakReference<>(activity);
            int i = AnonymousClass1.a[this.a.ordinal()];
            if (i != 1) {
                if (i == 2 && !(activity instanceof LockScreenActivity)) {
                    b(activity, this.d, this.e);
                }
            } else if (activity instanceof LockScreenActivity) {
                activity.finish();
            }
        }
    }
}
