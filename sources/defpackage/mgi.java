package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.paste.widgets.layouts.AspectRatioView;

/* renamed from: mgi reason: default package */
public final class mgi extends grw {
    public a a;
    private final mhd b;

    /* renamed from: mgi$a */
    public interface a {
        void onClick(mhc mhc, int i);
    }

    /* renamed from: mgi$b */
    public static class b extends u {
        final fqt a;

        public b(fqt fqt) {
            super(fqt.getView());
            this.a = fqt;
        }
    }

    public final int a() {
        return 51;
    }

    public final int[] c() {
        return new int[]{51};
    }

    public final int d() {
        return 1;
    }

    public mgi(mhd mhd) {
        this.b = mhd;
    }

    public final u a(ViewGroup viewGroup, int i) {
        fqb.d();
        fqt a2 = fqv.a(viewGroup.getContext(), viewGroup);
        int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.connect_education_card_padding);
        int dimensionPixelSize2 = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.connect_education_card_text_view_horizontal_padding);
        a2.getView().setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        a2.b().setPadding(dimensionPixelSize2, a2.b().getPaddingTop(), dimensionPixelSize2, a2.b().getPaddingBottom());
        if (a2.getView() instanceof AspectRatioView) {
            ((AspectRatioView) a2.getView()).a = 1.0f;
        }
        uuu.b(a2.getView().getContext(), a2.b(), R.attr.pasteTextAppearanceBodyMedium);
        return new b(a2);
    }

    public final void a(u uVar, int i) {
        if (uVar instanceof b) {
            mhc mhc = (mhc) this.b.a().get(i);
            b bVar = (b) uVar;
            bVar.a.a((CharSequence) mhc.b);
            bVar.a.a(mhc.b());
            ViewGroup viewGroup = (ViewGroup) bVar.o;
            viewGroup.setClickable(true);
            viewGroup.setFocusable(true);
            viewGroup.setOnClickListener(new $$Lambda$mgi$diQrCh4NWF_d3sb68CEeUo4Qipk(this, mhc, i));
            return;
        }
        throw new RuntimeException(String.format("Wrong ViewHolder received. Expected: %s Received: %s", new Object[]{b.class.getSimpleName(), uVar.getClass().getSimpleName()}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(mhc mhc, int i, View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.onClick(mhc, i);
        }
    }

    public final long a(int i) {
        return (long) ((mhc) this.b.a().get(i)).hashCode();
    }

    public final int b() {
        return this.b.a().size();
    }
}
