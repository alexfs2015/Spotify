package com.spotify.music.features.quicksilver.qa.views;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.quicksilver.qa.QuicksilverAdminBannerMessage;
import com.spotify.music.features.quicksilver.qa.QuicksilverAdminCardMessage;
import com.spotify.music.features.quicksilver.qa.QuicksilverAdminNoteMessage;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.ArrayList;
import java.util.List;

public class QuicksilverQAPanelActivity extends kyd {
    private EditText g;
    private Spinner h;
    private Spinner i;
    private Spinner j;
    private Button k;
    private Disposable l = Disposables.b();
    private Disposable m = Disposables.b();

    /* JADX WARNING: type inference failed for: r4v19, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v19, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi, io.reactivex.Scheduler]
      mth insns count: 52
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
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            r4 = 2131624001(0x7f0e0041, float:1.887517E38)
            r3.setContentView(r4)
            r4 = 2131427673(0x7f0b0159, float:1.8476969E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.EditText r4 = (android.widget.EditText) r4
            r3.g = r4
            r4 = 2131428158(0x7f0b033e, float:1.8477953E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.Spinner r4 = (android.widget.Spinner) r4
            r3.h = r4
            r4 = 2131428157(0x7f0b033d, float:1.847795E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.Spinner r4 = (android.widget.Spinner) r4
            r3.i = r4
            r4 = 2131430650(0x7f0b0cfa, float:1.8483007E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            r3.k = r4
            r4 = 2131428156(0x7f0b033c, float:1.8477949E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.Spinner r4 = (android.widget.Spinner) r4
            r3.j = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi$MessageState r0 = com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi.MessageState.PENDING_QA
            r4.add(r0)
            com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi$MessageState r0 = com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi.MessageState.APPROVED
            r4.add(r0)
            com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi$MessageState r0 = com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi.MessageState.REJECTED
            r4.add(r0)
            com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi$MessageState r0 = com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi.MessageState.TRANSLATING
            r4.add(r0)
            android.widget.ArrayAdapter r0 = new android.widget.ArrayAdapter
            r1 = 17367043(0x1090003, float:2.5162934E-38)
            r0.<init>(r3, r1, r4)
            android.widget.Spinner r4 = r3.h
            r4.setAdapter(r0)
            r4 = 0
            pqm r0 = r4.a
            java.lang.String r2 = r4.a()
            io.reactivex.Single r0 = r0.a(r2)
            io.reactivex.Single r4 = r0.a(r4)
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$5YHvBY4iSIFgp2GYWOhV7Av39dE r0 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$5YHvBY4iSIFgp2GYWOhV7Av39dE
            r0.<init>()
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$ZjiammYJ_vzzxjaupTDpfOxxPvE r2 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$ZjiammYJ_vzzxjaupTDpfOxxPvE
            r2.<init>()
            io.reactivex.disposables.Disposable r4 = r4.a(r0, r2)
            r3.m = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r0 = "cards"
            r4.add(r0)
            java.lang.String r0 = "banners"
            r4.add(r0)
            java.lang.String r0 = "notes"
            r4.add(r0)
            android.widget.ArrayAdapter r0 = new android.widget.ArrayAdapter
            r0.<init>(r3, r1, r4)
            android.widget.Spinner r4 = r3.j
            r4.setAdapter(r0)
            android.widget.Button r4 = r3.k
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$k8dPeEheHgu_cX5VydKHm2leMTw r0 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$k8dPeEheHgu_cX5VydKHm2leMTw
            r0.<init>()
            r4.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.quicksilver.qa.views.QuicksilverQAPanelActivity.onCreate(android.os.Bundle):void");
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.DEBUG, null);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0, types: [io.reactivex.Scheduler, com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi, io.reactivex.Scheduler, ?[OBJECT, ARRAY]]
      mth insns count: 86
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
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(android.view.View r11) {
        /*
            r10 = this;
            android.widget.Spinner r11 = r10.j
            java.lang.Object r11 = r11.getSelectedItem()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = "cards"
            boolean r0 = r11.equals(r0)
            java.lang.String r1 = "ALL"
            r2 = 0
            if (r0 == 0) goto L_0x005e
            android.widget.EditText r11 = r10.g
            android.text.Editable r11 = r11.getText()
            java.lang.String r5 = r11.toString()
            android.widget.Spinner r11 = r10.h
            java.lang.Object r11 = r11.getSelectedItem()
            com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi$MessageState r11 = (com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi.MessageState) r11
            android.widget.Spinner r0 = r10.i
            java.lang.Object r0 = r0.getSelectedItem()
            java.lang.String r0 = r0.toString()
            pqm r3 = r2.a
            java.lang.String r4 = r2.a()
            java.lang.String r6 = r11.toString()
            r7 = 1
            boolean r11 = android.text.TextUtils.equals(r0, r1)
            if (r11 == 0) goto L_0x0042
            r9 = r2
            goto L_0x0043
        L_0x0042:
            r9 = r0
        L_0x0043:
            java.lang.String r8 = "cards"
            io.reactivex.Single r11 = r3.a(r4, r5, r6, r7, r8, r9)
            io.reactivex.Single r11 = r11.a(r2)
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$9aDwiJaDRstlsNuu76n2SRmOzF8 r0 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$9aDwiJaDRstlsNuu76n2SRmOzF8
            r0.<init>()
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$wnKFbiZZkQPvPCBoMfq8G1YxsD8 r1 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$wnKFbiZZkQPvPCBoMfq8G1YxsD8
            r1.<init>()
            io.reactivex.disposables.Disposable r11 = r11.a(r0, r1)
            r10.l = r11
            return
        L_0x005e:
            java.lang.String r0 = "banners"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00b1
            android.widget.EditText r11 = r10.g
            android.text.Editable r11 = r11.getText()
            java.lang.String r5 = r11.toString()
            android.widget.Spinner r11 = r10.h
            java.lang.Object r11 = r11.getSelectedItem()
            com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi$MessageState r11 = (com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi.MessageState) r11
            android.widget.Spinner r0 = r10.i
            java.lang.Object r0 = r0.getSelectedItem()
            java.lang.String r0 = r0.toString()
            pqm r3 = r2.a
            java.lang.String r4 = r2.a()
            java.lang.String r6 = r11.toString()
            r7 = 1
            boolean r11 = android.text.TextUtils.equals(r0, r1)
            if (r11 == 0) goto L_0x0095
            r9 = r2
            goto L_0x0096
        L_0x0095:
            r9 = r0
        L_0x0096:
            java.lang.String r8 = "banners"
            io.reactivex.Single r11 = r3.b(r4, r5, r6, r7, r8, r9)
            io.reactivex.Single r11 = r11.a(r2)
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$W0q5YQhIbq0Px4dwjyqVhAmYS9k r0 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$W0q5YQhIbq0Px4dwjyqVhAmYS9k
            r0.<init>()
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$O7CMtZs1w_IR5D0Zn0bsaIzo2C0 r1 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$O7CMtZs1w_IR5D0Zn0bsaIzo2C0
            r1.<init>()
            io.reactivex.disposables.Disposable r11 = r11.a(r0, r1)
            r10.l = r11
            return
        L_0x00b1:
            java.lang.String r0 = "notes"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0103
            android.widget.EditText r11 = r10.g
            android.text.Editable r11 = r11.getText()
            java.lang.String r5 = r11.toString()
            android.widget.Spinner r11 = r10.h
            java.lang.Object r11 = r11.getSelectedItem()
            com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi$MessageState r11 = (com.spotify.music.features.quicksilver.qa.QuicksilverAdminPanelApi.MessageState) r11
            android.widget.Spinner r0 = r10.i
            java.lang.Object r0 = r0.getSelectedItem()
            java.lang.String r0 = r0.toString()
            pqm r3 = r2.a
            java.lang.String r4 = r2.a()
            java.lang.String r6 = r11.toString()
            r7 = 1
            boolean r11 = android.text.TextUtils.equals(r0, r1)
            if (r11 == 0) goto L_0x00e8
            r9 = r2
            goto L_0x00e9
        L_0x00e8:
            r9 = r0
        L_0x00e9:
            java.lang.String r8 = "notes"
            io.reactivex.Single r11 = r3.c(r4, r5, r6, r7, r8, r9)
            io.reactivex.Single r11 = r11.a(r2)
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$D2CyF4jfJg-b6MTihq_aGZeeJKY r0 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$D2CyF4jfJg-b6MTihq_aGZeeJKY
            r0.<init>()
            com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$JHT1hwDcTzNJOGWbMICfx1p-j20 r1 = new com.spotify.music.features.quicksilver.qa.views.-$$Lambda$QuicksilverQAPanelActivity$JHT1hwDcTzNJOGWbMICfx1p-j20
            r1.<init>()
            io.reactivex.disposables.Disposable r11 = r11.a(r0, r1)
            r10.l = r11
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.quicksilver.qa.views.QuicksilverQAPanelActivity.a(android.view.View):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(List list) {
        if (!list.isEmpty()) {
            if (list.size() > 30) {
                list = list.subList(0, 30);
                Toast.makeText(this, "Couldn't handle all the messages at once, limiting to 30. Retry after approve/reject to get other messages", 0).show();
            }
            startActivity(CardMessageAcceptRejectFlowActivity.a(this, (QuicksilverAdminCardMessage[]) list.toArray(new QuicksilverAdminCardMessage[0])));
            return;
        }
        Toast.makeText(this, "No Card messages available", 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(Throwable th) {
        Toast.makeText(this, th.getMessage(), 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(List list) {
        if (!list.isEmpty()) {
            if (list.size() > 30) {
                list = list.subList(0, 30);
                Toast.makeText(this, "Couldn't handle all the messages at once, limiting to 30. Retry after approve/reject to get other messages", 0).show();
            }
            startActivity(BannerMessageAcceptRejectFlowActivity.a(this, (QuicksilverAdminBannerMessage[]) list.toArray(new QuicksilverAdminBannerMessage[0])));
            return;
        }
        Toast.makeText(this, "No Banner messages available", 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        Toast.makeText(this, th.getMessage(), 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        if (!list.isEmpty()) {
            if (list.size() > 30) {
                list = list.subList(0, 30);
                Toast.makeText(this, "Couldn't handle all the messages at once, limiting to 30. Retry after approve/reject to get other messages", 0).show();
            }
            startActivity(NoteMessageAcceptRejectFlowActivity.a(this, (QuicksilverAdminNoteMessage[]) list.toArray(new QuicksilverAdminNoteMessage[0])));
            return;
        }
        Toast.makeText(this, "No Note messages available", 0).show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Toast.makeText(this, th.getMessage(), 0).show();
    }

    public void onStop() {
        super.onStop();
        if (!this.l.b()) {
            this.l.bf_();
            Toast.makeText(this, "Fetching messages request failed", 0).show();
        }
        if (!this.m.b()) {
            this.m.bf_();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<pql>, for r6v0, types: [java.util.List, java.util.List<pql>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(java.util.List<defpackage.pql> r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "ALL"
            r0.add(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x000e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0035
            java.lang.Object r1 = r6.next()
            pql r1 = (defpackage.pql) r1
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = r1.b()
            r2[r3] = r4
            r3 = 1
            java.lang.String r1 = r1.a()
            r2[r3] = r1
            java.lang.String r1 = "%s : %s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.add(r1)
            goto L_0x000e
        L_0x0035:
            android.widget.ArrayAdapter r6 = new android.widget.ArrayAdapter
            r1 = 17367043(0x1090003, float:2.5162934E-38)
            r6.<init>(r5, r1, r0)
            android.widget.Spinner r0 = r5.i
            r0.setAdapter(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.quicksilver.qa.views.QuicksilverQAPanelActivity.a(java.util.List):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Toast.makeText(this, "Could Not Fetch Locales", 0).show();
        ArrayList arrayList = new ArrayList();
        arrayList.add("ALL");
        arrayList.add("en");
        arrayList.add("ar");
        arrayList.add("cs-CZ");
        arrayList.add("da-DK");
        arrayList.add("de-AT");
        arrayList.add("de-CH");
        arrayList.add("de-DE");
        arrayList.add("el-GR");
        arrayList.add("es-AR");
        arrayList.add("es-CL");
        arrayList.add("es-CO");
        arrayList.add("es-ES");
        arrayList.add("es-LA");
        arrayList.add("es-MX");
        arrayList.add("es-US");
        arrayList.add("fi-FI");
        arrayList.add("fr-CA");
        arrayList.add("fr-FR");
        arrayList.add("hu-HU");
        arrayList.add("id-ID");
        arrayList.add("it-IT");
        arrayList.add("ja-JP");
        arrayList.add("ms-MY");
        arrayList.add("nb-NO");
        arrayList.add("nl-NL");
        arrayList.add("pl-PL");
        arrayList.add("pt-BR");
        arrayList.add("pt-PT");
        arrayList.add("ro-RO");
        arrayList.add("ru-RU");
        arrayList.add("sv-SE");
        arrayList.add("th-TH");
        arrayList.add("tr-TR");
        arrayList.add("vi-VN");
        arrayList.add("zh-HK");
        arrayList.add("zh-SG");
        arrayList.add("zh-TW");
        this.i.setAdapter(new ArrayAdapter(this, 17367043, arrayList));
    }
}
