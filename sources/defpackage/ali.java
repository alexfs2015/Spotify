package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.internal.SubscriptionType;
import com.facebook.internal.FetchedAppSettingsManager;
import com.moat.analytics.mobile.MoatAdEvent;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ali reason: default package */
public class ali {
    private static final String a = ali.class.getCanonicalName();
    private static final akw b = new akw(akc.g());

    /* renamed from: ali$a */
    static class a {
        BigDecimal a;
        Currency b;
        Bundle c;

        a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.a = bigDecimal;
            this.b = currency;
            this.c = bundle;
        }
    }

    public static void a() {
        Context g = akc.g();
        String k = akc.k();
        boolean n = akc.n();
        amx.a((Object) g, "context");
        if (n && (g instanceof Application)) {
            AppEventsLogger.a((Application) g, k);
        }
    }

    public static void a(String str, long j) {
        Context g = akc.g();
        String k = akc.k();
        amx.a((Object) g, "context");
        amg a2 = FetchedAppSettingsManager.a(k, false);
        if (a2 != null && a2.g && j > 0) {
            akw akw = new akw(g);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            akw.a("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    public static void a(String str, String str2) {
        if (b()) {
            a a2 = a(str, str2, new HashMap());
            if (a2 != null) {
                akw akw = b;
                BigDecimal bigDecimal = a2.a;
                Currency currency = a2.b;
                Bundle bundle = a2.c;
                if (akc.n()) {
                    aku aku = akw.a;
                    if (bigDecimal == null) {
                        aku.b("purchaseAmount cannot be null");
                    } else if (currency == null) {
                        aku.b("currency cannot be null");
                    } else {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        Bundle bundle2 = bundle;
                        bundle2.putString("fb_currency", currency.getCurrencyCode());
                        aku.a("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, true, alg.b());
                        if (aku.a() != FlushBehavior.EXPLICIT_ONLY) {
                            aks.a(FlushReason.EAGER_FLUSHING_EVENT);
                        }
                    }
                }
            }
        }
    }

    public static void a(SubscriptionType subscriptionType, String str, String str2, Map<String, String> map) {
        String str3;
        if (b()) {
            boolean a2 = amf.a("app_events_if_auto_log_subs", akc.k(), false);
            switch (subscriptionType) {
                case SUBSCRIBE:
                    if (a2) {
                        str3 = "Subscribe";
                        break;
                    } else {
                        a(str, str2);
                        return;
                    }
                case START_TRIAL:
                    if (a2) {
                        str3 = "StartTrial";
                        break;
                    } else {
                        a(str, str2);
                        return;
                    }
                case RESTORE:
                    str3 = "SubscriptionRestore";
                    break;
                case CANCEL:
                    str3 = "SubscriptionCancel";
                    break;
                case HEARTBEAT:
                    str3 = "SubscriptionHeartbeat";
                    break;
                case EXPIRE:
                    str3 = "SubscriptionExpire";
                    break;
                default:
                    return;
            }
            String str4 = str3;
            a a3 = a(str, str2, map);
            if (a3 != null) {
                akw akw = b;
                BigDecimal bigDecimal = a3.a;
                Currency currency = a3.b;
                Bundle bundle = a3.c;
                if (akc.n()) {
                    aku aku = akw.a;
                    if (bigDecimal == null || currency == null) {
                        amw.b(aku.a, "purchaseAmount and currency cannot be null");
                    } else {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        Bundle bundle2 = bundle;
                        bundle2.putString("fb_currency", currency.getCurrencyCode());
                        aku.a(str4, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, alg.b());
                    }
                }
            }
        }
    }

    public static boolean b() {
        amg a2 = FetchedAppSettingsManager.a(akc.k());
        return a2 != null && akc.n() && a2.i;
    }

    private static a a(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString(MoatAdEvent.EVENT_TYPE);
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (optString.equals("subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                if (!optString2.isEmpty()) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (String str3 : map.keySet()) {
                bundle.putCharSequence(str3, (CharSequence) map.get(str3));
            }
            double d = (double) jSONObject2.getLong("price_amount_micros");
            Double.isNaN(d);
            return new a(new BigDecimal(d / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
        } catch (JSONException e) {
            Log.e(a, "Error parsing in-app subscription data.", e);
            return null;
        }
    }
}
