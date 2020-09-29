package com.spotify.remoteconfig;

public abstract class AndroidLibsNowplayingDrivingProperties implements vhh {

    public enum DontLockWhenInCarView implements vgx {
        DONT_PREVENT_LOCKING("dont_prevent_locking"),
        PREVENT_LOCKING_WHEN_CHARGING("prevent_locking_when_charging"),
        ALWAYS_PREVENT_LOCKING("always_prevent_locking");
        
        final String value;

        private DontLockWhenInCarView(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public static abstract class a {
        public abstract a a(DontLockWhenInCarView dontLockWhenInCarView);

        public abstract a a(boolean z);

        public abstract AndroidLibsNowplayingDrivingProperties a();
    }

    public abstract DontLockWhenInCarView a();

    public abstract boolean b();

    public static AndroidLibsNowplayingDrivingProperties a(vhj vhj) {
        String str = "android-libs-nowplaying-driving";
        DontLockWhenInCarView dontLockWhenInCarView = (DontLockWhenInCarView) vhj.a(str, "dont_lock_when_in_car_view", DontLockWhenInCarView.ALWAYS_PREVENT_LOCKING);
        return new defpackage.vgh.a().a(DontLockWhenInCarView.ALWAYS_PREVENT_LOCKING).a(false).a(dontLockWhenInCarView).a(vhj.a(str, "enable_car_view_voice_search", false)).a();
    }
}
