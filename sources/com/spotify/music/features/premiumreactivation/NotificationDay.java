package com.spotify.music.features.premiumreactivation;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;

public enum NotificationDay {
    ONE_DAY("one_day_ahead_shown_key"),
    THREE_DAYS("three_days_ahead_shown_key"),
    FIVE_DAYS("five_days_ahead_shown_key");
    
    public final b<Object, Boolean> mPreferenceKey;

    private NotificationDay(String str) {
        this.mPreferenceKey = b.b(str);
    }

    public final String a() {
        return this.mPreferenceKey.a;
    }

    public static NotificationDay a(long j) {
        if (j <= 0) {
            return null;
        }
        if (j == 1) {
            return ONE_DAY;
        }
        if (j <= 3) {
            return THREE_DAYS;
        }
        if (j <= 5) {
            return FIVE_DAYS;
        }
        return null;
    }

    public static NotificationDay a(String str) {
        NotificationDay[] values;
        for (NotificationDay notificationDay : values()) {
            if (notificationDay.a().equals(str)) {
                return notificationDay;
            }
        }
        return null;
    }
}
