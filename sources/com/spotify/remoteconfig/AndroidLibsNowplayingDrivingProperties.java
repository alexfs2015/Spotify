package com.spotify.remoteconfig;

public abstract class AndroidLibsNowplayingDrivingProperties implements vum {

    public enum DontLockWhenInCarView implements vuc {
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

    public static AndroidLibsNowplayingDrivingProperties a(vuo vuo) {
        String str = "android-libs-nowplaying-driving";
        DontLockWhenInCarView dontLockWhenInCarView = (DontLockWhenInCarView) vuo.a(str, "dont_lock_when_in_car_view", DontLockWhenInCarView.ALWAYS_PREVENT_LOCKING);
        return new defpackage.vtk.a().a(DontLockWhenInCarView.ALWAYS_PREVENT_LOCKING).a(false).a(dontLockWhenInCarView).a(vuo.a(str, "enable_car_view_voice_search", false)).a();
    }

    public abstract DontLockWhenInCarView a();

    public abstract boolean b();
}
