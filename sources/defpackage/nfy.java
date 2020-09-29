package defpackage;

import com.spotify.music.features.fullscreen.story.logger.FullscreenStoryLogger;
import com.spotify.music.features.fullscreen.story.logger.FullscreenStoryLogger.Impression;
import com.spotify.music.features.fullscreen.story.logger.FullscreenStoryLogger.Interaction;
import com.spotify.music.features.fullscreen.story.logger.FullscreenStoryLogger.UserIntent;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: nfy reason: default package */
public final class nfy implements FullscreenStoryLogger {
    private final InteractionLogger a;
    private final ImpressionLogger b;
    private final String c;

    public nfy(InteractionLogger interactionLogger, ImpressionLogger impressionLogger, String str) {
        this.a = (InteractionLogger) fbp.a(interactionLogger);
        this.b = (ImpressionLogger) fbp.a(impressionLogger);
        this.c = (String) fbp.a(str);
    }

    private void a(Impression impression, String str, int i, ImpressionType impressionType, RenderType renderType) {
        this.b.a(impression.toString(), str, i, impressionType, renderType);
    }

    private void a(Impression impression, String str, ImpressionType impressionType, RenderType renderType) {
        a(impression, str, -1, impressionType, renderType);
    }

    private void a(Interaction interaction, String str, int i, InteractionType interactionType, UserIntent userIntent) {
        this.a.a(interaction.toString(), str, i, interactionType, userIntent.toString());
    }

