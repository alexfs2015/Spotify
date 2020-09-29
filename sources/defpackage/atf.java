package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader.UnsupportedFormatException;
import java.util.Collections;

/* renamed from: atf reason: default package */
final class atf extends TagPayloadReader {
    private static final int[] a = {5512, 11025, 22050, 44100};
    private boolean c;
    private boolean d;
    private int e;

    public atf(atd atd) {
        super(atd);
    }

    public final boolean a(bdj bdj) {
        if (!this.c) {
            int c2 = bdj.c();
            this.e = (c2 >> 4) & 15;
            int i = this.e;
            if (i == 2) {
                this.b.a(aqe.a((String) null, "audio/mpeg", (String) null, -1, -1, 1, a[(c2 >> 2) & 3], null, (asc) null, 0, (String) null));
                this.d = true;
            } else if (i == 7 || i == 8) {
                this.b.a(aqe.a((String) null, this.e == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, (c2 & 1) == 1 ? 2 : 3, null, (asc) null, 0, (String) null));
                this.d = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder("Audio format not supported: ");
                sb.append(this.e);
                throw new UnsupportedFormatException(sb.toString());
            }
            this.c = true;
        } else {
            bdj.d(1);
        }
        return true;
    }

    public final void a(bdj bdj, long j) {
        bdj bdj2 = bdj;
        if (this.e == 2) {
            int b = bdj.b();
            this.b.a(bdj2, b);
            this.b.a(j, 1, b, 0, null);
            return;
        }
        int c2 = bdj.c();
        if (c2 != 0 || this.d) {
            if (this.e != 10 || c2 == 1) {
                int b2 = bdj.b();
                this.b.a(bdj2, b2);
                this.b.a(j, 1, b2, 0, null);
            }
            return;
        }
        byte[] bArr = new byte[bdj.b()];
        bdj2.a(bArr, 0, bArr.length);
        Pair a2 = bcx.a(bArr);
        this.b.a(aqe.a((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a2.second).intValue(), ((Integer) a2.first).intValue(), Collections.singletonList(bArr), (asc) null, 0, (String) null));
        this.d = true;
    }
}
