package com.spotify.libs.pse.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PreSignupExperimentFlags implements JacksonModel {
    public static final String FLAG_KEY_ENABLE_BOOTSTRAP = "enable_bootstrap";
    public static final String FLAG_KEY_ENABLE_LOGIN5 = "enable_login5";
    public static final String FLAG_KEY_ENABLE_LOGIN5_DARK_LOADING = "enable_login5_dark_loading";
    public static final String FLAG_KEY_ENABLE_MULTIPLE_VALUE_AUTO_SCROLL = "enable_multiple_value_proposition_auto_scroll";
    public static final String FLAG_KEY_ENABLE_MULTIPLE_VALUE_PROPOSITION = "enable_multiple_value_proposition";
    public static final String FLAG_KEY_ENABLE_PHONE_NUMBER_SIGNUP = "enable_phone_number";
    public static final String FLAG_KEY_ENABLE_SAMSUNG_LOGIN = "enable_samsung_login";
    public static final String FLAG_KEY_REMOTE_PASSWORD_VALIDATION_DISABLED = "remote_password_validation_disabled";
    public static final String FLAG_LOCAL_VALUE_PROP_BR = "flag_local_value_prop_br";
    public static final String FLAG_LOCAL_VALUE_PROP_CONTROL = "flag_local_value_prop_control";
    public static final String FLAG_LOCAL_VALUE_PROP_DE = "flag_local_value_prop_de";
    public static final String FLAG_LOCAL_VALUE_PROP_HK = "flag_local_value_prop_hk";
    public static final String FLAG_LOCAL_VALUE_PROP_ID = "flag_local_value_prop_id";
    public static final String FLAG_LOCAL_VALUE_PROP_JP = "flag_local_value_prop_jp";
    public static final String FLAG_LOCAL_VALUE_PROP_PH = "flag_local_value_prop_ph";
    public static final String FLAG_LOCAL_VALUE_PROP_TH = "flag_local_value_prop_th";
    public static final String FLAG_LOCAL_VALUE_PROP_TW = "flag_local_value_prop_tw";
    public static final String FLAG_LOCAL_VALUE_PROP_VN = "flag_local_value_prop_vn";
    public static final String FLAG_MULTIPLE_VALUE_PROPS_VARIANT_1 = "flag_multiple_value_props_variant_1";
    public static final String FLAG_MULTIPLE_VALUE_PROPS_VARIANT_2 = "flag_multiple_value_props_variant_2";
    public static final String FLAG_MULTIPLE_VALUE_PROPS_VARIANT_3 = "flag_multiple_value_props_variant_3";
    private static final String FLAG_SPLITTER = ":";
    public static final b<Object, String> PREFS_KEY_PRE_SIGNUP_EXPERIMENT_FEATURE_FLAGS = b.a("pre-signup-experiment-flags");
    private final ImmutableSet<String> mActiveFlags;
    private final ImmutableSet<String> mInactiveFlags;

    @JsonCreator
    public PreSignupExperimentFlags(Map<String, Boolean> map) {
        a j = ImmutableSet.j();
        a j2 = ImmutableSet.j();
        for (Entry entry : map.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                j.b(entry.getKey());
            } else {
                j2.b(entry.getKey());
            }
        }
        this.mActiveFlags = j.a();
        this.mInactiveFlags = j2.a();
    }

    public boolean isEnabled(String str) {
        return this.mActiveFlags.contains(str);
    }

    public Set<String> activeFlags() {
        return this.mActiveFlags;
    }

    public String activeFlagsAsString() {
        return fau.a(FLAG_SPLITTER).a((Iterable<?>) ImmutableList.a((Comparator<? super E>) fct.a(fct.b()), fbx.a((Iterable<E>) this.mActiveFlags).a()));
    }

    public Set<String> inactiveFlags() {
        return this.mInactiveFlags;
    }

    public void savePreference(SpSharedPreferences<Object> spSharedPreferences) {
        spSharedPreferences.a().a(PREFS_KEY_PRE_SIGNUP_EXPERIMENT_FEATURE_FLAGS, activeFlagsAsString()).b();
    }

    public static PreSignupExperimentFlags loadPreference(SpSharedPreferences<Object> spSharedPreferences) {
        HashMap hashMap = new HashMap();
        for (String put : ((String) fay.a(spSharedPreferences.c(PREFS_KEY_PRE_SIGNUP_EXPERIMENT_FEATURE_FLAGS))).split(FLAG_SPLITTER)) {
            hashMap.put(put, Boolean.TRUE);
        }
        return new PreSignupExperimentFlags(hashMap);
    }
}
