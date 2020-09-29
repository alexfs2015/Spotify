package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: erd reason: default package */
public final class erd {
    public static a<Long> A = a.a("measurement.upload.interval", 3600000, 3600000);
    public static a<Long> B = a.a("measurement.upload.realtime_upload_interval", 10000, 10000);
    public static a<Long> C = a.a("measurement.upload.debug_upload_interval", 1000, 1000);
    public static a<Long> D = a.a("measurement.upload.minimum_delay", 500, 500);
    public static a<Long> E = a.a("measurement.alarm_manager.minimum_interval", 60000, 60000);
    public static a<Long> F = a.a("measurement.upload.stale_data_deletion_interval", 86400000, 86400000);
    public static a<Long> G = a.a("measurement.upload.refresh_blacklisted_config_interval", 604800000, 604800000);
    public static a<Long> H = a.a("measurement.upload.initial_upload_delay_time", 15000, 15000);
    public static a<Long> I = a.a("measurement.upload.retry_time", 1800000, 1800000);
    public static a<Integer> J = a.a("measurement.upload.retry_count", 6, 6);
    public static a<Long> K = a.a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);
    public static a<Integer> L = a.a("measurement.lifetimevalue.max_currency_tracked", 4, 4);
    public static a<Integer> M = a.a("measurement.audience.filter_result_max_count", 200, 200);
    public static a<Long> N = a.a("measurement.service_client.idle_disconnect_millis", 5000, 5000);
    public static a<Boolean> O = a.a("measurement.test.boolean_flag", false, false);
    public static a<Integer> P = a.a("measurement.experiment.max_ids", 50, 50);
    public static a<Boolean> Q = a.a("measurement.lifetimevalue.user_engagement_tracking_enabled", true, true);
    public static a<Boolean> R = a.a("measurement.audience.complex_param_evaluation", true, true);
    public static a<Boolean> S = a.a("measurement.validation.internal_limits_internal_event_params", false, false);
    public static a<Boolean> T = a.a("measurement.quality.unsuccessful_update_retry_counter", true, true);
    public static a<Boolean> U = a.a("measurement.iid.disable_on_collection_disabled", true, true);
    public static a<Boolean> V = a.a("measurement.app_launch.call_only_when_enabled", true, true);
    public static a<Boolean> W = a.a("measurement.run_on_worker_inline", true, false);
    public static a<Boolean> X = a.a("measurement.audience.dynamic_filters", false, false);
    public static a<Boolean> Y = a.a("measurement.reset_analytics.persist_time", false, false);
    public static a<Boolean> Z = a.a("measurement.validation.value_and_currency_params", false, false);
    static ewk a;
    public static a<Boolean> aa = a.a("measurement.sampling.time_zone_offset_enabled", false, false);
    public static a<Boolean> ab = a.a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", false, false);
    public static a<Boolean> ac = a.a("measurement.fetch_config_with_admob_app_id", false, false);
    public static a<Boolean> ad = a.a("measurement.sessions.session_id_enabled", false, false);
    public static a<Boolean> ae = a.a("measurement.sessions.session_number_enabled", false, false);
    public static a<Boolean> af = a.a("measurement.sessions.immediate_start_enabled", false, false);
    public static a<Boolean> ag = a.a("measurement.sessions.background_sessions_enabled", false, false);
    public static a<Boolean> ah = a.a("measurement.collection.firebase_global_collection_flag_enabled", true, true);
    public static a<Boolean> ai = a.a("measurement.collection.efficient_engagement_reporting_enabled", false, false);
    public static a<Boolean> aj = a.a("measurement.collection.redundant_engagement_removal_enabled", false, false);
    public static a<Boolean> ak = a.a("measurement.collection.init_params_control_enabled", true, true);
    public static a<Boolean> al = a.a("measurement.upload.disable_is_uploader", false, false);
    public static a<Boolean> am = a.a("measurement.experiment.enable_experiment_reporting", false, false);
    public static a<Boolean> an = a.a("measurement.collection.log_event_and_bundle_v2", true, true);
    /* access modifiers changed from: private */
    public static final ema ao = new ema(elt.a("com.google.android.gms.measurement"));
    private static volatile esp ap;
    private static Boolean aq;
    static List<a<Integer>> b = new ArrayList();
    static List<a<Long>> c = new ArrayList();
    static List<a<Boolean>> d = new ArrayList();
    static List<a<String>> e = new ArrayList();
    static List<a<Double>> f = new ArrayList();
    public static a<Boolean> g = a.a("measurement.upload_dsid_enabled", false, false);
    public static a<String> h = a.a("measurement.log_tag", "FA", "FA-SVC");
    public static a<Long> i = a.a("measurement.ad_id_cache_time", 10000, 10000);
    public static a<Long> j = a.a("measurement.monitoring.sample_period_millis", 86400000, 86400000);
    public static a<Long> k = a.a("measurement.config.cache_time", 86400000, 3600000);
    public static a<String> l;
    public static a<String> m;
    public static a<Integer> n = a.a("measurement.upload.max_bundles", 100, 100);
    public static a<Integer> o = a.a("measurement.upload.max_batch_size", 65536, 65536);
    public static a<Integer> p = a.a("measurement.upload.max_bundle_size", 65536, 65536);
    public static a<Integer> q = a.a("measurement.upload.max_events_per_bundle", 1000, 1000);
    public static a<Integer> r = a.a("measurement.upload.max_events_per_day", 100000, 100000);
    public static a<Integer> s = a.a("measurement.upload.max_error_events_per_day", 1000, 1000);
    public static a<Integer> t = a.a("measurement.upload.max_public_events_per_day", 50000, 50000);
    public static a<Integer> u = a.a("measurement.upload.max_conversions_per_day", 500, 500);
    public static a<Integer> v = a.a("measurement.upload.max_realtime_events_per_day", 10, 10);
    public static a<Integer> w = a.a("measurement.store.max_stored_events_per_app", 100000, 100000);
    public static a<String> x;
    public static a<Long> y = a.a("measurement.upload.backoff_period", 43200000, 43200000);
    public static a<Long> z = a.a("measurement.upload.window_interval", 3600000, 3600000);

    /* renamed from: erd$a */
    public static final class a<V> {
        final String a;
        private elu<V> b;
        private final V c;
        private final V d;
        private volatile V e;

        private a(String str, V v, V v2) {
            this.a = str;
            this.d = v;
            this.c = v2;
        }

        static a<Double> a(String str) {
            Double valueOf = Double.valueOf(-3.0d);
            a<Double> aVar = new a<>(str, valueOf, valueOf);
            erd.f.add(aVar);
            return aVar;
        }

        static a<Integer> a(String str, int i, int i2) {
            a<Integer> aVar = new a<>(str, Integer.valueOf(i), Integer.valueOf(i2));
            erd.b.add(aVar);
            return aVar;
        }

        static a<Long> a(String str, long j, long j2) {
            a<Long> aVar = new a<>(str, Long.valueOf(j), Long.valueOf(j2));
            erd.c.add(aVar);
            return aVar;
        }

        static a<String> a(String str, String str2, String str3) {
            a<String> aVar = new a<>(str, str2, str3);
            erd.e.add(aVar);
            return aVar;
        }

        static a<Boolean> a(String str, boolean z, boolean z2) {
            a<Boolean> aVar = new a<>(str, Boolean.valueOf(z), Boolean.valueOf(z2));
            erd.d.add(aVar);
            return aVar;
        }

        static /* synthetic */ void b() {
            synchronized (a.class) {
                for (a aVar : erd.d) {
                    ema a2 = erd.ao;
                    String str = aVar.a;
                    ewk ewk = erd.a;
                    aVar.b = elu.a(a2, str, ((Boolean) aVar.d).booleanValue());
                }
                for (a aVar2 : erd.e) {
                    ema a3 = erd.ao;
                    String str2 = aVar2.a;
                    ewk ewk2 = erd.a;
                    aVar2.b = elu.a(a3, str2, (String) aVar2.d);
                }
                for (a aVar3 : erd.c) {
                    ema a4 = erd.ao;
                    String str3 = aVar3.a;
                    ewk ewk3 = erd.a;
                    aVar3.b = elu.a(a4, str3, ((Long) aVar3.d).longValue());
                }
                for (a aVar4 : erd.b) {
                    ema a5 = erd.ao;
                    String str4 = aVar4.a;
                    ewk ewk4 = erd.a;
                    aVar4.b = elu.a(a5, str4, ((Integer) aVar4.d).intValue());
                }
                for (a aVar5 : erd.f) {
                    ema a6 = erd.ao;
                    String str5 = aVar5.a;
                    ewk ewk5 = erd.a;
                    aVar5.b = elu.a(a6, str5, ((Double) aVar5.d).doubleValue());
                }
            }
        }

        private static void c() {
            synchronized (a.class) {
                if (!ewk.a()) {
                    ewk ewk = erd.a;
                    try {
                        for (a aVar : erd.d) {
                            aVar.e = aVar.b.c();
                        }
                        for (a aVar2 : erd.e) {
                            aVar2.e = aVar2.b.c();
                        }
                        for (a aVar3 : erd.c) {
                            aVar3.e = aVar3.b.c();
                        }
                        for (a aVar4 : erd.b) {
                            aVar4.e = aVar4.b.c();
                        }
                        for (a aVar5 : erd.f) {
                            aVar5.e = aVar5.b.c();
                        }
                    } catch (SecurityException e2) {
                        erd.a((Exception) e2);
                    }
                } else {
                    throw new IllegalStateException("Tried to refresh flag cache on main thread or on package side.");
                }
            }
        }

        public final V a() {
            if (erd.a == null) {
                return this.d;
            }
            ewk ewk = erd.a;
            if (ewk.a()) {
                return this.e == null ? this.d : this.e;
            }
            c();
            try {
                return this.b.c();
            } catch (SecurityException e2) {
                erd.a((Exception) e2);
                return this.b.a;
            }
        }

        public final V a(V v) {
            if (v != null) {
                return v;
            }
            if (erd.a == null) {
                return this.d;
            }
            ewk ewk = erd.a;
            if (ewk.a()) {
                return this.e == null ? this.d : this.e;
            }
            c();
            try {
                return this.b.c();
            } catch (SecurityException e2) {
                erd.a((Exception) e2);
                return this.b.a;
            }
        }
    }

    static {
        a.a("measurement.log_third_party_store_events_enabled", false, false);
        a.a("measurement.log_installs_enabled", false, false);
        a.a("measurement.log_upgrades_enabled", false, false);
        a.a("measurement.log_androidId_enabled", false, false);
        String str = "https";
        l = a.a("measurement.config.url_scheme", str, str);
        String str2 = "app-measurement.com";
        m = a.a("measurement.config.url_authority", str2, str2);
        String str3 = "http://=";
        x = a.a("measurement.upload.url", str3, str3);
        String str4 = "---";
        a.a("measurement.test.string_flag", str4, str4);
        a.a("measurement.test.long_flag", -1, -1);
        a.a("measurement.test.int_flag", -2, -2);
        a.a("measurement.test.double_flag");
        a.a("measurement.remove_app_instance_id_cache_enabled", true, true);
    }

    public static Map<String, String> a(Context context) {
        return elk.a(context.getContentResolver(), elt.a("com.google.android.gms.measurement")).a();
    }

    static void a(esp esp) {
        ap = esp;
    }

    static void a(ewk ewk) {
        a = ewk;
        a.b();
    }

    static void a(Exception exc) {
        if (ap != null) {
            Context m2 = ap.m();
            if (aq == null) {
                aq = Boolean.valueOf(bsp.b().b(m2, bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0);
            }
            if (aq.booleanValue()) {
                ap.q().c.a("Got Exception on PhenotypeFlag.get on Play device", exc);
            }
        }
    }
}
