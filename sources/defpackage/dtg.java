package defpackage;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.comscore.android.id.IdHelperAndroid;
import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.cosmos.bindings.BuildConfig;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@cfp
/* renamed from: dtg reason: default package */
public final class dtg {
    public static final dsw<Long> A = dsw.a(1, "gads:video:spinner:jank_threshold_ms", 50);
    public static final dsw<Boolean> B = dsw.a(1, "gads:video:aggressive_media_codec_release", Boolean.FALSE);
    public static final dsw<Boolean> C = dsw.a(1, "gads:memory_bundle:debug_info", Boolean.FALSE);
    public static final dsw<Boolean> D = dsw.a(1, "gads:memory_bundle:runtime_info", Boolean.TRUE);
    public static final dsw<String> E;
    public static final dsw<Integer> F = dsw.a(1, "gads:video:codec_query_minimum_version", 16);
    public static final dsw<Boolean> G = dsw.a(0, "gads:looper_for_gms_client:enabled", Boolean.TRUE);
    public static final dsw<Boolean> H = dsw.a(0, "gads:sw_ad_request_service:enabled", Boolean.TRUE);
    public static final dsw<String> I = dsw.a(1, "gad:mraid:url_banner", "http://=");
    public static final dsw<String> J = dsw.a(1, "gad:mraid:url_expanded_banner", "http://=");
    public static final dsw<String> K = dsw.a(1, "gad:mraid:url_interstitial", "http://=");
    public static final dsw<String> L = dsw.a(1, "gad:mraid:version", "2.0");
    public static final dsw<Boolean> M = dsw.a(1, "gads:mraid:unload", Boolean.FALSE);
    public static final dsw<Boolean> N = dsw.a(0, "gads:enabled_sdk_csi", Boolean.FALSE);
    public static final dsw<String> O = dsw.a(0, "gads:sdk_csi_server", "http://=");
    public static final dsw<Boolean> P = dsw.a(0, "gads:sdk_csi_write_to_file", Boolean.FALSE);
    public static final dsw<Boolean> Q = dsw.a(0, "gads:enable_content_fetching", Boolean.TRUE);
    public static final dsw<Integer> R = dsw.a(0, "gads:content_length_weight", 1);
    public static final dsw<Integer> S = dsw.a(0, "gads:content_age_weight", 1);
    public static final dsw<Integer> T = dsw.a(0, "gads:min_content_len", 11);
    public static final dsw<Integer> U = dsw.a(0, "gads:fingerprint_number", 10);
    public static final dsw<Integer> V = dsw.a(0, "gads:sleep_sec", 10);
    public static final dsw<Boolean> W = dsw.a(1, "gads:enable_content_url_hash", Boolean.TRUE);
    public static final dsw<Integer> X = dsw.a(1, "gads:content_vertical_fingerprint_number", 100);
    public static final dsw<Boolean> Y = dsw.a(1, "gads:enable_content_vertical_hash", Boolean.TRUE);
    public static final dsw<Integer> Z = dsw.a(1, "gads:content_vertical_fingerprint_bits", 23);
    public static final dsw<String> a = dsw.a(0, "gads:sdk_core_location", "http://=");
    public static final dsw<Boolean> aA = dsw.a(0, "gads:webview:permission:disabled", Boolean.FALSE);
    public static final dsw<Boolean> aB = dsw.a(1, "gads:rewarded:adapter_initialization_enabled", Boolean.FALSE);
    public static final dsw<Long> aC = dsw.a(1, "gads:rewarded:adapter_timeout_ms", 20000);
    public static final dsw<Boolean> aD = dsw.a(1, "gads:rewarded:ad_metadata_enabled", Boolean.FALSE);
    public static final dsw<Boolean> aE = dsw.a(1, "gads:app_activity_tracker:enabled", Boolean.TRUE);
    public static final dsw<Long> aF = dsw.a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);
    public static final dsw<Long> aG = dsw.a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));
    public static final dsw<Boolean> aH = dsw.a(1, "gads:adid_values_in_adrequest:enabled", Boolean.FALSE);
    public static final dsw<Long> aI = dsw.a(1, "gads:adid_values_in_adrequest:timeout", 2000);
    public static final dsw<Boolean> aJ = dsw.a(1, "gads:disable_adid_values_in_ms", Boolean.FALSE);
    public static final dsw<Boolean> aK = dsw.a(1, "gads:enable_ad_loader_manager", Boolean.TRUE);
    public static final dsw<Boolean> aL = dsw.a(1, "gads:ad_manager_enforce_arp_invariant:enabled", Boolean.TRUE);
    public static final dsw<Boolean> aM = dsw.a(1, "gads:ad_manager:admob_extra:new_bundle", Boolean.TRUE);
    public static final dsw<Long> aN = dsw.a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);
    public static final dsw<Boolean> aO = dsw.a(1, "gads:interstitial_ad_immersive_mode", Boolean.TRUE);
    public static final dsw<Boolean> aP = dsw.a(1, "gads:custom_close_blocking:enabled", Boolean.FALSE);
    public static final dsw<Boolean> aQ = dsw.a(1, "gads:disabling_closable_area:enabled", Boolean.FALSE);
    public static final dsw<Boolean> aR = dsw.a(1, "gads:interstitial_ad_pool:enabled", Boolean.FALSE);
    public static final dsw<Boolean> aS = dsw.a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", Boolean.FALSE);
    public static final dsw<String> aT = dsw.a(1, "gads:interstitial_ad_pool:schema", "customTargeting");
    public static final dsw<String> aU = dsw.a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
    public static final dsw<Integer> aV = dsw.a(1, "gads:interstitial_ad_pool:max_pools", 3);
    public static final dsw<Integer> aW = dsw.a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
    public static final dsw<Integer> aX = dsw.a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    public static final dsw<String> aY;
    public static final dsw<Integer> aZ = dsw.a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
    public static final dsw<Integer> aa = dsw.a(1, "gads:content_vertical_fingerprint_ngram", 3);
    public static final dsw<String> ab = dsw.a(1, "gads:content_fetch_view_tag_id", "googlebot");
    public static final dsw<String> ac = dsw.a(1, "gads:content_fetch_exclude_view_tag", IdHelperAndroid.NO_ID_AVAILABLE);
    public static final dsw<Boolean> ad = dsw.a(0, "gad:app_index_enabled", Boolean.TRUE);
    public static final dsw<Boolean> ae = dsw.a(1, "gads:content_fetch_disable_get_title_from_webview", Boolean.FALSE);
    public static final dsw<Boolean> af = dsw.a(0, "gads:kitkat_interstitial_workaround:enabled", Boolean.TRUE);
    public static final dsw<Boolean> ag = dsw.a(0, "gads:interstitial_follow_url", Boolean.TRUE);
    public static final dsw<Boolean> ah = dsw.a(0, "gads:interstitial_follow_url:register_click", Boolean.TRUE);
    public static final dsw<Boolean> ai = dsw.a(0, "gads:ad_key_enabled", Boolean.FALSE);
    public static final dsw<Boolean> aj = dsw.a(1, "gads:sai:enabled", Boolean.TRUE);
    public static final dsw<Boolean> ak = dsw.a(1, "gads:sai:banner_ad_enabled", Boolean.TRUE);
    public static final dsw<Boolean> al = dsw.a(1, "gads:sai:native_ad_enabled", Boolean.TRUE);
    public static final dsw<Boolean> am = dsw.a(1, "gads:sai:interstitial_ad_enabled", Boolean.TRUE);
    public static final dsw<Boolean> an = dsw.a(1, "gads:sai:rewardedvideo_ad_enabled", Boolean.TRUE);
    public static final dsw<String> ao = dsw.a(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");
    public static final dsw<String> ap = dsw.a(1, "gads:sai:impression_ping_schema_v2", "^[^?]*/adview.*");
    public static final dsw<Boolean> aq = dsw.a(1, "gads:sai:click_gmsg_enabled", Boolean.TRUE);
    public static final dsw<Boolean> ar = dsw.a(1, "gads:sai:using_macro:enabled", Boolean.FALSE);
    public static final dsw<String> as = dsw.a(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");
    public static final dsw<Long> at = dsw.a(1, "gads:sai:timeout_ms", -1);
    public static final dsw<Integer> au = dsw.a(1, "gads:sai:scion_thread_pool_size", 5);
    public static final dsw<Boolean> av = dsw.a(1, "gads:x_seconds_rewarded:enable", Boolean.FALSE);
    public static final dsw<Boolean> aw = dsw.a(1, "gads:webview:ignore_over_scroll", Boolean.TRUE);
    public static final dsw<Boolean> ax = dsw.a(0, "gads:corewebview:adwebview_factory:enable", Boolean.FALSE);
    public static final dsw<Boolean> ay = dsw.a(0, "gads:corewebview:javascript_engine", Boolean.FALSE);
    public static final dsw<Boolean> az = dsw.a(1, "gad:webview:inject_scripts", Boolean.FALSE);
    public static final dsw<Boolean> b = dsw.a(0, "gads:sdk_crash_report_enabled", Boolean.FALSE);
    public static final dsw<Boolean> bA = dsw.a(0, "gads:adshield:enable_adshield_instrumentation", Boolean.FALSE);
    public static final dsw<Long> bB = dsw.a(1, "gads:gestures:task_timeout", 2000);
    public static final dsw<Boolean> bC = dsw.a(1, "gads:gestures:asig:enabled", Boolean.FALSE);
    public static final dsw<Boolean> bD = dsw.a(1, "gads:gestures:ans:enabled", Boolean.FALSE);
    public static final dsw<Boolean> bE = dsw.a(1, "gads:gestures:tos:enabled", Boolean.FALSE);
    public static final dsw<Boolean> bF = dsw.a(1, "gads:signal:app_permissions:disabled", Boolean.FALSE);
    public static final dsw<Boolean> bG = dsw.a(1, "gads:gestures:inthex:enabled", Boolean.FALSE);
    public static final dsw<Boolean> bH = dsw.a(1, "gads:gestures:hpk:enabled", Boolean.TRUE);
    public static final dsw<String> bI;
    public static final dsw<Boolean> bJ = dsw.a(1, "gads:gestures:bs:enabled", Boolean.TRUE);
    public static final dsw<Boolean> bK = dsw.a(1, "gads:gestures:check_initialization_thread:enabled", Boolean.FALSE);
    public static final dsw<Boolean> bL = dsw.a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", Boolean.TRUE);
    public static final dsw<Boolean> bM = dsw.a(0, "gass:enabled", Boolean.TRUE);
    public static final dsw<Boolean> bN = dsw.a(0, "gass:enable_int_signal", Boolean.TRUE);
    public static final dsw<Boolean> bO = dsw.a(0, "gass:enable_ad_attestation_signal", Boolean.TRUE);
    public static final dsw<Boolean> bP = dsw.a(0, "gads:support_screen_shot", Boolean.TRUE);
    public static final dsw<Boolean> bQ = dsw.a(0, "gads:use_get_drawing_cache_for_screenshot:enabled", Boolean.TRUE);
    public static final dsw<String> bR;
    public static final dsw<Long> bS = dsw.a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));
    public static final dsw<Boolean> bT = dsw.a(0, "gads:js_flags:mf", Boolean.FALSE);
    public static final dsw<Boolean> bU = dsw.a(0, "gads:custom_render:ping_on_ad_rendered", Boolean.FALSE);
    public static final dsw<String> bV = dsw.a(1, "gads:native:engine_url_with_protocol", "http://=");
    public static final dsw<String> bW = dsw.a(1, "gads:native:video_url_with_protocol", "http://=");
    public static final dsw<Boolean> bX = dsw.a(1, "gads:enable_untrack_view_native", Boolean.TRUE);
    public static final dsw<Boolean> bY = dsw.a(1, "gads:ignore_untrack_view_google_native", Boolean.TRUE);
    public static final dsw<Boolean> bZ = dsw.a(1, "gads:reset_listeners_preparead_native", Boolean.TRUE);
    public static final dsw<Integer> ba = dsw.a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
    public static final dsw<Long> bb = dsw.a(1, "gads:interstitial_ad_pool:discard_thresholds", 0);
    public static final dsw<Long> bc = dsw.a(1, "gads:interstitial_ad_pool:miss_thresholds", 0);
    public static final dsw<Float> bd = dsw.a(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);
    public static final dsw<Float> be = dsw.a(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);
    public static final dsw<Boolean> bf = dsw.a(0, "gads:debug_logging_feature:enable", Boolean.FALSE);
    public static final dsw<Boolean> bg = dsw.a(0, "gads:debug_logging_feature:intercept_web_view", Boolean.FALSE);
    public static final dsw<String> bh;
    public static final dsw<String> bi;
    public static final dsw<Boolean> bj = dsw.a(0, "gads:log:verbose_enabled", Boolean.FALSE);
    public static final dsw<Boolean> bk = dsw.a(1, "gads:include_local_global_rectangles", Boolean.FALSE);
    public static final dsw<Long> bl = dsw.a(1, "gads:position_watcher:throttle_ms", 200);
    public static final dsw<Boolean> bm = dsw.a(1, "gads:include_lock_screen_apps_for_visibility", Boolean.TRUE);
    public static final dsw<Boolean> bn = dsw.a(0, "gads:device_info_caching:enabled", Boolean.TRUE);
    public static final dsw<Long> bo = dsw.a(0, "gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final dsw<Boolean> bp = dsw.a(1, "gads:gen204_signals:enabled", Boolean.FALSE);
    public static final dsw<Boolean> bq = dsw.a(0, "gads:webview:error_reporting_enabled", Boolean.FALSE);
    public static final dsw<Boolean> br = dsw.a(1, "gads:gmsg:disable_back_button:enabled", Boolean.TRUE);
    public static final dsw<Boolean> bs = dsw.a(0, "gads:gmsg:video_meta:enabled", Boolean.TRUE);
    public static final dsw<Long> bt = dsw.a(1, "gads:network:network_prediction_timeout_ms", 2000);
    public static final dsw<Boolean> bu = dsw.a(0, "gads:mediation:dynamite_first:admobadapter", Boolean.TRUE);
    public static final dsw<Boolean> bv = dsw.a(0, "gads:mediation:dynamite_first:adurladapter", Boolean.TRUE);
    public static final dsw<Boolean> bw = dsw.a(1, "gads:bypass_adrequest_service_for_inlined_mediation", Boolean.TRUE);
    public static final dsw<Long> bx = dsw.a(0, "gads:resolve_future:default_timeout_ms", 30000);
    public static final dsw<Long> by = dsw.a(0, "gads:ad_loader:timeout_ms", 60000);
    public static final dsw<Long> bz = dsw.a(0, "gads:rendering:timeout_ms", 60000);
    public static final dsw<Boolean> c = dsw.a(0, "gads:report_dynamite_crash_in_background_thread", Boolean.FALSE);
    public static final dsw<Boolean> cA = dsw.a(0, "gads:webview_cookie:enabled", Boolean.TRUE);
    public static final dsw<Boolean> cB = dsw.a(1, "gads:cache:bind_on_foreground", Boolean.FALSE);
    public static final dsw<Boolean> cC = dsw.a(1, "gads:cache:bind_on_init", Boolean.FALSE);
    public static final dsw<Boolean> cD = dsw.a(1, "gads:cache:bind_on_request", Boolean.FALSE);
    public static final dsw<Long> cE = dsw.a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));
    public static final dsw<Boolean> cF = dsw.a(1, "gads:cache:use_cache_data_source", Boolean.FALSE);
    public static final dsw<Boolean> cG = dsw.a(1, "gads:http_assets_cache:enabled", Boolean.FALSE);
    public static final dsw<String> cH = dsw.a(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");
    public static final dsw<Integer> cI = dsw.a(1, "gads:http_assets_cache:time_out", 100);
    public static final dsw<Boolean> cJ = dsw.a(1, "gads:chrome_custom_tabs:enabled", Boolean.TRUE);
    public static final dsw<Boolean> cK = dsw.a(1, "gads:chrome_custom_tabs_browser:enabled", Boolean.FALSE);
    public static final dsw<Boolean> cL = dsw.a(1, "gads:chrome_custom_tabs:disabled", Boolean.FALSE);
    public static final dsw<Boolean> cM = dsw.a(1, "gads:drx_in_app_preview:enabled", Boolean.TRUE);
    public static final dsw<Boolean> cN = dsw.a(1, "gads:drx_debug_signals:enabled", Boolean.TRUE);
    public static final dsw<Boolean> cO = dsw.a(1, "gads:debug_hold_gesture:enabled", Boolean.FALSE);
    public static final dsw<Long> cP = dsw.a(1, "gads:debug_hold_gesture:time_millis", 2000);
    public static final dsw<String> cQ = dsw.a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
    public static final dsw<String> cR = dsw.a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
    public static final dsw<String> cS = dsw.a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
    public static final dsw<String> cT = dsw.a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
    public static final dsw<Integer> cU = dsw.a(1, "gads:drx_debug:timeout_ms", (int) CrashReportManager.TIME_WINDOW);
    public static final dsw<Integer> cV = dsw.a(1, "gad:pixel_dp_comparision_multiplier", 1);
    public static final dsw<Boolean> cW = dsw.a(1, "gad:interstitial_for_multi_window", Boolean.FALSE);
    public static final dsw<Boolean> cX = dsw.a(1, "gad:interstitial_ad_stay_active_in_multi_window", Boolean.FALSE);
    public static final dsw<Integer> cY = dsw.a(1, "gad:interstitial:close_button_padding_dip", 0);
    public static final dsw<Boolean> cZ = dsw.a(1, "gads:clearcut_logging:enabled", Boolean.FALSE);
    public static final dsw<Integer> ca = dsw.a(1, "gads:native_video_load_timeout", 10);
    public static final dsw<Integer> cb = dsw.a(1, "gads:omid:native_webview_load_timeout", 2000);
    public static final dsw<String> cc = dsw.a(1, "gads:ad_choices_content_description", "Ad Choices Icon");
    public static final dsw<Boolean> cd = dsw.a(1, "gads:clamp_native_video_player_dimensions", Boolean.TRUE);
    public static final dsw<Boolean> ce = dsw.a(1, "gads:enable_store_active_view_state", Boolean.FALSE);
    public static final dsw<Boolean> cf = dsw.a(1, "gads:enable_singleton_broadcast_receiver", Boolean.FALSE);
    public static final dsw<Boolean> cg = dsw.a(1, "gads:native:overlay_new_fix:enabled", Boolean.TRUE);
    public static final dsw<Boolean> ch = dsw.a(1, "gads:native:count_impression_for_assets", Boolean.FALSE);
    public static final dsw<Boolean> ci = dsw.a(1, "gads:native:custom_one_point_five_click:enable", Boolean.TRUE);
    public static final dsw<Boolean> cj = dsw.a(1, "gads:unified_native_ad:enable", Boolean.TRUE);
    public static final dsw<Boolean> ck = dsw.a(1, "gads:fluid_ad:use_wrap_content_height", Boolean.FALSE);
    public static final dsw<Boolean> cl = dsw.a(0, "gads:method_tracing:enabled", Boolean.FALSE);
    public static final dsw<Long> cm = dsw.a(0, "gads:method_tracing:duration_ms", 30000);
    public static final dsw<Integer> cn = dsw.a(0, "gads:method_tracing:count", 5);
    public static final dsw<Integer> co = dsw.a(0, "gads:method_tracing:filesize", 134217728);
    public static final dsw<Long> cp = dsw.a(1, "gads:auto_location_timeout", 2000);
    public static final dsw<Boolean> cq = dsw.a(1, "gads:fetch_app_settings_using_cld:enabled", Boolean.FALSE);
    public static final dsw<Long> cr = dsw.a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);
    public static final dsw<String> cs = dsw.a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");
    public static final dsw<String> ct = dsw.a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");
    public static final dsw<String> cu = dsw.a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");
    public static final dsw<String> cv = dsw.a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
    public static final dsw<String> cw = dsw.a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
    public static final dsw<Long> cx = dsw.a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000);
    public static final dsw<Long> cy = dsw.a(1, "gads:parental_controls:timeout", 2000);
    public static final dsw<Boolean> cz = dsw.a(0, "gads:safe_browsing:debug", Boolean.FALSE);
    public static final dsw<Boolean> d = dsw.a(0, "gads:sdk_crash_report_full_stacktrace", Boolean.FALSE);
    public static final dsw<Boolean> da = dsw.a(1, "gads:clearcut_logging:write_to_file", Boolean.FALSE);
    public static final dsw<Boolean> db = dsw.a(0, "gad:force_local_ad_request_service:enabled", Boolean.FALSE);
    public static final dsw<Boolean> dc = dsw.a(0, "gad:force_dynamite_loading_enabled", Boolean.FALSE);
    public static final dsw<Integer> dd = dsw.a(1, "gad:http_redirect_max_count:times", 8);
    public static final dsw<Boolean> de = dsw.a(1, "gads:omid:enabled", Boolean.FALSE);
    public static final dsw<Boolean> df = dsw.a(1, "gads:nonagon:banner:check_dp_size", Boolean.FALSE);
    public static final dsw<Long> dg = dsw.a(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);
    public static final dsw<String> dh = dsw.a(0, "gads:public_beta:traffic_multiplier", BuildConfig.VERSION_NAME);
    public static final dsw<Boolean> di = dsw.a(1, "gads:real_test_request:enabled", Boolean.TRUE);
    public static final dsw<Boolean> dj = dsw.a(1, "gads:real_test_request:render_webview_label", Boolean.TRUE);
    public static final dsw<Boolean> dk = dsw.a(1, "gads:real_test_request:render_native_label", Boolean.TRUE);
    public static final dsw<Integer> dl = dsw.a(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);
    public static final dsw<Integer> dm = dsw.a(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 27);
    public static final dsw<Integer> dn = dsw.a(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 26);

    /* renamed from: do reason: not valid java name */
    public static final dsw<Integer> f8do = dsw.a(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 27);
    private static final dsw<Integer> dp = dsw.a(1, "gads:heap_wastage:bytes", 0);
    public static final dsw<String> e = dsw.a(0, "gads:sdk_crash_report_class_prefix", "com.google.");
    public static final dsw<Float> f = dsw.a(1, "gads:trapped_exception_sample_rate", 0.01f);
    public static final dsw<Boolean> g = dsw.a(0, "gads:block_autoclicks", Boolean.FALSE);
    public static final dsw<String> h = dsw.a(1, "gads:video_exo_player:version", "1");
    public static final dsw<Integer> i = dsw.a(1, "gads:video_exo_player:connect_timeout", 8000);
    public static final dsw<Integer> j = dsw.a(1, "gads:video_exo_player:read_timeout", 8000);
    public static final dsw<Integer> k = dsw.a(1, "gads:video_exo_player:loading_check_interval", 1048576);
    public static final dsw<Integer> l = dsw.a(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);
    public static final dsw<Integer> m = dsw.a(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);
    public static final dsw<Integer> n = dsw.a(1, "gads:video_stream_cache:limit_count", 5);
    public static final dsw<Integer> o = dsw.a(1, "gads:video_stream_cache:limit_space", 8388608);
    public static final dsw<Integer> p = dsw.a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);
    public static final dsw<Long> q = dsw.a(1, "gads:video_stream_cache:limit_time_sec", 300);
    public static final dsw<Long> r = dsw.a(1, "gads:video_stream_cache:notify_interval_millis", 125);
    public static final dsw<Integer> s = dsw.a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final dsw<Boolean> t = dsw.a(0, "gads:video:metric_reporting_enabled", Boolean.FALSE);
    public static final dsw<String> u;
    public static final dsw<Long> v = dsw.a(1, "gads:video:metric_frame_hash_time_leniency", 500);
    public static final dsw<Boolean> w = dsw.a(1, "gads:video:force_watermark", Boolean.FALSE);
    public static final dsw<Long> x = dsw.a(1, "gads:video:surface_update_min_spacing_ms", 1000);
    public static final dsw<Boolean> y = dsw.a(1, "gads:video:spinner:enabled", Boolean.FALSE);
    public static final dsw<Integer> z = dsw.a(1, "gads:video:spinner:scale", 4);

    static {
        dsw.a(0, "gads:sdk_core_experiment_id");
        dsw.a(0, "gads:sdk_core_js_location", "http://=");
        dsw.a(0, "gads:request_builder:singleton_webview", Boolean.FALSE);
        dsw.a(0, "gads:request_builder:singleton_webview_experiment_id");
        dsw.a(0, "gads:sdk_use_dynamic_module", Boolean.TRUE);
        dsw.a(0, "gads:sdk_use_dynamic_module_experiment_id");
        dsw.a(0, "gads:block_autoclicks_experiment_id");
        dsw.a(0, "gads:spam_app_context:experiment_id");
        dsw.a(1, "gads:http_url_connection_factory:timeout_millis", 10000);
        dsw.a(0, "gads:video_stream_cache:experiment_id");
        String str = "";
        u = dsw.a(1, "gads:video:metric_frame_hash_times", str);
        E = dsw.a(1, "gads:video:codec_query_mime_types", str);
        dsw.a(0, "gads:ad_id_app_context:enabled", Boolean.FALSE);
        dsw.a(0, "gads:ad_id_app_context:ping_ratio", 0.0f);
        dsw.a(0, "gads:ad_id_app_context:experiment_id");
        dsw.a(0, "gads:ad_id_use_shared_preference:experiment_id");
        dsw.a(0, "gads:ad_id_use_shared_preference:enabled", Boolean.FALSE);
        dsw.a(0, "gads:ad_id_use_shared_preference:ping_ratio", 0.0f);
        dsw.a(0, "gads:ad_id_use_persistent_service:enabled", Boolean.FALSE);
        dsw.a(0, "gads:ad_id:use_ipc:enabled", Boolean.FALSE);
        dsw.b(0, "gads:looper_for_gms_client:experiment_id");
        dsw.a(0, "gads:sw_dynamite:enabled", Boolean.TRUE);
        dsw.a(0, "gads:app_index:without_content_info_present:enabled", Boolean.TRUE);
        dsw.a(0, "gads:app_index:timeout_ms", 1000);
        dsw.a(0, "gads:app_index:experiment_id");
        dsw.a(0, "gads:kitkat_interstitial_workaround:experiment_id");
        dsw.a(0, "gads:interstitial_follow_url:experiment_id");
        dsw.a(0, "gads:analytics_enabled", Boolean.TRUE);
        dsw.a(0, "gads:webview_cache_version", 0);
        dsw.b(0, "gads:pan:experiment_id");
        dsw.a(0, "gads:ad_serving:enabled", Boolean.TRUE);
        dsw.a(1, "gads:impression_optimization_enabled", Boolean.FALSE);
        dsw.a(1, "gads:banner_ad_pool:schema", "customTargeting");
        dsw.a(1, "gads:banner_ad_pool:max_queues", 3);
        dsw.a(1, "gads:banner_ad_pool:max_pools", 3);
        String str2 = "(?!)";
        aY = dsw.a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", str2);
        bh = dsw.a(1, "gads:spherical_video:vertex_shader", str);
        bi = dsw.a(1, "gads:spherical_video:fragment_shader", str);
        dsw.a(0, "gads:adid_reporting:enabled", Boolean.FALSE);
        dsw.a(0, "gads:ad_settings_page_reporting:enabled", Boolean.FALSE);
        dsw.a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.FALSE);
        dsw.a(0, "gads:request_pkg:enabled", Boolean.TRUE);
        dsw.a(0, "gads:gmsg:video_meta:experiment_id");
        dsw.a(1, "gads:network:cache_prediction_duration_s", 300);
        dsw.a(1, "gads:rtb_signal_timeout_ms", 1000);
        bI = dsw.a(1, "gads:gestures:pk", str);
        dsw.a(0, "gads:adid_notification:first_party_check:enabled", Boolean.TRUE);
        dsw.a(0, "gads:edu_device_helper:enabled", Boolean.TRUE);
        dsw.a(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");
        dsw.a(1, "gads:sdk_core_constants:experiment_id");
        bR = dsw.a(1, "gads:sdk_core_constants:caps", str);
        dsw.a(1, "gads:js_flags:disable_phenotype", Boolean.FALSE);
        dsw.a(0, "gads:native:engine_js_url_with_protocol", "http://=");
        dsw.a(1, "gads:native:video_url", "http://=");
        dsw.a(1, "gads:singleton_webview_native:experiment_id");
        dsw.a(1, "gads:auto_location_for_coarse_permission", Boolean.FALSE);
        dsw.b(1, "gads:auto_location_for_coarse_permission:experiment_id");
        dsw.b(1, "gads:auto_location_timeout:experiment_id");
        dsw.a(1, "gads:auto_location_interval", -1);
        dsw.b(1, "gads:auto_location_interval:experiment_id");
        dsw.a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");
        dsw.a(0, "gads:afs:csa:experiment_id");
        dsw.a(0, "gads:afs:csa_ad_manager_enabled", Boolean.TRUE);
        dsw.a(1, "gads:parental_controls:send_from_client", Boolean.TRUE);
        dsw.a(1, "gads:parental_controls:cache_results", Boolean.TRUE);
        dsw.a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");
        dsw.a(0, "gads:safe_browsing:safety_net:delay_ms", 2000);
        dsw.a(1, "gads:cache:ad_request_timeout_millis", 250);
        dsw.a(1, "gads:cache:max_concurrent_downloads", 10);
        dsw.a(1, "gads:cache:javascript_timeout_millis", 5000);
        dsw.a(1, "gads:cache:connection_per_read", Boolean.FALSE);
        dsw.a(1, "gads:cache:connection_timeout", 5000);
        dsw.a(1, "gads:cache:read_only_connection_timeout", 5000);
        dsw.a(0, "gads:nonagon:red_button", Boolean.FALSE);
        dsw.a(1, "gads:nonagon:banner:enabled", Boolean.FALSE);
        dsw.a(1, "gads:nonagon:banner:ad_unit_exclusions", str2);
        dsw.a(1, "gads:nonagon:interstitial:enabled", Boolean.FALSE);
        dsw.a(1, "gads:nonagon:interstitial:ad_unit_exclusions", str2);
        dsw.a(1, "gads:nonagon:rewardedvideo:enabled", Boolean.FALSE);
        dsw.a(1, "gads:nonagon:mobile_ads_setting_manager:enabled", Boolean.FALSE);
        dsw.a(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", str2);
        dsw.a(1, "gads:nonagon:nativead:enabled", Boolean.FALSE);
        dsw.a(1, "gads:nonagon:nativead:app_name", str2);
        dsw.a(1, "gads:nonagon:service:enabled", Boolean.FALSE);
        dsw.a(1, "gads:signals:ad_id_info:enabled", Boolean.FALSE);
        dsw.a(1, "gads:signals:app_index:enabled", Boolean.FALSE);
        dsw.a(1, "gads:signals:cache:enabled", Boolean.FALSE);
        dsw.a(1, "gads:signals:doritos:enabled", Boolean.FALSE);
        dsw.a(1, "gads:signals:location:enabled", Boolean.FALSE);
        dsw.a(1, "gads:signals:network_prediction:enabled", Boolean.FALSE);
        dsw.a(1, "gads:signals:parental_control:enabled", Boolean.FALSE);
    }

    public static List<String> a() {
        return dqe.e().a();
    }

    public static void a(Context context) {
        cou.a(context, new dth(context));
        ((Integer) dqe.f().a(dp)).intValue();
    }

    public static void a(Context context, JSONObject jSONObject) {
        dqe.d();
        Editor edit = context.getSharedPreferences("google_ads_flags", 0).edit();
        dqe.e().a(edit, jSONObject);
        dqe.d();
        edit.commit();
    }

    public static List<String> b() {
        dtc e2 = dqe.e();
        List<String> a2 = e2.a();
        for (dsw a3 : e2.c) {
            String str = (String) dqe.f().a(a3);
            if (str != null) {
                a2.add(str);
            }
        }
        return a2;
    }
}
