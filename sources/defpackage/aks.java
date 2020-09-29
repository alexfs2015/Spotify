package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.FlushResult;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aks reason: default package */
public class aks {
    private static final String a = aks.class.getName();
    /* access modifiers changed from: private */
    public static volatile akr b = new akr();
    /* access modifiers changed from: private */
    public static final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */
    public static ScheduledFuture d;
    /* access modifiers changed from: private */
    public static final Runnable e = new Runnable() {
        public final void run() {
            aks.d = null;
            if (AppEventsLogger.a() != FlushBehavior.EXPLICIT_ONLY) {
                aks.b(FlushReason.TIMER);
            }
        }
    };

    aks() {
    }

    public static void a() {
        c.execute(new Runnable() {
            public final void run() {
                akt.a(aks.b);
                aks.b = new akr();
            }
        });
    }

    public static void a(final FlushReason flushReason) {
        c.execute(new Runnable() {
            public final void run() {
                aks.b(flushReason);
            }
        });
    }

    public static void a(final AccessTokenAppIdPair accessTokenAppIdPair, final AppEvent appEvent) {
        c.execute(new Runnable() {
            public final void run() {
                aks.b.a(accessTokenAppIdPair, appEvent);
                if (AppEventsLogger.a() == FlushBehavior.EXPLICIT_ONLY || aks.b.b() <= 100) {
                    if (aks.d == null) {
                        aks.d = aks.c.schedule(aks.e, 15, TimeUnit.SECONDS);
                    }
                    return;
                }
                aks.b(FlushReason.EVENT_THRESHOLD);
            }
        });
    }

    public static Set<AccessTokenAppIdPair> b() {
        return b.a();
    }

    static void b(FlushReason flushReason) {
        b.a(akt.a());
        try {
            akr akr = b;
            final akv akv = new akv();
            boolean b2 = akc.b(akc.g());
            ArrayList<akd> arrayList = new ArrayList<>();
            Iterator it = akr.a().iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                final AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) it.next();
                final akx a2 = akr.a(accessTokenAppIdPair);
                String str = accessTokenAppIdPair.applicationId;
                amg a3 = FetchedAppSettingsManager.a(str, false);
                final akd a4 = akd.a((aju) null, String.format("%s/activities", new Object[]{str}), (JSONObject) null, (b) null);
                Bundle bundle = a4.d;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("access_token", accessTokenAppIdPair.accessTokenString);
                String d2 = aku.d();
                if (d2 != null) {
                    bundle.putString("device_token", d2);
                }
                String e2 = aku.e();
                if (e2 != null) {
                    bundle.putString("install_referrer", e2);
                }
                a4.d = bundle;
                if (a3 != null) {
                    z = a3.a;
                }
                int a5 = a2.a(a4, akc.g(), z, b2);
                if (a5 == 0) {
                    a4 = null;
                } else {
                    akv.a += a5;
                    a4.a((b) new b() {
                        public final void a(akg akg) {
                            aks.a(accessTokenAppIdPair, a4, akg, a2, akv);
                        }
                    });
                }
                if (a4 != null) {
                    arrayList.add(a4);
                }
            }
            if (arrayList.size() > 0) {
                amp.a(LoggingBehavior.APP_EVENTS, a, "Flushing %d events due to %s.", Integer.valueOf(akv.a), flushReason.toString());
                for (akd a6 : arrayList) {
                    akd.a(a6);
                }
            } else {
                akv = null;
            }
            if (akv != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", akv.a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", akv.b);
                mc.a(akc.g()).a(intent);
            }
        } catch (Exception unused) {
        }
    }

    static /* synthetic */ void a(final AccessTokenAppIdPair accessTokenAppIdPair, akd akd, akg akg, final akx akx, akv akv) {
        String str;
        String str2;
        FacebookRequestError facebookRequestError = akg.b;
        FlushResult flushResult = FlushResult.SUCCESS;
        boolean z = true;
        if (facebookRequestError == null) {
            str = "Success";
        } else if (facebookRequestError.b == -1) {
            flushResult = FlushResult.NO_CONNECTIVITY;
            str = "Failed: No Connectivity";
        } else {
            str = String.format("Failed:\n  Response: %s\n  Error %s", new Object[]{akg.toString(), facebookRequestError.toString()});
            flushResult = FlushResult.SERVER_ERROR;
        }
        if (akc.a(LoggingBehavior.APP_EVENTS)) {
            try {
                str2 = new JSONArray((String) akd.f).toString(2);
            } catch (JSONException unused) {
                str2 = "<Can't encode events for debug logging>";
            }
            amp.a(LoggingBehavior.APP_EVENTS, a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", akd.c.toString(), str, str2);
        }
        if (facebookRequestError == null) {
            z = false;
        }
        akx.a(z);
        if (flushResult == FlushResult.NO_CONNECTIVITY) {
            akc.e().execute(new Runnable() {
                public final void run() {
                    akt.a(accessTokenAppIdPair, akx);
                }
            });
        }
        if (flushResult != FlushResult.SUCCESS && akv.b != FlushResult.NO_CONNECTIVITY) {
            akv.b = flushResult;
        }
    }
}
