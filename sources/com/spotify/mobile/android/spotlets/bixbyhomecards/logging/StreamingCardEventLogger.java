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
    private final ilk a;
    private final gdz<fko> b;

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

    public StreamingCardEventLogger(ilk ilk, gdz<fko> gdz) {
        this.a = ilk;
        this.b = gdz;
    }

    public final void a(ild ild, Element element, String str) {
        a(ild, EventType.DEEPLINK, element, str);
        this.b.a(BixbyHomeCardsDeeplink.k().a(ild.a).a(element.mId).b(str).c(c(ild.c)).g());
    }

    public final void b(ild ild, Element element, String str) {
        a(ild, EventType.RECOMMENDATION_CLICKED, element, str);
        this.b.a(BixbyHomeCardsRecommendationClicked.k().a(ild.a).a(element.mId).b(str).c(c(ild.c)).g());
    }

    public final void a(ild ild) {
        a(ild, EventType.PREV, Element.PREV, b(ild.c));
        this.b.a(BixbyHomeCardsPreviousClicked.k().a(ild.a).a(Element.PREV.mId).b(a(ild.c)).c(c(ild.c)).g());
    }

    public final void b(ild ild) {
        a(ild, EventType.PLAY_RESUME, Element.PLAY_PAUSE, b(ild.c));
        this.b.a(BixbyHomeCardsPlayClicked.k().a(ild.a).a(Element.PLAY_PAUSE.mId).b(a(ild.c)).c(c(ild.c)).g());
    }

    public final void c(ild ild) {
        a(ild, EventType.PAUSE, Element.PLAY_PAUSE, b(ild.c));
        this.b.a(BixbyHomeCardsPauseClicked.k().a(ild.a).a(Element.PLAY_PAUSE.mId).b(a(ild.c)).c(c(ild.c)).g());
    }

    public final void d(ild ild) {
        a(ild, EventType.NEXT, Element.NEXT, b(ild.c));
        this.b.a(BixbyHomeCardsNextClicked.k().a(ild.a).a(Element.NEXT.mId).b(a(ild.c)).c(c(ild.c)).g());
    }

    public final void e(ild ild) {
        a(ild, EventType.DEEPLINK, Element.CTA, b(ild.c));
        this.b.a(BixbyHomeCardsCtaClicked.k().a(ild.a).a(Element.CTA.mId).b(a(ild.c)).c(c(ild.c)).g());
    }

    private static String a(StreamingCardData streamingCardData) {
        String b2 = b(streamingCardData);
        return b2 != null ? b2 : "invalid";
    }

    private static String b(StreamingCardData streamingCardData) {
        return streamingCardData == null ? "invalid" : streamingCardData.trackUri();
    }

    private static String c(StreamingCardData streamingCardData) {
        String d = d(streamingCardData);
        return d != null ? d : "invalid";
    }

    private static String d(StreamingCardData streamingCardData) {
        if (streamingCardData == null) {
            return "invalid";
        }
        if (streamingCardData.isPlaying()) {
            return b(streamingCardData);
        }
        return null;
    }

    private void a(ild ild, EventType eventType, Element element, String str) {
        this.a.a(ild.a, eventType.mId, element.mId, str, d(ild.c));
    }
}
