package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.templates.logging.StoryMessageBuilder;
import com.spotify.mobile.android.wrapped2019.stories.templates.logging.StoryMessageBuilder.Page;
import com.spotify.mobile.android.wrapped2019.stories.templates.logging.StoryMessageBuilder.Type;

/* renamed from: khh reason: default package */
public final class khh {
    private final jjf a;
    private final jrp b;

    public khh(jjf jjf, jrp jrp) {
        this.a = jjf;
        this.b = jrp;
    }

    public final void a(khg khg) {
        this.a.a(b(khg));
    }

    private haw b(khg khg) {
        return (haw) khg.a(new $$Lambda$khh$ZsO6wBagmaVI11M7N78a6YiIcWQ(this), new $$Lambda$khh$0i3WwVCfH7wq4lo1wozQGkr_x28(this), new $$Lambda$khh$KcXMyjdOAYokuA6QwhkWcAdfWFY(this), new $$Lambda$khh$OF7MiKV04vcYHBiNOFGUvIyes(this), new $$Lambda$khh$QCtGJBsXF6MMAh4YffGuL9twDlc(this), new $$Lambda$khh$aIIwBsfq0YXK76olEeZgUjYdNbI(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ haw a(a aVar) {
        return a().a(aVar.a).a(Page.STORY).a(Type.ENTER).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ haw a(d dVar) {
        return a().a(dVar.a).a(Page.STORY).a(Type.EXIT).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ haw a(e eVar) {
        return a().a(eVar.a).a(Page.LOADER).a(Type.ENTER).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ haw a(f fVar) {
        return a().a(fVar.a).a(Page.LOADER).a(Type.EXIT).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ haw a(b bVar) {
        return a().a(bVar.a).a(Page.LOAD_FAIL).a(Type.ENTER).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ haw a(c cVar) {
        return a().a(cVar.a).a(Page.LOAD_FAIL).a(Type.EXIT).a();
    }

    private StoryMessageBuilder a() {
        return new StoryMessageBuilder(this.b);
    }
}
