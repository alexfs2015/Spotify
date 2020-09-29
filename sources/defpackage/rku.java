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

/* renamed from: rku reason: default package */
public class rku extends ezk implements rkv {
    public a T;
    public rky U;
    private vhx V;
    private rkx W;
    private b X;
    private rkw Y;
    private b Z;

    /* renamed from: rku$a */
    public interface a {

        /* renamed from: rku$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(a aVar, b bVar, int i) {
            }
        }

        void a();

        void a(SortOption sortOption, int i);

        void a(b bVar, int i);
    }

    public static rku a(rkm rkm, SortOption sortOption) {
        rku rku = new rku();
        Bundle bundle = new Bundle();
        bundle.putParcelable("BottomSheetDialogFragment.filterAndSortConfiguration", rkm);
        bundle.putParcelable("BottomSheetDialogFragment.activeSortOption", sortOption);
        rku.g(bundle);
        return rku;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(SortOption sortOption, int i) {
        rky rky = this.U;
        if (sortOption.mIsReversible && sortOption.equals(rky.b)) {
            sortOption.a(!sortOption.b(), true);
        }
        rky.a.a(sortOption, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(b bVar, int i) {
        this.U.a.a(bVar, i);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.fragment_sort_and_filter_bottom_sheet, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) frameLayout.findViewById(R.id.recycler_view);
        this.V = new vhx(true);
        recyclerView.a((i) new LinearLayoutManager(context));
        recyclerView.a((androidx.recyclerview.widget.RecyclerView.a) this.V);
        fsm c = fqv.e().c(context, null);
        c.a((CharSequence) a((int) R.string.filter_title));
        TextView a2 = c.a();
        vgl.a(context, a2, 2132017678);
        a2.setTextColor(context.getResources().getColor(R.color.gray_70));
        this.V.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jog<H>(c.getView(), true), 2);
        this.Z = new $$Lambda$rku$Qg7FBCChbACrMr6PS0H14VDwng(this);
        this.Y = new rkw(this.Z);
        this.V.a((androidx.recyclerview.widget.RecyclerView.a<H>) this.Y, 3);
        fsm c2 = fqv.e().c(context, null);
        c2.a((CharSequence) a((int) R.string.sort_by_title));
        TextView a3 = c2.a();
        vgl.a(context, a3, 2132017678);
        a3.setTextColor(context.getResources().getColor(R.color.gray_70));
        this.V.a((androidx.recyclerview.widget.RecyclerView.a<H>) new jog<H>(c2.getView(), true), 0);
        this.X = new $$Lambda$rku$Gpo5zJMbMTa9zNTlvvSYm2sgBYU(this);
        this.W = new rkx(this.X);
        this.V.a((androidx.recyclerview.widget.RecyclerView.a<H>) this.W, 1);
        this.V.a(false, 0, 1, 2);
        Bundle bundle2 = this.i;
        if (bundle2 != null) {
            rkm rkm = (rkm) bundle2.getParcelable("BottomSheetDialogFragment.filterAndSortConfiguration");
            SortOption sortOption = (SortOption) bundle2.getParcelable("BottomSheetDialogFragment.activeSortOption");
            if (rkm != null) {
                rky rky = this.U;
                ImmutableList a4 = rkm.a();
                if (!a4.isEmpty()) {
                    rky.a.a((List<SortOption>) a4);
                }
                if (sortOption != null) {
                    rky.a.a(sortOption);
                }
                rky.b = sortOption;
                ImmutableList e = rkm.e();
                if (!e.isEmpty()) {
                    rky.a.b(e);
                }
            }
        }
        return frameLayout;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void a(SortOption sortOption) {
        rkx rkx = this.W;
        if (!sortOption.equals(rkx.e)) {
            rkx.e = sortOption;
            rkx.e();
        }
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

    public final void a(List<SortOption> list) {
        rkx rkx = this.W;
        rkx.d = list;
        rkx.e();
        this.V.a(true, 0, 1);
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

    public final void b(List<b> list) {
        rkw rkw = this.Y;
        rkw.d = list;
        rkw.e();
        this.V.a(true, 2, 1);
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
