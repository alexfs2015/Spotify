package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.google.common.base.Optional;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.events.ReasonEnd;
import java.text.DecimalFormat;

/* renamed from: gcb reason: default package */
public final class gcb extends kcf {
    private static final String[] a = {"kbps", "mbps"};
    private static final Object b = new Object();
    private final gcd o;
    private TextView p;
    private final jya q;
    private boolean r;
    private kam s;

    public gcb(jya jya, jrp jrp, gcd gcd) {
        super(jya, jrp);
        this.q = jya;
        this.o = gcd;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        TextView textView = this.p;
        if (textView != null && ip.E(textView)) {
            ((ClipboardManager) this.p.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Video debug", this.p.getText()));
            Toast.makeText(this.p.getContext(), "Information copied to clipboard", 0).show();
        }
    }

    public final void a(boolean z, long j) {
        super.a(z, j);
        b();
    }

    public final void a(jxr jxr, ReasonEnd reasonEnd, long j, long j2) {
        super.a(jxr, reasonEnd, j, j2);
        TextView textView = this.p;
        if (textView != null && ip.E(textView)) {
            this.p.setText(c());
            this.p.setVisibility(8);
        }
    }

    public final void a(Optional<VideoSurfaceView> optional, long j, long j2) {
        TextView textView;
        super.a(optional, j, j2);
        if (optional.b()) {
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) optional.c();
            int i = 0;
            while (true) {
                if (i >= videoSurfaceView.getChildCount()) {
                    textView = null;
                    break;
                } else if (videoSurfaceView.getChildAt(i).getTag() == b) {
                    textView = (TextView) videoSurfaceView.getChildAt(i);
                    break;
                } else {
                    i++;
                }
            }
            if (textView != null) {
                this.p = textView;
            } else {
                Context context = ((VideoSurfaceView) optional.c()).getContext();
                int round = Math.round(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
                TextView a2 = this.o.a(context);
                a2.setTag(b);
                a2.setSingleLine(false);
                a2.setBackgroundColor(1996488704);
                a2.setTextSize(1, 9.0f);
                a2.setPadding(round, round, round, round);
                a2.setOnClickListener(new $$Lambda$gcb$GzkAGKxW6EXcVghg3729In0tjQE(this));
                this.p = a2;
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.gravity = 80;
                int round2 = Math.round(TypedValue.applyDimension(1, 6.0f, ((VideoSurfaceView) optional.c()).getContext().getResources().getDisplayMetrics()));
                layoutParams.bottomMargin = round2;
                layoutParams.leftMargin = round2;
                ((VideoSurfaceView) optional.c()).addView(this.p, layoutParams);
            }
            b();
        }
    }

    public final void a(long j) {
        super.a(j);
        this.r = true;
        b();
    }

    public final void a(kam kam, long j, long j2) {
        super.a(kam, j, j2);
        this.s = kam;
        b();
    }

    public final void a(long j, long j2) {
        super.a(j, j2);
        b();
    }

    private void b() {
        TextView textView = this.p;
        if (textView != null && ip.E(textView)) {
            this.p.setVisibility(0);
            this.p.setText(c());
        }
    }

    private String c() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("Session Id: ");
        sb.append(this.q.a());
        sb.append(10);
        sb.append("Media url: ");
        sb.append(this.q.d());
        sb.append(10);
        sb.append("DRM: ");
        sb.append(this.r);
        sb.append(10);
        Optional<Long> optional = this.i;
        Long valueOf = Long.valueOf(-1);
        long longValue = ((Long) optional.a(valueOf)).longValue();
        String str = "ms\n";
        if (longValue > -1) {
            sb.append("Start time: ");
            sb.append(longValue);
            sb.append(str);
        }
        long longValue2 = ((Long) this.f.a(valueOf)).longValue();
        if (longValue2 > -1) {
            sb.append("Manifest load time: ");
            sb.append(longValue2);
            sb.append(str);
        }
        sb.append("VideoFormat: ");
        sb.append(a(this.s));
        sb.append('@');
        sb.append(b(this.s));
        sb.append(10);
        return sb.toString();
    }

    private static String a(kam kam) {
        if (kam == null) {
            return "?";
        }
        double a2 = (double) kam.a();
        if (Math.abs(a2) < 1000.0d) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("bps");
            return sb.toString();
        }
        int i = -1;
        do {
            a2 /= 1000.0d;
            i++;
            if (Math.abs(a2) < 1000.0d) {
                break;
            }
        } while (i <= 0);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(decimalFormat.format(a2));
        sb2.append(a[i]);
        return sb2.toString();
    }

    private static String b(kam kam) {
        if (kam == null) {
            return "?x?";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(kam.b());
        sb.append("x");
        sb.append(kam.c());
        return sb.toString();
    }
}
