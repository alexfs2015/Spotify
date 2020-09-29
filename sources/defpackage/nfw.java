package defpackage;

/* renamed from: nfw reason: default package */
public final class nfw implements wig<String> {
    private final wzi<nfl> a;

    private nfw(wzi<nfl> wzi) {
        this.a = wzi;
    }

    public static nfw a(wzi<nfl> wzi) {
        return new nfw(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a((String) fbp.a(((nfl) this.a.get()).i.getString("fullscreen_story_playlist_uri"), (Object) "Playlist uri not set."), "Cannot return null from a non-@Nullable @Provides method");
    }
}
