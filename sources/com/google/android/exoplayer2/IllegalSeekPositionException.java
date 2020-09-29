package com.google.android.exoplayer2;

public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final aqu timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(aqu aqu, int i, long j) {
        this.timeline = aqu;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
