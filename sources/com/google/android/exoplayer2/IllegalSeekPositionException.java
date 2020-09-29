package com.google.android.exoplayer2;

public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final arl timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(arl arl, int i, long j) {
        this.timeline = arl;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
