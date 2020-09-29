package com.spotify.music.features.quicksilver.qa.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.spotify.music.R;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import com.spotify.music.features.quicksilver.qa.QuicksilverAdminNoteMessage;
import com.spotify.music.features.quicksilver.triggers.models.UriTrigger;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class NoteMessageAcceptRejectFlowActivity extends lbm {
    private String g = "";
    private Queue<Parcelable> h;
    private NoteMessage i;
    private final qag j;
    private Disposable k;
    private FrameLayout l;
    private LinearLayout m;
    private pya n;
    private boolean o;

    public NoteMessageAcceptRejectFlowActivity() {
        String str = "test";
        this.j = UriTrigger.create(str, false, str);
        this.k = Disposables.b();
    }

    public static Intent a(Context context, QuicksilverAdminNoteMessage[] quicksilverAdminNoteMessageArr) {
        Intent intent = new Intent(context, NoteMessageAcceptRejectFlowActivity.class);
        intent.putExtra("messages", quicksilverAdminNoteMessageArr);
        return intent;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi]
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
    public /* synthetic */ void a(android.view.View r3) {
        /*
            r2 = this;
            java.lang.String r3 = r2.g
            r0 = 0
            r1 = 0
            io.reactivex.Single r3 = r0.a(r1, r3)
            io.reactivex.Single r3 = r3.a(r0)
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$NoteMessageAcceptRejectFlowActivity$RnHB3pXDpSHhIJA8fc901SaGQwI r0 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$NoteMessageAcceptRejectFlowActivity$RnHB3pXDpSHhIJA8fc901SaGQwI
            r0.<init>()
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$NoteMessageAcceptRejectFlowActivity$UuxN0demVkuvRE3nxBEwsRSfLCw r1 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$NoteMessageAcceptRejectFlowActivity$UuxN0demVkuvRE3nxBEwsRSfLCw
            r1.<init>()
            io.reactivex.disposables.Disposable r3 = r3.a(r0, r1)
            r2.k = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.quicksilver.qa.views.NoteMessageAcceptRejectFlowActivity.a(android.view.View):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        k();
        Toast.makeText(this, "Note Message Rejected", 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Toast.makeText(this, th.getMessage(), 0).show();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi]
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
    public /* synthetic */ void b(android.view.View r3) {
        /*
            r2 = this;
            java.lang.String r3 = r2.g
            r0 = 0
            r1 = 1
            io.reactivex.Single r3 = r0.a(r1, r3)
            io.reactivex.Single r3 = r3.a(r0)
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$NoteMessageAcceptRejectFlowActivity$gGk9GYWdXV96F5Q2dVGbED9dliE r0 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$NoteMessageAcceptRejectFlowActivity$gGk9GYWdXV96F5Q2dVGbED9dliE
            r0.<init>()
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$NoteMessageAcceptRejectFlowActivity$crz__MHrXiiIpyQ3xtgVrcvge4A r1 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$NoteMessageAcceptRejectFlowActivity$crz__MHrXiiIpyQ3xtgVrcvge4A
            r1.<init>()
            io.reactivex.disposables.Disposable r3 = r3.a(r0, r1)
            r2.k = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.quicksilver.qa.views.NoteMessageAcceptRejectFlowActivity.b(android.view.View):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        k();
        Toast.makeText(this, "Note Message Accepted", 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Toast.makeText(this, th.getMessage(), 0).show();
    }

    private void k() {
        if (this.o) {
            l();
            return;
        }
        Parcelable parcelable = (Parcelable) this.h.poll();
        if (parcelable instanceof QuicksilverAdminNoteMessage) {
            QuicksilverAdminNoteMessage quicksilverAdminNoteMessage = (QuicksilverAdminNoteMessage) parcelable;
            this.g = quicksilverAdminNoteMessage.id();
            this.i = quicksilverAdminNoteMessage.content();
            l();
            return;
        }
        Toast.makeText(this, "All Note messages tested!", 0).show();
        finish();
    }

    private void l() {
        this.n = pya.a(this.j, this.i);
        this.n.a(new a() {
            public final void dismiss() {
                NoteMessageAcceptRejectFlowActivity.this.finish();
            }
        });
        i().a().b(this.l.getId(), this.n, "QuicksilverTag").b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_note_accept_reject_flow);
        findViewById(R.id.accept).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                NoteMessageAcceptRejectFlowActivity.this.b(view);
            }
        });
        findViewById(R.id.reject).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                NoteMessageAcceptRejectFlowActivity.this.a(view);
            }
        });
        this.l = (FrameLayout) findViewById(R.id.note_container);
        this.m = (LinearLayout) findViewById(R.id.accept_reject_buttons_layout);
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
            this.i = (NoteMessage) getIntent().getParcelableExtra(str2);
            this.m.setVisibility(8);
        }
        k();
    }

    public void onStop() {
        super.onStop();
        if (!this.k.b()) {
            this.k.bd_();
            Toast.makeText(this, "Accepting messages request failed", 0).show();
        }
    }
}
