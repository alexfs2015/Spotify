package defpackage;

import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.speakercompanion.model.EntityFeedback;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: qhb reason: default package */
public final class qhb implements a {
    private b a;
    private EntityFeedback b;
    private final SpSharedPreferences<Object> c;
    private final spi d;
    private final jjf e;
    private final jrp f;

    qhb(spi spi, SpSharedPreferences<Object> spSharedPreferences, jjf jjf, jrp jrp) {
        this.c = spSharedPreferences;
        this.d = spi;
        this.e = jjf;
        this.f = jrp;
    }

    public final void a(b bVar) {
        this.a = bVar;
        if (d() >= 3) {
            this.a.k();
        }
    }

    public final void a(EntityFeedback entityFeedback) {
        EntityFeedback entityFeedback2 = entityFeedback;
        if (entityFeedback2 != null && this.a != null) {
            this.b = entityFeedback2;
            EntityFeedback entityFeedback3 = this.b;
            jjf jjf = this.e;
            bf bfVar = r4;
            bf bfVar2 = new bf(entityFeedback3.uid(), udt.aT.a(), ViewUris.bR.toString(), "", -1, "", "popover", "", (double) this.f.a());
            jjf.a(bfVar);
            this.a.a(entityFeedback.title());
            this.a.b(entityFeedback.entityUri(), entityFeedback.imageUri());
        }
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
        this.c.a().a(qgf.a, d() + 1).b();
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

    private int d() {
        return this.c.a(qgf.a, 0);
    }

    private void a(EntityFeedback entityFeedback, String str) {
        jjf jjf = this.e;
        bi biVar = new bi(entityFeedback.uid(), udt.aT.a(), ViewUris.bR.toString(), "", -1, "", InteractionType.TAP.mInteractionType, InteractionIntent.CLOSE.mInteractionIntent, (double) this.f.a(), str);
        jjf.a(biVar);
    }
}
