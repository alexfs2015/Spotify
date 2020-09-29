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

/* renamed from: alg reason: default package */
public class alg {
    private static final String a = alg.class.getName();
    /* access modifiers changed from: private */
    public static volatile alf b = new alf();
    /* access modifiers changed from: private */
    public static final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */
    public static ScheduledFuture d;
    /* access modifiers changed from: private */
    public static final Runnable e = new Runnable() {
        public final void run() {
            alg.d = null;
            if (AppEventsLogger.a() != FlushBehavior.EXPLICIT_ONLY) {
                alg.b(FlushReason.TIMER);
            }
        }
    };

    alg() {
    }

    public static void a() {
        c.execute(new Runnable() {
            public final void run() {
                alh.a(alg.b);
                alg.b = new alf();
            }
        });
    }

    static /* synthetic */ void a(final AccessTokenAppIdPair accessTokenAppIdPair, akr akr, aku aku, final all all, alj alj) {
        String str;
        String str2;
        FacebookRequestError facebookRequestError = aku.b;
        FlushResult flushResult = FlushResult.SUCCESS;
        boolean z = true;
        if (facebookRequestError == null) {
            str = "Success";
        } else if (facebookRequestError.b == -1) {
            flushResult = FlushResult.NO_CONNECTIVITY;
            str = "Failed: No Connectivity";
        } else {
            str = String.format("Failed:\n  Response: %s\n  Error %s", new Object[]{aku.toString(), facebookRequestError.toString()});
            flushResult = FlushResult.SERVER_ERROR;
        }
        if (akq.a(LoggingBehavior.APP_EVENTS)) {
            try {
                str2 = new JSONArray((String) akr.f).toString(2);
            } catch (JSONException unused) {
                str2 = "<Can't encode events for debug logging>";
            }
            and.a(LoggingBehavior.APP_EVENTS, a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", akr.c.toString(), str, str2);
        }
        if (facebookRequestError == null) {
            z = false;
        }
        all.a(z);
        if (flushResult == FlushResult.NO_CONNECTIVITY) {
            akq.e().execute(new Runnable() {
                public final void run() {
                    alh.a(accessTokenAppIdPair, all);
                }
            });
        }
        if (flushResult != FlushResult.SUCCESS && alj.b != FlushResult.NO_CONNECTIVITY) {
            alj.b = flushResult;
        }
    }

    public static void a(final AccessTokenAppIdPair accessTokenAppIdPair, final AppEvent appEvent) {
        c.execute(new Runnable() {
            public final void run() {
                alg.b.a(accessTokenAppIdPair, appEvent);
                if (AppEventsLogger.a() == FlushBehavior.EXPLICIT_ONLY || alg.b.b() <= 100) {
                    if (alg.d == null) {
                        alg.d = alg.c.schedule(alg.e, 15, TimeUnit.SECONDS);
                    }
                    return;
                }
                alg.b(FlushReason.EVENT_THRESHOLD);
            }
        });
    }

    public static void a(final FlushReason flushReason) {
        c.execute(new Runnable() {
            public final void run() {
                alg.b(flushReason);
            }
        });
    }

    public static Set<AccessTokenAppIdPair> b() {
        return b.a();
    }

    static void b(FlushReason flushReason) {
        b.a(alh.a());
        try {
            alf alf = b;
            final alj alj = new alj();
            boolean b2 = akq.b(akq.g());
            ArrayList<akr> arrayList = new ArrayList<>();
            Iterator it = alf.a().iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                final AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) it.next();
                final all a2 = alf.a(accessTokenAppIdPair);
                String str = accessTokenAppIdPair.applicationId;
                amu a3 = FetchedAppSettingsManager.a(str, false);
                final akr a4 = akr.a((aki) null, String.format("%s/activities", new Object[]{str}), (JSONObject) null, (b) null);
                Bundle bundle = a4.d;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("access_token", accessTokenAppIdPair.accessTokenString);
                String d2 = ali.d();
                if (d2 != null) {
                    bundle.putString("device_token", d2);
                }
                String e2 = ali.e();
                if (e2 != null) {
                    bundle.putString("install_referrer", e2);
                }
                a4.d = bundle;
                if (a3 != null) {
                    z = a3.a;
                }
                int a5 = a2.a(a4, akq.g(), z, b2);
                if (a5 == 0) {
                    a4 = null;
                } else {
                    alj.a += a5;
                    a4.a((b) new b() {
                        public final void a(aku aku) {
                            alg.a(accessTokenAppIdPair, a4, aku, a2, alj);
                        }
                    });
                }
                if (a4 != null) {
                    arrayList.add(a4);
                }
            }
            if (arrayList.size() > 0) {
                and.a(LoggingBehavior.APP_EVENTS, a, "Flushing %d events due to %s.", Integer.valueOf(alj.a), flushReason.toString());
                for (akr a6 : arrayList) {
                    akr.a(a6);
                }
            } else {
                alj = null;
            }
            if (alj != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", alj.a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", alj.b);
                mh.a(akq.g()).a(intent);
            }
        } catch (Exception unused) {
        }
    }
}
