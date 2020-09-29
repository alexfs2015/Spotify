package defpackage;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.Collections;
import java.util.List;

/* renamed from: avy reason: default package */
public interface avy {
    public static final avy a = new avy() {
        public final List<avx> a(String str, boolean z) {
            List a = MediaCodecUtil.a(str, z);
            if (a.isEmpty()) {
                return Collections.emptyList();
            }
            return Collections.singletonList(a.get(0));
        }

        public final avx a() {
            return MediaCodecUtil.a();
        }
    };

    avx a();

    List<avx> a(String str, boolean z);

    static {
        new avy() {
            public final List<avx> a(String str, boolean z) {
                return MediaCodecUtil.a(str, z);
            }

            public final avx a() {
                return MediaCodecUtil.a();
            }
        };
    }
}
