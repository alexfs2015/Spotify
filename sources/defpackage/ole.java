package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: ole reason: default package */
public final class ole implements rbr {
    private final InteractionLogger a;

    public ole(opb opb, gjf gjf) {
        this.a = opb.a(gjf);
    }

    public final void a(String str, int i) {
        this.a.a(null, "filter-and-sort-view", i, InteractionType.HIT, "sort-order-changed");
    }

    public final void a(String str, int i, boolean z) {
        this.a.a(null, "filter-and-sort-view", i, InteractionType.HIT, "filter-state-changed");
    }

    public final void a() {
        this.a.a(null, "filter-and-sort-view-menu", 0, InteractionType.HIT, "back-navigation");
    }

    public final void b() {
        this.a.a(null, "filter-and-sort-view", 0, InteractionType.HIT, "sort-or-filter-button-clicked");
    }

    public final void c() {
        this.a.a(null, "filter-and-sort-view", 0, InteractionType.HIT, "text-filter-changed");
    }

    public final void d() {
        this.a.a(null, "filter-and-sort-view", 0, InteractionType.HIT, "filter-selected");
    }

    public final void e() {
        this.a.a(null, "filter-and-sort-view", 0, InteractionType.HIT, "text-filter-cleared");
    }

    public final void f() {
        this.a.a(null, "filter-and-sort-view", 0, InteractionType.HIT, "text-filter-canceled");
    }
}
