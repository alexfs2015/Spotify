package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;

public class DOMSerializer extends StdSerializer<Node> {
    protected final DOMImplementationLS _domImpl;

    public DOMSerializer() {
        super(Node.class);
        try {
            this._domImpl = (DOMImplementationLS) DOMImplementationRegistry.newInstance().getDOMImplementation("LS");
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Could not instantiate DOMImplementationRegistry: ");
            sb.append(e.getMessage());
            throw new IllegalStateException(sb.toString(), e);
        }
    }

    public void serialize(Node node, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        DOMImplementationLS dOMImplementationLS = this._domImpl;
        if (dOMImplementationLS != null) {
            jsonGenerator.writeString(dOMImplementationLS.createLSSerializer().writeToString(node));
            return;
        }
        throw new IllegalStateException("Could not find DOM LS");
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.expectAnyFormat(javaType);
        }
    }
}
