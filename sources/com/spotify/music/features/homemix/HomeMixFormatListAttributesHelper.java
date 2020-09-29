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
        private final List<nnc> mAffinityUsers;

        public AffinityUsers(@JsonProperty("users") List<nnc> list) {
            this.mAffinityUsers = list;
        }

        public List<nnc> getAffinityUsers() {
            return this.mAffinityUsers;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Tastes implements JacksonModel {
        @JsonProperty("taste")
        private final List<nne> mHomeMixTastes;

        public Tastes(@JsonProperty("taste") List<nne> list) {
            this.mHomeMixTastes = list;
        }

        public List<nne> getHomeMixTastes() {
            return this.mHomeMixTastes;
        }
    }

    public HomeMixFormatListAttributesHelper(rnf rnf) {
        this.a = rnf.b();
    }

    private static String c(uyz uyz) {
        return (String) ((uyz) fay.a(uyz)).q().get("home-mix.v1");
    }

    public final HomeMix a(uyz uyz) {
        String c = c(uyz);
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

    public final List<nne> b(uyz uyz) {
        String c = c(uyz);
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

    public List<nnc> a(uzb uzb) {
        String str = (String) ((uzb) fay.a((uzb) fay.a(uzb))).c().get("home-mix.v1");
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
}
