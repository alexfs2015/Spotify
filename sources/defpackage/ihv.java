package defpackage;

import defpackage.ihx;

/* renamed from: ihv reason: default package */
public final class ihv<T extends ihx> implements ihx {
    public final T a;
    public final long b;
    public final long c;
    public final boolean d;

    public ihv(T t, long j, long j2, boolean z) {
        this.a = t;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    public final int getTimestampMillis() {
        return this.a.getTimestampMillis();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnnotationPlayerState{mTimedItem=");
        sb.append(this.a);
        sb.append(", mCurrentPosition=");
        sb.append(this.b);
        sb.append(", mDuration=");
        sb.append(this.c);
        sb.append(", mPlaying=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
