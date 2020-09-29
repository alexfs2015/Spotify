package com.spotify.core.http;

public class HttpOptions {
    private final long mConnectTimeout;
    private final boolean mFollowRedirects;
    private final long mTimeout;

    @Deprecated
    public HttpOptions(long j, long j2) {
        this(j, j2, true);
    }

    public HttpOptions(long j, long j2, boolean z) {
        this.mTimeout = j;
        this.mConnectTimeout = j2;
        this.mFollowRedirects = z;
    }

    public long getTimeout() {
        return this.mTimeout;
    }

    public long getConnectTimeout() {
        return this.mConnectTimeout;
    }

    public boolean isFollowRedirects() {
        return this.mFollowRedirects;
    }
}
