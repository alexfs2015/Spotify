package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdSlot implements JacksonModel, idy {
    public static final AdSlot ACTIVE_PLAY_INTERRUPTION = new AdSlot(ACTIVE_PLAY_INTERRUPTION_SLOT, Arrays.asList(new Format[]{Format.AUDIO, Format.VIDEO}), new a() {
        public final void a(hxc hxc) {
        }
    });
    private static final String ACTIVE_PLAY_INTERRUPTION_SLOT = "active-play-limit";
    public static final AdSlot MARQUEE = new AdSlot(MARQUEE_SLOT, Collections.singletonList(Format.BANNER), new a() {
        public final void a(hxc hxc) {
            hxc.c();
        }
    });
    private static final String MARQUEE_SLOT = "marquee";
    public static final AdSlot MIDROLL_WATCHNOW = new AdSlot(MIDROLL_WATCHNOW_SLOT, Arrays.asList(new Format[]{Format.AUDIO, Format.VIDEO}), new a() {
        public final void a(hxc hxc) {
            hxc.d();
        }
    });
    private static final String MIDROLL_WATCHNOW_SLOT = "midroll-watchnow";
    public static final AdSlot MOBILE_SCREENSAVER = new AdSlot(MOBILE_SCREENSAVER_SLOT, Collections.singletonList(Format.BANNER), new a() {
        public final void a(hxc hxc) {
            hxc.e();
        }
    });
    private static final String MOBILE_SCREENSAVER_SLOT = "mobile-screensaver";
    public static final AdSlot PREROLL = new AdSlot(PREROLL_SLOT, Arrays.asList(new Format[]{Format.AUDIO, Format.VIDEO}), new a() {
        public final void a(hxc hxc) {
            hxc.a();
        }
    });
    private static final String PREROLL_SLOT = "preroll";
    public static final AdSlot REPEAT_PLAY_INTERRUPTION = new AdSlot(REPEAT_PLAY_INTERRUPTION_SLOT, Arrays.asList(new Format[]{Format.AUDIO, Format.VIDEO}), new a() {
        public final void a(hxc hxc) {
        }
    });
    private static final String REPEAT_PLAY_INTERRUPTION_SLOT = "repeat-play";
    public static final AdSlot SPONSORED_PLAYLIST = new AdSlot(SPONSORED_PLAYLIST_SLOT, Collections.singletonList(Format.BANNER), new a() {
        public final void a(hxc hxc) {
        }
    });
    private static final String SPONSORED_PLAYLIST_SLOT = "sponsored-playlist";
    public static final AdSlot STREAM = new AdSlot(STREAM_SLOT, Collections.singletonList(Format.VIDEO), new a() {
        public final void a(hxc hxc) {
        }
    });
    private static final String STREAM_SLOT = "stream";
    public static final AdSlot WATCHNOW = new AdSlot(WATCHNOW_SLOT, Arrays.asList(new Format[]{Format.AUDIO, Format.VIDEO}), new a() {
        public final void a(hxc hxc) {
            hxc.b();
        }
    });
    private static final String WATCHNOW_SLOT = "watchnow";
    @JsonProperty
    public List<Format> formats;
    private boolean mIsRegistered;
    private final a mOnSlotRegistered;
    private b mPendingAdRequestListener;
    @JsonProperty
    public String slot_id;

    public interface a {
        void a(hxc hxc);
    }

    public interface b {
        void request();
    }

    public void onRegistered(hxc hxc) {
        this.mOnSlotRegistered.a(hxc);
        this.mIsRegistered = true;
        b bVar = this.mPendingAdRequestListener;
        if (bVar != null) {
            bVar.request();
            this.mPendingAdRequestListener = null;
        }
    }

    public AdSlot(String str, List<Format> list, a aVar) {
        this.slot_id = str;
        this.formats = list;
        this.mOnSlotRegistered = aVar;
    }

    public String getSlotId() {
        return this.slot_id;
    }

    public static AdSlot valueOf(String str) {
        if (PREROLL.getSlotId().equals(str)) {
            return PREROLL;
        }
        if (WATCHNOW.getSlotId().equals(str)) {
            return WATCHNOW;
        }
        if (MIDROLL_WATCHNOW.getSlotId().equals(str)) {
            return MIDROLL_WATCHNOW;
        }
        if (MOBILE_SCREENSAVER.getSlotId().equals(str)) {
            return MOBILE_SCREENSAVER;
        }
        if (SPONSORED_PLAYLIST.getSlotId().equals(str)) {
            return SPONSORED_PLAYLIST;
        }
        if (ACTIVE_PLAY_INTERRUPTION.getSlotId().equals(str)) {
            return ACTIVE_PLAY_INTERRUPTION;
        }
        if (REPEAT_PLAY_INTERRUPTION.getSlotId().equals(str)) {
            return REPEAT_PLAY_INTERRUPTION;
        }
        return STREAM;
    }

    public String getCosmosEndpoint() {
        String slotId = getSlotId();
        StringBuilder sb = new StringBuilder("sp://ads/v1/slots/");
        sb.append(slotId);
        return sb.toString();
    }

    public String toString() {
        return this.slot_id;
    }

    public void setRegistered(boolean z) {
        this.mIsRegistered = z;
    }

    public void registerAdRequest(b bVar) {
        if (this.mIsRegistered) {
            bVar.request();
        } else {
            this.mPendingAdRequestListener = bVar;
        }
    }
}
