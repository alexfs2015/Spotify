package defpackage;

import com.spotify.mobile.android.core.internal.AudioDriver;

/* renamed from: ile reason: default package */
public final class ile {
    private int a = AudioDriver.SPOTIFY_MAX_VOLUME;

    public final byte a(byte b) {
        int i = this.a;
        this.a = ((i << 8) | (i >>> 8)) & AudioDriver.SPOTIFY_MAX_VOLUME;
        this.a ^= b & 255;
        int i2 = this.a;
        this.a = i2 ^ ((i2 & 255) >> 4);
        int i3 = this.a;
        this.a = i3 ^ ((i3 << 12) & AudioDriver.SPOTIFY_MAX_VOLUME);
        int i4 = this.a;
        this.a = i4 ^ (65535 & ((i4 & 255) << 5));
        return b;
    }

    public final short a() {
        return (short) (this.a & AudioDriver.SPOTIFY_MAX_VOLUME);
    }
}
