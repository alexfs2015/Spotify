package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: pic reason: default package */
public final class pic extends defpackage.reu.a<a> {

    /* renamed from: pic$a */
    static class a extends defpackage.gui.c.a<TextView> {
        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        public a(TextView textView) {
            super(textView);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            ((TextView) this.a).setText(gzt.text().title());
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_header;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.premium_page_header, viewGroup, false));
    }
}
