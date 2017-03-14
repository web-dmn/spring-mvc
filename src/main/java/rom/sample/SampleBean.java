package rom.sample;

import org.springframework.stereotype.Component;

/**
 * Created by Java on 2017/03/14.
 */
@Component
public interface SampleBean {
    public String getMessage();
    public void setMessage(String message);
}
