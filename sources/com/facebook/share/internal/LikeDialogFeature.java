package com.facebook.share.internal;

@Deprecated
public enum LikeDialogFeature implements amm {
    LIKE_DIALOG(20140701);
    
    private int minVersion;

    private LikeDialogFeature(int i) {
        this.minVersion = 20140701;
    }

    public final String a() {
        return "com.facebook.platform.action.request.LIKE_DIALOG";
    }

    public final int b() {
        return this.minVersion;
    }
}
