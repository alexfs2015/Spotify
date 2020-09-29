package defpackage;

import io.reactivex.functions.Function;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: vpq reason: default package */
public final class vpq implements Function<ByteBuffer, Float> {
    public final /* synthetic */ Object apply(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        ShortBuffer asShortBuffer = byteBuffer.slice().order(byteBuffer.order()).asShortBuffer();
        int remaining = asShortBuffer.remaining();
        float f = 0.0f;
        while (asShortBuffer.hasRemaining()) {
            short s = asShortBuffer.get();
            f += (float) (s * s);
        }
        return Float.valueOf(Math.min(1.0f, (((float) Math.sqrt((double) (f / ((float) remaining)))) / 32767.0f) * 16.0f));
    }
}
