package com.spotify.mobile.android.video.tracking;

import com.google.common.base.Optional;

public final class BufferEvent {
    public final Kind a;
    private final long b;
    private final long c;
    private final long d;

    public enum Kind {
        INITIAL,
        SEEK,
        STALL
    }

    public BufferEvent(Kind kind, long j, long j2) {
        this(kind, j, j2, -1);
    }

    private BufferEvent(Kind kind, long j, long j2, long j3) {
        this.a = kind;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final Optional<Long> a() {
        long j = this.d;
        return j == -1 ? Optional.e() : Optional.b(Long.valueOf(j - this.c));
    }

    public final BufferEvent a(long j) {
        BufferEvent bufferEvent = r0;
        BufferEvent bufferEvent2 = new BufferEvent(this.a, this.b, this.c, j);
        return bufferEvent2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BufferEvent)) {
            return false;
        }
        BufferEvent bufferEvent = (BufferEvent) obj;
        if (this.b != bufferEvent.b) {
            return false;
        }
        if (this.c == bufferEvent.c && this.d == bufferEvent.d) {
            return this.a == bufferEvent.a;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        return i2 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BufferEvent{mKind=");
        sb.append(this.a);
        String str = "rAsurtca,eiecoindt iMsM=soPdm";
        sb.append(", mMsOccurredAtMediaPosition=");
        sb.append(this.b);
        String str2 = "uiSmafresBf M,=mteTrm";
        sb.append(", mMsBufferStartTime=");
        sb.append(this.c);
        String str3 = " MuroeE,imnfmdsBf=T";
        sb.append(", mMsBufferEndTime=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
