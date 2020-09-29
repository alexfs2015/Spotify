package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.container.logging.WrappedMessageBuilder;
import com.spotify.mobile.android.wrapped2019.stories.container.logging.WrappedMessageBuilder.Interaction;
import com.spotify.mobile.android.wrapped2019.stories.container.logging.WrappedMessageBuilder.UserIntent;

/* renamed from: kgl reason: default package */
public final class kgl {
    private final jlr a;
    private final jtz b;

    public kgl(jlr jlr, jtz jtz) {
        this.a = jlr;
        this.b = jtz;
    }

    private WrappedMessageBuilder a() {
        return new WrappedMessageBuilder(this.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hdp a(a aVar) {
        WrappedMessageBuilder a2 = a().a(aVar.a);
        a2.a = aVar.b;
        WrappedMessageBuilder b2 = a2.b(aVar.a);
        b2.b = Interaction.HIT;
        b2.c = UserIntent.MUTE;
        return b2.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hdp a(b bVar) {
        WrappedMessageBuilder a2 = a().a(bVar.a);
        a2.a = bVar.d;
        WrappedMessageBuilder b2 = a2.b(bVar.b);
        b2.b = (Interaction) bVar.c.a($$Lambda$kgl$_sfYQybQYLx1lKqTiyDQK3tQyw.INSTANCE, $$Lambda$kgl$MifY4tPIUI4MDZjAdChF_gmMx9c.INSTANCE, $$Lambda$kgl$oZpj3F5h5fRgI3_iTt6z5AadM74.INSTANCE);
        b2.c = (UserIntent) bVar.c.a($$Lambda$kgl$3Xe6bHmFXLb3J_0zFVm7hNGB3t0.INSTANCE, $$Lambda$kgl$KjrMIoxxxaRRIvHLiGxv6TfTroo.INSTANCE, $$Lambda$kgl$SIJsjIQgD1mENVB60q5ftqrreQ.INSTANCE);
        return b2.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hdp a(c cVar) {
        WrappedMessageBuilder a2 = a().a(cVar.a);
        a2.a = cVar.b;
        WrappedMessageBuilder b2 = a2.b(cVar.a);
        b2.b = Interaction.HIT;
        b2.c = UserIntent.UNMUTE;
        return b2.a();
    }

    public final void a(kgk kgk) {
        this.a.a((hdp) kgk.a(new $$Lambda$kgl$0ALMsKHdWuk8XJbc2_aWdrR3MY(this), new $$Lambda$kgl$gLneLPjaWTUzf1cVWOPlbeMNTt8(this), new $$Lambda$kgl$LXa94cwBbqCuc7YNFrpz7_mZ9tA(this)));
    }
}
