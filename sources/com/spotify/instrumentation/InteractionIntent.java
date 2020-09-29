package com.spotify.instrumentation;

public enum InteractionIntent {
    ADD("add"),
    ADD_TO_QUEUE("add-to-queue"),
    CLOSE("close"),
    CONNECT("connect"),
    CONTINUE("continue"),
    DEFAULT_CAST("default-cast"),
    DEFAULT_CONNECT("default-connect"),
    DELETE_PLAYLIST("delete-playlist"),
    DOWNLOAD("download"),
    EDIT_PLAYLIST_FILTER("edit-playlist-filter"),
    FILTER("filter"),
    FOLLOW("follow"),
    FOLLOW_PLAYLIST("follow-playlist"),
    FORGET_DEVICE("forget-device"),
    GO_BACK("go-back"),
    GROUP_ROOMS("group-rooms"),
    INSTALL_APP("install-app"),
    LATER("later"),
    LISTEN_NOW("listen-now"),
    LISTEN_ON_THIS_DEVICE("listen-on-this-device"),
    NAVIGATE("navigate"),
    NEXT("next"),
    PAUSE("pause"),
    PLAY("play"),
    PREVIOUS("previous"),
    REMOVE_FROM_DOWNLOAD("remove-from-download"),
    REPEAT("repeat"),
    SAVE("save"),
    SHARE("share"),
    SHOW_CONTEXTMENU_TRACK("show-contextmenu-track"),
    SHOW_OPTIONS("show-options"),
    SHUFFLE("shuffle"),
    UNFOLLOW_PLAYLIST("unfollow-playlist"),
    UNKNOWN("unknown"),
    VALIDATE("validate");
    
    public final String mInteractionIntent;

    private InteractionIntent(String str) {
        this.mInteractionIntent = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{interactionIntent='");
        sb.append(this.mInteractionIntent);
        sb.append("'}");
        return sb.toString();
    }
}
