package defpackage;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.Layer.LayerType;
import com.airbnb.lottie.model.layer.Layer.MatteType;
import java.util.Collections;
import java.util.List;

/* renamed from: abb reason: default package */
public final class abb {
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0256  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.model.layer.Layer a(android.util.JsonReader r38, defpackage.xa r39) {
        /*
            r0 = r38
            r7 = r39
            com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.None
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r38.beginObject()
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r2)
            r3 = 0
            r11 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r4 = 0
            java.lang.String r5 = "UNSET"
            r13 = 0
            r15 = -1
            r26 = r1
            r17 = r3
            r27 = r17
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r13
            r20 = r15
            r1 = 0
            r2 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r14 = r30
            r16 = r14
            r13 = r5
        L_0x004b:
            boolean r3 = r38.hasNext()
            if (r3 == 0) goto L_0x0301
            java.lang.String r3 = r38.nextName()
            int r5 = r3.hashCode()
            java.lang.String r6 = "nm"
            r11 = 1
            r34 = -1
            switch(r5) {
                case -995424086: goto L_0x014e;
                case -903568142: goto L_0x0143;
                case 104: goto L_0x0138;
                case 116: goto L_0x012d;
                case 119: goto L_0x0122;
                case 3177: goto L_0x0117;
                case 3233: goto L_0x010c;
                case 3367: goto L_0x0101;
                case 3432: goto L_0x00f6;
                case 3519: goto L_0x00ed;
                case 3553: goto L_0x00e1;
                case 3664: goto L_0x00d6;
                case 3669: goto L_0x00cb;
                case 3679: goto L_0x00bf;
                case 3681: goto L_0x00b3;
                case 3684: goto L_0x00a8;
                case 3705: goto L_0x009c;
                case 3712: goto L_0x0090;
                case 3717: goto L_0x0085;
                case 104415: goto L_0x007a;
                case 108390670: goto L_0x006f;
                case 1441620890: goto L_0x0063;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0158
        L_0x0063:
            java.lang.String r5 = "masksProperties"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 10
            goto L_0x0159
        L_0x006f:
            java.lang.String r5 = "refId"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 2
            goto L_0x0159
        L_0x007a:
            java.lang.String r5 = "ind"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 1
            goto L_0x0159
        L_0x0085:
            java.lang.String r5 = "ty"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 3
            goto L_0x0159
        L_0x0090:
            java.lang.String r5 = "tt"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 9
            goto L_0x0159
        L_0x009c:
            java.lang.String r5 = "tm"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 20
            goto L_0x0159
        L_0x00a8:
            java.lang.String r5 = "sw"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 5
            goto L_0x0159
        L_0x00b3:
            java.lang.String r5 = "st"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 15
            goto L_0x0159
        L_0x00bf:
            java.lang.String r5 = "sr"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 14
            goto L_0x0159
        L_0x00cb:
            java.lang.String r5 = "sh"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 6
            goto L_0x0159
        L_0x00d6:
            java.lang.String r5 = "sc"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 7
            goto L_0x0159
        L_0x00e1:
            java.lang.String r5 = "op"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 19
            goto L_0x0159
        L_0x00ed:
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0158
            r3 = 0
            goto L_0x0159
        L_0x00f6:
            java.lang.String r5 = "ks"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 8
            goto L_0x0159
        L_0x0101:
            java.lang.String r5 = "ip"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 18
            goto L_0x0159
        L_0x010c:
            java.lang.String r5 = "ef"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 13
            goto L_0x0159
        L_0x0117:
            java.lang.String r5 = "cl"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 21
            goto L_0x0159
        L_0x0122:
            java.lang.String r5 = "w"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 16
            goto L_0x0159
        L_0x012d:
            java.lang.String r5 = "t"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 12
            goto L_0x0159
        L_0x0138:
            java.lang.String r5 = "h"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 17
            goto L_0x0159
        L_0x0143:
            java.lang.String r5 = "shapes"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 11
            goto L_0x0159
        L_0x014e:
            java.lang.String r5 = "parent"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0158
            r3 = 4
            goto L_0x0159
        L_0x0158:
            r3 = -1
        L_0x0159:
            switch(r3) {
                case 0: goto L_0x02f9;
                case 1: goto L_0x02f1;
                case 2: goto L_0x02ec;
                case 3: goto L_0x02d6;
                case 4: goto L_0x02ce;
                case 5: goto L_0x02bf;
                case 6: goto L_0x02b0;
                case 7: goto L_0x02a7;
                case 8: goto L_0x02a2;
                case 9: goto L_0x0297;
                case 10: goto L_0x0281;
                case 11: goto L_0x0269;
                case 12: goto L_0x0202;
                case 13: goto L_0x01ab;
                case 14: goto L_0x01a4;
                case 15: goto L_0x019b;
                case 16: goto L_0x018b;
                case 17: goto L_0x017b;
                case 18: goto L_0x0174;
                case 19: goto L_0x016d;
                case 20: goto L_0x0167;
                case 21: goto L_0x0161;
                default: goto L_0x015c;
            }
        L_0x015c:
            r38.skipValue()
            goto L_0x02fd
        L_0x0161:
            java.lang.String r14 = r38.nextString()
            goto L_0x02fe
        L_0x0167:
            ze r30 = defpackage.aao.a(r0, r7, r4)
            goto L_0x02fe
        L_0x016d:
            double r2 = r38.nextDouble()
            float r2 = (float) r2
            goto L_0x02fe
        L_0x0174:
            double r5 = r38.nextDouble()
            float r1 = (float) r5
            goto L_0x02fe
        L_0x017b:
            int r3 = r38.nextInt()
            float r3 = (float) r3
            float r5 = defpackage.abw.a()
            float r3 = r3 * r5
            int r3 = (int) r3
            r24 = r3
            goto L_0x02fe
        L_0x018b:
            int r3 = r38.nextInt()
            float r3 = (float) r3
            float r5 = defpackage.abw.a()
            float r3 = r3 * r5
            int r3 = (int) r3
            r23 = r3
            goto L_0x02fe
        L_0x019b:
            double r5 = r38.nextDouble()
            float r3 = (float) r5
            r25 = r3
            goto L_0x02fe
        L_0x01a4:
            double r5 = r38.nextDouble()
            float r15 = (float) r5
            goto L_0x02fe
        L_0x01ab:
            r38.beginArray()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x01b3:
            boolean r5 = r38.hasNext()
            if (r5 == 0) goto L_0x01ec
            r38.beginObject()
        L_0x01bc:
            boolean r5 = r38.hasNext()
            if (r5 == 0) goto L_0x01e7
            java.lang.String r5 = r38.nextName()
            int r11 = r5.hashCode()
            r4 = 3519(0xdbf, float:4.931E-42)
            if (r11 == r4) goto L_0x01cf
            goto L_0x01d7
        L_0x01cf:
            boolean r4 = r5.equals(r6)
            if (r4 == 0) goto L_0x01d7
            r4 = 0
            goto L_0x01d8
        L_0x01d7:
            r4 = -1
        L_0x01d8:
            if (r4 == 0) goto L_0x01df
            r38.skipValue()
        L_0x01dd:
            r4 = 0
            goto L_0x01bc
        L_0x01df:
            java.lang.String r4 = r38.nextString()
            r3.add(r4)
            goto L_0x01dd
        L_0x01e7:
            r38.endObject()
            r4 = 0
            goto L_0x01b3
        L_0x01ec:
            r38.endArray()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r7.a(r3)
            goto L_0x02fd
        L_0x0202:
            r38.beginObject()
        L_0x0205:
            boolean r3 = r38.hasNext()
            if (r3 == 0) goto L_0x0264
            java.lang.String r3 = r38.nextName()
            int r4 = r3.hashCode()
            r5 = 97
            if (r4 == r5) goto L_0x0226
            r5 = 100
            if (r4 == r5) goto L_0x021c
            goto L_0x0230
        L_0x021c:
            java.lang.String r4 = "d"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0230
            r3 = 0
            goto L_0x0231
        L_0x0226:
            java.lang.String r4 = "a"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0230
            r3 = 1
            goto L_0x0231
        L_0x0230:
            r3 = -1
        L_0x0231:
            if (r3 == 0) goto L_0x0256
            if (r3 == r11) goto L_0x0239
            r38.skipValue()
            goto L_0x0205
        L_0x0239:
            r38.beginArray()
            boolean r3 = r38.hasNext()
            if (r3 == 0) goto L_0x0248
            zn r3 = defpackage.aam.a(r38, r39)
            r29 = r3
        L_0x0248:
            boolean r3 = r38.hasNext()
            if (r3 == 0) goto L_0x0252
            r38.skipValue()
            goto L_0x0248
        L_0x0252:
            r38.endArray()
            goto L_0x0205
        L_0x0256:
            zm r3 = new zm
            aas r4 = defpackage.aas.a
            java.util.List r4 = defpackage.aao.a(r0, r7, r4)
            r3.<init>(r4)
            r28 = r3
            goto L_0x0205
        L_0x0264:
            r38.endObject()
            goto L_0x02fd
        L_0x0269:
            r38.beginArray()
        L_0x026c:
            boolean r3 = r38.hasNext()
            if (r3 == 0) goto L_0x027c
            zs r3 = defpackage.aar.a(r38, r39)
            if (r3 == 0) goto L_0x026c
            r8.add(r3)
            goto L_0x026c
        L_0x027c:
            r38.endArray()
            goto L_0x02fd
        L_0x0281:
            r38.beginArray()
        L_0x0284:
            boolean r3 = r38.hasNext()
            if (r3 == 0) goto L_0x0292
            com.airbnb.lottie.model.content.Mask r3 = defpackage.abd.a(r38, r39)
            r10.add(r3)
            goto L_0x0284
        L_0x0292:
            r38.endArray()
            goto L_0x02fd
        L_0x0297:
            com.airbnb.lottie.model.layer.Layer$MatteType[] r3 = com.airbnb.lottie.model.layer.Layer.MatteType.values()
            int r4 = r38.nextInt()
            r26 = r3[r4]
            goto L_0x02fd
        L_0x02a2:
            zo r27 = defpackage.aan.a(r38, r39)
            goto L_0x02fd
        L_0x02a7:
            java.lang.String r3 = r38.nextString()
            int r22 = android.graphics.Color.parseColor(r3)
            goto L_0x02fd
        L_0x02b0:
            int r3 = r38.nextInt()
            float r3 = (float) r3
            float r4 = defpackage.abw.a()
            float r3 = r3 * r4
            int r3 = (int) r3
            r19 = r3
            goto L_0x02fd
        L_0x02bf:
            int r3 = r38.nextInt()
            float r3 = (float) r3
            float r4 = defpackage.abw.a()
            float r3 = r3 * r4
            int r3 = (int) r3
            r18 = r3
            goto L_0x02fd
        L_0x02ce:
            int r3 = r38.nextInt()
            long r3 = (long) r3
            r20 = r3
            goto L_0x02fd
        L_0x02d6:
            int r3 = r38.nextInt()
            com.airbnb.lottie.model.layer.Layer$LayerType r4 = com.airbnb.lottie.model.layer.Layer.LayerType.Unknown
            int r4 = r4.ordinal()
            if (r3 >= r4) goto L_0x02e9
            com.airbnb.lottie.model.layer.Layer$LayerType[] r4 = com.airbnb.lottie.model.layer.Layer.LayerType.values()
            r16 = r4[r3]
            goto L_0x02fd
        L_0x02e9:
            com.airbnb.lottie.model.layer.Layer$LayerType r16 = com.airbnb.lottie.model.layer.Layer.LayerType.Unknown
            goto L_0x02fd
        L_0x02ec:
            java.lang.String r17 = r38.nextString()
            goto L_0x02fd
        L_0x02f1:
            int r3 = r38.nextInt()
            long r3 = (long) r3
            r31 = r3
            goto L_0x02fd
        L_0x02f9:
            java.lang.String r13 = r38.nextString()
        L_0x02fd:
            r4 = 0
        L_0x02fe:
            r11 = 0
            goto L_0x004b
        L_0x0301:
            r38.endObject()
            float r11 = r1 / r15
            float r34 = r2 / r15
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 0
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0332
            abx r5 = new abx
            r4 = 0
            r35 = 0
            java.lang.Float r36 = java.lang.Float.valueOf(r11)
            r0 = r5
            r1 = r39
            r2 = r12
            r3 = r12
            r37 = r5
            r5 = r35
            r35 = r15
            r15 = r6
            r6 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r37
            r15.add(r0)
            goto L_0x0335
        L_0x0332:
            r35 = r15
            r15 = r6
        L_0x0335:
            r0 = 0
            int r0 = (r34 > r0 ? 1 : (r34 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x033b
            goto L_0x033f
        L_0x033b:
            float r0 = r7.j
            r34 = r0
        L_0x033f:
            abx r6 = new abx
            r4 = 0
            java.lang.Float r33 = java.lang.Float.valueOf(r34)
            r0 = r6
            r1 = r39
            r2 = r9
            r3 = r9
            r5 = r11
            r9 = r6
            r6 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.add(r9)
            abx r9 = new abx
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r0 = r9
            r2 = r12
            r3 = r12
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.add(r9)
            java.lang.String r0 = ".ai"
            boolean r0 = r13.endsWith(r0)
            if (r0 != 0) goto L_0x0379
            java.lang.String r0 = "ai"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x037e
        L_0x0379:
            java.lang.String r0 = "Convert your Illustrator layers to shape layers."
            r7.a(r0)
        L_0x037e:
            com.airbnb.lottie.model.layer.Layer r33 = new com.airbnb.lottie.model.layer.Layer
            r0 = r33
            r1 = r8
            r2 = r39
            r3 = r13
            r4 = r31
            r6 = r16
            r7 = r20
            r9 = r17
            r11 = r27
            r12 = r18
            r13 = r19
            r14 = r22
            r21 = r15
            r15 = r35
            r16 = r25
            r17 = r23
            r18 = r24
            r19 = r28
            r20 = r29
            r22 = r26
            r23 = r30
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abb.a(android.util.JsonReader, xa):com.airbnb.lottie.model.layer.Layer");
    }

    public static Layer a(xa xaVar) {
        xa xaVar2 = xaVar;
        Rect rect = xaVar.h;
        List emptyList = Collections.emptyList();
        LayerType layerType = LayerType.PreComp;
        List emptyList2 = Collections.emptyList();
        zo zoVar = r4;
        zo zoVar2 = new zo();
        Layer layer = new Layer(emptyList, xaVar2, "__container", -1, layerType, -1, null, emptyList2, zoVar, 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), MatteType.None, null);
        return layer;
    }
}