    private void a(Interaction interaction, String str, InteractionType interactionType, UserIntent userIntent) {
        a(interaction, str, -1, interactionType, userIntent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        a(Impression.AUDIO_PLAYING, this.c, aVar.a, ImpressionType.ITEM, RenderType.PAGE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        a(Interaction.BACK_BUTTON, this.c, InteractionType.HIT, UserIntent.DISMISS);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        a(Interaction.CLOSE, this.c, InteractionType.HIT, UserIntent.DISMISS);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        a(Interaction.CONTEXT_MENU_BUTTON, this.c, dVar.a, InteractionType.HIT, UserIntent.MORE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(e eVar) {
        a(Interaction.CONTEXT_PLAYER, this.c, InteractionType.HIT, UserIntent.DISMISS);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(f fVar) {
        a(Impression.EMPTY_CHAPTER, this.c, ImpressionType.ERROR, RenderType.PAGE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(g gVar) {
        a(Impression.EMPTY_STORY, this.c, ImpressionType.ERROR, RenderType.PAGE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(h hVar) {
        a(Interaction.HEART_BUTTON, this.c, hVar.a, InteractionType.HIT, hVar.b ? UserIntent.HEARTED : UserIntent.UNHEARTED);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(i iVar) {
        a(Interaction.NEXT_CHAPTER, this.c, iVar.a, InteractionType.HIT, UserIntent.NAVIGATE_FORWARD);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(j jVar) {
        a(Impression.PLAYBACK_ERROR, this.c, ImpressionType.ERROR, RenderType.PAGE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(k kVar) {
        a(Interaction.PLAYLIST_COVER, this.c, InteractionType.HIT, UserIntent.DISMISS);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(l lVar) {
        a(Interaction.PREVIOUS_CHAPTER, this.c, lVar.a, InteractionType.HIT, UserIntent.NAVIGATE_BACKWARD);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(m mVar) {
        a(Impression.STORY_FETCHED, this.c, ImpressionType.ITEM, RenderType.PAGE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(n nVar) {
        a(Impression.STORY_FETCHING_FAILED, this.c, ImpressionType.ERROR, RenderType.PAGE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(o oVar) {
        a(Impression.STORY_VIEW_SHOWN, this.c, ImpressionType.ITEM, RenderType.PAGE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(p pVar) {
        a(Impression.VIDEO_PLAYING, this.c, pVar.a, ImpressionType.ITEM, RenderType.PAGE);
    }

    public final void a(ngg ngg) {
        ngg ngg2 = ngg;
        $$Lambda$nfy$SH_VcxDlRaBIn8VJCv494DdX19o r2 = r3;
        $$Lambda$nfy$SH_VcxDlRaBIn8VJCv494DdX19o r3 = new $$Lambda$nfy$SH_VcxDlRaBIn8VJCv494DdX19o(this);
        $$Lambda$nfy$d1fne_OzFLuUmxfRQohmJgjm8d0 r32 = r4;
        $$Lambda$nfy$d1fne_OzFLuUmxfRQohmJgjm8d0 r4 = new $$Lambda$nfy$d1fne_OzFLuUmxfRQohmJgjm8d0(this);
        $$Lambda$nfy$KewA2IQKC1qfv3WJZULdQURV_II r42 = r5;
        $$Lambda$nfy$KewA2IQKC1qfv3WJZULdQURV_II r5 = new $$Lambda$nfy$KewA2IQKC1qfv3WJZULdQURV_II(this);
        $$Lambda$nfy$ZNGX7YefnzO0xQcPnVEQx76Rpk r52 = r6;
        $$Lambda$nfy$ZNGX7YefnzO0xQcPnVEQx76Rpk r6 = new $$Lambda$nfy$ZNGX7YefnzO0xQcPnVEQx76Rpk(this);
        $$Lambda$nfy$f_QxIkpwwA3u8VEdWvdDDfYaFU0 r62 = r7;
        $$Lambda$nfy$f_QxIkpwwA3u8VEdWvdDDfYaFU0 r7 = new $$Lambda$nfy$f_QxIkpwwA3u8VEdWvdDDfYaFU0(this);
        $$Lambda$nfy$Lnyy6jcfstFO0AXEgux9YyNvF3A r72 = r8;
        $$Lambda$nfy$Lnyy6jcfstFO0AXEgux9YyNvF3A r8 = new $$Lambda$nfy$Lnyy6jcfstFO0AXEgux9YyNvF3A(this);
        $$Lambda$nfy$Bw6Lh2iQokVV8HHDeXZsxYC8 r82 = r9;
        $$Lambda$nfy$Bw6Lh2iQokVV8HHDeXZsxYC8 r9 = new $$Lambda$nfy$Bw6Lh2iQokVV8HHDeXZsxYC8(this);
        $$Lambda$nfy$dtfkHRYv_kfzC66OceC7Qd0k7g r92 = r10;
        $$Lambda$nfy$dtfkHRYv_kfzC66OceC7Qd0k7g r10 = new $$Lambda$nfy$dtfkHRYv_kfzC66OceC7Qd0k7g(this);
        $$Lambda$nfy$QU27gKQea9NJDpf988vcRlznges r102 = r11;
        $$Lambda$nfy$QU27gKQea9NJDpf988vcRlznges r11 = new $$Lambda$nfy$QU27gKQea9NJDpf988vcRlznges(this);
        $$Lambda$nfy$Kw8wwquR4RaWbm9csSPPhLUG_UM r112 = r12;
        $$Lambda$nfy$Kw8wwquR4RaWbm9csSPPhLUG_UM r12 = new $$Lambda$nfy$Kw8wwquR4RaWbm9csSPPhLUG_UM(this);
        $$Lambda$nfy$pPfvVKMbNEcqcDBFmryrKk1G7Kc r122 = r13;
        $$Lambda$nfy$pPfvVKMbNEcqcDBFmryrKk1G7Kc r13 = new $$Lambda$nfy$pPfvVKMbNEcqcDBFmryrKk1G7Kc(this);
        $$Lambda$nfy$B3tH3mTHcuSYY910zD0wD8_TBEc r132 = r14;
        $$Lambda$nfy$B3tH3mTHcuSYY910zD0wD8_TBEc r14 = new $$Lambda$nfy$B3tH3mTHcuSYY910zD0wD8_TBEc(this);
        $$Lambda$nfy$ZI5inioCQshJtdYMuzzR_QW4Z3Q r142 = r15;
        $$Lambda$nfy$ZI5inioCQshJtdYMuzzR_QW4Z3Q r15 = new $$Lambda$nfy$ZI5inioCQshJtdYMuzzR_QW4Z3Q(this);
        ngg ngg3 = ngg2;
        $$Lambda$nfy$aCRsncfyQ7bLUFHOOrxo3EQQfM4 r1 = new $$Lambda$nfy$aCRsncfyQ7bLUFHOOrxo3EQQfM4(this);
        $$Lambda$nfy$6nJupuVCsIq6S3CAqeojJ7rKeYI r16 = r1;
        $$Lambda$nfy$6nJupuVCsIq6S3CAqeojJ7rKeYI r17 = new $$Lambda$nfy$6nJupuVCsIq6S3CAqeojJ7rKeYI(this);
        $$Lambda$nfy$jEaDFSBVd3xNRC0nh9k6U4i_xc r172 = r1;
        $$Lambda$nfy$jEaDFSBVd3xNRC0nh9k6U4i_xc r18 = new $$Lambda$nfy$jEaDFSBVd3xNRC0nh9k6U4i_xc(this);
        ngg3.a(r2, r32, r42, r52, r62, r72, r82, r92, r102, r112, r122, r132, r142, r1, r16, r172);
    }
}
