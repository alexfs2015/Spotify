package com.spotify.music.features.assistedcuration.provider;

import java.util.Set;

public final class CardAction {
    public final Action a;
    public final String b;
    private final luu c;
    private final Set<String> d;

    public enum Action {
        INITIALIZE,
        EXPAND_TRACK,
        EXPAND_CARD,
        ADD_CARDS_BASED_ON_TRACK,
        REMOVE_TRACKS_IN_SET,
        JUST
    }

    public CardAction(Action action) {
        this(null, action, null, null);
    }

    public CardAction(Action action, Set<String> set) {
        this(null, action, null, set);
    }

    public CardAction(String str, Action action, luu luu, Set<String> set) {
        this.b = str;
        this.a = action;
        this.c = luu;
        this.d = set;
    }

    public static CardAction a() {
        return new CardAction(Action.JUST);
    }

    public final luu b() {
        fbp.a(this.a == Action.EXPAND_TRACK || this.a == Action.ADD_CARDS_BASED_ON_TRACK, "Action is not EXPAND_TRACK or ADD_CARDS_BASED_ON_TRACK. Is: %s", (Object) this.a);
        return this.c;
    }

    public final Set<String> c() {
        fbp.a(this.a == Action.EXPAND_TRACK || this.a == Action.EXPAND_CARD || this.a == Action.ADD_CARDS_BASED_ON_TRACK || this.a == Action.REMOVE_TRACKS_IN_SET, "Action is not supported. Is: %s", (Object) this.a);
        return this.d;
    }
}
