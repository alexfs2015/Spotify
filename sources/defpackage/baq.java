package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: baq reason: default package */
public final class baq extends azj {
    private static final int c = bdw.g("payl");
    private static final int d = bdw.g("sttg");
    private static final int e = bdw.g("vttc");
    private final bdj f = new bdj();
    private final a g = new a();

    public baq() {
        super("Mp4WebvttDecoder");
    }

    private static azi a(bdj bdj, a aVar, int i) {
        aVar.a();
        while (i > 0) {
            if (i >= 8) {
                int i2 = bdj.i();
                int i3 = bdj.i();
                int i4 = i - 8;
                int i5 = i2 - 8;
                String a = bdw.a(bdj.a, bdj.b, i5);
                bdj.d(i5);
                i = i4 - i5;
                if (i3 == d) {
                    bau.a(a, aVar);
                } else if (i3 == c) {
                    bau.a((String) null, a.trim(), aVar, Collections.emptyList());
                }
            } else {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
        }
        return aVar.b();
    }

    public final /* synthetic */ azl a(byte[] bArr, int i, boolean z) {
        this.f.a(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f.b() > 0) {
            if (this.f.b() >= 8) {
                int i2 = this.f.i();
                if (this.f.i() == e) {
                    arrayList.add(a(this.f, this.g, i2 - 8));
                } else {
                    this.f.d(i2 - 8);
                }
            } else {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new bar(arrayList);
    }
}
