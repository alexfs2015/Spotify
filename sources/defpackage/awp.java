package defpackage;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.Collections;
import java.util.List;

/* renamed from: awp reason: default package */
public interface awp {
    public static final awp a = new awp() {
        public final awo a() {
            return MediaCodecUtil.a();
        }

        public final List<awo> a(String str, boolean z) {
            List a = MediaCodecUtil.a(str, z);
            return a.isEmpty() ? Collections.emptyList() : Collections.singletonList(a.get(0));
        }
    };

    static {
        new awp() {
            public final awo a() {
                return MediaCodecUtil.a();
            }

            public final List<awo> a(String str, boolean z) {
                return MediaCodecUtil.a(str, z);
            }
        };
    }

    awo a();

    List<awo> a(String str, boolean z);
}
