package com.spotify.mobile.android.hubframework.model.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.Iterator;

public class HubsJsonComponentBundleDeserializer extends JsonDeserializer<HubsJsonComponentBundle> {
    private HubsImmutableComponentBundle a(JsonParser jsonParser) {
        a builder = HubsImmutableComponentBundle.builder();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            String currentName = jsonParser.getCurrentName();
            switch (currentToken) {
                case VALUE_STRING:
                    builder = builder.a(currentName, jsonParser.getText());
                    break;
                case VALUE_NUMBER_INT:
                    builder = builder.a(currentName, jsonParser.getLongValue());
                    break;
                case VALUE_NUMBER_FLOAT:
                    builder = builder.a(currentName, jsonParser.getDoubleValue());
                    break;
                case VALUE_FALSE:
                    builder = builder.a(currentName, false);
                    break;
                case VALUE_TRUE:
                    builder = builder.a(currentName, true);
                    break;
                case START_OBJECT:
                    builder = builder.a(currentName, (gzq) a(jsonParser));
                    break;
                case START_ARRAY:
                    String currentName2 = jsonParser.getCurrentName();
                    if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                        break;
                    } else {
                        switch (jsonParser.getCurrentToken()) {
                            case VALUE_STRING:
                                ArrayList arrayList = new ArrayList();
                                do {
                                    arrayList.add(jsonParser.getText());
                                } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                                builder = builder.a(currentName2, (String[]) arrayList.toArray(new String[0]));
                                break;
                            case VALUE_NUMBER_INT:
                                builder = builder.a(currentName2, d(jsonParser));
                                break;
                            case VALUE_NUMBER_FLOAT:
                                builder = builder.a(currentName2, c(jsonParser));
                                break;
                            case VALUE_FALSE:
                            case VALUE_TRUE:
                                builder = builder.a(currentName2, b(jsonParser));
                                break;
                            case START_OBJECT:
                                builder = builder.a(currentName2, (gzq[]) e(jsonParser));
                                break;
                        }
                    }
            }
        }
        return (HubsImmutableComponentBundle) builder.a();
    }

    private static boolean[] b(JsonParser jsonParser) {
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(Boolean.valueOf(jsonParser.getBooleanValue()));
        } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
        boolean[] zArr = new boolean[arrayList.size()];
        int i = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    private static double[] c(JsonParser jsonParser) {
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(Double.valueOf(jsonParser.getDoubleValue()));
        } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
        double[] dArr = new double[arrayList.size()];
        int i = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dArr[i] = ((Double) it.next()).doubleValue();
            i++;
        }
        return dArr;
    }

    private static long[] d(JsonParser jsonParser) {
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(Long.valueOf(jsonParser.getLongValue()));
        } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
        long[] jArr = new long[arrayList.size()];
        int i = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    private HubsImmutableComponentBundle[] e(JsonParser jsonParser) {
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(a(jsonParser));
        } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
        return (HubsImmutableComponentBundle[]) arrayList.toArray(new HubsImmutableComponentBundle[0]);
    }

    public /* synthetic */ Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return new HubsJsonComponentBundle(a(jsonParser));
    }
}
