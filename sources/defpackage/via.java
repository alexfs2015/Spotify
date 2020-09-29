package defpackage;

import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.StopCommand;
import io.reactivex.Single;

/* renamed from: via reason: default package */
public final class via implements vid {
    private final vik a;
    private final vii b;

    public via(vik vik, vii vii) {
        this.a = vik;
        this.b = vii;
    }

    private Single<vhy> a(PauseCommand pauseCommand) {
        return this.a.a("pause", pauseCommand.toBuilder().loggingParams(this.b.a()).build());
    }

    private Single<vhy> a(ResumeCommand resumeCommand) {
        return this.a.a("resume", resumeCommand.toBuilder().loggingParams(this.b.a()).build());
    }

    private Single<vhy> a(SeekToCommand seekToCommand) {
        return this.a.a("seek_to", seekToCommand.toBuilder().loggingParams(this.b.a()).build());
    }

    private Single<vhy> a(SkipToNextTrackCommand skipToNextTrackCommand) {
        return this.a.a("skip_next", skipToNextTrackCommand.toBuilder().loggingParams(this.b.a()).build());
    }

    private Single<vhy> a(SkipToPrevTrackCommand skipToPrevTrackCommand) {
        return this.a.a("skip_prev", skipToPrevTrackCommand.toBuilder().loggingParams(this.b.a()).build());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(a aVar) {
        return a(PauseCommand.create());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(b bVar) {
        return a(bVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(c cVar) {
        return a(ResumeCommand.create());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(d dVar) {
        return a(dVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(e eVar) {
        return a(SeekToCommand.create(eVar.a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(f fVar) {
        return a(fVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(g gVar) {
        return a(SkipToNextTrackCommand.create());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(h hVar) {
        return a(hVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(i iVar) {
        return a(SkipToPrevTrackCommand.create());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(j jVar) {
        return a(jVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(k kVar) {
        return this.a.a("stop", StopCommand.create().toBuilder().loggingParams(this.b.a()).build());
    }

    public final Single<vhy> a(vic vic) {
        return (Single) vic.a(new $$Lambda$via$iAjWwYJCThvUAKiUQnZta_sbc(this), new $$Lambda$via$aHjpF74KNOxt4E68OmWmTyXJ1k(this), new $$Lambda$via$hLhhmZL23tU6ux8eet0DHebqQkI(this), new $$Lambda$via$aY3T8bI3kvjXzCf1Kb_JhjKp0w(this), new $$Lambda$via$PjISwp0lqB1rrD5ElZIcA6Fl1s(this), new $$Lambda$via$ZqguO1_9F5SjjL_CPafXqz0z3g8(this), new $$Lambda$via$icxL0qzvhHrr8xfpWuXpSwVLMg(this), new $$Lambda$via$_Qb2JaxBFUpCBeGA5EiHWkgkM4(this), new $$Lambda$via$vNW49aK69FDmQuXEvoCyvadBW9A(this), new $$Lambda$via$xe0XRJW8E5BcB2_bEG66XVQPNnw(this), new $$Lambda$via$mZf2IIBipogCIEGzUYiVTcY0Ze8(this));
    }
}
