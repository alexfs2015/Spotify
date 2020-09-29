package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.paste.widgets.layouts.AspectRatioView;

/* renamed from: mkw reason: default package */
public final class mkw extends gty {
    public a a;
    private final mlr b;

    /* renamed from: mkw$a */
    public interface a {
        void onClick(mlq mlq, int i);
    }

    /* renamed from: mkw$b */
    public static class b extends u {
        final frn a;

        public b(frn frn) {
            super(frn.getView());
            this.a = frn;
        }
    }

    public mkw(mlr mlr) {
        this.b = mlr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(mlq mlq, int i, View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.onClick(mlq, i);
        }
    }

    public final int a() {
        return 51;
    }

    public final long a(int i) {
        return (long) ((mlq) this.b.a().get(i)).hashCode();
    }

    public final u a(ViewGroup viewGroup, int i) {
        fqv.d();
        frn a2 = frp.a(viewGroup.getContext(), viewGroup);
        int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.connect_education_card_padding);
        int dimensionPixelSize2 = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.connect_education_card_text_view_horizontal_padding);
        a2.getView().setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        a2.b().setPadding(dimensionPixelSize2, a2.b().getPaddingTop(), dimensionPixelSize2, a2.b().getPaddingBottom());
        if (a2.getView() instanceof AspectRatioView) {
            ((AspectRatioView) a2.getView()).a = 1.0f;
        }
        vgl.b(a2.getView().getContext(), a2.b(), R.attr.pasteTextAppearanceBodyMedium);
        return new b(a2);
    }

    public final void a(u uVar, int i) {
        if (uVar instanceof b) {
            mlq mlq = (mlq) this.b.a().get(i);
            b bVar = (b) uVar;
            bVar.a.a((CharSequence) mlq.b);
            bVar.a.a(mlq.b());
            ViewGroup viewGroup = (ViewGroup) bVar.o;
            viewGroup.setClickable(true);
            viewGroup.setFocusable(true);
            viewGroup.setOnClickListener(new $$Lambda$mkw$lWtHgh5H9e7obZ0E3rd5xEkv8kY(this, mlq, i));
            return;
        }
        throw new RuntimeException(String.format("Wrong ViewHolder received. Expected: %s Received: %s", new Object[]{b.class.getSimpleName(), uVar.getClass().getSimpleName()}));
    }

    public final int b() {
        return this.b.a().size();
    }

    public final int[] c() {
        return new int[]{51};
    }

    public final int d() {
        return 1;
    }
}
