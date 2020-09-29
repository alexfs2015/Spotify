package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader.UnsupportedFormatException;
import java.util.Collections;

/* renamed from: atw reason: default package */
final class atw extends TagPayloadReader {
    private static final int[] a = {5512, 11025, 22050, 44100};
    private boolean c;
    private boolean d;
    private int e;

    public atw(atu atu) {
        super(atu);
    }

    public final void a(bea bea, long j) {
        bea bea2 = bea;
        if (this.e == 2) {
            int b = bea.b();
            this.b.a(bea2, b);
            this.b.a(j, 1, b, 0, null);
            return;
        }
        int c2 = bea.c();
        if (c2 != 0 || this.d) {
            if (this.e != 10 || c2 == 1) {
                int b2 = bea.b();
                this.b.a(bea2, b2);
                this.b.a(j, 1, b2, 0, null);
            }
            return;
        }
        byte[] bArr = new byte[bea.b()];
        bea2.a(bArr, 0, bArr.length);
        Pair a2 = bdo.a(bArr);
        this.b.a(aqv.a((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a2.second).intValue(), ((Integer) a2.first).intValue(), Collections.singletonList(bArr), (ast) null, 0, (String) null));
        this.d = true;
    }

    public final boolean a(bea bea) {
        if (!this.c) {
            int c2 = bea.c();
            this.e = (c2 >> 4) & 15;
            int i = this.e;
            if (i == 2) {
                this.b.a(aqv.a((String) null, "audio/mpeg", (String) null, -1, -1, 1, a[(c2 >> 2) & 3], null, (ast) null, 0, (String) null));
                this.d = true;
            } else if (i == 7 || i == 8) {
                this.b.a(aqv.a((String) null, this.e == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, (c2 & 1) == 1 ? 2 : 3, null, (ast) null, 0, (String) null));
                this.d = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder("Audio format not supported: ");
                sb.append(this.e);
                throw new UnsupportedFormatException(sb.toString());
            }
            this.c = true;
        } else {
            bea.d(1);
        }
        return true;
    }
}
