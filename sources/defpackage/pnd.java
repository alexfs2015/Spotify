package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;

/* renamed from: pnd reason: default package */
final class pnd {
    private final jsz a;

    /* renamed from: pnd$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        static {
            try {
                a[LinkType.SHOW_EPISODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    pnd(jsz jsz) {
        this.a = jsz;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        a(R.string.toast_added_album_to_queue);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new $$Lambda$pnd$7w8DdLLrfQyoKQWCnxjBv4MuFv0(this, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        this.a.a(SpotifyIconV2.ADD_TO_QUEUE, i, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i) {
        this.a.a(i, 1, new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    public void b(int i) {
        new Handler(Looper.getMainLooper()).post(new $$Lambda$pnd$ikA2DnZub4v6zkvoEs3Z900KPc(this, i));
    }
}
