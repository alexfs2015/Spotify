package defpackage;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: mtw reason: default package */
public final class mtw extends defpackage.rev.a<a> {
    private final defpackage.trv.a a;

    /* renamed from: mtw$a */
    class a extends defpackage.gui.c.a<View> {
        /* access modifiers changed from: 0000 */
        public final TextView b;
        private final TextView c;

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
        }

        protected a(View view) {
            super(view);
            this.c = (TextView) view.findViewById(R.id.title);
            this.b = (TextView) view.findViewById(R.id.subtitle);
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            String title = gzt.text().title();
            String subtitle = gzt.text().subtitle();
            this.c.setVisibility(fax.a(title) ? 8 : 0);
            this.c.setText(title);
            Integer intValue = gzt.custom().intValue("bollywood-synopsis-number-of-lines");
            if (intValue != null) {
                this.b.setMaxLines(intValue.intValue());
            } else {
                this.b.setMaxLines(3);
            }
            this.b.setText(new SpannableString(subtitle.trim()), BufferType.SPANNABLE);
            this.b.setMovementMethod(LinkMovementMethod.getInstance());
            this.b.addOnLayoutChangeListener(new OnLayoutChangeListener() {
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    a.this.b.removeOnLayoutChangeListener(this);
                    a aVar = a.this;
                    a.this.b.setText(aVar.b, BufferType.SPANNABLE);
                }
            });
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(CharSequence charSequence) {
            this.b.setText(charSequence, BufferType.SPANNABLE);
            this.b.setMaxLines(Integer.MAX_VALUE);
        }
    }

    public final int b() {
        return R.id.expandable_text_component;
    }

    public mtw(defpackage.trv.a aVar) {
        this.a = aVar;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.expandable_text, viewGroup, false));
    }
}
