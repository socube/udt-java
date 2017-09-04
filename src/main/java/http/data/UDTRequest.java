package http.data;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author lifeng
 */
public class UDTRequest implements Serializable{
    protected int method;
    private HashMap<String,String> headers = new HashMap();
    private Object body;

    public HashMap<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(HashMap<String, String> headers) {
        this.headers = headers;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public void addHeader(String key, String value){
        headers.put(key,value);
    }

    public String getHeader(String key){
        return headers.get(key);
    }

    public int getMethod() {
        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }
}
