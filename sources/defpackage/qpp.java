package defpackage;

import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.speakercompanion.model.EntityFeedback;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: qpp reason: default package */
public final class qpp implements a {
    private b a;
    private EntityFeedback b;
    private final SpSharedPreferences<Object> c;
    private final szp d;
    private final jlr e;
    private final jtz f;

    qpp(szp szp, SpSharedPreferences<Object> spSharedPreferences, jlr jlr, jtz jtz) {
        this.c = spSharedPreferences;
        this.d = szp;
        this.e = jlr;
        this.f = jtz;
    }

    private void a(EntityFeedback entityFeedback, String str) {
        jlr jlr = this.e;
        bh bhVar = new bh(entityFeedback.uid(), uqo.aT.a(), ViewUris.bQ.toString(), "", -1, "", InteractionType.TAP.mInteractionType, InteractionIntent.CLOSE.mInteractionIntent, (double) this.f.a(), str);
        jlr.a(bhVar);
    }

    private int d() {
        return this.c.a(qot.a, 0);
    }

    public final void a() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.k();
        }
        EntityFeedback entityFeedback = this.b;
        if (entityFeedback != null) {
            a(entityFeedback, "dismiss");
        }
        this.c.a().a(qot.a, d() + 1).b();
    }

    public final void a(EntityFeedback entityFeedback) {
        EntityFeedback entityFeedback2 = entityFeedback;
        if (entityFeedback2 != null && this.a != null) {
            this.b = entityFeedback2;
            EntityFeedback entityFeedback3 = this.b;
            jlr jlr = this.e;
            be beVar = r4;
            be beVar2 = new be(entityFeedback3.uid(), uqo.aT.a(), ViewUris.bQ.toString(), "", -1, "", "popover", "", (double) this.f.a());
            jlr.a(beVar);
            this.a.a(entityFeedback.title());
            this.a.b(entityFeedback.entityUri(), entityFeedback.imageUri());
        }
    }

    public final void a(b bVar) {
        this.a = bVar;
        if (d() >= 3) {
            this.a.k();
        }
    }

    public final void b() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.k();
        }
        EntityFeedback entityFeedback = this.b;
        if (entityFeedback != null) {
            a(entityFeedback, "yes");
        }
    }

    public final void c() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.k();
        }
        EntityFeedback entityFeedback = this.b;
        if (entityFeedback != null) {
            a(entityFeedback, "no");
            if (!this.b.actionUri().isEmpty()) {
                this.d.a(this.b.actionUri());
            }
        }
    }
}
