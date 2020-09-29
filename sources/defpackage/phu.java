package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: phu reason: default package */
public final class phu extends defpackage.reu.a<a> {
    private final phk a;

    /* renamed from: phu$a */
    static class a extends defpackage.gui.c.a<ViewGroup> {
        private final TextView b;
        private final phk c;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(ViewGroup viewGroup, phk phk) {
            super(viewGroup);
            this.b = (TextView) viewGroup.findViewById(R.id.flexbox_legal);
            this.c = phk;
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            phk.a(gzt, (ViewGroup) this.a, ((ViewGroup) this.a).getResources().getDisplayMetrics());
            String title = gzt.text().title();
            if (fax.a(title)) {
                this.b.setText("");
            } else {
                int indexOf = title.indexOf(91);
                int indexOf2 = title.indexOf(93);
                if (indexOf < 0 || indexOf2 < 0 || indexOf2 <= indexOf) {
                    this.b.setText(title);
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(title, 0, indexOf).append(title, indexOf + 1, indexOf2).append(title, indexOf2 + 1, title.length());
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.b.getLinkTextColors().getDefaultColor()), indexOf, indexOf2 - 1, 33);
                    this.b.setText(spannableStringBuilder);
                }
            }
            TextView textView = this.b;
            String str = "click";
            if (gzt.events().containsKey(str)) {
                has.a(gum.c).a(str).a(gzt).a(textView).a();
            }
        }
    }

    public final int b() {
        return R.id.hubs_premium_page_flexbox_legal;
    }

    public phu(phk phk) {
        this.a = phk;
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.flexbox_legal, viewGroup, false), this.a);
    }
}
