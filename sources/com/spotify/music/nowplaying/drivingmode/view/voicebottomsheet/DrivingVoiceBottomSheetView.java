package com.spotify.music.nowplaying.drivingmode.view.voicebottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.a;
import com.spotify.music.R;
import com.spotify.music.nowplaying.drivingmode.view.voiceview.DrivingVoiceView;

public class DrivingVoiceBottomSheetView extends CoordinatorLayout implements tqi {
    public a d;
    private BottomSheetBehavior<DrivingVoiceView> e;

    public DrivingVoiceBottomSheetView(Context context) {
        super(context);
        a(context);
    }

    public DrivingVoiceBottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public DrivingVoiceBottomSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.driving_voice_bottom_sheet_view, this, true);
        gaw.a(this, new gcp() {
            public final void accept(Object obj) {
                DrivingVoiceBottomSheetView.this.b((DrivingVoiceBottomSheetView) obj);
            }
        }, true);
        this.e = BottomSheetBehavior.a((DrivingVoiceView) findViewById(R.id.driving_voice_view));
        this.e.j = new a() {
            public final void a(float f) {
                DrivingVoiceBottomSheetView.this.d.a(f);
            }

            public final void a(int i) {
                if (i == 5) {
                    DrivingVoiceBottomSheetView.this.d.a();
                }
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DrivingVoiceBottomSheetView drivingVoiceBottomSheetView) {
        this.d.b();
    }

    public final void a() {
        this.e.b(3);
    }

    public final void b() {
        this.e.b(5);
    }
}
