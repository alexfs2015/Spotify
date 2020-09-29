package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.templates.logging.StoryMessageBuilder;
import com.spotify.mobile.android.wrapped2019.stories.templates.logging.StoryMessageBuilder.Page;
import com.spotify.mobile.android.wrapped2019.stories.templates.logging.StoryMessageBuilder.Type;

/* renamed from: kju reason: default package */
public final class kju {
    private final jlr a;
    private final jtz b;

    public kju(jlr jlr, jtz jtz) {
        this.a = jlr;
        this.b = jtz;
    }

    private StoryMessageBuilder a() {
        return new StoryMessageBuilder(this.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hdp a(a aVar) {
        return a().a(aVar.a).a(Page.STORY).a(Type.ENTER).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hdp a(b bVar) {
        return a().a(bVar.a).a(Page.LOAD_FAIL).a(Type.ENTER).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hdp a(c cVar) {
        return a().a(cVar.a).a(Page.LOAD_FAIL).a(Type.EXIT).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hdp a(d dVar) {
        return a().a(dVar.a).a(Page.STORY).a(Type.EXIT).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hdp a(e eVar) {
        return a().a(eVar.a).a(Page.LOADER).a(Type.ENTER).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hdp a(f fVar) {
        return a().a(fVar.a).a(Page.LOADER).a(Type.EXIT).a();
    }

    private hdp b(kjt kjt) {
        return (hdp) kjt.a(new $$Lambda$kju$rSWSTrtvfUlL59pwWyd8nSYswok(this), new $$Lambda$kju$sfIetH8ebHvpT40Uz6rGrDq4Ezc(this), new $$Lambda$kju$Rt4vtwO68guHF3MJy8V8IRTYfc(this), new $$Lambda$kju$GvBZojKhxnhFvTE9Q8HXMVwVSg(this), new $$Lambda$kju$wyX1MFVCVGtE74affHF_TB9X6g(this), new $$Lambda$kju$hbAucjLIpG76z5SB5onKbC5GHIg(this));
    }

    public final void a(kjt kjt) {
        this.a.a(b(kjt));
    }
}
