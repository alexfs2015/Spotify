package com.spotify.mobile.android.connect.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.EnumSet;
import java.util.Locale;

public interface DeviceState {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public enum GaiaDeviceState implements DeviceState, JacksonModel {
        CONNECTING,
        INCOMPATIBLE,
        UNAVAILABLE,
        LOGGED_IN,
        NOT_LOGGED_IN,
        PREMIUM_REQUIRED,
        NOT_INSTALLED,
        UNSUPPORTED_URI,
        SLEEPING,
        NOT_AUTHORIZED;
        
        static final EnumSet<GaiaDeviceState> GAIA_DISABLED_STATES = null;
        public static final DeviceState[] VALUES = null;

        static {
            VALUES = values();
            GAIA_DISABLED_STATES = EnumSet.of(NOT_AUTHORIZED, new GaiaDeviceState[]{UNAVAILABLE, PREMIUM_REQUIRED, INCOMPATIBLE, NOT_INSTALLED, UNSUPPORTED_URI});
        }

        @JsonCreator
        public static GaiaDeviceState fromValue(String str) {
            try {
                return (GaiaDeviceState) Enum.valueOf(GaiaDeviceState.class, str.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                Object[] objArr = {str};
                String str2 = "r/sn iAISe/Aa ntsNo,b tL /ielns%VvteAer  upretEgceULa/UaB";
                Logger.b("Unable to parse DeviceState '%s', returning UNAVAILABLE", objArr);
                return UNAVAILABLE;
            }
        }

        @JsonValue
        public final String toJson() {
            return name().toLowerCase(Locale.US);
        }
    }

    int ordinal();
}
