package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import java.util.List;

/* renamed from: rbw reason: default package */
public class rbw extends eyt implements rbx {
    public a T;
    public rca U;
    private uwh V;
    private rbz W;
    private b X;
    private rby Y;
    private b Z;

    /* renamed from: rbw$a */
    public interface a {

        /* renamed from: rbw$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(a aVar, b bVar, int i) {
            }
        }

        void a();

        void a(SortOption sortOption, int i);

        void a(b bVar, int i);
    }

    public static rbw a(rbq rbq, SortOption sortOption) {
        rbw rbw = new rbw();
        Bundle bundle = new Bundle();
        bundle.putParcelable("BottomSheetDialogFragment.filterAndSortConfiguration", rbq);
        bundle.putParcelable("BottomSheetDialogFragment.activeSortOption", sortOption);
        rbw.g(bundle);
        return rbw;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.fragment_sort_and_filter_bottom_sheet, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) frameLayout.findViewById(R.id.recycler_view);
        this.V = new uwh(true);
        recyclerView.a((i) new LinearLayoutManager(context));
        recyclerView.a((androidx.recyclerview.widget.RecyclerView.a) this.V);
        frs c = fqb.e().c(context, null);
        c.a((CharSequence) a((int) R.string.filter_title));
        TextView a2 = c.a();
        uuu.a(context, a2, 2132017675);
        a2.setTextColor(context.getResources().getColor(R.color.gray_70));
        this.V.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jlu<H>(c.getView(), true), 2);
        this.Z = new $$Lambda$rbw$kuvuQuhHzwMtxZjT0XiE69S8znU(this);
        this.Y = new rby(this.Z);
        this.V.a((androidx.recyclerview.widget.RecyclerView.a<H>) this.Y, 3);
        frs c2 = fqb.e().c(context, null);
        c2.a((CharSequence) a((int) R.string.sort_by_title));
        TextView a3 = c2.a();
        uuu.a(context, a3, 2132017675);
        a3.setTextColor(context.getResources().getColor(R.color.gray_70));
        this.V.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jlu<H>(c2.getView(), true), 0);
        this.X = new $$Lambda$rbw$ZFLfcBgiaZcm9g_vZ5OPiqplmI(this);
        this.W = new rbz(this.X);
        this.V.a((androidx.recyclerview.widget.RecyclerView.a<H>) this.W, 1);
        this.V.a(false, 0, 1, 2);
        Bundle bundle2 = this.i;
        if (bundle2 != null) {
            rbq rbq = (rbq) bundle2.getParcelable("BottomSheetDialogFragment.filterAndSortConfiguration");
            SortOption sortOption = (SortOption) bundle2.getParcelable("BottomSheetDialogFragment.activeSortOption");
            if (rbq != null) {
                rca rca = this.U;
                ImmutableList a4 = rbq.a();
                if (!a4.isEmpty()) {
                    rca.a.a((List<SortOption>) a4);
                }
                if (sortOption != null) {
                    rca.a.a(sortOption);
                }
                rca.b = sortOption;
                ImmutableList e = rbq.e();
                if (!e.isEmpty()) {
                    rca.a.b(e);
                }
            }
        }
        return frameLayout;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(b bVar, int i) {
        this.U.a.a(bVar, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(SortOption sortOption, int i) {
        rca rca = this.U;
        if (sortOption.mIsReversible && sortOption.equals(rca.b)) {
            sortOption.a(!sortOption.b(), true);
        }
        rca.a.a(sortOption, i);
    }

    public final void a(List<SortOption> list) {
        rbz rbz = this.W;
        rbz.d = list;
        rbz.e();
        this.V.a(true, 0, 1);
    }

    public final void b(List<b> list) {
        rby rby = this.Y;
        rby.d = list;
        rby.e();
        this.V.a(true, 2, 1);
    }

    public final void a(SortOption sortOption) {
        rbz rbz = this.W;
        if (!sortOption.equals(rbz.e)) {
            rbz.e = sortOption;
            rbz.e();
        }
    }

    public final void a(b bVar, int i) {
        a aVar = this.T;
        if (aVar == null) {
            Logger.b("No interaction listener available for filter and sorting no information sent to calling component", new Object[0]);
        } else {
            aVar.a(bVar, i);
        }
        c();
    }

    public final void a(SortOption sortOption, int i) {
        a aVar = this.T;
        if (aVar == null) {
            Logger.b("No interaction listener available for filter and sorting no information sent to calling component", new Object[0]);
        } else {
            aVar.a(sortOption, i);
        }
        c();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        a aVar = this.T;
        if (aVar != null) {
            aVar.a();
        }
        this.T = null;
        super.onDismiss(dialogInterface);
    }
}
