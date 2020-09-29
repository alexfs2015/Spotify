package defpackage;

import com.spotify.music.R;

/* renamed from: swc reason: default package */
public final class swc implements wig<Integer> {
    private final wzi<Boolean> a;

    private swc(wzi<Boolean> wzi) {
        this.a = wzi;
    }

    public static swc a(wzi<Boolean> wzi) {
        return new swc(wzi);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(((Boolean) this.a.get()).booleanValue() ? R.id.fragment_container : R.id.content);
    }
}
