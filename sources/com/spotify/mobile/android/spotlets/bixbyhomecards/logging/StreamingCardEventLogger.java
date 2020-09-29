package com.spotify.mobile.android.spotlets.bixbyhomecards.logging;

import com.spotify.messages.BixbyHomeCardsCtaClicked;
import com.spotify.messages.BixbyHomeCardsDeeplink;
import com.spotify.messages.BixbyHomeCardsNextClicked;
import com.spotify.messages.BixbyHomeCardsPauseClicked;
import com.spotify.messages.BixbyHomeCardsPlayClicked;
import com.spotify.messages.BixbyHomeCardsPreviousClicked;
import com.spotify.messages.BixbyHomeCardsRecommendationClicked;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;

public final class StreamingCardEventLogger {
    private final inx a;
    private final gfk<fli> b;

    public enum Element {
        PLAY_PAUSE("play_pause_button"),
        PREV("previous_button"),
        NEXT("next_button"),
        MAIN_VIEW("main_view"),
        LIST_ITEM_1("list_item_1"),
        LIST_ITEM_2("list_item_2"),
        CTA("cta");
        
        final String mId;

        private Element(String str) {
            this.mId = str;
        }
    }

    public enum EventType {
        PLAY_RESUME("play_resume"),
        PAUSE("pause"),
        PREV("prev"),
        NEXT("next"),
        RECOMMENDATION_CLICKED("recommendation_clicked"),
        DEEPLINK("deeplink");
        
        final String mId;

        private EventType(String str) {
            this.mId = str;
        }
    }

    public StreamingCardEventLogger(inx inx, gfk<fli> gfk) {
        this.a = inx;
        this.b = gfk;
    }

    private static String a(StreamingCardData streamingCardData) {
        String b2 = b(streamingCardData);
        if (b2 != null) {
            return b2;
        }
        String str = "iasndli";
        return "invalid";
    }

    private void a(inq inq, EventType eventType, Element element, String str) {
        String str2 = str;
        this.a.a(inq.a, eventType.mId, element.mId, str, d(inq.c));
    }

    private static String b(StreamingCardData streamingCardData) {
        if (streamingCardData != null) {
            return streamingCardData.trackUri();
        }
        String str = "idvminl";
        return "invalid";
    }

    private static String c(StreamingCardData streamingCardData) {
        String d = d(streamingCardData);
        return d != null ? d : "invalid";
    }

    private static String d(StreamingCardData streamingCardData) {
        if (streamingCardData == null) {
            String str = "ivdaoil";
            return "invalid";
        } else if (streamingCardData.isPlaying()) {
            return b(streamingCardData);
        } else {
            return null;
        }
    }

    public final void a(inq inq) {
        a(inq, EventType.PREV, Element.PREV, b(inq.c));
        this.b.a(BixbyHomeCardsPreviousClicked.k().a(inq.a).a(Element.PREV.mId).b(a(inq.c)).c(c(inq.c)).g());
    }

    public final void a(inq inq, Element element, String str) {
        a(inq, EventType.DEEPLINK, element, str);
        this.b.a(BixbyHomeCardsDeeplink.k().a(inq.a).a(element.mId).b(str).c(c(inq.c)).g());
    }

    public final void b(inq inq) {
        a(inq, EventType.PLAY_RESUME, Element.PLAY_PAUSE, b(inq.c));
        this.b.a(BixbyHomeCardsPlayClicked.k().a(inq.a).a(Element.PLAY_PAUSE.mId).b(a(inq.c)).c(c(inq.c)).g());
    }

    public final void b(inq inq, Element element, String str) {
        a(inq, EventType.RECOMMENDATION_CLICKED, element, str);
        this.b.a(BixbyHomeCardsRecommendationClicked.k().a(inq.a).a(element.mId).b(str).c(c(inq.c)).g());
    }

    public final void c(inq inq) {
        a(inq, EventType.PAUSE, Element.PLAY_PAUSE, b(inq.c));
        this.b.a(BixbyHomeCardsPauseClicked.k().a(inq.a).a(Element.PLAY_PAUSE.mId).b(a(inq.c)).c(c(inq.c)).g());
    }

    public final void d(inq inq) {
        a(inq, EventType.NEXT, Element.NEXT, b(inq.c));
        this.b.a(BixbyHomeCardsNextClicked.k().a(inq.a).a(Element.NEXT.mId).b(a(inq.c)).c(c(inq.c)).g());
    }

    public final void e(inq inq) {
        a(inq, EventType.DEEPLINK, Element.CTA, b(inq.c));
        this.b.a(BixbyHomeCardsCtaClicked.k().a(inq.a).a(Element.CTA.mId).b(a(inq.c)).c(c(inq.c)).g());
    }
}
