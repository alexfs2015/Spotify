package com.spotify.mobile.android.service.session;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonDeserialize(using = SessionState_Deserializer.class)
public abstract class SessionState implements Parcelable, JacksonModel {
    @Deprecated
    public static final String PRODUCT_TYPE_FREE = "free";
    @Deprecated
    public static final String PRODUCT_TYPE_PREMIUM = "premium";

    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(hdd hdd);

        public abstract a a(String str);

        public abstract a a(boolean z);

        public abstract a b(String str);

        public abstract a b(boolean z);

        public abstract a c(String str);

        public abstract a c(boolean z);

        public abstract a d(boolean z);

        public abstract a e(boolean z);

        public abstract a f(boolean z);
    }

    static final class b extends upy<hdd> {
        protected b() {
            super(hdd.CREATOR);
        }
    }

    public abstract boolean canConnect();

    @Deprecated
    public abstract boolean canStream();

    public abstract boolean connected();

    @Deprecated
    public abstract String countryCode();

    public abstract int currentAccountType();

    public abstract String currentUser();

    public abstract String currentUserName();

    public abstract boolean loggedIn();

    public abstract boolean loggingIn();

    public abstract boolean loggingOut();

    @Deprecated
    public abstract hdd paymentState();

    @Deprecated
    public abstract String productType();

    public abstract a toBuilder();

    @JsonCreator
    public static SessionState create(@JsonProperty("current_user") String str, @JsonProperty("current_user_name") String str2, @JsonProperty("logged_in") boolean z, @JsonProperty("logging_in") boolean z2, @JsonProperty("logging_out") boolean z3, @JsonProperty("current_account_type") int i, @JsonProperty("country_code") String str3, @JsonProperty("connected") boolean z4, @JsonProperty("can_connect") boolean z5, @JsonProperty("can_stream") boolean z6, @JsonProperty("payment_state") String str4, @JsonProperty("product_type") String str5) {
        AutoValue_SessionState autoValue_SessionState = new AutoValue_SessionState(str, str2, z, z2, z3, i, str3, z4, z5, z6, new hdd(str4), str5);
        return autoValue_SessionState;
    }

    public static a builder() {
        a aVar = new a();
        String str = "";
        aVar.a = str;
        return aVar.a(str).a(false).b(false).c(false).a(0).b(str).d(false).e(false).f(false).a(new hdd((String) null)).c(str);
    }
}
