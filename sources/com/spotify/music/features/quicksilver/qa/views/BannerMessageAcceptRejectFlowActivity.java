package com.spotify.music.features.quicksilver.qa.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar.SnackAnimation;
import com.spotify.mobile.android.ui.view.snackbar.SnackItem;
import com.spotify.music.R;
import com.spotify.music.features.quicksilver.messages.models.BannerMessage;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction;
import com.spotify.music.features.quicksilver.qa.QuicksilverAdminBannerMessage;
import com.spotify.music.features.quicksilver.triggers.models.UriTrigger;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Map;
import java.util.Queue;

public class BannerMessageAcceptRejectFlowActivity extends kyd {
    private String g = "";
    private Queue<Parcelable> h;
    private BannerMessage i;
    private final prk j;
    private Disposable k;
    private Disposable l;
    private PublishSubject<QuicksilverClickAction> m;
    private kje<poc> n;
    private boolean o;

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(Throwable th) {
    }

    public BannerMessageAcceptRejectFlowActivity() {
        String str = "test";
        this.j = UriTrigger.create(str, false, str);
        this.k = Disposables.b();
        this.l = Disposables.b();
        this.m = PublishSubject.a();
    }

    public static Intent a(Context context, QuicksilverAdminBannerMessage[] quicksilverAdminBannerMessageArr) {
        Intent intent = new Intent(context, BannerMessageAcceptRejectFlowActivity.class);
        intent.putExtra("messages", quicksilverAdminBannerMessageArr);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_banner_accept_reject_flow);
        SnackBar snackBar = (SnackBar) findViewById(R.id.snack_bar_top);
        pog pog = new pog(snackBar);
        snackBar.a((SnackItem) pog);
        snackBar.a(SnackAnimation.TOP_TO_BOTTOM);
        this.n = pog.connect(new kkn() {
            public final void accept(Object obj) {
                BannerMessageAcceptRejectFlowActivity.this.a((poa) obj);
            }
        });
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.accept_reject_buttons_layout);
        findViewById(R.id.accept).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                BannerMessageAcceptRejectFlowActivity.this.b(view);
            }
        });
        findViewById(R.id.reject).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                BannerMessageAcceptRejectFlowActivity.this.a(view);
            }
        });
        this.g = "";
        String str = "messages";
        if (getIntent().getParcelableArrayExtra(str) != null) {
            this.h = new ArrayDeque();
            Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra(str);
            if (parcelableArrayExtra != null) {
                Collections.addAll(this.h, parcelableArrayExtra);
            }
        }
        String str2 = "preview";
        this.o = getIntent().getParcelableExtra(str2) != null;
        if (this.o) {
            this.i = (BannerMessage) getIntent().getParcelableExtra(str2);
            linearLayout.setVisibility(8);
        }
        k();
        hec hec = null;
        this.l = this.m.a((ObservableSource<? extends U>) hec.a().j(), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$3qRr7UC3uH6IsEbbS1TfY_0Kc.INSTANCE).a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                BannerMessageAcceptRejectFlowActivity.this.a((ho) obj);
            }
        }, (Consumer<? super Throwable>) $$Lambda$BannerMessageAcceptRejectFlowActivity$Wf9Jnok5WLFBEsZ5H0IjougXW3w.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        prr prr = null;
        prr.a((QuicksilverClickAction) fay.a(hoVar.a), (fpt) hoVar.b);
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.l.b()) {
            this.l.bf_();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(poa poa) {
        if (poa instanceof a) {
            this.m.onNext(((Map) fay.a(this.i.getClickActions())).get(((a) poa).a));
        }
    }

    public void onStop() {
        super.onStop();
        if (!this.k.b()) {
            this.k.bf_();
            Toast.makeText(this, "Accepting messages request failed", 0).show();
        }
    }

    private void k() {
        jrp jrp = null;
        if (this.o) {
            this.n.accept(poc.d().a(pod.a(this.i, this.j, jrp.c()).a()).a());
            return;
        }
        Parcelable parcelable = (Parcelable) this.h.poll();
        if (parcelable instanceof QuicksilverAdminBannerMessage) {
            QuicksilverAdminBannerMessage quicksilverAdminBannerMessage = (QuicksilverAdminBannerMessage) parcelable;
            this.g = quicksilverAdminBannerMessage.id();
            this.i = quicksilverAdminBannerMessage.content();
            this.n.accept(poc.d().a(pod.a(quicksilverAdminBannerMessage.content(), this.j, jrp.c()).a()).a());
            return;
        }
        Toast.makeText(this, "All Banner messages tested!", 0).show();
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        k();
        Toast.makeText(this, "Banner Message Accepted", 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Toast.makeText(this, th.getMessage(), 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        k();
        Toast.makeText(this, "Banner Message Rejected", 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Toast.makeText(this, th.getMessage(), 0).show();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi, io.reactivex.Scheduler]
      mth insns count: 13
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(android.view.View r3) {
        /*
            r2 = this;
            kje<poc> r3 = r2.n
            poc$a r0 = defpackage.poc.d()
            poc r0 = r0.a()
            r3.accept(r0)
            java.lang.String r3 = r2.g
            r0 = 0
            r1 = 0
            io.reactivex.Single r3 = r0.a(r1, r3)
            io.reactivex.Single r3 = r3.a(r0)
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$BannerMessageAcceptRejectFlowActivity$h1Lu1o9XHHXFKfIoqpr-huVEI2w r0 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$BannerMessageAcceptRejectFlowActivity$h1Lu1o9XHHXFKfIoqpr-huVEI2w
            r0.<init>()
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$BannerMessageAcceptRejectFlowActivity$-wDyi8mVUCfk4cZQehq-95RfmH4 r1 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$BannerMessageAcceptRejectFlowActivity$-wDyi8mVUCfk4cZQehq-95RfmH4
            r1.<init>()
            io.reactivex.disposables.Disposable r3 = r3.a(r0, r1)
            r2.k = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.quicksilver.qa.views.BannerMessageAcceptRejectFlowActivity.a(android.view.View):void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi, io.reactivex.Scheduler]
      mth insns count: 13
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void b(android.view.View r3) {
        /*
            r2 = this;
            kje<poc> r3 = r2.n
            poc$a r0 = defpackage.poc.d()
            poc r0 = r0.a()
            r3.accept(r0)
            java.lang.String r3 = r2.g
            r0 = 0
            r1 = 1
            io.reactivex.Single r3 = r0.a(r1, r3)
            io.reactivex.Single r3 = r3.a(r0)
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$BannerMessageAcceptRejectFlowActivity$kxHFkBxRFNgAc03iMCyBviUf2_0 r0 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$BannerMessageAcceptRejectFlowActivity$kxHFkBxRFNgAc03iMCyBviUf2_0
            r0.<init>()
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$BannerMessageAcceptRejectFlowActivity$pE3-LyJ6b-NXTkqOBJk6eb68iF0 r1 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$BannerMessageAcceptRejectFlowActivity$pE3-LyJ6b-NXTkqOBJk6eb68iF0
            r1.<init>()
            io.reactivex.disposables.Disposable r3 = r3.a(r0, r1)
            r2.k = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.quicksilver.qa.views.BannerMessageAcceptRejectFlowActivity.b(android.view.View):void");
    }
}
