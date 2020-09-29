package com.spotify.music.internal.parnerid;

import io.reactivex.Single;

public interface PartnerUserIdEndpoint {

    public enum Vendor {
        CRASHLYTICS("crashlytics"),
        ITERABLE("iterable");
        
        private final String mId;

        private Vendor(String str) {
            this.mId = str;
        }

        public final String toString() {
            return this.mId;
        }
    }

    @wti(a = "partner-userid/encrypted/{vendor}")
    Single<String> a(@wtv(a = "vendor") Vendor vendor);
}
