package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: lku reason: default package */
public final class lku {
    private final Context a;

    /* renamed from: lku$a */
    interface a {
        void a();

        void b();

        void c();

        void d();
    }

    lku(Context context) {
        this.a = context;
    }

    public final void a(a aVar) {
        Context context = this.a;
        fsr b = fsy.a(context, context.getString(R.string.explicit_track_dialog_title), this.a.getString(R.string.explicit_track_dialog_subtitle)).a(this.a.getString(R.string.explicit_content_dialog_action), new $$Lambda$lku$6NNjSjw09jXqzoh1g_WmawMpgTw(aVar)).b(this.a.getString(R.string.explicit_content_dialog_dismiss), new $$Lambda$lku$kzQpkrxk3wGVsBJcYt1ZsoxOIdo(aVar));
        b.e = true;
        b.f = new $$Lambda$lku$SA1OaC3y6VIxntujCbDOhxr4xU(aVar);
        b.a().a();
    }

    public final void b(a aVar) {
        Context context = this.a;
        fsr a2 = fsy.a(context, context.getString(R.string.explicit_track_dialog_title), this.a.getString(R.string.locked_explicit_content_dialog_subtitle)).a(this.a.getString(R.string.locked_explicit_content_dialog_close_button), new $$Lambda$lku$XCQDBjvMrA_dqfYDRyOXFfiSq0o(aVar));
        a2.e = true;
        a2.f = new $$Lambda$lku$Ra7OPZttLMqfXoOv9m3n2NfjGU(aVar);
        a2.a().a();
    }
}
