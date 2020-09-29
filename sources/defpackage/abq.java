package defpackage;

import android.util.JsonReader;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.Layer.LayerType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: abq reason: default package */
public final class abq {
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.util.JsonReader r11, java.util.Map<java.lang.String, defpackage.zl> r12) {
        /*
            r11.beginObject()
        L_0x0003:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = r11.nextName()
            int r1 = r0.hashCode()
            r2 = 3322014(0x32b09e, float:4.655133E-39)
            r3 = 0
            r4 = -1
            if (r1 == r2) goto L_0x0019
            goto L_0x0023
        L_0x0019:
            java.lang.String r1 = "list"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0023
            r0 = 0
            goto L_0x0024
        L_0x0023:
            r0 = -1
        L_0x0024:
            if (r0 == 0) goto L_0x002a
            r11.skipValue()
            goto L_0x0003
        L_0x002a:
            r11.beginArray()
        L_0x002d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00a8
            r0 = 0
            r11.beginObject()
            r1 = 0
            r0 = r1
            r2 = r0
            r5 = 0
        L_0x003b:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x009a
            java.lang.String r6 = r11.nextName()
            int r7 = r6.hashCode()
            r8 = 3
            r9 = 2
            r10 = 1
            switch(r7) {
                case -1866931350: goto L_0x006e;
                case -1408684838: goto L_0x0064;
                case -1294566165: goto L_0x005a;
                case 96619537: goto L_0x0050;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0078
        L_0x0050:
            java.lang.String r7 = "fName"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0078
            r6 = 1
            goto L_0x0079
        L_0x005a:
            java.lang.String r7 = "fStyle"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0078
            r6 = 2
            goto L_0x0079
        L_0x0064:
            java.lang.String r7 = "ascent"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0078
            r6 = 3
            goto L_0x0079
        L_0x006e:
            java.lang.String r7 = "fFamily"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0078
            r6 = 0
            goto L_0x0079
        L_0x0078:
            r6 = -1
        L_0x0079:
            if (r6 == 0) goto L_0x0095
            if (r6 == r10) goto L_0x0090
            if (r6 == r9) goto L_0x008b
            if (r6 == r8) goto L_0x0085
            r11.skipValue()
            goto L_0x003b
        L_0x0085:
            double r5 = r11.nextDouble()
            float r5 = (float) r5
            goto L_0x003b
        L_0x008b:
            java.lang.String r2 = r11.nextString()
            goto L_0x003b
        L_0x0090:
            java.lang.String r0 = r11.nextString()
            goto L_0x003b
        L_0x0095:
            java.lang.String r1 = r11.nextString()
            goto L_0x003b
        L_0x009a:
            r11.endObject()
            zl r6 = new zl
            r6.<init>(r1, r0, r2, r5)
            java.lang.String r0 = r6.b
            r12.put(r0, r6)
            goto L_0x002d
        L_0x00a8:
            r11.endArray()
            goto L_0x0003
        L_0x00ad:
            r11.endObject()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abq.a(android.util.JsonReader, java.util.Map):void");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.util.JsonReader r16, defpackage.xo r17, defpackage.dw<defpackage.zm> r18) {
        /*
            r16.beginArray()
        L_0x0003:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00e9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r16.beginObject()
            r0 = 0
            r3 = 0
            r1 = 0
            r8 = r0
            r9 = r8
            r6 = r3
            r4 = r6
            r3 = 0
        L_0x001a:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = r16.nextName()
            int r11 = r0.hashCode()
            r12 = 5
            r13 = 4
            r14 = 3
            r15 = 2
            r10 = 1
            switch(r11) {
                case -1866931350: goto L_0x0063;
                case 119: goto L_0x0059;
                case 3173: goto L_0x004f;
                case 3076010: goto L_0x0045;
                case 3530753: goto L_0x003b;
                case 109780401: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x006d
        L_0x0031:
            java.lang.String r11 = "style"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x006d
            r0 = 3
            goto L_0x006e
        L_0x003b:
            java.lang.String r11 = "size"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x006d
            r0 = 1
            goto L_0x006e
        L_0x0045:
            java.lang.String r11 = "data"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x006d
            r0 = 5
            goto L_0x006e
        L_0x004f:
            java.lang.String r11 = "ch"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x006d
            r0 = 0
            goto L_0x006e
        L_0x0059:
            java.lang.String r11 = "w"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x006d
            r0 = 2
            goto L_0x006e
        L_0x0063:
            java.lang.String r11 = "fFamily"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x006d
            r0 = 4
            goto L_0x006e
        L_0x006d:
            r0 = -1
        L_0x006e:
            if (r0 == 0) goto L_0x00cb
            if (r0 == r10) goto L_0x00c5
            if (r0 == r15) goto L_0x00bf
            if (r0 == r14) goto L_0x00b9
            if (r0 == r13) goto L_0x00b3
            if (r0 == r12) goto L_0x007e
            r16.skipValue()
            goto L_0x001a
        L_0x007e:
            r16.beginObject()
        L_0x0081:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = r16.nextName()
            java.lang.String r10 = "shapes"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00aa
            r16.beginArray()
        L_0x0096:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00a6
            aag r0 = defpackage.abf.a(r16, r17)
            aao r0 = (defpackage.aao) r0
            r2.add(r0)
            goto L_0x0096
        L_0x00a6:
            r16.endArray()
            goto L_0x0081
        L_0x00aa:
            r16.skipValue()
            goto L_0x0081
        L_0x00ae:
            r16.endObject()
            goto L_0x001a
        L_0x00b3:
            java.lang.String r9 = r16.nextString()
            goto L_0x001a
        L_0x00b9:
            java.lang.String r8 = r16.nextString()
            goto L_0x001a
        L_0x00bf:
            double r6 = r16.nextDouble()
            goto L_0x001a
        L_0x00c5:
            double r4 = r16.nextDouble()
            goto L_0x001a
        L_0x00cb:
            java.lang.String r0 = r16.nextString()
            char r3 = r0.charAt(r1)
            goto L_0x001a
        L_0x00d5:
            r16.endObject()
            zm r0 = new zm
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r9)
            int r1 = r0.hashCode()
            r2 = r18
            r2.b(r1, r0)
            goto L_0x0003
        L_0x00e9:
            r16.endArray()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abq.a(android.util.JsonReader, xo, dw):void");
    }

    public static void a(JsonReader jsonReader, xo xoVar, List<Layer> list, ds<Layer> dsVar) {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            Layer a = abp.a(jsonReader, xoVar);
            if (a.e == LayerType.Image) {
                i++;
            }
            list.add(a);
            dsVar.b(a.d, a);
            if (i > 4) {
                StringBuilder sb = new StringBuilder("You have ");
                sb.append(i);
                sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                xn.b(sb.toString());
            }
        }
        jsonReader.endArray();
    }

    public static void a(JsonReader jsonReader, xo xoVar, Map<String, List<Layer>> map, Map<String, xr> map2) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            ds dsVar = new ds();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                char c = 65535;
                int hashCode = nextName.hashCode();
                if (hashCode != -1109732030) {
                    if (hashCode != 104) {
                        if (hashCode != 112) {
                            if (hashCode != 117) {
                                if (hashCode != 119) {
                                    if (hashCode == 3355 && nextName.equals("id")) {
                                        c = 0;
                                    }
                                } else if (nextName.equals("w")) {
                                    c = 2;
                                }
                            } else if (nextName.equals("u")) {
                                c = 5;
                            }
                        } else if (nextName.equals("p")) {
                            c = 4;
                        }
                    } else if (nextName.equals("h")) {
                        c = 3;
                    }
                } else if (nextName.equals("layers")) {
                    c = 1;
                }
                if (c == 0) {
                    str = jsonReader.nextString();
                } else if (c == 1) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        Layer a = abp.a(jsonReader, xoVar);
                        dsVar.b(a.d, a);
                        arrayList.add(a);
                    }
                    jsonReader.endArray();
                } else if (c == 2) {
                    i = jsonReader.nextInt();
                } else if (c == 3) {
                    i2 = jsonReader.nextInt();
                } else if (c == 4) {
                    str2 = jsonReader.nextString();
                } else if (c != 5) {
                    jsonReader.skipValue();
                } else {
                    str3 = jsonReader.nextString();
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                xr xrVar = new xr(i, i2, str, str2, str3);
                map2.put(xrVar.a, xrVar);
            } else {
                Map<String, xr> map3 = map2;
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }
}
