package com.spotify.mobile.android.video;

public enum VideoSurfacePriority {
    LOW(0),
    MEDIUM(1),
    HIGH(2);
    
    final int mValue;

    private VideoSurfacePriority(int i) {
        this.mValue = i;
    }

    public static VideoSurfacePriority a(int i) {
        VideoSurfacePriority[] values;
        for (VideoSurfacePriority videoSurfacePriority : values()) {
            if (videoSurfacePriority.mValue == i) {
                return videoSurfacePriority;
            }
        }
        return MEDIUM;
    }
}
