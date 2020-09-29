package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import io.reactivex.functions.Consumer;
import java.util.UUID;

@Deprecated
/* renamed from: gji reason: default package */
public final class gji {
    private final Context a;
    private final jjf b;
    private final jrp c;
    private final gjm d;
    private rdd e;
    private float f;
    private float g;
    private long h;

    gji(Context context, jjf jjf, rdh rdh, jrp jrp, gjm gjm) {
        this.a = (Context) fay.a(context);
        this.b = (jjf) fay.a(jjf);
        this.c = (jrp) fay.a(jrp);
        this.d = (gjm) fay.a(gjm);
        ((rdh) fay.a(rdh)).a.a((Consumer<? super T>) new $$Lambda$gji$NdhMNLoM6hm6bdG_nevzIUCDhsY<Object>(this), (Consumer<? super Throwable>) $$Lambda$gji$7egOdE0bNtPkzIHp502mGh4aIs4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rdd rdd) {
        this.e = rdd;
    }

    public final void a(ViewGroup viewGroup, MotionEvent motionEvent) {
        InteractionType interactionType;
        String str;
        fay.a(viewGroup);
        fay.a(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float abs = Math.abs(motionEvent.getRawX() - this.f);
                float abs2 = Math.abs(motionEvent.getRawY() - this.g);
                float scaledTouchSlop = (float) ViewConfiguration.get(this.a.getApplicationContext()).getScaledTouchSlop();
                if (abs >= scaledTouchSlop || abs2 >= scaledTouchSlop) {
                    interactionType = InteractionType.UNKNOWN;
                } else if (this.c.a() - this.h < ((long) ViewConfiguration.getLongPressTimeout())) {
                    interactionType = InteractionType.TAP;
                } else {
                    interactionType = InteractionType.LONG_PRESS;
                }
                if (interactionType != InteractionType.UNKNOWN) {
                    View a2 = a(viewGroup, motionEvent.getX(), motionEvent.getY());
                    Logger.b("Touched View: %s", a2.getClass().getSimpleName());
                    fay.a(interactionType);
                    fay.a(a2);
                    gjh gjh = new gjh(a2);
                    View view = gjh.a;
                    if (gjd.c(gjh.a)) {
                        gjh.b = gjh.a;
                    }
                    StringBuilder sb = new StringBuilder(16);
                    String a3 = gjd.a(gjh.a);
                    if (a3 != null) {
                        sb.append(a3);
                    }
                    StringBuilder sb2 = new StringBuilder(32);
                    sb2.append(gjh.a.getClass().getSimpleName());
                    while ((gjh.a.getParent() instanceof View) && gjh.a.getId() != 16908290) {
                        ViewParent parent = gjh.a.getParent();
                        ViewGroup viewGroup2 = (ViewGroup) parent;
                        String a4 = gjd.a(viewGroup2);
                        if (a4 != null) {
                            if (sb.length() > 0) {
                                sb.insert(0, '/');
                            }
                            sb.insert(0, a4);
                        }
                        if (parent instanceof RecyclerView) {
                            a c2 = ((RecyclerView) parent).c();
                            int e2 = RecyclerView.e(gjh.a);
                            String simpleName = gjh.a.getClass().getSimpleName();
                            if (sb2.indexOf(simpleName) == 0) {
                                int indexOf = sb2.indexOf("/");
                                if (indexOf <= 0) {
                                    indexOf = simpleName.length();
                                }
                                sb2.delete(0, indexOf);
                            }
                            if (e2 >= 0 && (c2 instanceof gjk)) {
                                gjk gjk = (gjk) c2;
                                simpleName = gjk.c(e2);
                                int i = 0;
                                for (int i2 = 0; i2 < e2; i2++) {
                                    if (simpleName.equals(gjk.c(i2))) {
                                        i++;
                                    }
                                }
                                e2 = i;
                            } else if (!(c2 instanceof gjl)) {
                                simpleName = "Unknown";
                            }
                            sb2.insert(0, e2);
                            sb2.insert(0, ':');
                            sb2.insert(0, simpleName);
                            sb2.insert(0, '/');
                        } else {
                            sb2.insert(0, '/');
                            if (viewGroup2.getChildCount() > 1) {
                                sb2.insert(0, viewGroup2.indexOfChild(gjh.a));
                                sb2.insert(0, ':');
                            }
                        }
                        sb2.insert(0, viewGroup2.getClass().getSimpleName());
                        if (gjh.c == null) {
                            gjh.c = gjd.b(viewGroup2);
                        }
                        if (gjh.b == null && gjd.c(viewGroup2)) {
                            gjh.b = viewGroup2;
                        }
                        gjh.a = (View) parent;
                    }
                    if (sb.length() > 0) {
                        gjh.d = sb.toString();
                    } else {
                        gjh.d = sb2.toString();
                        if (gjh.b == null) {
                            gjh.b = view;
                        }
                    }
                    String str2 = gjh.d;
                    String str3 = gjh.c;
                    View view2 = gjh.b;
                    fay.a(interactionType);
                    rdd rdd = this.e;
                    if (rdd instanceof rde) {
                        str = ((rde) rdd).a();
                    } else {
                        str = PageIdentifiers.UNKNOWN.mPageIdentifier;
                    }
                    String str4 = str;
                    rdd rdd2 = this.e;
                    String str5 = "unknown";
                    String b2 = (!(rdd2 instanceof rde) || ((rde) rdd2).b() == null) ? str5 : ((rde) this.e).b();
                    String uuid = UUID.randomUUID().toString();
                    String str6 = !TextUtils.isEmpty(str2) ? str2 : str5;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = InteractionIntent.UNKNOWN.mInteractionIntent;
                    }
                    String str7 = str3;
                    jjf jjf = this.b;
                    ai aiVar = new ai(uuid, str6, interactionType.mInteractionType, str7, str4, b2);
                    jjf.a(aiVar);
                    if (view2 != null) {
                        view2.setTag(R.id.interaction_id, uuid);
                    }
                }
            }
            return;
        }
        this.h = this.c.a();
        this.f = motionEvent.getRawX();
        this.g = motionEvent.getRawY();
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.view.ViewGroup, code=null, for r10v0, types: [java.lang.Object, android.view.ViewGroup] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v2
      assigns: []
      uses: []
      mth insns count: 47
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
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.view.View a(android.view.ViewGroup r10, float r11, float r12) {
        /*
            defpackage.fay.a(r10)
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 0
            r3 = r10
            r2 = 0
        L_0x0009:
            int r4 = r10.getChildCount()
            if (r2 >= r4) goto L_0x0059
            android.view.View r4 = r10.getChildAt(r2)
            int r5 = r4.getVisibility()
            if (r5 != 0) goto L_0x0056
            r4.getLocationOnScreen(r0)
            r5 = r0[r1]
            r6 = 1
            r6 = r0[r6]
            int r7 = r4.getWidth()
            int r7 = r7 + r5
            int r8 = r4.getHeight()
            int r8 = r8 + r6
            float r5 = (float) r5
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0056
            float r5 = (float) r7
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0056
            float r5 = (float) r6
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0056
            float r5 = (float) r8
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0056
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0049
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r4 = a(r4, r11, r12)
        L_0x0049:
            long r5 = a(r4)
            long r7 = a(r3)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0056
            r3 = r4
        L_0x0056:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gji.a(android.view.ViewGroup, float, float):android.view.View");
    }

    private static long a(View view) {
        fay.a(view);
        return ((long) view.getWidth()) * ((long) view.getHeight());
    }
}
