package defpackage;

import com.spotify.messages.VoiceLibraryAudioInput;
import com.spotify.messages.VoiceLibraryError;
import com.spotify.messages.VoiceLibraryResult;
import com.spotify.messages.VoiceLibraryStatus;

/* renamed from: wdp reason: default package */
final class wdp implements wdx {
    private final gfk<fli> a;

    wdp(gfk<fli> gfk) {
        this.a = gfk;
    }

    public final void a(wdy wdy) {
        this.a.a(VoiceLibraryAudioInput.k().a(wdy.a()).b(wdy.b()).c(wdy.c()).g());
    }

    public final void a(wed wed) {
        this.a.a(VoiceLibraryError.k().a(wed.a()).b(wed.b()).c(wed.c().toString()).d(wed.d().a()).e(wed.e()).g());
    }

    public final void a(wee wee) {
        this.a.a(VoiceLibraryResult.k().a(wee.a()).b(wee.b()).g());
    }

    public final void a(wef wef) {
        this.a.a(VoiceLibraryStatus.k().a(wef.a()).b(wef.b()).a(wef.c()).b(wef.d()).c(wef.e()).g());
    }
}
