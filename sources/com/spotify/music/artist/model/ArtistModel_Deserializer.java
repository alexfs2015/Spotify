package com.spotify.music.artist.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.music.artist.model.ArtistModel.ArtistInfo;
import com.spotify.music.artist.model.ArtistModel.Concert;
import com.spotify.music.artist.model.ArtistModel.CreatorAbout;
import com.spotify.music.artist.model.ArtistModel.CustomMessage;
import com.spotify.music.artist.model.ArtistModel.MerchandiseItem;
import com.spotify.music.artist.model.ArtistModel.MonthlyListeners;
import com.spotify.music.artist.model.ArtistModel.Playlist;
import com.spotify.music.artist.model.ArtistModel.Track;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class ArtistModel_Deserializer extends StdDeserializer<ArtistModel> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.music.artist.model.ArtistModel_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[JsonToken.values().length];

        static {
            try {
                a[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    ArtistModel_Deserializer() {
        super(ArtistModel.class);
    }

    private ReleasesWithTotalCount A(JsonParser jsonParser, DeserializationContext deserializationContext) {
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int hashCode = currentName.hashCode();
                if (hashCode != -551298740) {
                    if (hashCode == -407761836 && currentName.equals("total_count")) {
                        c = 1;
                    }
                } else if (currentName.equals("releases")) {
                    c = 0;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    list = o(jsonParser, deserializationContext);
                } else if (c != 1) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    i = b(jsonParser, deserializationContext);
                }
            }
        }
        return new ReleasesWithTotalCount(list, i);
    }

    private String B(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    private Track C(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str = null;
        String str2 = null;
        Release release = null;
        int i = 0;
        boolean z = false;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1929091532:
                        if (currentName.equals("explicit")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1873959333:
                        if (currentName.equals("playcount")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 116076:
                        if (currentName.equals("uri")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3373707:
                        if (currentName.equals("name")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1090594823:
                        if (currentName.equals("release")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    str = B(jsonParser, deserializationContext);
                } else if (c == 1) {
                    jsonParser.nextValue();
                    i = b(jsonParser, deserializationContext);
                } else if (c == 2) {
                    jsonParser.nextValue();
                    z = a(jsonParser, deserializationContext);
                } else if (c == 3) {
                    jsonParser.nextValue();
                    str2 = B(jsonParser, deserializationContext);
                } else if (c != 4) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    release = y(jsonParser, deserializationContext);
                }
            }
        }
        Track track = new Track(str, i, z, str2, release);
        return track;
    }

    private static boolean a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    private static int b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r7v1, types: [com.spotify.music.artist.model.ArtistModel$ArtistGallery] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v20, types: [com.spotify.music.artist.model.ArtistModel$ArtistGallery] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r0v22, types: [java.util.Map, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* JADX WARNING: type inference failed for: r7v23 */
    /* JADX WARNING: type inference failed for: r7v24 */
    /* JADX WARNING: type inference failed for: r7v25 */
    /* JADX WARNING: type inference failed for: r7v26 */
    /* JADX WARNING: type inference failed for: r7v27 */
    /* JADX WARNING: type inference failed for: r7v28 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: type inference failed for: r2v29 */
    /* JADX WARNING: type inference failed for: r2v30 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r7v29 */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r7v30 */
    /* JADX WARNING: type inference failed for: r2v32 */
    /* JADX WARNING: type inference failed for: r0v56 */
    /* JADX WARNING: type inference failed for: r0v57 */
    /* JADX WARNING: type inference failed for: r0v58 */
    /* JADX WARNING: type inference failed for: r0v59 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d0, code lost:
        r23.nextValue();
        r23.skipChildren();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d6, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        r23.nextValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e0, code lost:
        r7 = new com.spotify.music.artist.model.ArtistModel.ArtistGallery
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e8, code lost:
        r23.nextValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f1, code lost:
        if (r23.getCurrentToken() != com.fasterxml.jackson.core.JsonToken.VALUE_NULL) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f3, code lost:
        r6 = null;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f6, code lost:
        r0 = 0;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01fe, code lost:
        if (r23.nextToken() == com.fasterxml.jackson.core.JsonToken.END_OBJECT) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x020c, code lost:
        if (com.spotify.music.artist.model.ArtistModel_Deserializer.AnonymousClass1.a[r23.getCurrentToken().ordinal()] == r1) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0210, code lost:
        r3 = r23.getCurrentName();
        r6 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x021b, code lost:
        if (r6 == -1019779949) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0220, code lost:
        if (r6 == 100313435) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0229, code lost:
        if (r3.equals("image") == false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x022b, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0233, code lost:
        if (r3.equals("offset") == false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0235, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0237, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0238, code lost:
        if (r1 == 0) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x023b, code lost:
        if (r1 == 1) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x023d, code lost:
        r23.nextValue();
        r23.skipChildren();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0243, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0245, code lost:
        r23.nextValue();
        r0 = b(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x024d, code lost:
        r23.nextValue();
        r2 = B(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0256, code lost:
        r6 = new com.spotify.music.artist.model.ArtistModel.HeaderImage(r2, r0);
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x025d, code lost:
        r23.nextValue();
        r5 = d(r23, r24);
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0265, code lost:
        r23.nextValue();
        r4 = B(r23, r24);
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x026d, code lost:
        r23.skipChildren();
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x001e, code lost:
        r8 = r8;
        r7 = r7;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x001e, code lost:
        r8 = r8;
        r7 = r7;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x001e, code lost:
        r8 = r8;
        r7 = r7;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x001e, code lost:
        r8 = r8;
        r7 = r7;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x001e, code lost:
        r8 = r8;
        r7 = r7;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x001e, code lost:
        r8 = r8;
        r7 = r7;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x001e, code lost:
        r8 = r8;
        r7 = r7;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x001e, code lost:
        r8 = r8;
        r7 = r7;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x001e, code lost:
        r8 = r8;
        r7 = r7;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x001e, code lost:
        r8 = r8;
        r7 = r7;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x001e, code lost:
        r8 = r8;
        r7 = r7;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x001e, code lost:
        r7 = r7;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x001e, code lost:
        r7 = r7;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x01d6, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x01d6, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x01d6, code lost:
        r0 = l(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f6, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f7, code lost:
        switch(r0) {
            case 0: goto L_0x0265;
            case 1: goto L_0x025d;
            case 2: goto L_0x01e8;
            case 3: goto L_0x018f;
            case 4: goto L_0x0162;
            case 5: goto L_0x0159;
            case 6: goto L_0x0150;
            case 7: goto L_0x0147;
            case 8: goto L_0x013e;
            case 9: goto L_0x0135;
            case 10: goto L_0x012c;
            case 11: goto L_0x0123;
            case 12: goto L_0x011a;
            case 13: goto L_0x0111;
            case 14: goto L_0x0108;
            case 15: goto L_0x00ff;
            default: goto L_0x00fa;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fa, code lost:
        r23.nextValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ff, code lost:
        r23.nextValue();
        r19 = e(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0108, code lost:
        r23.nextValue();
        r18 = g(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0111, code lost:
        r23.nextValue();
        r17 = w(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011a, code lost:
        r23.nextValue();
        r16 = h(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0123, code lost:
        r23.nextValue();
        r15 = t(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012c, code lost:
        r23.nextValue();
        r14 = y(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0135, code lost:
        r23.nextValue();
        r13 = z(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013e, code lost:
        r23.nextValue();
        r12 = u(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0147, code lost:
        r23.nextValue();
        r11 = q(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0150, code lost:
        r23.nextValue();
        r10 = s(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0159, code lost:
        r23.nextValue();
        r9 = r(r23, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0162, code lost:
        r23.nextValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x016b, code lost:
        if (r23.getCurrentToken() != com.fasterxml.jackson.core.JsonToken.VALUE_NULL) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x016d, code lost:
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0170, code lost:
        r0 = new java.util.HashMap
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x017b, code lost:
        if (r23.nextToken() == com.fasterxml.jackson.core.JsonToken.END_OBJECT) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017d, code lost:
        r1 = B(r23, r24);
        r23.nextValue();
        r0.put(r1, p(r23, r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018c, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018f, code lost:
        r23.nextValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0198, code lost:
        if (r23.getCurrentToken() != com.fasterxml.jackson.core.JsonToken.VALUE_NULL) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019a, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019d, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a4, code lost:
        if (r23.nextToken() == com.fasterxml.jackson.core.JsonToken.END_OBJECT) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b2, code lost:
        if (com.spotify.music.artist.model.ArtistModel_Deserializer.AnonymousClass1.a[r23.getCurrentToken().ordinal()] == 1) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b5, code lost:
        r3 = r23.getCurrentName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c0, code lost:
        if (r3.hashCode() == -1185250696) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c9, code lost:
        if (r3.equals("images") == false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01cb, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01cd, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ce, code lost:
        if (r2 == 0) goto L_0x01d8;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v2
      assigns: []
      uses: []
      mth insns count: 327
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
    /* JADX WARNING: Unknown variable types count: 14 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.artist.model.ArtistModel deserialize(com.fasterxml.jackson.core.JsonParser r23, com.fasterxml.jackson.databind.DeserializationContext r24) {
        /*
            r22 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r23.getCurrentToken()     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x027a }
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
        L_0x001e:
            com.fasterxml.jackson.core.JsonToken r0 = r23.nextToken()     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == r1) goto L_0x0273
            int[] r0 = com.spotify.music.artist.model.ArtistModel_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r1 = r23.getCurrentToken()     // Catch:{ RuntimeException -> 0x027a }
            int r1 = r1.ordinal()     // Catch:{ RuntimeException -> 0x027a }
            r0 = r0[r1]     // Catch:{ RuntimeException -> 0x027a }
            r1 = 1
            if (r0 == r1) goto L_0x0037
            goto L_0x0270
        L_0x0037:
            java.lang.String r0 = r23.getCurrentName()     // Catch:{ RuntimeException -> 0x027a }
            int r3 = r0.hashCode()     // Catch:{ RuntimeException -> 0x027a }
            r20 = -1
            r21 = 0
            switch(r3) {
                case -1956048599: goto L_0x00ec;
                case -1652496561: goto L_0x00e1;
                case -838143496: goto L_0x00d7;
                case -615695694: goto L_0x00cd;
                case -551298740: goto L_0x00c2;
                case -196315310: goto L_0x00b8;
                case -29658995: goto L_0x00ad;
                case 116076: goto L_0x00a3;
                case 3237038: goto L_0x0099;
                case 60358643: goto L_0x008e;
                case 103785407: goto L_0x0083;
                case 412418640: goto L_0x0078;
                case 428552505: goto L_0x006c;
                case 1027393306: goto L_0x0060;
                case 1738683834: goto L_0x0054;
                case 2098807760: goto L_0x0048;
                default: goto L_0x0046;
            }     // Catch:{ RuntimeException -> 0x027a }
        L_0x0046:
            goto L_0x00f6
        L_0x0048:
            java.lang.String r3 = "published_playlists"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 11
            goto L_0x00f7
        L_0x0054:
            java.lang.String r3 = "creator_about"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 14
            goto L_0x00f7
        L_0x0060:
            java.lang.String r3 = "pinned_item"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 15
            goto L_0x00f7
        L_0x006c:
            java.lang.String r3 = "custom_message"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 12
            goto L_0x00f7
        L_0x0078:
            java.lang.String r3 = "upcoming_concerts"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 5
            goto L_0x00f7
        L_0x0083:
            java.lang.String r3 = "merch"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 6
            goto L_0x00f7
        L_0x008e:
            java.lang.String r3 = "biography"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 8
            goto L_0x00f7
        L_0x0099:
            java.lang.String r3 = "info"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 1
            goto L_0x00f7
        L_0x00a3:
            java.lang.String r3 = "uri"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 0
            goto L_0x00f7
        L_0x00ad:
            java.lang.String r3 = "monthly_listeners"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 13
            goto L_0x00f7
        L_0x00b8:
            java.lang.String r3 = "gallery"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 3
            goto L_0x00f7
        L_0x00c2:
            java.lang.String r3 = "releases"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 9
            goto L_0x00f7
        L_0x00cd:
            java.lang.String r3 = "top_tracks"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 4
            goto L_0x00f7
        L_0x00d7:
            java.lang.String r3 = "related_artists"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 7
            goto L_0x00f7
        L_0x00e1:
            java.lang.String r3 = "latest_release"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 10
            goto L_0x00f7
        L_0x00ec:
            java.lang.String r3 = "header_image"
            boolean r0 = r0.equals(r3)     // Catch:{ RuntimeException -> 0x027a }
            if (r0 == 0) goto L_0x00f6
            r0 = 2
            goto L_0x00f7
        L_0x00f6:
            r0 = -1
        L_0x00f7:
            switch(r0) {
                case 0: goto L_0x0265;
                case 1: goto L_0x025d;
                case 2: goto L_0x01e8;
                case 3: goto L_0x018f;
                case 4: goto L_0x0162;
                case 5: goto L_0x0159;
                case 6: goto L_0x0150;
                case 7: goto L_0x0147;
                case 8: goto L_0x013e;
                case 9: goto L_0x0135;
                case 10: goto L_0x012c;
                case 11: goto L_0x0123;
                case 12: goto L_0x011a;
                case 13: goto L_0x0111;
                case 14: goto L_0x0108;
                case 15: goto L_0x00ff;
                default: goto L_0x00fa;
            }     // Catch:{ RuntimeException -> 0x027a }
        L_0x00fa:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x026d
        L_0x00ff:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            com.spotify.music.artist.model.ArtistsPick r19 = r22.e(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x001e
        L_0x0108:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            com.spotify.music.artist.model.ArtistModel$CreatorAbout r18 = r22.g(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x001e
        L_0x0111:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            com.spotify.music.artist.model.ArtistModel$MonthlyListeners r17 = r22.w(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x001e
        L_0x011a:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            com.spotify.music.artist.model.ArtistModel$CustomMessage r16 = r22.h(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x001e
        L_0x0123:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            java.util.Map r15 = r22.t(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x001e
        L_0x012c:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            com.spotify.music.artist.model.Release r14 = r22.y(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x001e
        L_0x0135:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            com.spotify.music.artist.model.Releases r13 = r22.z(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x001e
        L_0x013e:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            java.util.Map r12 = r22.u(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x001e
        L_0x0147:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            java.util.Map r11 = r22.q(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x001e
        L_0x0150:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            java.util.Map r10 = r22.s(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x001e
        L_0x0159:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            java.util.Map r9 = r22.r(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x001e
        L_0x0162:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r0 = r23.getCurrentToken()     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x027a }
            if (r0 != r1) goto L_0x0170
            r8 = r2
            goto L_0x001e
        L_0x0170:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ RuntimeException -> 0x027a }
            r0.<init>()     // Catch:{ RuntimeException -> 0x027a }
        L_0x0175:
            com.fasterxml.jackson.core.JsonToken r1 = r23.nextToken()     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x027a }
            if (r1 == r3) goto L_0x018c
            java.lang.String r1 = r22.B(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            java.util.List r3 = r22.p(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            r0.put(r1, r3)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x0175
        L_0x018c:
            r8 = r0
            goto L_0x001e
        L_0x018f:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r0 = r23.getCurrentToken()     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x027a }
            if (r0 != r3) goto L_0x019d
            r7 = r2
            goto L_0x0270
        L_0x019d:
            r0 = r2
        L_0x019e:
            com.fasterxml.jackson.core.JsonToken r3 = r23.nextToken()     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r7 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x027a }
            if (r3 == r7) goto L_0x01e0
            int[] r3 = com.spotify.music.artist.model.ArtistModel_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r7 = r23.getCurrentToken()     // Catch:{ RuntimeException -> 0x027a }
            int r7 = r7.ordinal()     // Catch:{ RuntimeException -> 0x027a }
            r3 = r3[r7]     // Catch:{ RuntimeException -> 0x027a }
            if (r3 == r1) goto L_0x01b5
            goto L_0x01d6
        L_0x01b5:
            java.lang.String r3 = r23.getCurrentName()     // Catch:{ RuntimeException -> 0x027a }
            int r7 = r3.hashCode()     // Catch:{ RuntimeException -> 0x027a }
            r2 = -1185250696(0xffffffffb95a8278, float:-2.0838703E-4)
            if (r7 == r2) goto L_0x01c3
            goto L_0x01cd
        L_0x01c3:
            java.lang.String r2 = "images"
            boolean r2 = r3.equals(r2)     // Catch:{ RuntimeException -> 0x027a }
            if (r2 == 0) goto L_0x01cd
            r2 = 0
            goto L_0x01ce
        L_0x01cd:
            r2 = -1
        L_0x01ce:
            if (r2 == 0) goto L_0x01d8
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            r23.skipChildren()     // Catch:{ RuntimeException -> 0x027a }
        L_0x01d6:
            r2 = 0
            goto L_0x019e
        L_0x01d8:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            java.util.List r0 = r22.l(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x01d6
        L_0x01e0:
            com.spotify.music.artist.model.ArtistModel$ArtistGallery r1 = new com.spotify.music.artist.model.ArtistModel$ArtistGallery     // Catch:{ RuntimeException -> 0x027a }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x027a }
            r7 = r1
            goto L_0x0270
        L_0x01e8:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r0 = r23.getCurrentToken()     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ RuntimeException -> 0x027a }
            if (r0 != r2) goto L_0x01f6
            r6 = 0
            goto L_0x0270
        L_0x01f6:
            r0 = 0
            r2 = 0
        L_0x01f8:
            com.fasterxml.jackson.core.JsonToken r3 = r23.nextToken()     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ RuntimeException -> 0x027a }
            if (r3 == r6) goto L_0x0256
            int[] r3 = com.spotify.music.artist.model.ArtistModel_Deserializer.AnonymousClass1.a     // Catch:{ RuntimeException -> 0x027a }
            com.fasterxml.jackson.core.JsonToken r6 = r23.getCurrentToken()     // Catch:{ RuntimeException -> 0x027a }
            int r6 = r6.ordinal()     // Catch:{ RuntimeException -> 0x027a }
            r3 = r3[r6]     // Catch:{ RuntimeException -> 0x027a }
            if (r3 == r1) goto L_0x0210
            r3 = 1
            goto L_0x0243
        L_0x0210:
            java.lang.String r3 = r23.getCurrentName()     // Catch:{ RuntimeException -> 0x027a }
            int r6 = r3.hashCode()     // Catch:{ RuntimeException -> 0x027a }
            r1 = -1019779949(0xffffffffc3376493, float:-183.39287)
            if (r6 == r1) goto L_0x022d
            r1 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r6 == r1) goto L_0x0223
            goto L_0x0237
        L_0x0223:
            java.lang.String r1 = "image"
            boolean r1 = r3.equals(r1)     // Catch:{ RuntimeException -> 0x027a }
            if (r1 == 0) goto L_0x0237
            r1 = 0
            goto L_0x0238
        L_0x022d:
            java.lang.String r1 = "offset"
            boolean r1 = r3.equals(r1)     // Catch:{ RuntimeException -> 0x027a }
            if (r1 == 0) goto L_0x0237
            r1 = 1
            goto L_0x0238
        L_0x0237:
            r1 = -1
        L_0x0238:
            if (r1 == 0) goto L_0x024d
            r3 = 1
            if (r1 == r3) goto L_0x0245
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            r23.skipChildren()     // Catch:{ RuntimeException -> 0x027a }
        L_0x0243:
            r1 = 1
            goto L_0x01f8
        L_0x0245:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            int r0 = b(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x0243
        L_0x024d:
            r3 = 1
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            java.lang.String r2 = r22.B(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x0243
        L_0x0256:
            com.spotify.music.artist.model.ArtistModel$HeaderImage r1 = new com.spotify.music.artist.model.ArtistModel$HeaderImage     // Catch:{ RuntimeException -> 0x027a }
            r1.<init>(r2, r0)     // Catch:{ RuntimeException -> 0x027a }
            r6 = r1
            goto L_0x0270
        L_0x025d:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            com.spotify.music.artist.model.ArtistModel$ArtistInfo r5 = r22.d(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x0270
        L_0x0265:
            r23.nextValue()     // Catch:{ RuntimeException -> 0x027a }
            java.lang.String r4 = r22.B(r23, r24)     // Catch:{ RuntimeException -> 0x027a }
            goto L_0x0270
        L_0x026d:
            r23.skipChildren()     // Catch:{ RuntimeException -> 0x027a }
        L_0x0270:
            r2 = 0
            goto L_0x001e
        L_0x0273:
            com.spotify.music.artist.model.ArtistModel r0 = new com.spotify.music.artist.model.ArtistModel     // Catch:{ RuntimeException -> 0x027a }
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ RuntimeException -> 0x027a }
            return r0
        L_0x027a:
            r0 = move-exception
        L_0x027b:
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0286
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x027b
        L_0x0286:
            java.lang.String r1 = r0.getMessage()
            r2 = r24
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.from(r2, r1, r0)
            goto L_0x0292
        L_0x0291:
            throw r0
        L_0x0292:
            goto L_0x0291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.artist.model.ArtistModel_Deserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.artist.model.ArtistModel");
    }

    private ArtistInfo d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str2 = null;
        List list = null;
        boolean z = false;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1994383672:
                        if (currentName.equals("verified")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 116076:
                        if (currentName.equals("uri")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3373707:
                        if (currentName.equals("name")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1132443704:
                        if (currentName.equals("portraits")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    str = B(jsonParser, deserializationContext);
                } else if (c == 1) {
                    jsonParser.nextValue();
                    str2 = B(jsonParser, deserializationContext);
                } else if (c == 2) {
                    jsonParser.nextValue();
                    list = l(jsonParser, deserializationContext);
                } else if (c != 3) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    z = a(jsonParser, deserializationContext);
                }
            }
        }
        return new ArtistInfo(str, str2, list, z);
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.artist.model.ArtistsPick e(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12) {
        /*
            r10 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r11.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = r2
            r1 = r0
            r3 = r1
        L_0x000d:
            com.fasterxml.jackson.core.JsonToken r4 = r11.nextToken()
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r4 == r5) goto L_0x008c
            int[] r4 = com.spotify.music.artist.model.ArtistModel_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r5 = r11.getCurrentToken()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L_0x0025
            goto L_0x000d
        L_0x0025:
            java.lang.String r4 = r11.getCurrentName()
            r6 = -1
            int r7 = r4.hashCode()
            r8 = 3
            r9 = 2
            switch(r7) {
                case -2060497896: goto L_0x0052;
                case 116076: goto L_0x0048;
                case 100313435: goto L_0x003e;
                case 110371416: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x005c
        L_0x0034:
            java.lang.String r7 = "title"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 0
            goto L_0x005d
        L_0x003e:
            java.lang.String r7 = "image"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 3
            goto L_0x005d
        L_0x0048:
            java.lang.String r7 = "uri"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 2
            goto L_0x005d
        L_0x0052:
            java.lang.String r7 = "subtitle"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 1
            goto L_0x005d
        L_0x005c:
            r4 = -1
        L_0x005d:
            if (r4 == 0) goto L_0x0084
            if (r4 == r5) goto L_0x007c
            if (r4 == r9) goto L_0x0074
            if (r4 == r8) goto L_0x006c
            r11.nextValue()
            r11.skipChildren()
            goto L_0x000d
        L_0x006c:
            r11.nextValue()
            java.lang.String r3 = r10.B(r11, r12)
            goto L_0x000d
        L_0x0074:
            r11.nextValue()
            java.lang.String r1 = r10.B(r11, r12)
            goto L_0x000d
        L_0x007c:
            r11.nextValue()
            java.lang.String r0 = r10.B(r11, r12)
            goto L_0x000d
        L_0x0084:
            r11.nextValue()
            java.lang.String r2 = r10.B(r11, r12)
            goto L_0x000d
        L_0x008c:
            com.spotify.music.artist.model.ArtistsPick r11 = new com.spotify.music.artist.model.ArtistsPick
            r11.<init>(r2, r0, r1, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.artist.model.ArtistModel_Deserializer.e(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.artist.model.ArtistsPick");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.artist.model.ArtistModel.Concert f(com.fasterxml.jackson.core.JsonParser r13, com.fasterxml.jackson.databind.DeserializationContext r14) {
        /*
            r12 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r13.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x000f:
            com.fasterxml.jackson.core.JsonToken r0 = r13.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00a6
            int[] r0 = com.spotify.music.artist.model.ArtistModel_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r1 = r13.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0027
            goto L_0x000f
        L_0x0027:
            java.lang.String r0 = r13.getCurrentName()
            r2 = -1
            int r3 = r0.hashCode()
            r9 = 4
            r10 = 3
            r11 = 2
            switch(r3) {
                case -1204255560: goto L_0x005f;
                case 3355: goto L_0x0055;
                case 3053931: goto L_0x004b;
                case 110371416: goto L_0x0041;
                case 112093807: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0069
        L_0x0037:
            java.lang.String r3 = "venue"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0069
            r0 = 3
            goto L_0x006a
        L_0x0041:
            java.lang.String r3 = "title"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0069
            r0 = 0
            goto L_0x006a
        L_0x004b:
            java.lang.String r3 = "city"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0069
            r0 = 4
            goto L_0x006a
        L_0x0055:
            java.lang.String r3 = "id"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0069
            r0 = 1
            goto L_0x006a
        L_0x005f:
            java.lang.String r3 = "localtime"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0069
            r0 = 2
            goto L_0x006a
        L_0x0069:
            r0 = -1
        L_0x006a:
            if (r0 == 0) goto L_0x009d
            if (r0 == r1) goto L_0x0094
            if (r0 == r11) goto L_0x008b
            if (r0 == r10) goto L_0x0083
            if (r0 == r9) goto L_0x007b
            r13.nextValue()
            r13.skipChildren()
            goto L_0x000f
        L_0x007b:
            r13.nextValue()
            java.lang.String r8 = r12.B(r13, r14)
            goto L_0x000f
        L_0x0083:
            r13.nextValue()
            java.lang.String r7 = r12.B(r13, r14)
            goto L_0x000f
        L_0x008b:
            r13.nextValue()
            java.lang.String r6 = r12.B(r13, r14)
            goto L_0x000f
        L_0x0094:
            r13.nextValue()
            java.lang.String r5 = r12.B(r13, r14)
            goto L_0x000f
        L_0x009d:
            r13.nextValue()
            java.lang.String r4 = r12.B(r13, r14)
            goto L_0x000f
        L_0x00a6:
            com.spotify.music.artist.model.ArtistModel$Concert r13 = new com.spotify.music.artist.model.ArtistModel$Concert
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.artist.model.ArtistModel_Deserializer.f(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.artist.model.ArtistModel$Concert");
    }

    private CreatorAbout g(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int hashCode = currentName.hashCode();
                if (hashCode != -1206574926) {
                    if (hashCode == 1972143172 && currentName.equals("globalChartPosition")) {
                        c = 1;
                    }
                } else if (currentName.equals("monthlyListeners")) {
                    c = 0;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    i = b(jsonParser, deserializationContext);
                } else if (c != 1) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    i2 = b(jsonParser, deserializationContext);
                }
            }
        }
        return new CreatorAbout(i, i2);
    }

    private CustomMessage h(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                if (currentName.hashCode() == 1253013930 && currentName.equals("body_text")) {
                    c = 0;
                }
                if (c != 0) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    str = B(jsonParser, deserializationContext);
                }
            }
        }
        return new CustomMessage(str);
    }

    private Image i(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                int hashCode = currentName.hashCode();
                if (hashCode != -1221029593) {
                    if (hashCode != 116076) {
                        if (hashCode == 113126854 && currentName.equals("width")) {
                            c = 1;
                        }
                    } else if (currentName.equals("uri")) {
                        c = 0;
                    }
                } else if (currentName.equals("height")) {
                    c = 2;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    str = B(jsonParser, deserializationContext);
                } else if (c == 1) {
                    jsonParser.nextValue();
                    i = b(jsonParser, deserializationContext);
                } else if (c != 2) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    i2 = b(jsonParser, deserializationContext);
                }
            }
        }
        return new Image(str, i, i2);
    }

    private List<ArtistInfo> j(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(d(jsonParser, deserializationContext));
        }
        return linkedList;
    }

    private List<Concert> k(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(f(jsonParser, deserializationContext));
        }
        return linkedList;
    }

    private List<Image> l(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(i(jsonParser, deserializationContext));
        }
        return linkedList;
    }

    private List<MerchandiseItem> m(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(v(jsonParser, deserializationContext));
        }
        return linkedList;
    }

    private List<Playlist> n(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(x(jsonParser, deserializationContext));
        }
        return linkedList;
    }

    private List<Release> o(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(y(jsonParser, deserializationContext));
        }
        return linkedList;
    }

    private List<Track> p(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(C(jsonParser, deserializationContext));
        }
        return linkedList;
    }

    private Map<String, List<ArtistInfo>> q(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String B = B(jsonParser, deserializationContext);
            jsonParser.nextValue();
            hashMap.put(B, j(jsonParser, deserializationContext));
        }
        return hashMap;
    }

    private Map<String, List<Concert>> r(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String B = B(jsonParser, deserializationContext);
            jsonParser.nextValue();
            hashMap.put(B, k(jsonParser, deserializationContext));
        }
        return hashMap;
    }

    private Map<String, List<MerchandiseItem>> s(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String B = B(jsonParser, deserializationContext);
            jsonParser.nextValue();
            hashMap.put(B, m(jsonParser, deserializationContext));
        }
        return hashMap;
    }

    private Map<String, List<Playlist>> t(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String B = B(jsonParser, deserializationContext);
            jsonParser.nextValue();
            hashMap.put(B, n(jsonParser, deserializationContext));
        }
        return hashMap;
    }

    private Map<String, String> u(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String B = B(jsonParser, deserializationContext);
            jsonParser.nextValue();
            hashMap.put(B, B(jsonParser, deserializationContext));
        }
        return hashMap;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.artist.model.ArtistModel.MerchandiseItem v(com.fasterxml.jackson.core.JsonParser r13, com.fasterxml.jackson.databind.DeserializationContext r14) {
        /*
            r12 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r13.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x000f:
            com.fasterxml.jackson.core.JsonToken r0 = r13.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00a6
            int[] r0 = com.spotify.music.artist.model.ArtistModel_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r1 = r13.getCurrentToken()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0027
            goto L_0x000f
        L_0x0027:
            java.lang.String r0 = r13.getCurrentName()
            r2 = -1
            int r3 = r0.hashCode()
            r9 = 4
            r10 = 3
            r11 = 2
            switch(r3) {
                case -1724546052: goto L_0x005f;
                case -877823864: goto L_0x0055;
                case 3321850: goto L_0x004b;
                case 3373707: goto L_0x0041;
                case 3601339: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0069
        L_0x0037:
            java.lang.String r3 = "uuid"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0069
            r0 = 0
            goto L_0x006a
        L_0x0041:
            java.lang.String r3 = "name"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0069
            r0 = 1
            goto L_0x006a
        L_0x004b:
            java.lang.String r3 = "link"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0069
            r0 = 4
            goto L_0x006a
        L_0x0055:
            java.lang.String r3 = "image_uri"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0069
            r0 = 3
            goto L_0x006a
        L_0x005f:
            java.lang.String r3 = "description"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0069
            r0 = 2
            goto L_0x006a
        L_0x0069:
            r0 = -1
        L_0x006a:
            if (r0 == 0) goto L_0x009d
            if (r0 == r1) goto L_0x0094
            if (r0 == r11) goto L_0x008b
            if (r0 == r10) goto L_0x0083
            if (r0 == r9) goto L_0x007b
            r13.nextValue()
            r13.skipChildren()
            goto L_0x000f
        L_0x007b:
            r13.nextValue()
            java.lang.String r8 = r12.B(r13, r14)
            goto L_0x000f
        L_0x0083:
            r13.nextValue()
            java.lang.String r7 = r12.B(r13, r14)
            goto L_0x000f
        L_0x008b:
            r13.nextValue()
            java.lang.String r6 = r12.B(r13, r14)
            goto L_0x000f
        L_0x0094:
            r13.nextValue()
            java.lang.String r5 = r12.B(r13, r14)
            goto L_0x000f
        L_0x009d:
            r13.nextValue()
            java.lang.String r4 = r12.B(r13, r14)
            goto L_0x000f
        L_0x00a6:
            com.spotify.music.artist.model.ArtistModel$MerchandiseItem r13 = new com.spotify.music.artist.model.ArtistModel$MerchandiseItem
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.artist.model.ArtistModel_Deserializer.v(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.artist.model.ArtistModel$MerchandiseItem");
    }

    private MonthlyListeners w(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                if (currentName.hashCode() == 1379869124 && currentName.equals("listener_count")) {
                    c = 0;
                }
                if (c != 0) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    str = B(jsonParser, deserializationContext);
                }
            }
        }
        return new MonthlyListeners(str);
    }

    private Playlist x(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str2 = null;
        Image image = null;
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.a[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -2107390546:
                        if (currentName.equals("follower_count")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 116076:
                        if (currentName.equals("uri")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3373707:
                        if (currentName.equals("name")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 94852023:
                        if (currentName.equals("cover")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    jsonParser.nextValue();
                    str = B(jsonParser, deserializationContext);
                } else if (c == 1) {
                    jsonParser.nextValue();
                    str2 = B(jsonParser, deserializationContext);
                } else if (c == 2) {
                    jsonParser.nextValue();
                    image = i(jsonParser, deserializationContext);
                } else if (c != 3) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    i = b(jsonParser, deserializationContext);
                }
            }
        }
        return new Playlist(str, str2, image, i);
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.artist.model.Release y(com.fasterxml.jackson.core.JsonParser r13, com.fasterxml.jackson.databind.DeserializationContext r14) {
        /*
            r12 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r13.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0012:
            com.fasterxml.jackson.core.JsonToken r1 = r13.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r2) goto L_0x00c6
            int[] r1 = com.spotify.music.artist.model.ArtistModel_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r2 = r13.getCurrentToken()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x002a
            goto L_0x0012
        L_0x002a:
            java.lang.String r1 = r13.getCurrentName()
            r3 = -1
            int r11 = r1.hashCode()
            switch(r11) {
                case 99228: goto L_0x0073;
                case 116076: goto L_0x0069;
                case 3373707: goto L_0x005f;
                case 3704893: goto L_0x0055;
                case 94852023: goto L_0x004b;
                case 104080000: goto L_0x0041;
                case 1582711067: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x007d
        L_0x0037:
            java.lang.String r2 = "track_count"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007d
            r1 = 6
            goto L_0x007e
        L_0x0041:
            java.lang.String r2 = "month"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007d
            r1 = 4
            goto L_0x007e
        L_0x004b:
            java.lang.String r2 = "cover"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007d
            r1 = 2
            goto L_0x007e
        L_0x0055:
            java.lang.String r2 = "year"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007d
            r1 = 3
            goto L_0x007e
        L_0x005f:
            java.lang.String r11 = "name"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x007d
            r1 = 1
            goto L_0x007e
        L_0x0069:
            java.lang.String r2 = "uri"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007d
            r1 = 0
            goto L_0x007e
        L_0x0073:
            java.lang.String r2 = "day"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007d
            r1 = 5
            goto L_0x007e
        L_0x007d:
            r1 = -1
        L_0x007e:
            switch(r1) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00b4;
                case 2: goto L_0x00ab;
                case 3: goto L_0x00a2;
                case 4: goto L_0x0099;
                case 5: goto L_0x0090;
                case 6: goto L_0x0088;
                default: goto L_0x0081;
            }
        L_0x0081:
            r13.nextValue()
            r13.skipChildren()
            goto L_0x0012
        L_0x0088:
            r13.nextValue()
            int r10 = b(r13, r14)
            goto L_0x0012
        L_0x0090:
            r13.nextValue()
            int r9 = b(r13, r14)
            goto L_0x0012
        L_0x0099:
            r13.nextValue()
            int r8 = b(r13, r14)
            goto L_0x0012
        L_0x00a2:
            r13.nextValue()
            int r7 = b(r13, r14)
            goto L_0x0012
        L_0x00ab:
            r13.nextValue()
            com.spotify.music.artist.model.Image r6 = r12.i(r13, r14)
            goto L_0x0012
        L_0x00b4:
            r13.nextValue()
            java.lang.String r5 = r12.B(r13, r14)
            goto L_0x0012
        L_0x00bd:
            r13.nextValue()
            java.lang.String r4 = r12.B(r13, r14)
            goto L_0x0012
        L_0x00c6:
            com.spotify.music.artist.model.Release r13 = new com.spotify.music.artist.model.Release
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.artist.model.ArtistModel_Deserializer.y(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.artist.model.Release");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.music.artist.model.Releases z(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12) {
        /*
            r10 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r11.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = r2
            r1 = r0
            r3 = r1
        L_0x000d:
            com.fasterxml.jackson.core.JsonToken r4 = r11.nextToken()
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r4 == r5) goto L_0x008c
            int[] r4 = com.spotify.music.artist.model.ArtistModel_Deserializer.AnonymousClass1.a
            com.fasterxml.jackson.core.JsonToken r5 = r11.getCurrentToken()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L_0x0025
            goto L_0x000d
        L_0x0025:
            java.lang.String r4 = r11.getCurrentName()
            r6 = -1
            int r7 = r4.hashCode()
            r8 = 3
            r9 = 2
            switch(r7) {
                case -1415163932: goto L_0x0052;
                case 44612368: goto L_0x0048;
                case 1797239872: goto L_0x003e;
                case 2094531883: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x005c
        L_0x0034:
            java.lang.String r7 = "singles"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 1
            goto L_0x005d
        L_0x003e:
            java.lang.String r7 = "appears_on"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 2
            goto L_0x005d
        L_0x0048:
            java.lang.String r7 = "compilations"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 3
            goto L_0x005d
        L_0x0052:
            java.lang.String r7 = "albums"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x005c
            r4 = 0
            goto L_0x005d
        L_0x005c:
            r4 = -1
        L_0x005d:
            if (r4 == 0) goto L_0x0084
            if (r4 == r5) goto L_0x007c
            if (r4 == r9) goto L_0x0074
            if (r4 == r8) goto L_0x006c
            r11.nextValue()
            r11.skipChildren()
            goto L_0x000d
        L_0x006c:
            r11.nextValue()
            com.spotify.music.artist.model.ReleasesWithTotalCount r3 = r10.A(r11, r12)
            goto L_0x000d
        L_0x0074:
            r11.nextValue()
            com.spotify.music.artist.model.ReleasesWithTotalCount r1 = r10.A(r11, r12)
            goto L_0x000d
        L_0x007c:
            r11.nextValue()
            com.spotify.music.artist.model.ReleasesWithTotalCount r0 = r10.A(r11, r12)
            goto L_0x000d
        L_0x0084:
            r11.nextValue()
            com.spotify.music.artist.model.ReleasesWithTotalCount r2 = r10.A(r11, r12)
            goto L_0x000d
        L_0x008c:
            com.spotify.music.artist.model.Releases r11 = new com.spotify.music.artist.model.Releases
            r11.<init>(r2, r0, r1, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.artist.model.ArtistModel_Deserializer.z(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.artist.model.Releases");
    }

    public final boolean isCachable() {
        return true;
    }
}
