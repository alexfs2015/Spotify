package defpackage;

/* renamed from: nap reason: default package */
public final class nap implements vua<String> {
    private final wlc<nae> a;

    private nap(wlc<nae> wlc) {
        this.a = wlc;
    }

    public static nap a(wlc<nae> wlc) {
        return new nap(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a((String) fay.a(((nae) this.a.get()).i.getString("fullscreen_story_playlist_uri"), (Object) "Playlist uri not set."), "Cannot return null from a non-@Nullable @Provides method");
    }
}
