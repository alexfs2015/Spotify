package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;

public abstract class TagPayloadReader {
    protected final atu b;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    protected TagPayloadReader(atu atu) {
        this.b = atu;
    }

    /* access modifiers changed from: protected */
    public abstract void a(bea bea, long j);

    /* access modifiers changed from: protected */
    public abstract boolean a(bea bea);

    public final void b(bea bea, long j) {
        if (a(bea)) {
            a(bea, j);
        }
    }
}
