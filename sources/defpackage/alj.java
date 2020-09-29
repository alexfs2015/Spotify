package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.appevents.internal.SubscriptionType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: alj reason: default package */
public class alj {
    private static final String a = alj.class.getCanonicalName();
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static Boolean c = null;
    /* access modifiers changed from: private */
    public static Boolean d = null;
    private static ServiceConnection e;
    private static ActivityLifecycleCallbacks f;
    private static Intent g;
    /* access modifiers changed from: private */
    public static Object h;

    public static void a() {
        if (c == null) {
            try {
                Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
                c = Boolean.TRUE;
                try {
                    Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                    d = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    d = Boolean.FALSE;
                }
                alk.a();
                g = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                e = new ServiceConnection() {
                    public final void onServiceDisconnected(ComponentName componentName) {
                    }

                    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        alj.h = alk.a(akc.g(), iBinder);
                    }
                };
                f = new ActivityLifecycleCallbacks() {
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityDestroyed(Activity activity) {
                    }

                    public final void onActivityPaused(Activity activity) {
                    }

                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityStarted(Activity activity) {
                    }

                    public final void onActivityResumed(Activity activity) {
                        akc.e().execute(new Runnable() {
                            public final void run() {
                                Context g = akc.g();
                                alj.a(g, alk.a(g, alj.h));
                                Map b = alk.b(g, alj.h);
                                alj.a(g, b, new HashMap());
                                HashSet hashSet = new HashSet();
                                b.clear();
                                Iterator it = alk.a(g, alj.h, (Set<Integer>) hashSet).iterator();
                                while (it.hasNext()) {
                                    b.put((String) it.next(), SubscriptionType.EXPIRE);
                                }
                                HashMap hashMap = new HashMap();
                                if (!hashSet.isEmpty()) {
                                    hashMap.put("error_code", TextUtils.join(",", hashSet));
                                }
                                alj.a(g, b, hashMap);
                            }
                        });
                    }

                    public final void onActivityStopped(Activity activity) {
                        if (alj.d.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                            akc.e().execute(new Runnable() {
                                public final void run() {
                                    Context g = akc.g();
                                    ArrayList a2 = alk.a(g, alj.h);
                                    if (a2.isEmpty()) {
                                        a2 = alk.c(g, alj.h);
                                    }
                                    alj.a(g, a2);
                                }
                            });
                        }
                    }
                };
            } catch (ClassNotFoundException unused2) {
                c = Boolean.FALSE;
            }
        }
        if (c.booleanValue() && ali.b() && b.compareAndSet(false, true)) {
            Context g2 = akc.g();
            if (g2 instanceof Application) {
                ((Application) g2).registerActivityLifecycleCallbacks(f);
                g2.bindService(g, e, 1);
            }
        }
    }

    static /* synthetic */ void a(Context context, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString("productId");
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException e2) {
                    Log.e(a, "Error parsing in-app purchase data.", e2);
                }
            }
            for (Entry entry : alk.a(context, arrayList2, h, false).entrySet()) {
                ali.a((String) hashMap.get(entry.getKey()), (String) entry.getValue());
            }
        }
    }

    static /* synthetic */ void a(Context context, Map map, Map map2) {
        if (!map.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (String str : map.keySet()) {
                try {
                    String string = new JSONObject(str).getString("productId");
                    arrayList.add(string);
                    hashMap.put(string, str);
                } catch (JSONException e2) {
                    Log.e(a, "Error parsing in-app purchase data.", e2);
                }
            }
            Map a2 = alk.a(context, arrayList, h, true);
            for (String str2 : a2.keySet()) {
                String str3 = (String) hashMap.get(str2);
                ali.a((SubscriptionType) map.get(str3), str3, (String) a2.get(str2), map2);
            }
        }
    }
}
