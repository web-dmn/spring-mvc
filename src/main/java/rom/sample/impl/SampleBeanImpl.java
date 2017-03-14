package rom.sample.impl;

import rom.sample.SampleBean;

/**
 * Created by Java on 2017/03/14.
 */
public class SampleBeanImpl implements SampleBean {
    private String message;

    public SampleBeanImpl() {
        message = "(No message)";
    }

    public SampleBeanImpl(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SampleBean [message=" + message + "]";
    }
}
