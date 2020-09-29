package defpackage;

import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.StopCommand;
import io.reactivex.Single;

/* renamed from: uwj reason: default package */
public final class uwj implements uwm {
    private final uwn a;

    public uwj(uwn uwn) {
        this.a = uwn;
    }

    public final Single<uwi> a(uwl uwl) {
        return (Single) uwl.a(new $$Lambda$uwj$p3_qtw9Taszf0ZyBGsl4YEcfJIw(this), new $$Lambda$uwj$6RhjS1KPfFDaN8qGKjxDWlcwT8Y(this), new $$Lambda$uwj$lq6_d9rPCZxx0O3zYmnkdNl5Rhs(this), new $$Lambda$uwj$rTmK9FEC6YWjrr6CEA0xNRyLUm0(this), new $$Lambda$uwj$1a8FnX6UQ_fJ7GMML5Q7A71CC0(this), new $$Lambda$uwj$D4SRp1HHrLT2FBbJtWr4w7YwGEg(this), new $$Lambda$uwj$0VTKlq9mFXzZHq6MNtEyyIhJJGc(this), new $$Lambda$uwj$tWA2uWHbVycxu4GpWybJuTU2L4k(this), new $$Lambda$uwj$Vn3jH2KQzSwYcy3NwBVK7eQ4yXc(this), new $$Lambda$uwj$TsT4c52kNorqZl4TOORayP09uh4(this), new $$Lambda$uwj$KsKEccWFhA_pAtqsMNuX40bOkrE(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(c cVar) {
        return a(ResumeCommand.EMPTY);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(a aVar) {
        return a(PauseCommand.EMPTY);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(g gVar) {
        return a(SkipToNextTrackCommand.EMPTY);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(i iVar) {
        return a(SkipToPrevTrackCommand.EMPTY);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(e eVar) {
        return a(SeekToCommand.builder().value(eVar.a).build());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(k kVar) {
        return this.a.a("stop", StopCommand.EMPTY);
    }

    private Single<uwi> a(ResumeCommand resumeCommand) {
        return this.a.a("resume", resumeCommand);
    }

    private Single<uwi> a(PauseCommand pauseCommand) {
        return this.a.a("pause", pauseCommand);
    }

    private Single<uwi> a(SkipToNextTrackCommand skipToNextTrackCommand) {
        return this.a.a("skip_next", skipToNextTrackCommand);
    }

    private Single<uwi> a(SkipToPrevTrackCommand skipToPrevTrackCommand) {
        return this.a.a("skip_prev", skipToPrevTrackCommand);
    }

    private Single<uwi> a(SeekToCommand seekToCommand) {
        return this.a.a("seek_to", seekToCommand);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(f fVar) {
        return a(fVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(j jVar) {
        return a(jVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(h hVar) {
        return a(hVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(b bVar) {
        return a(bVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(d dVar) {
        return a(dVar.a);
    }
}
