package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: txa reason: default package */
public final class txa implements twz {
    private fvi a;

    /* renamed from: txa$a */
    public interface a {

        /* renamed from: txa$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static /* synthetic */ void a() {
            }
        }

        static {
            $$Lambda$txa$a$EAmbnqLGkk_tbCbK2usFnIZEjEU r0 = $$Lambda$txa$a$EAmbnqLGkk_tbCbK2usFnIZEjEU.INSTANCE;
        }

        void onErrorStateButtonClick();
    }

    public final void a() {
        fvi fvi = this.a;
        if (fvi != null) {
            ((fvi) fbp.a(fvi)).getView().setVisibility(0);
        }
    }

    public final void a(Context context, ViewGroup viewGroup, a aVar) {
        String string = context.getString(R.string.podcast_error_state_generic_title);
        String string2 = context.getString(R.string.podcast_error_state_generic_subtitle);
        String string3 = context.getString(R.string.podcast_error_state_generic_button_text);
        this.a = fvm.b(context, viewGroup);
        this.a.a((CharSequence) string);
        this.a.b((CharSequence) string2);
        this.a.getView().setBackgroundColor(0);
        this.a.c((CharSequence) string3);
        this.a.V_().setOnClickListener(new $$Lambda$txa$6LkT905jkNaGroUceG_H1fZb1iI(aVar));
        View view = this.a.getView();
        view.setVisibility(8);
        view.setId(R.id.podcast_error_view);
        viewGroup.addView(view);
    }

    public final void b() {
        fvi fvi = this.a;
        if (fvi != null) {
            ((fvi) fbp.a(fvi)).getView().setVisibility(8);
        }
    }
}
