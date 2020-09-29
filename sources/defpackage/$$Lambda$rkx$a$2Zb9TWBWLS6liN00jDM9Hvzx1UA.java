package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.mobile.android.util.SortOption;

/* renamed from: -$$Lambda$rkx$a$2Zb9TWBWLS6liN00jDM9Hvzx1UA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rkx$a$2Zb9TWBWLS6liN00jDM9Hvzx1UA implements OnClickListener {
    private final /* synthetic */ a f$0;
    private final /* synthetic */ SortOption f$1;
    private final /* synthetic */ int f$2;

    public /* synthetic */ $$Lambda$rkx$a$2Zb9TWBWLS6liN00jDM9Hvzx1UA(a aVar, SortOption sortOption, int i) {
        this.f$0 = aVar;
        this.f$1 = sortOption;
        this.f$2 = i;
    }

    public final void onClick(View view) {
        this.f$0.a(this.f$1, this.f$2, view);
    }
}
