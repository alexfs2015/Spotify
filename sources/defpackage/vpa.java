package defpackage;

import com.spotify.messages.VoiceLibraryAudioInput;
import com.spotify.messages.VoiceLibraryError;
import com.spotify.messages.VoiceLibraryResult;
import com.spotify.messages.VoiceLibraryStatus;

/* renamed from: vpa reason: default package */
final class vpa implements vqp {
    private final gdz<fko> a;

    vpa(gdz<fko> gdz) {
        this.a = gdz;
    }

    public final void a(vqx vqx) {
        this.a.a(VoiceLibraryStatus.k().a(vqx.a()).b(vqx.b()).a(vqx.c()).b(vqx.d()).c(vqx.e()).g());
    }

    public final void a(vqv vqv) {
        this.a.a(VoiceLibraryError.k().a(vqv.a()).b(vqv.b()).c(vqv.c().toString()).d(vqv.d().a()).e(vqv.e()).g());
    }

    public final void a(vqw vqw) {
        this.a.a(VoiceLibraryResult.k().a(vqw.a()).b(vqw.b()).g());
    }

    public final void a(vqq vqq) {
        this.a.a(VoiceLibraryAudioInput.k().a(vqq.a()).b(vqq.b()).c(vqq.c()).g());
    }
}
