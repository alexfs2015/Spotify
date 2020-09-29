package com.spotify.music.features.settings.adapter;

import com.spotify.mobile.android.flags.RolloutFlag;
import java.util.EnumSet;

public enum Item {
    DATA_SAVER_MODE {
        public final Group a(fqn fqn) {
            return Group.DATA_SAVER;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    ACCOUNT {
        public final Group a(fqn fqn) {
            return Group.ACCOUNT;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.l;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    OFFLINE_MODE {
        public final Group a(fqn fqn) {
            return Group.PLAYBACK;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.e;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.CHECK_BOX;
        }
    },
    CROSSFADE {
        public final Group a(fqn fqn) {
            return Group.PLAYBACK;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.CROSSFADE;
        }
    },
    GAPLESS {
        public final Group a(fqn fqn) {
            return Group.PLAYBACK;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.CHECK_BOX;
        }
    },
    AUTOMIX {
        public final Group a(fqn fqn) {
            return Group.PLAYBACK;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.CHECK_BOX;
        }
    },
    PLAY_EXPLICIT_CONTENT {
        public final Group a(fqn fqn) {
            return Group.PLAYBACK;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.g);
        }

        public final ViewType d() {
            return ViewType.CHECK_BOX;
        }
    },
    UNAVAILABLE_TRACKS {
        public final Group a(fqn fqn) {
            return Group.PLAYBACK;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.CHECK_BOX;
        }
    },
    NORMALIZE {
        public final Group a(fqn fqn) {
            return Group.PLAYBACK;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.CHECK_BOX;
        }
    },
    LOUDNESS_ENVIRONMENT {
        public final Group a(fqn fqn) {
            return Group.PLAYBACK;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.e);
        }

        public final ViewType d() {
            return ViewType.SPINNER;
        }
    },
    SEND_BROADCASTS {
        public final Group a(fqn fqn) {
            return Group.PLAYBACK;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.BROADCAST;
        }
    },
    AUTOPLAY {
        public final Group a(fqn fqn) {
            return Group.PLAYBACK;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    AB_STORYLINES {
        public final Group a(fqn fqn) {
            return Group.PLAYBACK;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    CANVAS {
        public final Group a(fqn fqn) {
            return Group.PLAYBACK;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.f);
        }

        public final ViewType d() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    MUSIC_LITE_AUTO_OPEN {
        public final Group a(fqn fqn) {
            return Group.PLAYBACK;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    DEVICE_PICKER {
        public final Group a(fqn fqn) {
            return Group.SPOTIFY_CONNECT;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    APPS_NAVIGATION {
        public final Group a(fqn fqn) {
            return Group.APPS;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    LANGUAGE_PREFERENCE {
        public final Group a(fqn fqn) {
            return Group.LANGUAGE_PREFERENCE;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.n;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    LOCAL_DEVICE_SETTINGS {
        public final Group a(fqn fqn) {
            return Group.SPOTIFY_CONNECT;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    DRIVING_MODE_AUTO_LAUNCH {
        public final Group a(fqn fqn) {
            return Group.CAR;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.o;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    DRIVING_MODE_ALWAYS_ON {
        public final Group a(fqn fqn) {
            return Group.CAR;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.o;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    PRIVATE_SESSION {
        public final Group a(fqn fqn) {
            return Group.SOCIAL;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.CHECK_BOX;
        }
    },
    LISTENING_ACTIVITY {
        public final Group a(fqn fqn) {
            return Group.SOCIAL;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    RECENTLY_PLAYED_ARTISTS {
        public final Group a(fqn fqn) {
            return Group.SOCIAL;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    FACEBOOK {
        public final Group a(fqn fqn) {
            return Group.SOCIAL;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.m;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.FACEBOOK;
        }
    },
    WAZE {
        public final Group a(fqn fqn) {
            return fqn.a(sen.a) == RolloutFlag.ENABLED ? Group.APPS : Group.SOCIAL;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.WAZE;
        }
    },
    STREAM_QUALITY {
        public final Group a(fqn fqn) {
            return Group.MUSIC_QUALITY;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.f, DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.SPINNER;
        }
    },
    DOWNLOAD_QUALITY {
        public final Group a(fqn fqn) {
            return Group.MUSIC_QUALITY;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.d;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.SPINNER;
        }
    },
    DOWNLOAD_OVER_3G {
        public final Group a(fqn fqn) {
            return Group.MUSIC_QUALITY;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.e;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.CHECK_BOX;
        }
    },
    AUDIO_EFFECTS {
        public final Group a(fqn fqn) {
            return Group.MUSIC_QUALITY;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.c;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.b);
        }

        public final ViewType d() {
            return ViewType.AUDIO_EFFECTS;
        }
    },
    STORAGE_BAR {
        public final Group a(fqn fqn) {
            return Group.STORAGE;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.d);
        }

        public final ViewType d() {
            return ViewType.STORAGE_BAR;
        }
    },
    DELETE_CACHE {
        public final Group a(fqn fqn) {
            return Group.STORAGE;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    NOTIFICATIONS {
        public final Group a(fqn fqn) {
            return Group.NOTIFICATIONS;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.NOTIFICATION;
        }
    },
    AD_PARTNER_PREFERENCES {
        public final Group a(fqn fqn) {
            return Group.ADVERTISEMENTS;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.f;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    VOICE_ADS {
        public final Group a(fqn fqn) {
            return Group.ADVERTISEMENTS;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.g;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.NON_ORBIT_CHECK_BOX;
        }
    },
    VERSION {
        public final Group a(fqn fqn) {
            return Group.ABOUT;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.d);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    LICENSES {
        public final Group a(fqn fqn) {
            return Group.ABOUT;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    LICENSING_INFO {
        public final Group a(fqn fqn) {
            return Group.ABOUT;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.j;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    SCTA_INFO {
        public final Group a(fqn fqn) {
            return Group.ABOUT;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.j;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    TERMS_CONDITIONS {
        public final Group a(fqn fqn) {
            return Group.ABOUT;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    PRIVACY_POLICY {
        public final Group a(fqn fqn) {
            return Group.ABOUT;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    VOICE_EULA {
        public final Group a(fqn fqn) {
            return Group.ABOUT;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.k;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    BUG_REPORTING {
        public final Group a(fqn fqn) {
            return Group.ABOUT;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.b;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    SUPPORT {
        public final Group a(fqn fqn) {
            return Group.ABOUT;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    STORAGE {
        public final Group a(fqn fqn) {
            return Group.OTHER;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.i;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.c);
        }

        public final ViewType d() {
            return ViewType.STORAGE;
        }
    },
    LOCAL_FILES_IMPORT {
        public final Group a(fqn fqn) {
            return Group.IMPORT;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.h;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    LOGOUT {
        public final Group a(fqn fqn) {
            return Group.OTHER;
        }

        public final For a() {
            return For.a;
        }

        public final ShowWhen b() {
            return ShowWhen.a;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.TEXT;
        }
    },
    DEBUG_TOOLS {
        public final Group a(fqn fqn) {
            return Group.OTHER;
        }

        public final For a() {
            return For.b;
        }

        public final ShowWhen b() {
            return ShowWhen.b;
        }

        public final EnumSet<DisableWhen> c() {
            return EnumSet.of(DisableWhen.a);
        }

        public final ViewType d() {
            return ViewType.DEBUG;
        }
    };

    public enum DisableWhen {
        public static final DisableWhen a = null;
        public static final DisableWhen b = null;
        public static final DisableWhen c = null;
        public static final DisableWhen d = null;
        public static final DisableWhen e = null;
        public static final DisableWhen f = null;
        public static final DisableWhen g = null;
        private static final /* synthetic */ DisableWhen[] h = null;

        static {
            a = new DisableWhen("NEVER", 0);
            b = new DisableWhen("PLAYING_REMOTELY", 1);
            c = new DisableWhen("DELETING_CACHE", 2);
            d = new DisableWhen("ALWAYS", 3);
            e = new DisableWhen("PLAYING_REMOTELY_OR_NORMALIZATION_DISABLED", 4);
            f = new DisableWhen("DATA_SAVER_MODE", 5);
            g = new DisableWhen("EXPLICIT_SETTINGS_LOCKED", 6);
            h = new DisableWhen[]{a, b, c, d, e, f, g};
        }

        private DisableWhen(String str, int i) {
        }

        public static DisableWhen valueOf(String str) {
            return (DisableWhen) Enum.valueOf(DisableWhen.class, str);
        }

        public static DisableWhen[] values() {
            return (DisableWhen[]) h.clone();
        }
    }

    public enum For {
        public static final For a = null;
        public static final For b = null;
        private static For c;
        private static final /* synthetic */ For[] d = null;

        static {
            a = new For("REGISTERED_USER", 0);
            c = new For("ANONYMOUS_USER", 1);
            b = new For("ANY_USER", 2);
            d = new For[]{a, c, b};
        }

        private For(String str, int i) {
        }

        public static For valueOf(String str) {
            return (For) Enum.valueOf(For.class, str);
        }

        public static For[] values() {
            return (For[]) d.clone();
        }
    }

    public enum ShowWhen {
        public static final ShowWhen a = null;
        public static final ShowWhen b = null;
        public static final ShowWhen c = null;
        public static final ShowWhen d = null;
        public static final ShowWhen e = null;
        public static final ShowWhen f = null;
        public static final ShowWhen g = null;
        public static final ShowWhen h = null;
        public static final ShowWhen i = null;
        public static final ShowWhen j = null;
        public static final ShowWhen k = null;
        public static final ShowWhen l = null;
        public static final ShowWhen m = null;
        public static final ShowWhen n = null;
        public static final ShowWhen o = null;
        private static final /* synthetic */ ShowWhen[] p = null;

        static {
            a = new ShowWhen("EVER", 0);
            b = new ShowWhen("DEBUG_MENU_ENABLED", 1);
            c = new ShowWhen("AUDIO_EFFECTS_CONTROL_AVAILABLE", 2);
            d = new ShowWhen("HIGH_BITRATE_OFFLINE_ENABLED", 3);
            e = new ShowWhen("OFFLINE_ENABLED", 4);
            f = new ShowWhen("AD_PARTNER_PREFERENCES_ENABLED", 5);
            g = new ShowWhen("VOICE_ADS_ENABLED", 6);
            h = new ShowWhen("LOCAL_FILES_IMPORT_ENABLED", 7);
            i = new ShowWhen("SD_CARD_AVAILABLE", 8);
            j = new ShowWhen("LICENSING_SCTA_INFO_ENABLED", 9);
            k = new ShowWhen("VOICE_FEATURE_ENABLED", 10);
            l = new ShowWhen("ACCOUNT_SUBSCRIPTION_ENABLED", 11);
            m = new ShowWhen("NOT_CONNECTED_TO_FACEBOOK", 12);
            n = new ShowWhen("LANGUAGE_ONBOARDING_ENABLED", 13);
            o = new ShowWhen("DRIVING_MODE_AVAILABLE", 14);
            p = new ShowWhen[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o};
        }

        private ShowWhen(String str, int i2) {
        }

        public static ShowWhen valueOf(String str) {
            return (ShowWhen) Enum.valueOf(ShowWhen.class, str);
        }

        public static ShowWhen[] values() {
            return (ShowWhen[]) p.clone();
        }
    }

    public abstract Group a(fqn fqn);

    public abstract For a();

    public abstract ShowWhen b();

    public abstract EnumSet<DisableWhen> c();

    public abstract ViewType d();
}
