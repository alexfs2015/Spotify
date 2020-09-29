package com.spotify.mobile.android.connect.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Locale;

@JsonIgnoreProperties(ignoreUnknown = true)
public interface DeviceType {

    public enum BluetoothTypes implements DeviceType {
        BLUETOOTH;

        static {
            values();
        }
    }

    public enum GaiaTypes implements DeviceType, JacksonModel {
        UNKNOWN(0),
        COMPUTER(1),
        TABLET(2),
        SMARTPHONE(3),
        SPEAKER(4),
        TV(5),
        AVR(6),
        STB(7),
        AUDIO_DONGLE(8),
        GAME_CONSOLE(9),
        CAST_VIDEO(10),
        CAST_AUDIO(11),
        AUTOMOBILE(12),
        SMARTWATCH(13),
        UNKNOWN_SPOTIFY_HW(100),
        CARTHING(101),
        HOMETHING(103);
        
        public static final GaiaTypes[] VALUES = null;
        private final int mValue;

        static {
            VALUES = values();
        }

        private GaiaTypes(int i) {
            this.mValue = i;
        }

        public final int getValue() {
            return this.mValue;
        }

        @JsonCreator
        public static GaiaTypes fromValue(String str) {
            try {
                return (GaiaTypes) Enum.valueOf(GaiaTypes.class, str.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                return UNKNOWN;
            }
        }

        @JsonValue
        public final String toJson() {
            return name().toLowerCase(Locale.US);
        }
    }

    String name();

    int ordinal();
}
