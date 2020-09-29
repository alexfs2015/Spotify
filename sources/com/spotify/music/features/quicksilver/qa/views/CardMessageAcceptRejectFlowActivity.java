package com.spotify.music.features.quicksilver.qa.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage;
import com.spotify.music.features.quicksilver.qa.QuicksilverAdminCardMessage;
import com.spotify.music.features.quicksilver.triggers.models.UriTrigger;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.SwipeDirection;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.a;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class CardMessageAcceptRejectFlowActivity extends lbm implements a {
    private Queue<Parcelable> g;
    private TextView h;
    private TextView i;
    private String j = "";
    private LinearLayout k;
    private Fragment l;
    private Disposable m = Disposables.b();
    private QuicksilverCardMessage n;

    public static Intent a(Context context, QuicksilverAdminCardMessage[] quicksilverAdminCardMessageArr) {
        Intent intent = new Intent(context, CardMessageAcceptRejectFlowActivity.class);
        intent.putExtra("messages", quicksilverAdminCardMessageArr);
        return intent;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    private void a(QuicksilverAdminCardMessage quicksilverAdminCardMessage) {
        QuicksilverCardMessage content = quicksilverAdminCardMessage.content();
        qar a = qar.a((qag) UriTrigger.create("qa pattern", false, "fake"), content);
        if (!content.isFullscreen()) {
            this.k.setVisibility(8);
        } else {
            this.k.setVisibility(0);
        }
        this.l = a;
        i().a().b(R.id.child_fragment_container, a, null).b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        l();
        Toast.makeText(this, "Card Message Accepted", 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Toast.makeText(this, th.getMessage(), 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        q();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        l();
        Toast.makeText(this, "Message Rejected", 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Toast.makeText(this, th.getMessage(), 0).show();
    }

    private void l() {
        this.i.setTextColor(Color.argb(0, 255, 0, 0));
        this.h.setTextColor(Color.argb(0, 0, 255, 0));
        if (this.n != null) {
            m();
            return;
        }
        Parcelable parcelable = (Parcelable) this.g.poll();
        if (parcelable instanceof QuicksilverAdminCardMessage) {
            QuicksilverAdminCardMessage quicksilverAdminCardMessage = (QuicksilverAdminCardMessage) parcelable;
            this.j = quicksilverAdminCardMessage.id();
            a(quicksilverAdminCardMessage);
            return;
        }
        Toast.makeText(this, "All Card messages tested!", 0).show();
        finish();
    }

    private void m() {
        qar a = qar.a((qag) UriTrigger.create("qa pattern", false, "fake"), this.n);
        this.k.setVisibility(8);
        this.l = a;
        i().a().b(R.id.child_fragment_container, a, null).b();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi, io.reactivex.Scheduler]
      mth insns count: 12
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void n() {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = "Message Rejected"
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r0)
            r1.show()
            java.lang.String r1 = r3.j
            r2 = 0
            io.reactivex.Single r0 = r2.a(r0, r1)
            io.reactivex.Single r0 = r0.a(r2)
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$CardMessageAcceptRejectFlowActivity$HEMkITByPdaApgyF4a3bF6Ei3vY r1 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$CardMessageAcceptRejectFlowActivity$HEMkITByPdaApgyF4a3bF6Ei3vY
            r1.<init>()
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$CardMessageAcceptRejectFlowActivity$m1HHF8Gwp4RufYJhuVuv1R-YnTg r2 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$CardMessageAcceptRejectFlowActivity$m1HHF8Gwp4RufYJhuVuv1R-YnTg
            r2.<init>()
            io.reactivex.disposables.Disposable r0 = r0.a(r1, r2)
            r3.m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.quicksilver.qa.views.CardMessageAcceptRejectFlowActivity.n():void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi, io.reactivex.Scheduler]
      mth insns count: 9
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q() {
        /*
            r3 = this;
            java.lang.String r0 = r3.j
            r1 = 0
            r2 = 1
            io.reactivex.Single r0 = r1.a(r2, r0)
            io.reactivex.Single r0 = r0.a(r1)
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$CardMessageAcceptRejectFlowActivity$QOjY5U5NlVD1a3Z5h2JxcxV35So r1 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$CardMessageAcceptRejectFlowActivity$QOjY5U5NlVD1a3Z5h2JxcxV35So
            r1.<init>()
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$CardMessageAcceptRejectFlowActivity$jsd77nuMoLvpxZxeqCK2b9t1s24 r2 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$CardMessageAcceptRejectFlowActivity$jsd77nuMoLvpxZxeqCK2b9t1s24
            r2.<init>()
            io.reactivex.disposables.Disposable r0 = r0.a(r1, r2)
            r3.m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.quicksilver.qa.views.CardMessageAcceptRejectFlowActivity.q():void");
    }

    public final void a(double d, float f, SwipeDirection swipeDirection) {
        double d2 = (double) f;
        Double.isNaN(d2);
        double d3 = d / d2;
        if (d3 >= 1.0d) {
            d3 = 1.0d;
        }
        if (swipeDirection == SwipeDirection.LEFT) {
            this.i.setTextColor(Color.argb((int) (d3 * 255.0d), 255, 0, 0));
        } else {
            this.h.setTextColor(Color.argb((int) (d3 * 255.0d), 0, 255, 0));
        }
    }

    public final void a(SwipeDirection swipeDirection) {
        if (this.n != null) {
            finish();
        } else if (swipeDirection == SwipeDirection.LEFT) {
            n();
        } else {
            q();
        }
    }

    public final void aC_() {
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.DEBUG, null);
    }

    public final void b() {
        this.i.setTextColor(Color.argb(0, 255, 0, 0));
        this.h.setTextColor(Color.argb(0, 0, 255, 0));
    }

    public final boolean k() {
        return this.n != null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_card_accept_reject_flow);
        this.h = (TextView) findViewById(R.id.accept_card_status);
        this.i = (TextView) findViewById(R.id.reject_card_status);
        this.k = (LinearLayout) findViewById(R.id.accept_reject_layout);
        this.k.setVisibility(8);
        findViewById(R.id.accept_tap_area).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                CardMessageAcceptRejectFlowActivity.this.b(view);
            }
        });
        findViewById(R.id.reject_tap_area).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                CardMessageAcceptRejectFlowActivity.this.a(view);
            }
        });
        String str = "messages";
        if (getIntent().getParcelableArrayExtra(str) != null) {
            this.g = new ArrayDeque();
            Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra(str);
            if (parcelableArrayExtra != null) {
                Collections.addAll(this.g, parcelableArrayExtra);
            }
        }
        this.n = (QuicksilverCardMessage) getIntent().getParcelableExtra("preview");
        if (this.n != null) {
            this.h.setVisibility(8);
            this.i.setVisibility(8);
        }
        l();
    }

    public void onStop() {
        super.onStop();
        if (!this.m.b()) {
            this.m.bd_();
            Toast.makeText(this, "Accept Card Message request failed", 0).show();
        }
    }
}
