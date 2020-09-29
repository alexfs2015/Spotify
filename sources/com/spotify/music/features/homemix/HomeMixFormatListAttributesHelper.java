package com.spotify.music.features.homemix;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.homemix.models.HomeMix;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public final class HomeMixFormatListAttributesHelper {
    private final ObjectMapper a;

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class AffinityUsers implements JacksonModel {
        @JsonProperty("users")
        private final List<nsr> mAffinityUsers;

        public AffinityUsers(@JsonProperty("users") List<nsr> list) {
            this.mAffinityUsers = list;
        }

        public List<nsr> getAffinityUsers() {
            return this.mAffinityUsers;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Tastes implements JacksonModel {
        @JsonProperty("taste")
        private final List<nst> mHomeMixTastes;

        public Tastes(@JsonProperty("taste") List<nst> list) {
            this.mHomeMixTastes = list;
        }

        public List<nst> getHomeMixTastes() {
            return this.mHomeMixTastes;
        }
    }

    public HomeMixFormatListAttributesHelper(rwl rwl) {
        this.a = rwl.b();
    }

    private static String c(vlc vlc) {
        return (String) ((vlc) fbp.a(vlc)).q().get("home-mix.v1");
    }

    public final HomeMix a(vlc vlc) {
        String c = c(vlc);
        if (c == null) {
            return null;
        }
        try {
            return (HomeMix) this.a.readValue(c, HomeMix.class);
        } catch (IOException e) {
            Logger.e("JSON Parsing error: %s", e.getMessage());
            return null;
        }
    }

    public List<nsr> a(vle vle) {
        String str = (String) ((vle) fbp.a((vle) fbp.a(vle))).c().get("home-mix.v1");
        if (str == null) {
            return Collections.emptyList();
        }
        try {
            return ((AffinityUsers) this.a.readValue(str, AffinityUsers.class)).getAffinityUsers();
        } catch (IOException e) {
            Logger.e("JSON Parsing error: %s", e.getMessage());
            return Collections.emptyList();
        }
    }

    public final List<nst> b(vlc vlc) {
        String c = c(vlc);
        if (c == null) {
            return Collections.emptyList();
        }
        try {
            return ((Tastes) this.a.readValue(c, Tastes.class)).getHomeMixTastes();
        } catch (IOException e) {
            Logger.e("JSON Parsing error: %s", e.getMessage());
            return Collections.emptyList();
        }
    }
}
