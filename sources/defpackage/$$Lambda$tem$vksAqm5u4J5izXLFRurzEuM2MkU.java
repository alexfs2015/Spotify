package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.nowplaying.drivingmode.view.VerticalSplitLayout.a;
import com.spotify.music.nowplaying.drivingmode.view.coachmark.DrivingCoachMarkView;
import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotContainerView;

/* renamed from: -$$Lambda$tem$vksAqm5u4J5izXLFRurzEuM2MkU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$tem$vksAqm5u4J5izXLFRurzEuM2MkU implements a {
    private final /* synthetic */ tem f$0;
    private final /* synthetic */ View f$1;
    private final /* synthetic */ DrivingCoachMarkView f$2;
    private final /* synthetic */ PivotContainerView f$3;
    private final /* synthetic */ FrameLayout f$4;
    private final /* synthetic */ FrameLayout f$5;

    public /* synthetic */ $$Lambda$tem$vksAqm5u4J5izXLFRurzEuM2MkU(tem tem, View view, DrivingCoachMarkView drivingCoachMarkView, PivotContainerView pivotContainerView, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f$0 = tem;
        this.f$1 = view;
        this.f$2 = drivingCoachMarkView;
        this.f$3 = pivotContainerView;
        this.f$4 = frameLayout;
        this.f$5 = frameLayout2;
    }

    public final void onSlide(float f, boolean z) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, f, z);
    }
}
