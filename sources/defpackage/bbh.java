package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: bbh reason: default package */
public final class bbh extends baa {
    private static final int c = ben.g("payl");
    private static final int d = ben.g("sttg");
    private static final int e = ben.g("vttc");
    private final bea f = new bea();
    private final a g = new a();

    public bbh() {
        super("Mp4WebvttDecoder");
    }

    private static azz a(bea bea, a aVar, int i) {
        aVar.a();
        while (i > 0) {
            if (i >= 8) {
                int i2 = bea.i();
                int i3 = bea.i();
                int i4 = i - 8;
                int i5 = i2 - 8;
                String a = ben.a(bea.a, bea.b, i5);
                bea.d(i5);
                i = i4 - i5;
                if (i3 == d) {
                    bbl.a(a, aVar);
                } else if (i3 == c) {
                    bbl.a((String) null, a.trim(), aVar, Collections.emptyList());
                }
            } else {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
        }
        return aVar.b();
    }

    public final /* synthetic */ bac a(byte[] bArr, int i, boolean z) {
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
        return new bbi(arrayList);
    }
}
