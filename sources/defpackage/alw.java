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

/* renamed from: alw reason: default package */
public class alw {
    private static final String a = alw.class.getCanonicalName();
    private static final alk b = new alk(akq.g());

    /* renamed from: alw$a */
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

    public static void a() {
        Context g = akq.g();
        String k = akq.k();
        boolean n = akq.n();
        anl.a((Object) g, "context");
        if (n && (g instanceof Application)) {
            AppEventsLogger.a((Application) g, k);
        }
    }

    public static void a(SubscriptionType subscriptionType, String str, String str2, Map<String, String> map) {
        String str3;
        if (b()) {
            boolean a2 = amt.a("app_events_if_auto_log_subs", akq.k(), false);
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
                alk alk = b;
                BigDecimal bigDecimal = a3.a;
                Currency currency = a3.b;
                Bundle bundle = a3.c;
                if (akq.n()) {
                    ali ali = alk.a;
                    if (bigDecimal == null || currency == null) {
                        ank.b(ali.a, "purchaseAmount and currency cannot be null");
                    } else {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        Bundle bundle2 = bundle;
                        bundle2.putString("fb_currency", currency.getCurrencyCode());
                        ali.a(str4, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, alu.b());
                    }
                }
            }
        }
    }

    public static void a(String str, long j) {
        Context g = akq.g();
        String k = akq.k();
        anl.a((Object) g, "context");
        amu a2 = FetchedAppSettingsManager.a(k, false);
        if (a2 != null && a2.g && j > 0) {
            alk alk = new alk(g);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            alk.a("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    public static void a(String str, String str2) {
        if (b()) {
            a a2 = a(str, str2, new HashMap());
            if (a2 != null) {
                alk alk = b;
                BigDecimal bigDecimal = a2.a;
                Currency currency = a2.b;
                Bundle bundle = a2.c;
                if (akq.n()) {
                    ali ali = alk.a;
                    if (bigDecimal == null) {
                        ali.b("purchaseAmount cannot be null");
                    } else if (currency == null) {
                        ali.b("currency cannot be null");
                    } else {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        Bundle bundle2 = bundle;
                        bundle2.putString("fb_currency", currency.getCurrencyCode());
                        ali.a("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, true, alu.b());
                        if (ali.a() != FlushBehavior.EXPLICIT_ONLY) {
                            alg.a(FlushReason.EAGER_FLUSHING_EVENT);
                        }
                    }
                }
            }
        }
    }

    public static boolean b() {
        amu a2 = FetchedAppSettingsManager.a(akq.k());
        return a2 != null && akq.n() && a2.i;
    }
}
