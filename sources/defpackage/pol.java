package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: pol reason: default package */
public final class pol extends defpackage.rnw.a<a> {
    private final pob a;

    /* renamed from: pol$a */
    static class a extends defpackage.gwi.c.a<ViewGroup> {
        private final TextView b;
        private final pob c;

        protected a(ViewGroup viewGroup, pob pob) {
            super(viewGroup);
            this.b = (TextView) viewGroup.findViewById(R.id.flexbox_legal);
            this.c = pob;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            pob.a(hcm, (ViewGroup) this.a, ((ViewGroup) this.a).getResources().getDisplayMetrics());
            String title = hcm.text().title();
            if (fbo.a(title)) {
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
            if (hcm.events().containsKey(str)) {
                hdl.a(gwm.c).a(str).a(hcm).a(textView).a();
            }
        }
    }

    public pol(pob pob) {
        this.a = pob;
    }

    public final int b() {
        return R.id.hubs_premium_page_flexbox_legal;
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.flexbox_legal, viewGroup, false), this.a);
    }
}
