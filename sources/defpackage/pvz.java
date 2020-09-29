package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;

/* renamed from: pvz reason: default package */
final class pvz {
    private final jvf a;

    /* renamed from: pvz$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        static {
            try {
                a[LinkType.SHOW_EPISODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    pvz(jvf jvf) {
        this.a = jvf;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i) {
        this.a.a(i, 1, new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        this.a.a(SpotifyIconV2.ADD_TO_QUEUE, i, 0);
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        a(R.string.toast_added_album_to_queue);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new $$Lambda$pvz$4luEcgIRXhyHXOVX6zihJr2xQc(this, i));
    }

    /* access modifiers changed from: 0000 */
    public void b(int i) {
        new Handler(Looper.getMainLooper()).post(new $$Lambda$pvz$1UgToBraMI5VzSV6bJVU5anRWA(this, i));
    }
}
