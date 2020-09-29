package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.container.logging.WrappedMessageBuilder;
import com.spotify.mobile.android.wrapped2019.stories.container.logging.WrappedMessageBuilder.Interaction;
import com.spotify.mobile.android.wrapped2019.stories.container.logging.WrappedMessageBuilder.UserIntent;

/* renamed from: kej reason: default package */
public final class kej {
    private final jjf a;
    private final jrp b;

    public kej(jjf jjf, jrp jrp) {
        this.a = jjf;
        this.b = jrp;
    }

    public final void a(kei kei) {
        this.a.a((haw) kei.a(new $$Lambda$kej$vOI3JISO5C7tBrLkBuMdPIYZ4gA(this), new $$Lambda$kej$ueUVTXDxes9ER3r9mza4suGAppg(this), new $$Lambda$kej$eW98t4Z5zPSehl9YArOFNMdTm88(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ haw a(b bVar) {
        WrappedMessageBuilder a2 = a().a(bVar.a);
        a2.a = bVar.d;
        WrappedMessageBuilder b2 = a2.b(bVar.b);
        b2.b = (Interaction) bVar.c.a($$Lambda$kej$i9vUTdOyEtDsKKQxZBQBk6Y_Go.INSTANCE, $$Lambda$kej$4AJELsRrTKg27EHpl4C1byAyFA.INSTANCE, $$Lambda$kej$4lR2OUz20sNXphV3_sgcvGF2758.INSTANCE);
        b2.c = (UserIntent) bVar.c.a($$Lambda$kej$_GSAYW4Nhy2z0h5Zk_KC0GqKikI.INSTANCE, $$Lambda$kej$a9Ih8rF8Z04_Hb0PBCIVD4apH8.INSTANCE, $$Lambda$kej$snsWI48YjHe5es95DFTUPXSttyw.INSTANCE);
        return b2.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ haw a(a aVar) {
        WrappedMessageBuilder a2 = a().a(aVar.a);
        a2.a = aVar.b;
        WrappedMessageBuilder b2 = a2.b(aVar.a);
        b2.b = Interaction.HIT;
        b2.c = UserIntent.MUTE;
        return b2.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ haw a(c cVar) {
        WrappedMessageBuilder a2 = a().a(cVar.a);
        a2.a = cVar.b;
        WrappedMessageBuilder b2 = a2.b(cVar.a);
        b2.b = Interaction.HIT;
        b2.c = UserIntent.UNMUTE;
        return b2.a();
    }

    private WrappedMessageBuilder a() {
        return new WrappedMessageBuilder(this.b);
    }
}
