package com.spotify.music.features.voiceassistant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.util.Assertion;
import java.util.Locale;

public final class NaturalLanguageSearchModel {

    @JsonPropertyOrder(alphabetic = true)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ParsedQuery implements JacksonModel {
        @JsonIgnore
        public static final String INTENT_FOLLOW = "FOLLOW";
        @JsonIgnore
        public static final String INTENT_PLAY = "PLAY";
        @JsonIgnore
        public static final String INTENT_UNFOLLOW = "UNFOLLOW";
        @JsonIgnore
        private final String mIntent;
        @JsonIgnore
        private final String mUri;

        public ParsedQuery(String str, String str2) {
            this.mIntent = (String) fbp.a(str);
            this.mUri = wer.a((String) fbp.a(str2)).toString();
        }

        @JsonGetter("intent")
        public String getIntent() {
            return this.mIntent;
        }

        @JsonGetter("uri")
        public String getUri() {
            return this.mUri;
        }
    }

    @JsonPropertyOrder(alphabetic = true)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Request implements JacksonModel {
        @JsonIgnore
        private final String mLanguage;
        @JsonIgnore
        private final ParsedQuery mParsedQuery;
        @JsonIgnore
        private final SourceDevice mSourceDevice;
        @JsonIgnore
        private final String mTextQuery;

        public Request(String str, String str2, ParsedQuery parsedQuery, SourceDevice sourceDevice) {
            this.mTextQuery = (String) fbp.a(str);
            this.mLanguage = (String) fbp.a(str2);
            this.mParsedQuery = (ParsedQuery) fbp.a(parsedQuery);
            this.mSourceDevice = (SourceDevice) fbp.a(sourceDevice);
        }

        @JsonGetter("text_query_language")
        public String getLanguage() {
            return this.mLanguage;
        }

        @JsonGetter("parsed_query")
        public ParsedQuery getParsedQuery() {
            return this.mParsedQuery;
        }

        @JsonGetter("source_device")
        public SourceDevice getSourceDevice() {
            return this.mSourceDevice;
        }

        @JsonGetter("text_query")
        public String getTextQuery() {
            return this.mTextQuery;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Response implements JacksonModel {
        public static final String EMPTY_VIEW_URI = "";
        private static final String RESULT_SUCCESS = "SUCCESS";
        @JsonIgnore
        private final String mIntent;
        @JsonIgnore
        private final PlayerContext mPlayContext;
        @JsonIgnore
        private final PlayOptions mPlayOptions;
        @JsonIgnore
        private final PlayOrigin mPlayOrigin;
        @JsonIgnore
        private final String mResult;
        @JsonIgnore
        private final String mViewUri;

        @JsonCreator
        public Response(@JsonProperty("intent") String str, @JsonProperty("result") String str2, @JsonProperty("context") PlayerContext playerContext, @JsonProperty("play_options") PlayOptions playOptions, @JsonProperty("play_origin") PlayOrigin playOrigin, @JsonProperty("view_uri") String str3) {
            this.mIntent = str;
            this.mResult = str2;
            this.mPlayContext = playerContext;
            this.mPlayOptions = playOptions;
            this.mPlayOrigin = playOrigin;
            this.mViewUri = str3;
        }

        @JsonGetter("intent")
        public String getIntent() {
            Assertion.a((Object) this.mIntent);
            return this.mIntent;
        }

        @JsonGetter("context")
        public PlayerContext getPlayContext() {
            return this.mPlayContext;
        }

        @JsonGetter("play_options")
        public PlayOptions getPlayOptions() {
            Assertion.a((Object) this.mPlayOptions);
            return this.mPlayOptions;
        }

        @JsonGetter("play_origin")
        public PlayOrigin getPlayOrigin() {
            Assertion.a((Object) this.mPlayOrigin);
            return this.mPlayOrigin;
        }

        @JsonGetter("result")
        public String getResult() {
            Assertion.a((Object) this.mResult);
            return this.mResult;
        }

        @JsonGetter("view_uri")
        public String getViewUri() {
            String str = this.mViewUri;
            return str != null ? str : "";
        }

        @JsonIgnore
        public boolean isSuccess() {
            return RESULT_SUCCESS.equals(getResult());
        }

        @JsonIgnore
        public String toString() {
            PlayerContext playerContext = this.mPlayContext;
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[2];
            objArr[0] = this.mResult;
            objArr[1] = playerContext != null ? playerContext.uri() : "null context";
            return String.format(locale, "%s: %s", objArr);
        }
    }

    @JsonPropertyOrder(alphabetic = true)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SourceDevice implements JacksonModel {
        @JsonIgnore
        private final String mBrand;
        @JsonIgnore
        private final String mDeviceId;
        @JsonIgnore
        private final String mDeviceType;
        @JsonIgnore
        private final String mModel;

        public SourceDevice(String str, String str2, String str3, String str4) {
            this.mBrand = str;
            this.mModel = str2;
            this.mDeviceType = str3;
            this.mDeviceId = str4;
        }

        @JsonGetter("brand")
        public String getBrand() {
            return this.mBrand;
        }

        @JsonGetter("device_id")
        public String getDeviceId() {
            return this.mDeviceId;
        }

        @JsonGetter("device_type")
        public String getDeviceType() {
            return this.mDeviceType;
        }

        @JsonGetter("model")
        public String getModel() {
            return this.mModel;
        }
    }
}
