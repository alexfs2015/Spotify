package com.facebook.share.internal;

public enum OpenGraphActionDialogFeature implements amm {
    OG_ACTION_DIALOG(20130618);
    
    private int minVersion;

    private OpenGraphActionDialogFeature(int i) {
        this.minVersion = 20130618;
    }

    public final String a() {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    public final int b() {
        return this.minVersion;
    }
}
