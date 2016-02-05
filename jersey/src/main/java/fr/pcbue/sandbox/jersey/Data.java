package fr.pcbue.sandbox.jersey;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NON_PRIVATE)
public class Data {

    private   String field1;
    protected String field2;

    public Data(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }
}
