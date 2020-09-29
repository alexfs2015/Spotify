package com.facebook.share.internal;

public enum MessageDialogFeature implements amm {
    MESSAGE_DIALOG(20140204),
    PHOTOS(20140324),
    VIDEO(20141218),
    MESSENGER_GENERIC_TEMPLATE(20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(20171115),
    MESSENGER_MEDIA_TEMPLATE(20171115);
    
    private int minVersion;

    private MessageDialogFeature(int i) {
        this.minVersion = i;
    }

    public final String a() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }

    public final int b() {
        return this.minVersion;
    }
}
