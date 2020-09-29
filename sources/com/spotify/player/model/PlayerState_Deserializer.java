package com.spotify.player.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PlayerState_Deserializer extends StdDeserializer<PlayerState> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.player.model.PlayerState_Deserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];

        static {
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    PlayerState_Deserializer() {
        super(PlayerState.class);
    }

    public final Double _deserializeDouble(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return (Double) NumberDeserializers.find(Double.class, "java.lang.Double").deserialize(jsonParser, deserializationContext);
    }

    public final Long _deserializeLong(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return (Long) NumberDeserializers.find(Long.class, "java.lang.Long").deserialize(jsonParser, deserializationContext);
    }

    public final boolean _deserializeboolean(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    public final long _deserializelong(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Long) NumberDeserializers.find(Long.TYPE, "long").deserialize(jsonParser, deserializationContext)).longValue();
    }

    public final PlayerState deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            return deserializePlayerState(jsonParser, deserializationContext);
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }

    public final AudioStream deserializeAudioStreamEnum(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        if (jsonParser.getCurrentToken() != JsonToken.VALUE_STRING) {
            return (AudioStream) deserializationContext.handleUnexpectedToken(AudioStream.class, jsonParser);
        }
        String text = jsonParser.getText();
        char c = 65535;
        int hashCode = text.hashCode();
        if (hashCode != 92895825) {
            if (hashCode == 1544803905 && text.equals("default")) {
                c = 0;
            }
        } else if (text.equals("alarm")) {
            c = 1;
        }
        return c != 0 ? c != 1 ? AudioStream.valueOf(text) : AudioStream.ALARM : AudioStream.DEFAULT;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.player.model.ContextIndex deserializeContextIndex(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11) {
        /*
            r9 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r10.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x000a
            r10 = 0
            return r10
        L_0x000a:
            r0 = 0
            r2 = r0
        L_0x000d:
            com.fasterxml.jackson.core.JsonToken r4 = r10.nextToken()
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r4 == r5) goto L_0x0069
            int[] r4 = com.spotify.player.model.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r5 = r10.getCurrentToken()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L_0x0025
            goto L_0x000d
        L_0x0025:
            java.lang.String r4 = r10.getCurrentName()
            r6 = -1
            int r7 = r4.hashCode()
            r8 = 3433103(0x34628f, float:4.810802E-39)
            if (r7 == r8) goto L_0x0043
            r8 = 110621003(0x697f14b, float:5.7154435E-35)
            if (r7 == r8) goto L_0x0039
            goto L_0x004d
        L_0x0039:
            java.lang.String r7 = "track"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x0043:
            java.lang.String r7 = "page"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x004d
            r4 = 0
            goto L_0x004e
        L_0x004d:
            r4 = -1
        L_0x004e:
            if (r4 == 0) goto L_0x0061
            if (r4 == r5) goto L_0x0059
            r10.nextValue()
            r10.skipChildren()
            goto L_0x000d
        L_0x0059:
            r10.nextValue()
            long r2 = r9._deserializelong(r10, r11)
            goto L_0x000d
        L_0x0061:
            r10.nextValue()
            long r0 = r9._deserializelong(r10, r11)
            goto L_0x000d
        L_0x0069:
            com.spotify.player.model.ContextIndex r10 = com.spotify.player.model.ContextIndex.create(r0, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.model.PlayerState_Deserializer.deserializeContextIndex(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.player.model.ContextIndex");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.player.model.ContextTrack deserializeContextTrack(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9) {
        /*
            r7 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r8.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x000a
            r8 = 0
            return r8
        L_0x000a:
            com.spotify.player.model.ContextTrack$Builder r0 = com.spotify.player.model.ContextTrack.Builder.builder()
        L_0x000e:
            com.fasterxml.jackson.core.JsonToken r1 = r8.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r2) goto L_0x009a
            int[] r1 = com.spotify.player.model.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r2 = r8.getCurrentToken()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0026
            goto L_0x000e
        L_0x0026:
            java.lang.String r1 = r8.getCurrentName()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 3
            r6 = 2
            switch(r4) {
                case -987494927: goto L_0x0053;
                case -450004177: goto L_0x0049;
                case 115792: goto L_0x003f;
                case 116076: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x005d
        L_0x0035:
            java.lang.String r4 = "uri"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x005d
            r1 = 0
            goto L_0x005e
        L_0x003f:
            java.lang.String r4 = "uid"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x005d
            r1 = 1
            goto L_0x005e
        L_0x0049:
            java.lang.String r4 = "metadata"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x005d
            r1 = 2
            goto L_0x005e
        L_0x0053:
            java.lang.String r4 = "provider"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x005d
            r1 = 3
            goto L_0x005e
        L_0x005d:
            r1 = -1
        L_0x005e:
            if (r1 == 0) goto L_0x008e
            if (r1 == r2) goto L_0x0083
            if (r1 == r6) goto L_0x0078
            if (r1 == r5) goto L_0x006d
            r8.nextValue()
            r8.skipChildren()
            goto L_0x000e
        L_0x006d:
            r8.nextValue()
            java.lang.String r1 = r7.deserializeString(r8, r9)
            r0.provider(r1)
            goto L_0x000e
        L_0x0078:
            r8.nextValue()
            java.util.Map r1 = r7.deserializeMapStringString(r8, r9)
            r0.metadata(r1)
            goto L_0x000e
        L_0x0083:
            r8.nextValue()
            java.lang.String r1 = r7.deserializeString(r8, r9)
            r0.uid(r1)
            goto L_0x000e
        L_0x008e:
            r8.nextValue()
            java.lang.String r1 = r7.deserializeString(r8, r9)
            r0.uri(r1)
            goto L_0x000e
        L_0x009a:
            com.spotify.player.model.ContextTrack r8 = r0.build()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.model.PlayerState_Deserializer.deserializeContextTrack(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.player.model.ContextTrack");
    }

    public final List<ContextTrack> deserializeListContextTrack(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(deserializeContextTrack(jsonParser, deserializationContext));
        }
        return linkedList;
    }

    public final Map<String, String> deserializeMapStringString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String deserializeString = deserializeString(jsonParser, deserializationContext);
            jsonParser.nextValue();
            hashMap.put(deserializeString, deserializeString(jsonParser, deserializationContext));
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r1.equals("feature_version") != false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.player.model.PlayOrigin deserializePlayOrigin(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.DeserializationContext r7) {
        /*
            r5 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r6.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x000a
            r6 = 0
            return r6
        L_0x000a:
            com.spotify.player.model.PlayOrigin$Builder r0 = com.spotify.player.model.PlayOrigin.Builder.builder()
        L_0x000e:
            com.fasterxml.jackson.core.JsonToken r1 = r6.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r2) goto L_0x00d6
            int[] r1 = com.spotify.player.model.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r2 = r6.getCurrentToken()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0026
            goto L_0x000e
        L_0x0026:
            java.lang.String r1 = r6.getCurrentName()
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1358351982: goto L_0x006e;
                case -1238715854: goto L_0x0064;
                case -1144002417: goto L_0x005b;
                case -641989667: goto L_0x0051;
                case 1006001683: goto L_0x0047;
                case 1163267273: goto L_0x003d;
                case 1196184786: goto L_0x0033;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x0078
        L_0x0033:
            java.lang.String r2 = "view_uri"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0078
            r2 = 2
            goto L_0x0079
        L_0x003d:
            java.lang.String r2 = "referrer_identifier"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0078
            r2 = 4
            goto L_0x0079
        L_0x0047:
            java.lang.String r2 = "external_referrer"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0078
            r2 = 3
            goto L_0x0079
        L_0x0051:
            java.lang.String r2 = "feature_classes"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0078
            r2 = 6
            goto L_0x0079
        L_0x005b:
            java.lang.String r4 = "feature_version"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0064:
            java.lang.String r2 = "device_identifier"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0078
            r2 = 5
            goto L_0x0079
        L_0x006e:
            java.lang.String r2 = "feature_identifier"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0078
            r2 = 0
            goto L_0x0079
        L_0x0078:
            r2 = -1
        L_0x0079:
            switch(r2) {
                case 0: goto L_0x00ca;
                case 1: goto L_0x00be;
                case 2: goto L_0x00b2;
                case 3: goto L_0x00a6;
                case 4: goto L_0x009a;
                case 5: goto L_0x008e;
                case 6: goto L_0x0083;
                default: goto L_0x007c;
            }
        L_0x007c:
            r6.nextValue()
            r6.skipChildren()
            goto L_0x000e
        L_0x0083:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.featureClasses(r1)
            goto L_0x000e
        L_0x008e:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.deviceIdentifier(r1)
            goto L_0x000e
        L_0x009a:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.referrerIdentifier(r1)
            goto L_0x000e
        L_0x00a6:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.externalReferrer(r1)
            goto L_0x000e
        L_0x00b2:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.viewUri(r1)
            goto L_0x000e
        L_0x00be:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.featureVersion(r1)
            goto L_0x000e
        L_0x00ca:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.featureIdentifier(r1)
            goto L_0x000e
        L_0x00d6:
            com.spotify.player.model.PlayOrigin r6 = r0.build()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.model.PlayerState_Deserializer.deserializePlayOrigin(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.player.model.PlayOrigin");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.player.model.PlayerOptions deserializePlayerOptions(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9) {
        /*
            r7 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r8.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x000a
            r8 = 0
            return r8
        L_0x000a:
            com.spotify.player.model.PlayerOptions$Builder r0 = com.spotify.player.model.PlayerOptions.Builder.builder()
        L_0x000e:
            com.fasterxml.jackson.core.JsonToken r1 = r8.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r2) goto L_0x008d
            int[] r1 = com.spotify.player.model.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r2 = r8.getCurrentToken()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0026
            goto L_0x000e
        L_0x0026:
            java.lang.String r1 = r8.getCurrentName()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = -1459599913(0xffffffffa90045d7, float:-2.8482286E-14)
            r6 = 2
            if (r4 == r5) goto L_0x0054
            r5 = -1400336410(0xffffffffac888fe6, float:-3.8813284E-12)
            if (r4 == r5) goto L_0x004a
            r5 = 45542259(0x2b6eb73, float:2.6877638E-37)
            if (r4 == r5) goto L_0x0040
            goto L_0x005e
        L_0x0040:
            java.lang.String r4 = "repeating_track"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x005e
            r1 = 2
            goto L_0x005f
        L_0x004a:
            java.lang.String r4 = "shuffling_context"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x005e
            r1 = 0
            goto L_0x005f
        L_0x0054:
            java.lang.String r4 = "repeating_context"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x005e
            r1 = 1
            goto L_0x005f
        L_0x005e:
            r1 = -1
        L_0x005f:
            if (r1 == 0) goto L_0x0082
            if (r1 == r2) goto L_0x0077
            if (r1 == r6) goto L_0x006c
            r8.nextValue()
            r8.skipChildren()
            goto L_0x000e
        L_0x006c:
            r8.nextValue()
            boolean r1 = r7._deserializeboolean(r8, r9)
            r0.repeatingTrack(r1)
            goto L_0x000e
        L_0x0077:
            r8.nextValue()
            boolean r1 = r7._deserializeboolean(r8, r9)
            r0.repeatingContext(r1)
            goto L_0x000e
        L_0x0082:
            r8.nextValue()
            boolean r1 = r7._deserializeboolean(r8, r9)
            r0.shufflingContext(r1)
            goto L_0x000e
        L_0x008d:
            com.spotify.player.model.PlayerOptions r8 = r0.build()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.model.PlayerState_Deserializer.deserializePlayerOptions(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.player.model.PlayerOptions");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00dc, code lost:
        if (r1.equals("context_uri") != false) goto L_0x014f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.player.model.PlayerState deserializePlayerState(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.DeserializationContext r7) {
        /*
            r5 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r6.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x000a
            r6 = 0
            return r6
        L_0x000a:
            com.spotify.player.model.PlayerState$Builder r0 = com.spotify.player.model.PlayerState.Builder.builder()
        L_0x000e:
            com.fasterxml.jackson.core.JsonToken r1 = r6.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r2) goto L_0x0286
            int[] r1 = com.spotify.player.model.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r2 = r6.getCurrentToken()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0026
            goto L_0x000e
        L_0x0026:
            java.lang.String r1 = r6.getCurrentName()
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1992012396: goto L_0x0143;
                case -1434528759: goto L_0x0138;
                case -1263170109: goto L_0x012d;
                case -1249593651: goto L_0x0122;
                case -1249474914: goto L_0x0117;
                case -1148295641: goto L_0x010c;
                case -1034196033: goto L_0x0101;
                case -541598063: goto L_0x00f7;
                case -531282461: goto L_0x00ec;
                case -175076016: goto L_0x00e0;
                case -102516004: goto L_0x00d6;
                case -102516001: goto L_0x00cb;
                case 55126294: goto L_0x00c0;
                case 100346066: goto L_0x00b5;
                case 110621003: goto L_0x00aa;
                case 557282121: goto L_0x009e;
                case 725855648: goto L_0x0092;
                case 1006746137: goto L_0x0086;
                case 1099846370: goto L_0x007a;
                case 1202375813: goto L_0x006e;
                case 1572272419: goto L_0x0062;
                case 1661853540: goto L_0x0056;
                case 1706303935: goto L_0x004b;
                case 1999813343: goto L_0x003f;
                case 2016513719: goto L_0x0034;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x014e
        L_0x0034:
            java.lang.String r2 = "context_restrictions"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 3
            goto L_0x014f
        L_0x003f:
            java.lang.String r2 = "page_metadata"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 21
            goto L_0x014f
        L_0x004b:
            java.lang.String r2 = "playback_id"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 7
            goto L_0x014f
        L_0x0056:
            java.lang.String r2 = "session_id"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 22
            goto L_0x014f
        L_0x0062:
            java.lang.String r2 = "playback_speed"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 8
            goto L_0x014f
        L_0x006e:
            java.lang.String r2 = "position_as_of_timestamp"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 9
            goto L_0x014f
        L_0x007a:
            java.lang.String r2 = "reverse"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 18
            goto L_0x014f
        L_0x0086:
            java.lang.String r2 = "is_playing"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 11
            goto L_0x014f
        L_0x0092:
            java.lang.String r2 = "suppressions"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 17
            goto L_0x014f
        L_0x009e:
            java.lang.String r2 = "queue_revision"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 23
            goto L_0x014f
        L_0x00aa:
            java.lang.String r2 = "track"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 6
            goto L_0x014f
        L_0x00b5:
            java.lang.String r2 = "index"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 5
            goto L_0x014f
        L_0x00c0:
            java.lang.String r2 = "timestamp"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 0
            goto L_0x014f
        L_0x00cb:
            java.lang.String r2 = "context_url"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 2
            goto L_0x014f
        L_0x00d6:
            java.lang.String r4 = "context_uri"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x014e
            goto L_0x014f
        L_0x00e0:
            java.lang.String r2 = "is_system_initiated"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 14
            goto L_0x014f
        L_0x00ec:
            java.lang.String r2 = "is_paused"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 12
            goto L_0x014f
        L_0x00f7:
            java.lang.String r2 = "play_origin"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 4
            goto L_0x014f
        L_0x0101:
            java.lang.String r2 = "context_metadata"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 20
            goto L_0x014f
        L_0x010c:
            java.lang.String r2 = "restrictions"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 16
            goto L_0x014f
        L_0x0117:
            java.lang.String r2 = "options"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 15
            goto L_0x014f
        L_0x0122:
            java.lang.String r2 = "is_buffering"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 13
            goto L_0x014f
        L_0x012d:
            java.lang.String r2 = "future"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 19
            goto L_0x014f
        L_0x0138:
            java.lang.String r2 = "audio_stream"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 24
            goto L_0x014f
        L_0x0143:
            java.lang.String r2 = "duration"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x014e
            r2 = 10
            goto L_0x014f
        L_0x014e:
            r2 = -1
        L_0x014f:
            switch(r2) {
                case 0: goto L_0x027a;
                case 1: goto L_0x026e;
                case 2: goto L_0x0262;
                case 3: goto L_0x0256;
                case 4: goto L_0x024a;
                case 5: goto L_0x023e;
                case 6: goto L_0x0232;
                case 7: goto L_0x0226;
                case 8: goto L_0x021a;
                case 9: goto L_0x020e;
                case 10: goto L_0x0202;
                case 11: goto L_0x01f6;
                case 12: goto L_0x01ea;
                case 13: goto L_0x01de;
                case 14: goto L_0x01d2;
                case 15: goto L_0x01c6;
                case 16: goto L_0x01ba;
                case 17: goto L_0x01ae;
                case 18: goto L_0x01a2;
                case 19: goto L_0x0196;
                case 20: goto L_0x018a;
                case 21: goto L_0x017e;
                case 22: goto L_0x0172;
                case 23: goto L_0x0166;
                case 24: goto L_0x015a;
                default: goto L_0x0152;
            }
        L_0x0152:
            r6.nextValue()
            r6.skipChildren()
            goto L_0x000e
        L_0x015a:
            r6.nextValue()
            com.spotify.player.model.AudioStream r1 = r5.deserializeAudioStreamEnum(r6, r7)
            r0.audioStream(r1)
            goto L_0x000e
        L_0x0166:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.queueRevision(r1)
            goto L_0x000e
        L_0x0172:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.sessionId(r1)
            goto L_0x000e
        L_0x017e:
            r6.nextValue()
            java.util.Map r1 = r5.deserializeMapStringString(r6, r7)
            r0.pageMetadata(r1)
            goto L_0x000e
        L_0x018a:
            r6.nextValue()
            java.util.Map r1 = r5.deserializeMapStringString(r6, r7)
            r0.contextMetadata(r1)
            goto L_0x000e
        L_0x0196:
            r6.nextValue()
            java.util.List r1 = r5.deserializeListContextTrack(r6, r7)
            r0.nextTracks(r1)
            goto L_0x000e
        L_0x01a2:
            r6.nextValue()
            java.util.List r1 = r5.deserializeListContextTrack(r6, r7)
            r0.prevTracks(r1)
            goto L_0x000e
        L_0x01ae:
            r6.nextValue()
            com.spotify.player.model.Suppressions r1 = r5.deserializeSuppressions(r6, r7)
            r0.suppressions(r1)
            goto L_0x000e
        L_0x01ba:
            r6.nextValue()
            com.spotify.player.model.Restrictions r1 = r5.deserializeRestrictions(r6, r7)
            r0.restrictions(r1)
            goto L_0x000e
        L_0x01c6:
            r6.nextValue()
            com.spotify.player.model.PlayerOptions r1 = r5.deserializePlayerOptions(r6, r7)
            r0.options(r1)
            goto L_0x000e
        L_0x01d2:
            r6.nextValue()
            boolean r1 = r5._deserializeboolean(r6, r7)
            r0.isSystemInitiated(r1)
            goto L_0x000e
        L_0x01de:
            r6.nextValue()
            boolean r1 = r5._deserializeboolean(r6, r7)
            r0.isBuffering(r1)
            goto L_0x000e
        L_0x01ea:
            r6.nextValue()
            boolean r1 = r5._deserializeboolean(r6, r7)
            r0.isPaused(r1)
            goto L_0x000e
        L_0x01f6:
            r6.nextValue()
            boolean r1 = r5._deserializeboolean(r6, r7)
            r0.isPlaying(r1)
            goto L_0x000e
        L_0x0202:
            r6.nextValue()
            java.lang.Long r1 = r5._deserializeLong(r6, r7)
            r0.duration(r1)
            goto L_0x000e
        L_0x020e:
            r6.nextValue()
            java.lang.Long r1 = r5._deserializeLong(r6, r7)
            r0.positionAsOfTimestamp(r1)
            goto L_0x000e
        L_0x021a:
            r6.nextValue()
            java.lang.Double r1 = r5._deserializeDouble(r6, r7)
            r0.playbackSpeed(r1)
            goto L_0x000e
        L_0x0226:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.playbackId(r1)
            goto L_0x000e
        L_0x0232:
            r6.nextValue()
            com.spotify.player.model.ContextTrack r1 = r5.deserializeContextTrack(r6, r7)
            r0.track(r1)
            goto L_0x000e
        L_0x023e:
            r6.nextValue()
            com.spotify.player.model.ContextIndex r1 = r5.deserializeContextIndex(r6, r7)
            r0.index(r1)
            goto L_0x000e
        L_0x024a:
            r6.nextValue()
            com.spotify.player.model.PlayOrigin r1 = r5.deserializePlayOrigin(r6, r7)
            r0.playOrigin(r1)
            goto L_0x000e
        L_0x0256:
            r6.nextValue()
            com.spotify.player.model.Restrictions r1 = r5.deserializeRestrictions(r6, r7)
            r0.contextRestrictions(r1)
            goto L_0x000e
        L_0x0262:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.contextUrl(r1)
            goto L_0x000e
        L_0x026e:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.contextUri(r1)
            goto L_0x000e
        L_0x027a:
            r6.nextValue()
            long r1 = r5._deserializelong(r6, r7)
            r0.timestamp(r1)
            goto L_0x000e
        L_0x0286:
            com.spotify.player.model.PlayerState r6 = r0.build()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.model.PlayerState_Deserializer.deserializePlayerState(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.player.model.PlayerState");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        if (r1.equals("disallow_resuming_reasons") != false) goto L_0x011e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.player.model.Restrictions deserializeRestrictions(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.DeserializationContext r7) {
        /*
            r5 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r6.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x000a
            r6 = 0
            return r6
        L_0x000a:
            com.spotify.player.model.Restrictions$Builder r0 = com.spotify.player.model.Restrictions.Builder.builder()
        L_0x000e:
            com.fasterxml.jackson.core.JsonToken r1 = r6.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r2) goto L_0x0225
            int[] r1 = com.spotify.player.model.PlayerState_Deserializer.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken
            com.fasterxml.jackson.core.JsonToken r2 = r6.getCurrentToken()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0026
            goto L_0x000e
        L_0x0026:
            java.lang.String r1 = r6.getCurrentName()
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -2121012819: goto L_0x0113;
                case -1973888603: goto L_0x0109;
                case -1911949152: goto L_0x00fe;
                case -1789485441: goto L_0x00f3;
                case -1672017761: goto L_0x00e8;
                case -1615712193: goto L_0x00de;
                case -1320270643: goto L_0x00d3;
                case -1240009448: goto L_0x00c8;
                case -1034829721: goto L_0x00bd;
                case -858216162: goto L_0x00b2;
                case -669786401: goto L_0x00a7;
                case -192233122: goto L_0x009d;
                case -155077117: goto L_0x0091;
                case 545385963: goto L_0x0085;
                case 665436397: goto L_0x007a;
                case 826925761: goto L_0x006e;
                case 1031561578: goto L_0x0062;
                case 1145967401: goto L_0x0056;
                case 1170737023: goto L_0x004b;
                case 1197453590: goto L_0x0040;
                case 1847746542: goto L_0x0034;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x011d
        L_0x0034:
            java.lang.String r2 = "disallow_reordering_in_context_tracks_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 17
            goto L_0x011e
        L_0x0040:
            java.lang.String r2 = "disallow_seeking_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 2
            goto L_0x011e
        L_0x004b:
            java.lang.String r2 = "disallow_peeking_prev_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 3
            goto L_0x011e
        L_0x0056:
            java.lang.String r2 = "disallow_removing_from_next_tracks_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 18
            goto L_0x011e
        L_0x0062:
            java.lang.String r2 = "disallow_updating_context_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 20
            goto L_0x011e
        L_0x006e:
            java.lang.String r2 = "disallow_toggling_repeat_track_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 8
            goto L_0x011e
        L_0x007a:
            java.lang.String r2 = "disallow_skipping_prev_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 5
            goto L_0x011e
        L_0x0085:
            java.lang.String r2 = "disallow_transferring_playback_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 12
            goto L_0x011e
        L_0x0091:
            java.lang.String r2 = "disallow_removing_from_context_tracks_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 19
            goto L_0x011e
        L_0x009d:
            java.lang.String r4 = "disallow_resuming_reasons"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x011d
            goto L_0x011e
        L_0x00a7:
            java.lang.String r2 = "disallow_pausing_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 0
            goto L_0x011e
        L_0x00b2:
            java.lang.String r2 = "disallow_reordering_in_next_tracks_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 16
            goto L_0x011e
        L_0x00bd:
            java.lang.String r2 = "disallow_interrupting_playback_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 11
            goto L_0x011e
        L_0x00c8:
            java.lang.String r2 = "disallow_remote_control_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 13
            goto L_0x011e
        L_0x00d3:
            java.lang.String r2 = "disallow_inserting_into_context_tracks_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 15
            goto L_0x011e
        L_0x00de:
            java.lang.String r2 = "disallow_peeking_next_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 4
            goto L_0x011e
        L_0x00e8:
            java.lang.String r2 = "disallow_inserting_into_next_tracks_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 14
            goto L_0x011e
        L_0x00f3:
            java.lang.String r2 = "disallow_toggling_shuffle_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 9
            goto L_0x011e
        L_0x00fe:
            java.lang.String r2 = "disallow_set_queue_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 10
            goto L_0x011e
        L_0x0109:
            java.lang.String r2 = "disallow_toggling_repeat_context_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 7
            goto L_0x011e
        L_0x0113:
            java.lang.String r2 = "disallow_skipping_next_reasons"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011d
            r2 = 6
            goto L_0x011e
        L_0x011d:
            r2 = -1
        L_0x011e:
            switch(r2) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020d;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01e9;
                case 5: goto L_0x01dd;
                case 6: goto L_0x01d1;
                case 7: goto L_0x01c5;
                case 8: goto L_0x01b9;
                case 9: goto L_0x01ad;
                case 10: goto L_0x01a1;
                case 11: goto L_0x0195;
                case 12: goto L_0x0189;
                case 13: goto L_0x017d;
                case 14: goto L_0x0171;
                case 15: goto L_0x0165;
                case 16: goto L_0x0159;
                case 17: goto L_0x014d;
                case 18: goto L_0x0141;
                case 19: goto L_0x0135;
                case 20: goto L_0x0129;
                default: goto L_0x0121;
            }
        L_0x0121:
            r6.nextValue()
            r6.skipChildren()
            goto L_0x000e
        L_0x0129:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowUpdatingContextReasons(r1)
            goto L_0x000e
        L_0x0135:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowRemovingFromContextTracksReasons(r1)
            goto L_0x000e
        L_0x0141:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowRemovingFromNextTracksReasons(r1)
            goto L_0x000e
        L_0x014d:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowReorderingInContextTracksReasons(r1)
            goto L_0x000e
        L_0x0159:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowReorderingInNextTracksReasons(r1)
            goto L_0x000e
        L_0x0165:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowInsertingIntoContextTracksReasons(r1)
            goto L_0x000e
        L_0x0171:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowInsertingIntoNextTracksReasons(r1)
            goto L_0x000e
        L_0x017d:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowRemoteControlReasons(r1)
            goto L_0x000e
        L_0x0189:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowTransferringPlaybackReasons(r1)
            goto L_0x000e
        L_0x0195:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowInterruptingPlaybackReasons(r1)
            goto L_0x000e
        L_0x01a1:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowSetQueueReasons(r1)
            goto L_0x000e
        L_0x01ad:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowTogglingShuffleReasons(r1)
            goto L_0x000e
        L_0x01b9:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowTogglingRepeatTrackReasons(r1)
            goto L_0x000e
        L_0x01c5:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowTogglingRepeatContextReasons(r1)
            goto L_0x000e
        L_0x01d1:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowSkippingNextReasons(r1)
            goto L_0x000e
        L_0x01dd:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowSkippingPrevReasons(r1)
            goto L_0x000e
        L_0x01e9:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowPeekingNextReasons(r1)
            goto L_0x000e
        L_0x01f5:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowPeekingPrevReasons(r1)
            goto L_0x000e
        L_0x0201:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowSeekingReasons(r1)
            goto L_0x000e
        L_0x020d:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowResumingReasons(r1)
            goto L_0x000e
        L_0x0219:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.disallowPausingReasons(r1)
            goto L_0x000e
        L_0x0225:
            com.spotify.player.model.Restrictions r6 = r0.build()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.model.PlayerState_Deserializer.deserializeRestrictions(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.player.model.Restrictions");
    }

    public final Set<String> deserializeSetString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        HashSet hashSet = new HashSet();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            hashSet.add(deserializeString(jsonParser, deserializationContext));
        }
        return hashSet;
    }

    public final String deserializeString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    public final Suppressions deserializeSuppressions(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Set set = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()] == 1) {
                String currentName = jsonParser.getCurrentName();
                char c = 65535;
                if (currentName.hashCode() == -547571550 && currentName.equals("providers")) {
                    c = 0;
                }
                if (c != 0) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    set = deserializeSetString(jsonParser, deserializationContext);
                }
            }
        }
        return Suppressions.create(set);
    }

    public final boolean isCachable() {
        return true;
    }
}
