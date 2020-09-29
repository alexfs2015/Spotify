package com.spotify.mobile.android.spotlets.appprotocol.model;

import com.comscore.android.id.IdHelperAndroid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.mobile.android.service.media.browser.RootListType;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.music.R;
import com.spotify.music.builtinauth.model.FieldValidator.ValidationException;
import com.spotify.music.nowplaying.core.navcontext.EntityType;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class AppProtocol {
    public static final Empty a = new Empty();
    public static final List<Object> b = Collections.emptyList();
    public static final TrackData c;
    public static final WelcomeDetails d = new WelcomeDetails(null);

    /* renamed from: com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ThumbState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
        static {
            /*
                com.spotify.mobile.android.util.connectivity.ConnectionType[] r0 = com.spotify.mobile.android.util.connectivity.ConnectionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.connectivity.ConnectionType r2 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_3G     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.connectivity.ConnectionType r3 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_4G     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.connectivity.ConnectionType r3 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_EDGE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.util.connectivity.ConnectionType r3 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_ETHERNET     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.mobile.android.util.connectivity.ConnectionType r3 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_GPRS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x004b }
                com.spotify.mobile.android.util.connectivity.ConnectionType r3 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_NONE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.spotify.mobile.android.util.connectivity.ConnectionType r3 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_WLAN     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r4 = 7
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.spotify.mobile.android.util.connectivity.ConnectionType r3 = com.spotify.mobile.android.util.connectivity.ConnectionType.CONNECTION_TYPE_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r4 = 8
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                com.spotify.music.spotlets.radio.model.ThumbState[] r2 = com.spotify.music.spotlets.radio.model.ThumbState.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                a = r2
                int[] r2 = a     // Catch:{ NoSuchFieldError -> 0x0075 }
                com.spotify.music.spotlets.radio.model.ThumbState r3 = com.spotify.music.spotlets.radio.model.ThumbState.UP     // Catch:{ NoSuchFieldError -> 0x0075 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0075 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007f }
                com.spotify.music.spotlets.radio.model.ThumbState r2 = com.spotify.music.spotlets.radio.model.ThumbState.DOWN     // Catch:{ NoSuchFieldError -> 0x007f }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.AnonymousClass1.<clinit>():void");
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Album implements JacksonModel {
        @JsonProperty("name")
        public String name;
        @JsonProperty("type")
        public String type = "album";
        @JsonProperty("uri")
        public String uri;

        public Album(String str, String str2) {
            this.name = str;
            this.uri = str2;
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Alert implements JacksonModel {
        @JsonProperty("long_text")
        public String longText;
        @JsonProperty("short_text")
        public String shortText;
        @JsonProperty("code")
        public int statusCode;

        public Alert(int i, String str, String str2) {
            this.statusCode = i;
            this.shortText = str;
            this.longText = str2;
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Artist implements JacksonModel {
        @JsonProperty("name")
        public String name;
        @JsonProperty("type")
        public String type = "artist";
        @JsonProperty("uri")
        public String uri;

        public Artist(String str, String str2) {
            this.name = str;
            this.uri = str2;
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Capabilities implements JacksonModel {
        @JsonProperty("can_play_on_demand")
        public final boolean canPlayOnDemand;

        public Capabilities(@JsonProperty("can_play_on_demand") boolean z) {
            this.canPlayOnDemand = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Capabilities)) {
                return false;
            }
            return this.canPlayOnDemand == ((Capabilities) obj).canPlayOnDemand;
        }

        public int hashCode() {
            return this.canPlayOnDemand ? 1 : 0;
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Challenge implements JacksonModel {
        @JsonProperty("authid")
        public String authid;
        @JsonProperty("authmethod")
        public String authmethod;
        @JsonProperty("authprovider")
        public String authprovider = "spotify";
        @JsonProperty("authrole")
        public String authrole = "app";
        @JsonProperty("nonce")
        public String nonce;
        @JsonProperty("session")
        public int session;
        @JsonProperty("timestamp")
        public String timestamp;

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChallengeDetails implements JacksonModel {
        @JsonProperty("challenge")
        public String challenge;

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChildrenPageRequest implements JacksonModel {
        @JsonProperty("limit")
        public Integer limit;
        @JsonProperty("offset")
        public int offset;
        @JsonProperty("parent_id")
        public String parentId;
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Context implements JacksonModel {
        public static final Context EMPTY;
        @JsonProperty("can_repeat_context")
        public final Boolean canRepeatContext;
        @JsonProperty("can_repeat_track")
        public final Boolean canRepeatTrack;
        @JsonProperty("can_shuffle")
        public final Boolean canShuffle;
        @JsonProperty("id")
        public final String id;
        @JsonProperty("repeat_context")
        public final Boolean repeatContext;
        @JsonProperty("repeat_track")
        public final Boolean repeatTrack;
        @JsonProperty("shuffle")
        public final Boolean shuffle;
        @JsonProperty("subtitle")
        public final String subtitle;
        @JsonProperty("title")
        public final String title;
        @JsonProperty("type")
        public final String type;
        @JsonProperty("uri")
        public final String uri;

        static {
            Context context = new Context("", "", null, null, "no_context", null, null, null, null, null, null);
            EMPTY = context;
        }

        public Context(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
            this.id = str;
            this.uri = str2;
            this.title = str3;
            this.subtitle = str4;
            this.type = str5;
            this.repeatTrack = bool;
            this.repeatContext = bool2;
            this.shuffle = bool3;
            this.canRepeatTrack = bool4;
            this.canRepeatContext = bool5;
            this.canShuffle = bool6;
        }

        public Context(tcf tcf, com.spotify.mobile.android.cosmos.player.v2.PlayerState playerState, android.content.Context context) {
            this(playerState.entityUri(), playerState.entityUri(), tcf.b(context.getResources()), tcf.a(context.getResources()), getTypeForPlayerState(playerState), Boolean.valueOf(playerState.options().repeatingTrack()), Boolean.valueOf(playerState.options().repeatingContext()), Boolean.valueOf(playerState.options().shufflingContext()), Boolean.valueOf(playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()), Boolean.valueOf(playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty()), Boolean.valueOf(playerState.restrictions().disallowTogglingShuffleReasons().isEmpty()));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Context)) {
                return false;
            }
            Context context = (Context) obj;
            String str = this.id;
            if (str == null ? context.id != null : !str.equals(context.id)) {
                return false;
            }
            String str2 = this.uri;
            if (str2 == null ? context.uri != null : !str2.equals(context.uri)) {
                return false;
            }
            String str3 = this.title;
            if (str3 == null ? context.title != null : !str3.equals(context.title)) {
                return false;
            }
            String str4 = this.subtitle;
            if (str4 == null ? context.subtitle != null : !str4.equals(context.subtitle)) {
                return false;
            }
            Boolean bool = this.repeatTrack;
            if (bool == null ? context.repeatTrack != null : !bool.equals(context.repeatTrack)) {
                return false;
            }
            Boolean bool2 = this.repeatContext;
            if (bool2 == null ? context.repeatContext != null : !bool2.equals(context.repeatContext)) {
                return false;
            }
            Boolean bool3 = this.shuffle;
            if (bool3 == null ? context.shuffle != null : !bool3.equals(context.shuffle)) {
                return false;
            }
            Boolean bool4 = this.canRepeatTrack;
            if (bool4 == null ? context.canRepeatTrack != null : !bool4.equals(context.canRepeatTrack)) {
                return false;
            }
            Boolean bool5 = this.canRepeatContext;
            if (bool5 == null ? context.canRepeatContext != null : !bool5.equals(context.canRepeatContext)) {
                return false;
            }
            Boolean bool6 = this.canShuffle;
            return bool6 == null ? context.canShuffle == null : bool6.equals(context.canShuffle);
        }

        public int hashCode() {
            String str = this.id;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.uri;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.title;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.subtitle;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Boolean bool = this.repeatTrack;
            int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Boolean bool2 = this.repeatContext;
            int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Boolean bool3 = this.shuffle;
            int hashCode7 = (hashCode6 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.canRepeatTrack;
            int hashCode8 = (hashCode7 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Boolean bool5 = this.canRepeatContext;
            int hashCode9 = (hashCode8 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.canShuffle;
            if (bool6 != null) {
                i = bool6.hashCode();
            }
            return hashCode9 + i;
        }

        public String toString() {
            return getClass().getName();
        }

        private static String getTypeForPlayerState(com.spotify.mobile.android.cosmos.player.v2.PlayerState playerState) {
            return EntityType.a(playerState).name().toLowerCase(Locale.US);
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Empty implements JacksonModel {
        public String toString() {
            return "{}";
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class HelloDetails implements JacksonModel {
        @JsonProperty("authid")
        public String authid;
        @JsonProperty("authmethods")
        public String[] authmethods;
        @JsonProperty("extras")
        public Map<String, String> extras;
        @JsonProperty("info")
        public Info info;
        @JsonProperty("roles")
        public Roles roles;

        public String toString() {
            return getClass().getName();
        }

        public kue mapToAuthDetails() {
            return new kuf(this.authid, this.extras, Arrays.asList(this.authmethods));
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Identifier implements JacksonModel {
        @JsonProperty("id")
        public String id;

        public Identifier() {
        }

        public Identifier(String str) {
            this.id = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Identifier)) {
                return false;
            }
            Identifier identifier = (Identifier) obj;
            String str = this.id;
            String str2 = identifier.id;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            String str = this.id;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Image implements JacksonModel {
        public static final int MAX_IMAGE_DIMENSION = 720;
        @JsonProperty("height")
        public int height;
        @JsonProperty("image_data")
        public byte[] imageData;
        @JsonProperty("width")
        public int width;

        public Image(byte[] bArr, int i, int i2) {
            this.imageData = bArr;
            this.width = i;
            this.height = i2;
        }

        public String toString() {
            return String.format(Locale.US, "{\"image\":<binary of size %d>,\"width\":%d,\"height\":%d}", new Object[]{Integer.valueOf(this.imageData.length), Integer.valueOf(this.width), Integer.valueOf(this.height)});
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ImageIdentifier implements JacksonModel {
        @JsonProperty("height")
        public int height;
        @JsonProperty("id")
        public String id;
        @JsonProperty("image_type")
        public String imageType;
        @JsonProperty("width")
        public int width;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageIdentifier)) {
                return false;
            }
            ImageIdentifier imageIdentifier = (ImageIdentifier) obj;
            String str = this.id;
            if (str == null ? imageIdentifier.id != null : !str.equals(imageIdentifier.id)) {
                return false;
            }
            if (this.height != imageIdentifier.height || this.width != imageIdentifier.width) {
                return false;
            }
            String str2 = this.imageType;
            String str3 = imageIdentifier.imageType;
            return str2 == null ? str3 == null : str2.equals(str3);
        }

        public int hashCode() {
            String str = this.id;
            int i = 0;
            int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.height) * 31) + this.width) * 31;
            String str2 = this.imageType;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Info implements JacksonModel {
        private static final String CATEGORY_APP = "app";
        private static final String CATEGORY_CAR = "car";
        private static final String CATEGORY_WEARABLE = "wearable";
        private static final String UNKNOWN_ID = "Unknown_app_protocol_client_id";
        @JsonProperty("category")
        public String category;
        @JsonProperty("default_image_height")
        public int defaultImageHeight;
        @JsonProperty("default_image_width")
        public int defaultImageWidth;
        @JsonProperty("default_thumbnail_image_height")
        public int defaultThumbnailImageHeight;
        @JsonProperty("default_thumbnail_image_width")
        public int defaultThumbnailImageWidth;
        @JsonProperty("id")
        public String id;
        @JsonProperty("image_type")
        public String imageType;
        @JsonProperty("model")
        public String model;
        @JsonProperty("name")
        public String name;
        @JsonProperty("protocol_version")
        public int protocolVersion;
        @JsonProperty("required_features")
        public List<String> requiredFeatures;
        @JsonProperty("version")
        public String version;

        public String idOrUnknown() {
            return fax.a(this.id) ? UNKNOWN_ID : this.id;
        }

        public boolean isCategoryApp() {
            return CATEGORY_APP.equalsIgnoreCase(this.category);
        }

        public boolean isCategoryCar() {
            String str = this.category;
            return str == null || CATEGORY_CAR.equalsIgnoreCase(str);
        }

        public boolean isCategoryWearable() {
            return CATEGORY_WEARABLE.equalsIgnoreCase(this.category);
        }

        public boolean requiresFeature(String str) {
            List<String> list = this.requiredFeatures;
            return list != null && list.contains(str);
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ListItem implements JacksonModel {
        @JsonProperty("available_offline")
        public boolean availableOffline;
        @JsonProperty("has_children")
        public boolean hasChildren;
        @JsonProperty("id")
        public String id;
        @JsonProperty("image_id")
        public String imageUri;
        @JsonProperty("playable")
        public boolean playable;
        @JsonProperty("subtitle")
        public String subtitle;
        @JsonProperty("title")
        public String title;
        @JsonProperty("uri")
        public String uri;

        public ListItem() {
        }

        public ListItem(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
            this.id = str;
            this.uri = str2;
            this.imageUri = str3;
            this.title = str4;
            this.subtitle = str5;
            this.playable = z;
            this.hasChildren = z2;
            this.availableOffline = z3;
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ListItems implements JacksonModel {
        @JsonProperty("items")
        public final ListItem[] items;
        @JsonProperty("limit")
        public int limit;
        @JsonProperty("offset")
        public int offset;
        @JsonProperty("total")
        public int total;

        public ListItems(int i, int i2, int i3, ListItem[] listItemArr) {
            this.limit = i;
            this.offset = i2;
            this.total = i3;
            this.items = listItemArr;
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LogMessage implements JacksonModel {
        public static final String SEVERITY_ERROR = "error";
        public static final String SEVERITY_INFO = "info";
        public static final String SEVERITY_WARNING = "warning";
        @JsonProperty("message")
        public String message;
        @JsonProperty("severity")
        public String severity;
        @JsonProperty("title")
        public String title;

        public LogMessage(String str, String str2, String str3) {
            this.title = str;
            this.message = str2;
            this.severity = str3;
        }

        public LogMessage() {
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Message implements JacksonModel {
        @JsonProperty("message")
        public String message;

        public Message(String str) {
            this.message = str;
        }

        public String toString() {
            return getClass().getName();
        }

        public static Message fromValidationException(ValidationException validationException) {
            return new Message(validationException.getMessage());
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PlaybackPosition implements JacksonModel {
        @JsonProperty("position_ms")
        public final long position;

        public PlaybackPosition(@JsonProperty("position_ms") long j) {
            this.position = j;
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PlaybackSpeed implements JacksonModel {
        public static final int PAUSED_PLAYBACK_SPEED = 0;
        public static final int PLAYBACK_SPEED_100 = 100;
        public static final int PLAYBACK_SPEED_120 = 120;
        public static final int PLAYBACK_SPEED_150 = 150;
        public static final int PLAYBACK_SPEED_200 = 200;
        public static final int PLAYBACK_SPEED_300 = 300;
        public static final int PLAYBACK_SPEED_50 = 50;
        public static final int PLAYBACK_SPEED_80 = 80;
        public static final int PLAYING_PLAYBACK_SPEED = 1;
        @JsonProperty("playback_speed")
        public int playbackSpeed;

        public PlaybackSpeed() {
        }

        public PlaybackSpeed(int i) {
            this.playbackSpeed = i;
        }

        public PlaybackSpeed(com.spotify.mobile.android.cosmos.player.v2.PlayerState playerState) {
            this.playbackSpeed = isPaused(playerState) ^ true ? 1 : 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaybackSpeed)) {
                return false;
            }
            return this.playbackSpeed == ((PlaybackSpeed) obj).playbackSpeed;
        }

        public int hashCode() {
            return this.playbackSpeed;
        }

        public String toString() {
            return getClass().getName();
        }

        private static boolean isPaused(com.spotify.mobile.android.cosmos.player.v2.PlayerState playerState) {
            return playerState == null || playerState.isPaused() || !playerState.isPlaying();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PlayerOptions implements JacksonModel {
        public static final PlayerOptions DEFAULT = new PlayerOptions(false, 0);
        @JsonProperty("shuffle")
        public final boolean isShuffling;
        @JsonProperty("repeat")
        public final int repeatMode;

        public PlayerOptions(@JsonProperty("shuffle") boolean z, @JsonProperty("repeat") int i) {
            this.isShuffling = z;
            this.repeatMode = i;
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PlayerRestrictions implements JacksonModel {
        public static final PlayerRestrictions DEFAULT;
        @JsonProperty("can_repeat_context")
        public final boolean canRepeatContext;
        @JsonProperty("can_repeat_track")
        public final boolean canRepeatTrack;
        @JsonProperty("can_seek")
        public final boolean canSeek;
        @JsonProperty("can_skip_next")
        public final boolean canSkipNext;
        @JsonProperty("can_skip_prev")
        public final boolean canSkipPrev;
        @JsonProperty("can_toggle_shuffle")
        public final boolean canToggleShuffle;

        public PlayerRestrictions(@JsonProperty("can_skip_next") boolean z, @JsonProperty("can_skip_prev") boolean z2, @JsonProperty("can_repeat_track") boolean z3, @JsonProperty("can_repeat_context") boolean z4, @JsonProperty("can_toggle_shuffle") boolean z5, @JsonProperty("can_seek") boolean z6) {
            this.canSkipNext = z;
            this.canSkipPrev = z2;
            this.canRepeatTrack = z3;
            this.canRepeatContext = z4;
            this.canToggleShuffle = z5;
            this.canSeek = z6;
        }

        static {
            PlayerRestrictions playerRestrictions = new PlayerRestrictions(false, false, false, false, false, false);
            DEFAULT = playerRestrictions;
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PlayerState implements JacksonModel {
        private static final String ARTIST_NAME_KEY_FORMAT = "artist_name:%d";
        private static final String ARTIST_URI_KEY_FORMAT = "artist_uri:%d";
        private static final PlayerState EMPTY_PLAYER_STATE;
        @JsonProperty("is_paused")
        public final boolean isPaused;
        @JsonProperty("playback_options")
        public final PlayerOptions playbackOptions;
        @JsonProperty("playback_position")
        public final long playbackPosition;
        @JsonProperty("playback_restrictions")
        public final PlayerRestrictions playbackRestrictions;
        @JsonProperty("playback_speed")
        public final float playbackSpeed;
        @JsonProperty("track")
        public final Track track;

        static {
            PlayerState playerState = new PlayerState(null, true, 0.0f, 0, PlayerOptions.DEFAULT, PlayerRestrictions.DEFAULT);
            EMPTY_PLAYER_STATE = playerState;
        }

        public PlayerState(@JsonProperty("track") Track track2, @JsonProperty("is_paused") boolean z, @JsonProperty("playback_speed") float f, @JsonProperty("playback_position") long j, @JsonProperty("playback_options") PlayerOptions playerOptions, @JsonProperty("playback_restrictions") PlayerRestrictions playerRestrictions) {
            this.track = track2;
            this.isPaused = z;
            this.playbackSpeed = f;
            this.playbackPosition = j;
            if (playerOptions == null) {
                playerOptions = PlayerOptions.DEFAULT;
            }
            this.playbackOptions = playerOptions;
            if (playerRestrictions == null) {
                playerRestrictions = PlayerRestrictions.DEFAULT;
            }
            this.playbackRestrictions = playerRestrictions;
        }

        public String toString() {
            return getClass().getName();
        }

        public static PlayerState playerStateFrom(com.spotify.mobile.android.cosmos.player.v2.PlayerState playerState) {
            if (playerState == null) {
                return EMPTY_PLAYER_STATE;
            }
            int i = 0;
            if (playerState.options().repeatingTrack()) {
                i = 1;
            } else if (playerState.options().repeatingContext()) {
                i = 2;
            }
            PlayerRestrictions playerRestrictions = new PlayerRestrictions(playerState.restrictions().disallowSkippingNextReasons().isEmpty(), playerState.restrictions().disallowSkippingPrevReasons().isEmpty(), playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty(), playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty(), playerState.restrictions().disallowTogglingShuffleReasons().isEmpty(), playerState.restrictions().disallowSeekingReasons().isEmpty());
            PlayerState playerState2 = new PlayerState(convertTrack(playerState.track(), playerState.duration()), playerState.isPaused(), playerState.playbackSpeed(), playerState.currentPlaybackPosition(), new PlayerOptions(playerState.options().shufflingContext(), i), playerRestrictions);
            return playerState2;
        }

        private static Track convertTrack(PlayerTrack playerTrack, long j) {
            if (playerTrack == null) {
                return null;
            }
            Track track2 = new Track(new Artist((String) playerTrack.metadata().get("artist_name"), (String) playerTrack.metadata().get("artist_uri")), getArtists(playerTrack), new Album((String) playerTrack.metadata().get("album_title"), (String) playerTrack.metadata().get("album_uri")), Boolean.parseBoolean((String) playerTrack.metadata().get("collection.in_collection")), j, (String) playerTrack.metadata().get("title"), playerTrack.uri(), AppProtocol.a(playerTrack), getIsEpisode(playerTrack), getIsPodcast(playerTrack));
            return track2;
        }

        private static List<Artist> getArtists(PlayerTrack playerTrack) {
            ArrayList arrayList = new ArrayList();
            String str = (String) playerTrack.metadata().get("artist_name");
            String str2 = (String) playerTrack.metadata().get("artist_uri");
            int i = 1;
            while (str != null && str2 != null) {
                arrayList.add(new Artist(str, str2));
                String format = String.format(Locale.getDefault(), ARTIST_NAME_KEY_FORMAT, new Object[]{Integer.valueOf(i)});
                str = (String) playerTrack.metadata().get(format);
                str2 = (String) playerTrack.metadata().get(String.format(Locale.getDefault(), ARTIST_URI_KEY_FORMAT, new Object[]{Integer.valueOf(i)}));
                i++;
            }
            return arrayList;
        }

        private static boolean getIsEpisode(PlayerTrack playerTrack) {
            return jst.a(playerTrack.uri()).b == LinkType.SHOW_EPISODE;
        }

        private static boolean getIsPodcast(PlayerTrack playerTrack) {
            LinkType linkType = jst.a(playerTrack.uri()).b;
            String str = (String) playerTrack.metadata().get("media.type");
            return linkType == LinkType.SHOW_EPISODE && (str == null || "audio".equals(str));
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Rating implements JacksonModel {
        public static final int NONE = 0;
        public static final int THUMB_DOWN = -1;
        public static final int THUMB_UP = 1;
        @JsonProperty("rating")
        public int rating;

        public Rating() {
        }

        public Rating(int i) {
            this.rating = i;
        }

        public Rating(ThumbState thumbState) {
            this.rating = fromThumbState(thumbState);
        }

        public Rating(ugu ugu) {
            this.rating = ugu != null ? fromThumbState(ugu.b()) : 0;
        }

        private static int fromThumbState(ThumbState thumbState) {
            if (thumbState == null) {
                return 0;
            }
            int i = AnonymousClass1.a[thumbState.ordinal()];
            if (i != 1) {
                return i != 2 ? 0 : -1;
            }
            return 1;
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Repeat implements JacksonModel {
        public static final int ALL = 2;
        public static final int OFF = 0;
        public static final int ONE = 1;
        @JsonProperty("repeat")
        public int repeat;

        public Repeat() {
        }

        public Repeat(com.spotify.mobile.android.cosmos.player.v2.PlayerState playerState) {
            this.repeat = playerStateToRepeat(playerState).intValue();
        }

        public Repeat(int i) {
            this.repeat = i;
        }

        private static Integer playerStateToRepeat(com.spotify.mobile.android.cosmos.player.v2.PlayerState playerState) {
            if (playerState != null) {
                if (playerState.options().repeatingTrack()) {
                    return Integer.valueOf(1);
                }
                if (playerState.options().repeatingContext()) {
                    return Integer.valueOf(2);
                }
            }
            return Integer.valueOf(0);
        }

        public static Repeat getNextRepeatMode(com.spotify.mobile.android.cosmos.player.v2.PlayerState playerState) {
            int intValue = playerStateToRepeat(playerState).intValue();
            if (intValue == 2) {
                return new Repeat(1);
            }
            if (intValue == 1) {
                return new Repeat(0);
            }
            return new Repeat(2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Repeat) && ((Repeat) obj).repeat == this.repeat;
        }

        public int hashCode() {
            return this.repeat;
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Roles implements JacksonModel {
        @JsonProperty("broker")
        public Empty broker;
        @JsonProperty("caller")
        public Empty caller;
        @JsonProperty("dealer")
        public Empty dealer;
        @JsonProperty("subscriber")
        public Empty subscriber;

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RootListOptions implements JacksonModel {
        @JsonProperty("type")
        public final RootListType type;

        public RootListOptions(@JsonProperty("type") RootListType rootListType) {
            if (rootListType == null) {
                rootListType = RootListType.DEFAULT;
            }
            this.type = rootListType;
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Saved implements JacksonModel {
        @JsonProperty("can_save")
        public boolean canSave;
        @JsonProperty("saved")
        public boolean saved;
        @JsonProperty("uri")
        public String uri;

        public Saved() {
        }

        public Saved(boolean z) {
            this.saved = z;
        }

        public Saved(String str, boolean z) {
            this.uri = str;
            this.saved = z;
        }

        public Saved(String str, boolean z, boolean z2) {
            this.uri = str;
            this.saved = z;
            this.canSave = z2;
        }

        public Saved(com.spotify.mobile.android.cosmos.player.v2.PlayerState playerState) {
            if (playerState == null || playerState.track() == null) {
                this.saved = false;
                return;
            }
            PlayerTrack track = playerState.track();
            if (track != null) {
                this.uri = track.uri();
                this.saved = Boolean.parseBoolean((String) track.metadata().get("collection.in_collection"));
                this.canSave = Boolean.parseBoolean((String) track.metadata().get("collection.can_add"));
            }
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SearchQuery implements JacksonModel {
        @JsonProperty("limit")
        public int limit;
        @JsonProperty("offset")
        public int offset;
        @JsonProperty("query")
        public String query;

        public SearchQuery(@JsonProperty("query") String str, @JsonProperty("limit") int i, @JsonProperty("offset") int i2) {
            this.query = str;
            this.limit = i;
            this.offset = i2;
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SessionState implements JacksonModel {
        @JsonProperty("connection_type")
        public String connectionType;
        @JsonProperty("is_in_forced_offline_mode")
        public boolean isInForcedOfflineMode;
        @JsonProperty("is_logged_in")
        public boolean isLoggedIn;
        @JsonProperty("is_offline")
        public boolean isOffline;

        public SessionState(@JsonProperty("is_offline") boolean z, @JsonProperty("is_in_forced_offline_mode") boolean z2, @JsonProperty("is_logged_in") boolean z3, @JsonProperty("connection_type") String str) {
            this.isOffline = z;
            this.isInForcedOfflineMode = z2;
            this.isLoggedIn = z3;
            this.connectionType = str;
        }

        public SessionState(com.spotify.mobile.android.service.session.SessionState sessionState, ConnectionType connectionType2) {
            boolean z = true;
            this.isOffline = sessionState != null && !sessionState.connected();
            this.isInForcedOfflineMode = this.isOffline && !sessionState.canConnect();
            if (sessionState == null || !sessionState.loggedIn()) {
                z = false;
            }
            this.isLoggedIn = z;
            this.connectionType = getConnectionType(connectionType2);
        }

        public String toString() {
            return getClass().getName();
        }

        private static String getConnectionType(ConnectionType connectionType2) {
            switch (connectionType2) {
                case CONNECTION_TYPE_3G:
                    return "3g";
                case CONNECTION_TYPE_4G:
                    return "4g";
                case CONNECTION_TYPE_EDGE:
                    return "edge";
                case CONNECTION_TYPE_ETHERNET:
                    return "ethernet";
                case CONNECTION_TYPE_GPRS:
                    return "gprs";
                case CONNECTION_TYPE_NONE:
                    return IdHelperAndroid.NO_ID_AVAILABLE;
                case CONNECTION_TYPE_WLAN:
                    return "wlan";
                default:
                    return "unknown";
            }
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Shuffle implements JacksonModel {
        @JsonProperty("shuffle")
        public boolean shuffle;

        public Shuffle() {
        }

        public Shuffle(boolean z) {
            this.shuffle = z;
        }

        public Shuffle(com.spotify.mobile.android.cosmos.player.v2.PlayerState playerState) {
            this.shuffle = playerState != null && playerState.options().shufflingContext();
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Status implements JacksonModel {
        public static final Status OK;
        private static final int STATUS_CODE_NOT_LOGGED_IN = 1;
        private static final int STATUS_CODE_OK = 0;
        @JsonProperty("long_text")
        public String longText;
        @JsonProperty("short_text")
        public String shortText;
        @JsonProperty("code")
        public int statusCode;

        static {
            String str = "";
            OK = new Status(0, str, str);
        }

        public Status(int i, String str, String str2) {
            this.statusCode = i;
            this.shortText = str;
            this.longText = str2;
        }

        public static Status createNotLoggedIn(android.content.Context context) {
            return new Status(1, context.getString(R.string.applink_logged_out_warning_linescombo), String.format(Locale.getDefault(), "%s %s", new Object[]{context.getString(R.string.applink_logged_out_warning_line1), context.getString(R.string.applink_logged_out_warning_line2)}));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            if (this.statusCode != status.statusCode) {
                return false;
            }
            String str = this.shortText;
            if (str == null ? status.shortText != null : !str.equals(status.shortText)) {
                return false;
            }
            String str2 = this.longText;
            return str2 == null ? status.longText == null : str2.equals(status.longText);
        }

        public int hashCode() {
            int i = this.statusCode * 31;
            String str = this.shortText;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.longText;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TokenRequest implements JacksonModel {
        @JsonProperty("client_id")
        public final String clientId;
        @JsonProperty("redirect_uri")
        public final String redirectUri;
        @JsonProperty("scopes")
        public final String[] scopes;

        public TokenRequest(@JsonProperty("client_id") String str, @JsonProperty("scopes") String[] strArr, @JsonProperty("redirect_uri") String str2) {
            this.clientId = str;
            this.scopes = strArr;
            this.redirectUri = str2;
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TokenResponse implements JacksonModel {
        public static final int CANCELED = 1;
        public static final int OK = 0;
        public static final int REJECTED = 2;
        @JsonProperty("reason")
        public String reason;
        @JsonProperty("status")
        public int status;
        @JsonProperty("token")
        public String token;

        public TokenResponse(@JsonProperty("status") int i, @JsonProperty("reason") String str, @JsonProperty("token") String str2) {
            this.status = i;
            this.reason = str;
            this.token = str2;
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Track implements JacksonModel {
        @JsonProperty("album")
        public final Album album;
        @JsonProperty("artist")
        public final Artist artist;
        @JsonProperty("artists")
        public final List<Artist> artists;
        @JsonProperty("duration_ms")
        public final long duration;
        @JsonProperty("image_id")
        public final String imageUri;
        @JsonProperty("is_episode")
        public final boolean isEpisode;
        @JsonProperty("is_podcast")
        public final boolean isPodcast;
        @JsonProperty("name")
        public final String name;
        @JsonProperty("saved")
        public final boolean saved;
        @JsonProperty("uri")
        public final String uri;

        public Track(@JsonProperty("artist") Artist artist2, @JsonProperty("artists") List<Artist> list, @JsonProperty("album") Album album2, @JsonProperty("saved") boolean z, @JsonProperty("duration_ms") long j, @JsonProperty("name") String str, @JsonProperty("uri") String str2, @JsonProperty("image_id") String str3, @JsonProperty("is_episode") boolean z2, @JsonProperty("is_podcast") boolean z3) {
            this.artist = artist2;
            this.artists = list;
            this.album = album2;
            this.saved = z;
            this.duration = j;
            this.name = str;
            this.uri = str2;
            this.imageUri = str3;
            this.isEpisode = z2;
            this.isPodcast = z3;
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TrackData implements JacksonModel {
        public static final String TYPE_NO_TRACK = "no_track";
        public static final String TYPE_TRACK = "track";
        @JsonProperty("album")
        public Album album;
        @JsonProperty("artist")
        public Artist artist;
        @JsonProperty("can_mute")
        public boolean canMute;
        @JsonProperty("can_pause")
        public boolean canPause;
        @JsonProperty("can_peek_next")
        public boolean canPeekNext;
        @JsonProperty("can_peek_prev")
        public boolean canPeekPrev;
        @JsonProperty("can_rate")
        public boolean canRate;
        @JsonProperty("can_resume")
        public boolean canResume;
        @JsonProperty("can_save")
        public boolean canSave;
        @JsonProperty("can_seek")
        public boolean canSeek;
        @JsonProperty("can_show_more_albums")
        public boolean canShowMoreAlbums;
        @JsonProperty("can_skip_next")
        public boolean canSkipNext;
        @JsonProperty("can_skip_prev")
        public boolean canSkipPrev;
        @JsonProperty("can_start_radio")
        public boolean canStartRadio;
        @JsonProperty("duration_ms")
        public int durationMs;
        @JsonProperty("image_id")
        public String imageUri;
        @JsonProperty("name")
        public String name;
        @JsonProperty("rated")
        public int rated;
        @JsonProperty("saved")
        public boolean saved;
        @JsonProperty("track_number")
        public int trackNumber;
        @JsonProperty("type")
        public String type;
        @JsonProperty("uri")
        public String uri;

        public TrackData(Album album2, Artist artist2, int i, String str, int i2, String str2, String str3, boolean z, int i3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str4) {
            this.album = album2;
            this.artist = artist2;
            this.durationMs = i;
            this.name = str;
            this.trackNumber = i2;
            this.type = str2;
            this.uri = str3;
            this.saved = z;
            this.rated = i3;
            this.canSave = z2;
            this.canRate = z3;
            this.canStartRadio = z4;
            this.canShowMoreAlbums = z5;
            this.canSkipNext = z6;
            this.canSkipPrev = z7;
            this.canPause = z8;
            this.canResume = z9;
            this.canSeek = z10;
            this.imageUri = str4;
        }

        public static TrackData trackDataFor(ugu ugu, com.spotify.mobile.android.cosmos.player.v2.PlayerState playerState, tjv tjv) {
            return trackDataFor(playerState, new hot().a(playerState, ugu, tjv));
        }

        public static TrackData trackDataFor(com.spotify.mobile.android.cosmos.player.v2.PlayerState playerState, List<MediaAction> list) {
            int i;
            List<MediaAction> list2 = list;
            if (playerState == null) {
                return AppProtocol.c;
            }
            PlayerTrack track = playerState.track();
            if (track == null) {
                return AppProtocol.c;
            }
            Map metadata = track.metadata();
            Album album2 = new Album((String) metadata.get("album_title"), (String) metadata.get("album_uri"));
            Artist artist2 = new Artist((String) metadata.get("artist_name"), (String) metadata.get("artist_uri"));
            int i2 = list2.contains(MediaAction.THUMBS_UP_SELECTED) ? 1 : list2.contains(MediaAction.THUMB_DOWN_SELECTED) ? -1 : 0;
            String str = (String) metadata.get("album_track_number");
            int duration = (int) playerState.duration();
            String str2 = (String) metadata.get("title");
            if (str == null) {
                i = 0;
            } else {
                i = Integer.parseInt(str);
            }
            TrackData trackData = new TrackData(album2, artist2, duration, str2, i, TYPE_TRACK, track.uri(), list2.contains(MediaAction.REMOVE_FROM_COLLECTION), i2, list2.contains(MediaAction.REMOVE_FROM_COLLECTION) || list2.contains(MediaAction.ADD_TO_COLLECTION), list2.contains(MediaAction.THUMB_DOWN) || list2.contains(MediaAction.THUMB_UP) || list2.contains(MediaAction.THUMBS_UP_SELECTED), list2.contains(MediaAction.START_RADIO), false, list2.contains(MediaAction.SKIP_TO_NEXT), list2.contains(MediaAction.SKIP_TO_PREVIOUS), list2.contains(MediaAction.PLAY) || list2.contains(MediaAction.PAUSE), list2.contains(MediaAction.PLAY) || list2.contains(MediaAction.PAUSE), false, AppProtocol.a(track));
            return trackData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackData)) {
                return false;
            }
            TrackData trackData = (TrackData) obj;
            if (this.trackNumber != trackData.trackNumber || this.saved != trackData.saved || this.rated != trackData.rated || this.canSave != trackData.canSave || this.canRate != trackData.canRate || this.canStartRadio != trackData.canStartRadio || this.canShowMoreAlbums != trackData.canShowMoreAlbums || this.canSkipNext != trackData.canSkipNext || this.canSkipPrev != trackData.canSkipPrev || this.canPeekNext != trackData.canPeekNext || this.canPeekPrev != trackData.canPeekPrev || this.canPause != trackData.canPause || this.canResume != trackData.canResume || this.canSeek != trackData.canSeek || this.canMute != trackData.canMute) {
                return false;
            }
            String str = this.type;
            if (str == null ? trackData.type != null : !str.equals(trackData.type)) {
                return false;
            }
            String str2 = this.uri;
            if (str2 == null ? trackData.uri != null : !str2.equals(trackData.uri)) {
                return false;
            }
            String str3 = this.imageUri;
            return str3 == null ? trackData.imageUri == null : str3.equals(trackData.imageUri);
        }

        public int hashCode() {
            int i = this.trackNumber * 31;
            String str = this.type;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.uri;
            int hashCode2 = (((((((((((((((((((((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.saved ? 1 : 0)) * 31) + this.rated) * 31) + (this.canSave ? 1 : 0)) * 31) + (this.canRate ? 1 : 0)) * 31) + (this.canStartRadio ? 1 : 0)) * 31) + (this.canShowMoreAlbums ? 1 : 0)) * 31) + (this.canSkipNext ? 1 : 0)) * 31) + (this.canSkipPrev ? 1 : 0)) * 31) + (this.canPeekNext ? 1 : 0)) * 31) + (this.canPeekPrev ? 1 : 0)) * 31) + (this.canPause ? 1 : 0)) * 31) + (this.canResume ? 1 : 0)) * 31) + (this.canSeek ? 1 : 0)) * 31) + (this.canMute ? 1 : 0)) * 31;
            String str3 = this.imageUri;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TrackElapsed implements JacksonModel {
        @JsonProperty("duration_ms")
        public int durationMs;
        @JsonProperty("elapsed_time")
        public int elapsedTime;
        @JsonProperty("percentage")
        public int percentage;

        public TrackElapsed(int i, int i2, int i3) {
            this.elapsedTime = i;
            this.durationMs = i2;
            this.percentage = i3;
        }

        public TrackElapsed(com.spotify.mobile.android.cosmos.player.v2.PlayerState playerState) {
            long j;
            if (playerState != null) {
                this.elapsedTime = (int) playerState.currentPlaybackPosition();
                this.durationMs = (int) playerState.duration();
                if (this.durationMs <= 0) {
                    j = 0;
                } else {
                    j = (playerState.currentPlaybackPosition() * 100) / ((long) this.durationMs);
                }
                this.percentage = (int) j;
                return;
            }
            this.percentage = 0;
            this.durationMs = 0;
            this.elapsedTime = 0;
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Uri implements JacksonModel {
        @JsonProperty("uri")
        public String uri;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uri)) {
                return false;
            }
            Uri uri2 = (Uri) obj;
            String str = this.uri;
            String str2 = uri2.uri;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            String str = this.uri;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UriWithOptionExtras implements JacksonModel {
        @JsonProperty("options")
        public final String[] options;
        @JsonProperty("uri")
        public final String uri;

        public UriWithOptionExtras(@JsonProperty("uri") String str, @JsonProperty("options") String[] strArr) {
            this.uri = str;
            this.options = strArr;
        }

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Uris implements JacksonModel {
        @JsonProperty("uris")
        public String[] uris;

        public String toString() {
            return getClass().getName();
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WelcomeDetails implements JacksonModel {
        @JsonProperty("authid")
        public String authid;
        @JsonProperty("authmethod")
        public String authmethod;
        @JsonProperty("authprovider")
        public String authprovider;
        @JsonProperty("authrole")
        public String authrole;
        @JsonProperty("roles")
        public Roles roles;

        /* synthetic */ WelcomeDetails(AnonymousClass1 r1) {
            this();
        }

        private WelcomeDetails() {
            this.roles = new Roles();
            this.roles.dealer = new Empty();
            this.roles.broker = new Empty();
        }

        public String toString() {
            return getClass().getName();
        }
    }

    static {
        TrackData trackData = new TrackData(null, null, 0, "", 0, TrackData.TYPE_NO_TRACK, "", false, 0, false, false, false, false, false, false, false, false, false, null);
        c = trackData;
    }

    static /* synthetic */ String a(PlayerTrack playerTrack) {
        String str = "image_xlarge_url";
        if (playerTrack.metadata().containsKey(str)) {
            return (String) playerTrack.metadata().get(str);
        }
        String str2 = "image_large_url";
        if (playerTrack.metadata().containsKey(str2)) {
            return (String) playerTrack.metadata().get(str2);
        }
        return (String) playerTrack.metadata().get("image_url");
    }
}
