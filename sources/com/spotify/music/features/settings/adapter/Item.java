package com.spotify.music.features.settings.adapter;

import com.spotify.mobile.android.flags.RolloutFlag;
import java.util.EnumSet;

public enum Item {
    DATA_SAVER_MODE {
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

        public final Group a(fpt fpt) {
            return Group.DATA_SAVER;
        }
    },
    ACCOUNT {
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

        public final Group a(fpt fpt) {
            return Group.ACCOUNT;
        }
    },
    OFFLINE_MODE {
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

        public final Group a(fpt fpt) {
            return Group.PLAYBACK;
        }
    },
    CROSSFADE {
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

        public final Group a(fpt fpt) {
            return Group.PLAYBACK;
        }
    },
    GAPLESS {
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

        public final Group a(fpt fpt) {
            return Group.PLAYBACK;
        }
    },
    AUTOMIX {
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

        public final Group a(fpt fpt) {
            return Group.PLAYBACK;
        }
    },
    PLAY_EXPLICIT_CONTENT {
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

        public final Group a(fpt fpt) {
            return Group.PLAYBACK;
        }
    },
    UNAVAILABLE_TRACKS {
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

        public final Group a(fpt fpt) {
            return Group.PLAYBACK;
        }
    },
    NORMALIZE {
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

        public final Group a(fpt fpt) {
            return Group.PLAYBACK;
        }
    },
    LOUDNESS_ENVIRONMENT {
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

        public final Group a(fpt fpt) {
            return Group.PLAYBACK;
        }
    },
    SEND_BROADCASTS {
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

        public final Group a(fpt fpt) {
            return Group.PLAYBACK;
        }
    },
    AUTOPLAY {
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

        public final Group a(fpt fpt) {
            return Group.PLAYBACK;
        }
    },
    AB_STORYLINES {
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

        public final Group a(fpt fpt) {
            return Group.PLAYBACK;
        }
    },
    CANVAS {
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

        public final Group a(fpt fpt) {
            return Group.PLAYBACK;
        }
    },
    MUSIC_LITE_AUTO_OPEN {
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

        public final Group a(fpt fpt) {
            return Group.PLAYBACK;
        }
    },
    DEVICE_PICKER {
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

        public final Group a(fpt fpt) {
            return Group.SPOTIFY_CONNECT;
        }
    },
    APPS_NAVIGATION {
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

        public final Group a(fpt fpt) {
            return Group.APPS;
        }
    },
    LANGUAGE_PREFERENCE {
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

        public final Group a(fpt fpt) {
            return Group.LANGUAGE_PREFERENCE;
        }
    },
    LOCAL_DEVICE_SETTINGS {
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

        public final Group a(fpt fpt) {
            return Group.SPOTIFY_CONNECT;
        }
    },
    DRIVING_MODE_AUTO_LAUNCH {
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

        public final Group a(fpt fpt) {
            return Group.CAR;
        }
    },
    DRIVING_MODE_ALWAYS_ON {
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

        public final Group a(fpt fpt) {
            return Group.CAR;
        }
    },
    PRIVATE_SESSION {
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

        public final Group a(fpt fpt) {
            return Group.SOCIAL;
        }
    },
    LISTENING_ACTIVITY {
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

        public final Group a(fpt fpt) {
            return Group.SOCIAL;
        }
    },
    RECENTLY_PLAYED_ARTISTS {
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

        public final Group a(fpt fpt) {
            return Group.SOCIAL;
        }
    },
    FACEBOOK {
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

        public final Group a(fpt fpt) {
            return Group.SOCIAL;
        }
    },
    WAZE {
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

        public final Group a(fpt fpt) {
            if (fpt.a(rvd.a) == RolloutFlag.ENABLED) {
                return Group.APPS;
            }
            return Group.SOCIAL;
        }
    },
    STREAM_QUALITY {
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

        public final Group a(fpt fpt) {
            return Group.MUSIC_QUALITY;
        }
    },
    DOWNLOAD_QUALITY {
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

        public final Group a(fpt fpt) {
            return Group.MUSIC_QUALITY;
        }
    },
    DOWNLOAD_OVER_3G {
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

        public final Group a(fpt fpt) {
            return Group.MUSIC_QUALITY;
        }
    },
    AUDIO_EFFECTS {
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

        public final Group a(fpt fpt) {
            return Group.MUSIC_QUALITY;
        }
    },
    STORAGE_BAR {
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

        public final Group a(fpt fpt) {
            return Group.STORAGE;
        }
    },
    DELETE_CACHE {
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

        public final Group a(fpt fpt) {
            return Group.STORAGE;
        }
    },
    NOTIFICATIONS {
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

        public final Group a(fpt fpt) {
            return Group.NOTIFICATIONS;
        }
    },
    AD_PARTNER_PREFERENCES {
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

        public final Group a(fpt fpt) {
            return Group.ADVERTISEMENTS;
        }
    },
    VOICE_ADS {
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

        public final Group a(fpt fpt) {
            return Group.ADVERTISEMENTS;
        }
    },
    VERSION {
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

        public final Group a(fpt fpt) {
            return Group.ABOUT;
        }
    },
    LICENSES {
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

        public final Group a(fpt fpt) {
            return Group.ABOUT;
        }
    },
    LICENSING_INFO {
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

        public final Group a(fpt fpt) {
            return Group.ABOUT;
        }
    },
    SCTA_INFO {
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

        public final Group a(fpt fpt) {
            return Group.ABOUT;
        }
    },
    TERMS_CONDITIONS {
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

        public final Group a(fpt fpt) {
            return Group.ABOUT;
        }
    },
    PRIVACY_POLICY {
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

        public final Group a(fpt fpt) {
            return Group.ABOUT;
        }
    },
    VOICE_EULA {
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

        public final Group a(fpt fpt) {
            return Group.ABOUT;
        }
    },
    BUG_REPORTING {
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

        public final Group a(fpt fpt) {
            return Group.ABOUT;
        }
    },
    SUPPORT {
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

        public final Group a(fpt fpt) {
            return Group.ABOUT;
        }
    },
    STORAGE {
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

        public final Group a(fpt fpt) {
            return Group.OTHER;
        }
    },
    LOCAL_FILES_IMPORT {
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

        public final Group a(fpt fpt) {
            return Group.IMPORT;
        }
    },
    LOGOUT {
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

        public final Group a(fpt fpt) {
            return Group.OTHER;
        }
    },
    DEBUG_TOOLS {
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

        public final Group a(fpt fpt) {
            return Group.OTHER;
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

        private DisableWhen(String str, int i) {
        }

        public static DisableWhen valueOf(String str) {
            return (DisableWhen) Enum.valueOf(DisableWhen.class, str);
        }

        public static DisableWhen[] values() {
            return (DisableWhen[]) h.clone();
        }

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
    }

    public enum For {
        public static final For a = null;
        public static final For b = null;
        private static For c;
        private static final /* synthetic */ For[] d = null;

        private For(String str, int i) {
        }

        public static For valueOf(String str) {
            return (For) Enum.valueOf(For.class, str);
        }

        public static For[] values() {
            return (For[]) d.clone();
        }

        static {
            a = new For("REGISTERED_USER", 0);
            c = new For("ANONYMOUS_USER", 1);
            b = new For("ANY_USER", 2);
            d = new For[]{a, c, b};
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

        private ShowWhen(String str, int i2) {
        }

        public static ShowWhen valueOf(String str) {
            return (ShowWhen) Enum.valueOf(ShowWhen.class, str);
        }

        public static ShowWhen[] values() {
            return (ShowWhen[]) p.clone();
        }

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
    }

    public abstract Group a(fpt fpt);

    public abstract For a();

    public abstract ShowWhen b();

    public abstract EnumSet<DisableWhen> c();

    public abstract ViewType d();
}
