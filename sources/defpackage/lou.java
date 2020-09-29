package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: lou reason: default package */
public final class lou {
    private final Context a;

    /* renamed from: lou$a */
    interface a {
        void a();

        void b();

        void c();

        void d();
    }

    lou(Context context) {
        this.a = context;
    }

    public final void a(a aVar) {
        Context context = this.a;
        ftl b = fts.a(context, context.getString(R.string.explicit_track_dialog_title), this.a.getString(R.string.explicit_track_dialog_subtitle)).a(this.a.getString(R.string.explicit_content_dialog_action), new $$Lambda$lou$0T5rjIc2xzQi9VUvmVapy67n5oA(aVar)).b(this.a.getString(R.string.explicit_content_dialog_dismiss), new $$Lambda$lou$7kNlIeY2y45dHsasCEq0p26KVM(aVar));
        b.e = true;
        b.f = new $$Lambda$lou$SeuRtZFYdaCjplVbdNWpxs22H4(aVar);
        b.a().a();
    }

    public final void b(a aVar) {
        Context context = this.a;
        ftl a2 = fts.a(context, context.getString(R.string.explicit_track_dialog_title), this.a.getString(R.string.locked_explicit_content_dialog_subtitle)).a(this.a.getString(R.string.locked_explicit_content_dialog_close_button), new $$Lambda$lou$TgNO4qAhAiGpQjMRBCNM317N5ok(aVar));
        a2.e = true;
        a2.f = new $$Lambda$lou$PPGzc8msTTXEWMHJJXGyLw0aeI(aVar);
        a2.a().a();
    }
}
