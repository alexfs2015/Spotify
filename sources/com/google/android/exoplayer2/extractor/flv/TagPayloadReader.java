package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;

public abstract class TagPayloadReader {
    protected final atd b;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(bdj bdj, long j);

    /* access modifiers changed from: protected */
    public abstract boolean a(bdj bdj);

    protected TagPayloadReader(atd atd) {
        this.b = atd;
    }

    public final void b(bdj bdj, long j) {
        if (a(bdj)) {
            a(bdj, j);
        }
    }
}
